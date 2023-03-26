package hiiragi283.ragi_materials.item

import hiiragi283.ragi_materials.Reference
import hiiragi283.ragi_materials.base.ItemBase
import hiiragi283.ragi_materials.client.render.model.ICustomModel
import net.minecraft.client.resources.I18n
import net.minecraft.item.ItemStack
import net.minecraftforge.fml.relauncher.Side
import net.minecraftforge.fml.relauncher.SideOnly

class ItemOreCrushedVanilla : ItemBase(Reference.MOD_ID, "ore_crushed_vanilla", 7), ICustomModel {

    //    Client    //

    @SideOnly(Side.CLIENT)
    override fun getItemStackDisplayName(stack: ItemStack): String {
        val keyLang = when (stack.metadata) {
            0 -> "tile.oreGold.name"
            1 -> "tile.oreIron.name"
            2 -> "tile.oreCoal.name"
            3 -> "tile.oreLapis.name"
            4 -> "tile.oreDiamond.name"
            5 -> "tile.oreRedstone.name"
            6 -> "tile.oreEmerald.name"
            7 -> "tile.netherquartz.name"
            else -> ""
        }
        return I18n.format("item.ore_crushed.name", I18n.format(keyLang))
    }

}