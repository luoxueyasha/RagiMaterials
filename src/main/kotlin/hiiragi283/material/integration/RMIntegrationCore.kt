package hiiragi283.material.integration

import hiiragi283.material.api.material.MaterialCommon
import hiiragi283.material.api.material.MaterialIntegration
import hiiragi283.material.api.part.HiiragiPart
import hiiragi283.material.api.part.PartRegistry
import hiiragi283.material.api.shape.ShapeRegistry
import hiiragi283.material.config.enableBotania
import hiiragi283.material.config.enableEIO
import hiiragi283.material.config.enableThaum
import hiiragi283.material.util.OreDictUtil
import hiiragi283.material.util.getBlock
import hiiragi283.material.util.getItem
import net.minecraft.init.Blocks
import net.minecraft.init.Items

object RMIntegrationCore {

    fun onPreInit() {}

    fun onInit() {
        OreDictUtil.register("stoneStone", Blocks.STONE)

        OreDictUtil.register("dustGunpowder", Items.GUNPOWDER, share = "gunpowder")
        OreDictUtil.register("dustSugar", Items.SUGAR, share = "sugar")
        OreDictUtil.register("gemCharcoal", Items.COAL, 1, share = "charcoal")
        OreDictUtil.register("gemCoal", Items.COAL, share = "coal")
        OreDictUtil.register("gemEnder", Items.ENDER_PEARL, share = "enderpearl")
        OreDictUtil.register("stickWood", Items.STICK, share = "stick")

        OreDictUtil.shareOredict("dustSaltpeter", "dustNiter")
        OreDictUtil.shareOredict("fuelCoke", "gemCoke")
    }

    fun onPostInit() {
        if (enableBotania()) {
            OreDictUtil.register(
                ShapeRegistry.BLOCK.getOreDict(MaterialIntegration.MANASTEEL),
                getBlock("botania:storage"),
                0
            )
            OreDictUtil.register(
                ShapeRegistry.BLOCK.getOreDict(MaterialIntegration.TERRASTEEL),
                getBlock("botania:storage"),
                1
            )
            OreDictUtil.register(
                ShapeRegistry.BLOCK.getOreDict(MaterialIntegration.ELEMENTIUM),
                getBlock("botania:storage"),
                2
            )
            OreDictUtil.register(
                ShapeRegistry.BLOCK.getOreDict(MaterialIntegration.MANA_DIAMOND),
                getBlock("botania:storage"),
                3
            )
            OreDictUtil.register(
                ShapeRegistry.BLOCK.getOreDict(MaterialIntegration.DRAGONSTONE),
                getBlock("botania:storage"),
                4
            )

            OreDictUtil.register(
                ShapeRegistry.GEM.getOreDict(MaterialIntegration.MANA_DIAMOND),
                getItem("botania:manaresource"),
                2,
                "manaDiamond"
            )
            OreDictUtil.register(
                ShapeRegistry.GEM.getOreDict(MaterialIntegration.DRAGONSTONE),
                getItem("botania:manaresource"),
                9,
                "elvenDragonstone"
            )
        }
        if (enableEIO()) {
            PartRegistry.registerTag(
                "nuggetEnderpearl",
                HiiragiPart(ShapeRegistry.NUGGET, MaterialIntegration.ENDER_PEARL)
            )
        }
        if (enableThaum()) {
            PartRegistry.registerTag("quicksilver", HiiragiPart(ShapeRegistry.GEM, MaterialCommon.CINNABAR))
            PartRegistry.registerTag(
                "nuggetQuicksilver",
                HiiragiPart(ShapeRegistry.NUGGET, MaterialCommon.CINNABAR)
            )
        }
    }

}