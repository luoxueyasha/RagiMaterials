package hiiragi283.ragi_materials.item

import hiiragi283.ragi_materials.Reference
import hiiragi283.ragi_materials.base.ItemBase
import hiiragi283.ragi_materials.init.RagiInit
import hiiragi283.ragi_materials.util.RagiUtils
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.entity.Entity
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.item.ItemStack
import net.minecraft.util.NonNullList
import net.minecraft.world.World
import net.minecraftforge.fml.relauncher.Side
import net.minecraftforge.fml.relauncher.SideOnly

class ItemWaste : ItemBase(Reference.MOD_ID, "waste", 0) {

    init {
        creativeTab = RagiInit.TabMaterials
    }

    //    General    //

    //    Event    //

    override fun onUpdate(stack: ItemStack, world: World, entity: Entity, slot: Int, isSelected: Boolean) {
        //サーバー側の場合，かつ5秒ごと
        if (!world.isRemote && world.worldInfo.worldTime % 100 == 0L) {
            //entityがplayerの場合
            if (entity is EntityPlayer) {
                when (stack.metadata) {
                    //化学廃棄物 -> 毒デバフ
                    0 -> entity.addPotionEffect(RagiUtils.getPotionEffect("minecraft:poison", 110, 0))
                    else -> {}
                }
            }
        }
    }

    //    Client    //

    @SideOnly(Side.CLIENT) //Client側のみ
    override fun getSubItems(tab: CreativeTabs, subItems: NonNullList<ItemStack>) {
        if (isInCreativeTab(tab)) {
            for (i in 0..this.maxMeta) {
                subItems.add(ItemStack(this, 1, i))
            }
        }
    }
}