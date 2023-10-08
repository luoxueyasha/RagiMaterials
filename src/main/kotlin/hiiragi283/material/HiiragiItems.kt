package hiiragi283.material

import hiiragi283.material.api.item.MaterialItem
import hiiragi283.material.api.material.HiiragiMaterial
import hiiragi283.material.api.registry.HiiragiEntry
import hiiragi283.material.api.registry.HiiragiRegistries
import hiiragi283.material.api.shape.HiiragiShapeType
import hiiragi283.material.api.shape.HiiragiShapeTypes
import hiiragi283.material.api.shape.HiiragiShapes
import hiiragi283.material.config.HiiragiConfigs
import hiiragi283.material.item.*
import hiiragi283.material.util.*
import net.minecraft.item.ItemStack
import net.minecraft.util.ResourceLocation
import net.minecraftforge.client.model.ModelLoader

object HiiragiItems : HiiragiEntry.ITEM {

    @JvmField
    val BOOK_RESPAWN = HiiragiRegistries.ITEM.register(ItemBookRespawn)

    //    Material    //

    @JvmField
    val MATERIAL_BLOCK = HiiragiRegistries.ITEM.registerOptional(
        MaterialItem(
            HiiragiShapes.BLOCK,
            model = { item: MaterialItem ->
                ModelLoader.registerItemVariants(
                    item,
                    hiiragiLocation("block_gem"),
                    hiiragiLocation("block_metal")
                )
                ModelLoader.setCustomMeshDefinition(item) { stack: ItemStack ->
                    val material: HiiragiMaterial? = item.getMaterial(stack)
                    when {
                        material?.isMetal() == true -> hiiragiLocation("block_metal").toModelLocation()
                        material?.isGem() == true -> hiiragiLocation("block_gem").toModelLocation()
                        else -> item.registryName!!.toModelLocation()
                    }
                }
            },
            recipe = { item: MaterialItem, material: HiiragiMaterial ->
                if (HiiragiShapes.INGOT.isValid(material)) {
                    CraftingBuilder(item.itemStack(material))
                        .setPattern("AAA", "AAA", "AAA")
                        .setIngredient('A', HiiragiShapes.INGOT.getOreDict(material))
                        .build()
                } else if (HiiragiShapes.GEM.isValid(material)) {
                    CraftingBuilder(item.itemStack(material))
                        .setPattern("AAA", "AAA", "AAA")
                        .setIngredient('A', HiiragiShapes.GEM.getOreDict(material))
                        .build()
                }
            }
        )
    ) { !HiiragiConfigs.EXPERIMENTAL.enableMetaTileBlock }

    @JvmField
    val MATERIAL_BOTTLE = HiiragiRegistries.ITEM.register(MaterialItem(HiiragiShapes.BOTTLE))

    @JvmField
    val MATERIAL_CASING = HiiragiRegistries.ITEM.registerOptional(MaterialItemCasing)
    { !HiiragiConfigs.EXPERIMENTAL.enableMetaTileBlock }

    @JvmField
    val MATERIAL_DUST = HiiragiRegistries.ITEM.register(MaterialItem(
        HiiragiShapes.DUST,
        recipe = { item: MaterialItem, material: HiiragiMaterial ->
            val builder: CraftingBuilder = CraftingBuilder(item.itemStack(material))
                .setPattern("A", "B")
                .setIngredient('A', SMITHING_HAMMER, true)
            if (material.isMetal()) {
                builder.setIngredient('B', HiiragiShapes.INGOT.getOreDict(material)).build()
            } else if (material.isGem()) {
                builder.setIngredient('B', HiiragiShapes.GEM.getOreDict(material)).build()
            }
        }
    ))

    @JvmField
    val MATERIAL_GEAR = HiiragiRegistries.ITEM.register(MaterialItem(
        HiiragiShapes.GEAR,
        recipe = { item: MaterialItem, material: HiiragiMaterial ->
            if (!HiiragiShapes.INGOT.isValid(material)) return@MaterialItem
            CraftingBuilder(item.itemStack(material))
                .setPattern(" A ", "ABA", " A ")
                .setIngredient('A', HiiragiShapes.INGOT.getOreDict(material))
                .setIngredient('B', SMITHING_HAMMER, true)
                .build()
        }
    ))

