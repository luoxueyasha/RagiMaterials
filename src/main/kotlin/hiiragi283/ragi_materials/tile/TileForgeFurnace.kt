package hiiragi283.ragi_materials.tile

import hiiragi283.ragi_materials.base.TileBase
import hiiragi283.ragi_materials.init.RagiInit
import hiiragi283.ragi_materials.item.ItemMaterial
import hiiragi283.ragi_materials.material.IMaterialItem
import hiiragi283.ragi_materials.material.MaterialUtil
import hiiragi283.ragi_materials.material.part.PartRegistry
import hiiragi283.ragi_materials.util.RagiLogger
import hiiragi283.ragi_materials.util.RagiUtil
import hiiragi283.ragi_materials.util.RagiUtil.toBracket
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.item.ItemStack
import net.minecraft.nbt.NBTTagCompound
import net.minecraft.tileentity.TileEntityFurnace
import net.minecraft.util.EnumFacing
import net.minecraft.util.EnumHand
import net.minecraft.util.SoundCategory
import net.minecraft.util.math.BlockPos
import net.minecraft.world.World
import net.minecraftforge.common.capabilities.Capability
import net.minecraftforge.items.CapabilityItemHandler
import net.minecraftforge.items.ItemStackHandler
import kotlin.math.pow

class TileForgeFurnace : TileBase(102) {

    var fuel = 0
    val inventory = object : ItemStackHandler(1) {

        override fun insertItem(slot: Int, stack: ItemStack, simulate: Boolean): ItemStack {
            return if (isFuel(stack)) {
                RagiLogger.infoDebug("Burn Time: ${TileEntityFurnace.getItemBurnTime(stack)}")
                fuel += (TileEntityFurnace.getItemBurnTime(stack) * stack.count) / 200
                world.playSound(null, pos, RagiUtil.getSound("minecraft:block.gravel.place"), SoundCategory.BLOCKS, 1.0f, 0.5f) //SEを再生
                RagiLogger.infoDebug("Fuel: $fuel")
                ItemStack.EMPTY //燃料は消失する
            } else stack //燃焼不可能な素材なら搬入不可能
        }
    }

    //    NBT tag    //

    override fun writeToNBT(tag: NBTTagCompound): NBTTagCompound {
        super.writeToNBT(tag)
        tag.setInteger("fuel", this.fuel) //燃料をtagに書き込む
        return tag
    }

    override fun readFromNBT(tag: NBTTagCompound) {
        super.readFromNBT(tag)
        this.fuel = tag.getInteger("fuel") //tagから燃料を読み込む
    }

    //    Capability    //

    override fun <T : Any?> getCapability(capability: Capability<T>, facing: EnumFacing?): T? {
        return if (hasCapability(capability, null)) this.inventory as T else null
    }

    override fun hasCapability(capability: Capability<*>, facing: EnumFacing?): Boolean {
        return capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY
    }

    //    TileBase    //

    override fun onTileActivated(world: World, pos: BlockPos, player: EntityPlayer, hand: EnumHand, facing: EnumFacing): Boolean {
        val stack = player.getHeldItem(hand)
        return if (isFuel(stack)) {
            player.setHeldItem(hand, this.inventory.insertItem(0, stack, false)) //燃料を搬入
            true
        } else doProcess(world, pos, player, hand) //レシピを実行
    }

    //    Recipe    //

    private fun canProcess(stack: ItemStack): Boolean = this.fuel >= getFuelConsumption(stack) //入っている燃料が消費量より多いなら実行可能

    companion object {
        fun getFuelConsumption(stack: ItemStack): Int {
            val item = stack.item
            return if (item is IMaterialItem && item is ItemMaterial) {
                val material = item.getMaterial(stack)
                val tempMelt = material.tempMelt
                val scale = item.part.scale
                val fuelConsume = tempMelt?.run { (2.0.pow(this / 1000) * scale).toInt() } ?: 0 //2^(融点を1000で割った商)
                RagiLogger.infoDebug("Consume: $fuelConsume")
                return fuelConsume
            } else 0
        }
    }

    private fun getResult(stack: ItemStack): ItemStack {
        val item = stack.item
        var result = ItemStack.EMPTY
        if (item is IMaterialItem) {
            val material = item.getMaterial(stack)
            if (item is ItemMaterial) {
                val scale = item.part.scale
                if (scale >= 1) result = MaterialUtil.getPart(PartRegistry.INGOT_HOT, material, scale.toInt()) //完成品を代入
            }
            RagiLogger.infoDebug("Result: ${result.toBracket()}")
        }
        return result
    }

    private fun doProcess(world: World, pos: BlockPos, player: EntityPlayer, hand: EnumHand): Boolean {
        val stack = player.getHeldItem(hand)
        val stackResult = getResult(stack)
        var result = false
        if (canProcess(stack) && !stackResult.isEmpty) {
            RagiLogger.infoDebug("Can process!")

            val fuelConsumption = getFuelConsumption(stack)
            //燃料消費が0より多い場合
            if (fuelConsumption > 0) {
                this.fuel -= fuelConsumption //燃料を減らす
                RagiLogger.infoDebug("Fuel: ${this.fuel}")

                stack.shrink(1) //手持ちのアイテムを1つ減らす
                RagiUtil.spawnItemAtPlayer(world, player, stackResult) //完成品をプレイヤーに渡す

                world.playSound(null, pos, RagiUtil.getSound("minecraft:block.fire.extinguish"), SoundCategory.BLOCKS, 1.0f, 1.0f) //SEを再生
                result = true
            }
        }
        return result
    }

    //かまどのタイルエンティティから燃焼時間を取得
    private fun isFuel(stack: ItemStack): Boolean = TileEntityFurnace.getItemBurnTime(stack) > 0

}