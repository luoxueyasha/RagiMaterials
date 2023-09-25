package hiiragi283.material.api.registry

import hiiragi283.material.api.event.MaterialRegistryEvent
import hiiragi283.material.api.event.ShapeRegistryEvent
import hiiragi283.material.api.material.HiiragiMaterial
import hiiragi283.material.api.module.IRecipeModuleItem
import hiiragi283.material.api.part.HiiragiPart
import hiiragi283.material.api.part.createAllParts
import hiiragi283.material.api.recipe.IMachineRecipe
import hiiragi283.material.api.shape.HiiragiShape
import hiiragi283.material.block.BlockModuleMachine
import net.minecraft.block.Block
import net.minecraft.item.Item
import net.minecraft.util.ResourceLocation
import net.minecraftforge.common.MinecraftForge

object HiiragiRegistries {

    //    Forge    //

    @JvmField
    val BLOCK: HiiragiForgeRegistry<HiiragiEntry.BLOCK, Block> = HiiragiForgeRegistry("Blocks")

    @JvmField
    val ITEM: HiiragiForgeRegistry<HiiragiEntry.ITEM, Item> = HiiragiForgeRegistry("Item")

    //    Recipe    //

    @JvmField
    val MODULE_MACHINE: HiiragiRegistry<IMachineRecipe.Type, BlockModuleMachine> = HiiragiRegistry("Module Machine")

    @JvmField
    val MACHINE_RECIPE: HiiragiRegistry<IMachineRecipe.Type, HiiragiRegistry<ResourceLocation, IMachineRecipe>> =
        HiiragiRegistry("Machine Recipe")

    fun initRecipeType() {
        IMachineRecipe.Type.values().forEach { type: IMachineRecipe.Type ->
            MACHINE_RECIPE.register(type, HiiragiRegistry("Machine Recipe - ${type.name}", true))
        }
        MACHINE_RECIPE.lock()
    }

    @JvmField
    val RECIPE_MODULE: HiiragiRegistry<IMachineRecipe.Type, IRecipeModuleItem> = HiiragiRegistry("Recipe Module")

    //    Material    //

    @JvmField
    val MATERIAL: HiiragiRegistry<String, HiiragiMaterial> = HiiragiRegistry("Material")

    @JvmField
    val MATERIAL_INDEX: HiiragiRegistry<Int, HiiragiMaterial> = HiiragiRegistry("Material Index")

    @JvmField
    val MATERIAL_BLOCK: HiiragiRegistry<HiiragiShape, HiiragiMaterial.BLOCK> = HiiragiRegistry("Material Block")

    @JvmField
    val MATERIAL_ITEM: HiiragiRegistry<HiiragiShape, HiiragiMaterial.ITEM> = HiiragiRegistry("Material Item")

    fun registerMaterial() {
        val event = MaterialRegistryEvent(MATERIAL)
        MinecraftForge.EVENT_BUS.post(event)
        MATERIAL.sort { (name: String, _: HiiragiMaterial) -> name }
        MATERIAL.lock()
        MATERIAL_INDEX.sort { (index: Int, _: HiiragiMaterial) -> index }
        MATERIAL_INDEX.lock()
    }

    //    Part    //

    @JvmField
    val PART: HiiragiRegistry<String, HiiragiPart> = HiiragiRegistry("Part")

    fun registerPart() {
        createAllParts().forEach { part: HiiragiPart ->
            part.getOreDicts().forEach { oreDict: String ->
                PART.register(oreDict, part)
            }
        }
    }

    //    Shape    //

    @JvmField
    val SHAPE: HiiragiRegistry<String, HiiragiShape> = HiiragiRegistry("Shape")

    fun registerShape() {
        val event = ShapeRegistryEvent(SHAPE)
        MinecraftForge.EVENT_BUS.post(event)
        SHAPE.lock()
    }

}