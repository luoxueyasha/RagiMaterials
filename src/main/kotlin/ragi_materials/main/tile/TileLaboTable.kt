package ragi_materials.main.tile

import net.minecraft.init.SoundEvents
import net.minecraft.item.ItemStack
import net.minecraft.util.math.BlockPos
import net.minecraft.world.World
import ragi_materials.core.RagiMaterials
import ragi_materials.core.RagiRegistry
import ragi_materials.core.tile.ITileSyncable
import ragi_materials.core.util.*

class TileLaboTable : TileLaboBase(), ITileSyncable {

    //    Recipe    //

    fun chemicalReaction(world: World, pos: BlockPos) {
        var isFailed = true
        //サーバー側，かつインベントリが空でない場合
        if (!world.isRemote && !input.isEmpty()) {
            //レシピチェック
            for (recipe in RagiRegistry.LABO_RECIPE.valuesCollection) {
                if (recipe.matchExact(inventory)) {
                    isFailed = false
                    for (i in recipe.getOutputs().indices) {
                        dropItem(world, pos.add(0, 1, 0), recipe.getOutput(i), 0.0, 0.25, 0.0)
                        RagiMaterials.LOGGER.debug("The output is ${recipe.getOutput(i).toBracket()}")
                    }
                    playSoundHypixel(this)
                    succeeded(this)
                    break
                }
            }
            RagiMaterials.LOGGER.debug("$isFailed")
            //失敗時の処理
            if (isFailed) {
                dropItem(world, pos.add(0, 1, 0), ItemStack(RagiRegistry.ItemWaste, 1, 0), 0.0, 0.25, 0.0)
                playSound(this, SoundEvents.ENTITY_GENERIC_EXPLODE)
                failed(this)
            }
        }
        sync() //反応結果によらずインベントリを空にする
        syncData()
    }

    //    TileItemHandlerBase    //

    override fun getGuiID() = "${RagiMaterials.MOD_ID}:laboratory_table"

    //    ITileSyncable    //

    override fun sync() {
        input.clear()
    }
}