    @JvmField
    val MATERIAL_GEM = HiiragiRegistries.ITEM.register(
        MaterialItem(
        HiiragiShapes.GEM,
            model = { item: MaterialItem ->

                fun gemLocation(shapeType: HiiragiShapeType) = item.registryName!!.append("_${shapeType.name}")

            ModelLoader.registerItemVariants(
                item,
                gemLocation(HiiragiShapeTypes.GEM_AMORPHOUS),
                gemLocation(HiiragiShapeTypes.GEM_COAL),
                gemLocation(HiiragiShapeTypes.GEM_CUBIC),
                gemLocation(HiiragiShapeTypes.GEM_DIAMOND),
                gemLocation(HiiragiShapeTypes.GEM_EMERALD),
                gemLocation(HiiragiShapeTypes.GEM_LAPIS),
                gemLocation(HiiragiShapeTypes.GEM_QUARTZ),
                gemLocation(HiiragiShapeTypes.GEM_RUBY)
            )

            ModelLoader.setCustomMeshDefinition(item) { stack: ItemStack ->
                HiiragiRegistries.MATERIAL_INDEX.getValue(stack.metadata)?.shapeType
                    ?.let(::gemLocation)
                    ?.let(ResourceLocation::toModelLocation)
                    ?: item.registryName!!.toModelLocation()
            }

        },
            recipe = { entry: MaterialItem, material: HiiragiMaterial ->
            if (!HiiragiShapes.BLOCK.isValid(material)) return@MaterialItem
                CraftingBuilder(entry.itemStack(material, 9))
                    .addIngredient(HiiragiShapes.BLOCK.getOreDict(material))
                .build()
        }
    ))

    @JvmField
    val MATERIAL_INGOT = HiiragiRegistries.ITEM.register(
        MaterialItem(
        HiiragiShapes.INGOT,
            recipe = { item: MaterialItem, material: HiiragiMaterial ->
            //nugget -> ingot
            if (!HiiragiShapes.NUGGET.isValid(material)) return@MaterialItem
                CraftingBuilder(item.itemStack(material))
                .setPattern("AAA", "AAA", "AAA")
                .setIngredient('A', HiiragiShapes.NUGGET.getOreDict(material))
                .build()
            //block -> ingot
            if (!HiiragiShapes.BLOCK.isValid(material)) return@MaterialItem
                val ingot9 = item.itemStack(material, 9)
            CraftingBuilder(ingot9.toLocation("_").append("_alt"), ingot9)
                .addIngredient(HiiragiShapes.BLOCK.getOreDict(material))
                .build()
        }
    ))

    @JvmField
    val MATERIAL_NUGGET = HiiragiRegistries.ITEM.register(
        MaterialItem(
        HiiragiShapes.NUGGET,
            recipe = { item: MaterialItem, material: HiiragiMaterial ->
            if (!HiiragiShapes.INGOT.isValid(material)) return@MaterialItem
                CraftingBuilder(item.itemStack(material, 9))
                    .addIngredient(HiiragiShapes.INGOT.getOreDict(material))
                .build()
        }
    ))

    @JvmField
    val MATERIAL_PLATE: MaterialItem = HiiragiRegistries.ITEM.register(MaterialItem(
        HiiragiShapes.PLATE,
        recipe = { item: MaterialItem, material: HiiragiMaterial ->
            if (!HiiragiShapes.INGOT.isValid(material)) return@MaterialItem
            CraftingBuilder(item.itemStack(material))
                .setPattern("AB")
                .setIngredient('A', HiiragiShapes.INGOT.getOreDict(material))
                .setIngredient('B', SMITHING_HAMMER, true)
                .build()
        }
    ))

    @JvmField
    val MATERIAL_STICK: MaterialItem = HiiragiRegistries.ITEM.register(MaterialItem(
        HiiragiShapes.STICK,
        recipe = { item: MaterialItem, material: HiiragiMaterial ->
            if (!HiiragiShapes.INGOT.isValid(material)) return@MaterialItem
            CraftingBuilder(item.itemStack(material))
                .setPattern("A", "B")
                .setIngredient('A', HiiragiShapes.INGOT.getOreDict(material))
                .setIngredient('B', SMITHING_HAMMER, true)
                .build()
        }
    ))

    //    Module Item   //

    @JvmField
    val MODULE_MOTOR = HiiragiRegistries.ITEM.register(ItemMotor)

    //    Common    //

    @JvmField
    val MINECART_TANK = HiiragiRegistries.ITEM.registerOptional(ItemMinecartTank) { isDeobf() }

    @JvmField
    val SHAPE_PATTERN = HiiragiRegistries.ITEM.register(ItemShapePattern)

    @JvmField
    val SMITHING_HAMMER = HiiragiRegistries.ITEM.register(ItemSmithingHammer)

}