package hiiragi283.ragi_materials.recipe.furnace

import hiiragi283.ragi_materials.util.sameExact
import net.minecraft.item.ItemStack
import net.minecraft.item.crafting.FurnaceRecipes
import net.minecraftforge.fml.common.registry.GameRegistry

object SmeltingManager {

    //かまどレシピを追加するメソッド
    fun addRecipe(output: ItemStack, input: ItemStack, xp: Float = 0f) {
        GameRegistry.addSmelting(input, output, xp)
    }

    //かまどレシピを削除するメソッド
    fun removeInput(input: ItemStack) {
        val registry = FurnaceRecipes.instance().smeltingList
        val iterator = registry.keys.iterator()
        while (iterator.hasNext()) {
            if (iterator.next().sameExact(input)) {
                iterator.remove()
                break
            }
        }
    }

    fun removeOutput(output: ItemStack) {
        val registry = FurnaceRecipes.instance().smeltingList
        val iterator = registry.values.iterator()
        while (iterator.hasNext()) {
            if (iterator.next().sameExact(output)) {
                iterator.remove()
                break
            }
        }
    }
}