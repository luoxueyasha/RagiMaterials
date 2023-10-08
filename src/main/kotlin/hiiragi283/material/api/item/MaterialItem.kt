package hiiragi283.material.api.item

import hiiragi283.material.HiiragiCreativeTabs
import hiiragi283.material.api.material.HiiragiMaterial
import hiiragi283.material.api.registry.HiiragiRegistries
import hiiragi283.material.api.shape.HiiragiShape
import hiiragi283.material.util.itemStack
import hiiragi283.material.util.setModelSame
import net.minecraft.client.renderer.color.ItemColors
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.ItemStack
import net.minecraft.util.NonNullList
import net.minecraftforge.fml.relauncher.Side
import net.minecraftforge.fml.relauncher.SideOnly
import net.minecraftforge.oredict.OreDictionary

open class MaterialItem(
    final override val shape: HiiragiShape,
    val model: (MaterialItem) -> Unit = { item: MaterialItem -> item.setModelSame() },
    val recipe: (MaterialItem, HiiragiMaterial) -> Unit = { _, _ -> }
) : HiiragiItem(shape.name, Short.MAX_VALUE.toInt()), HiiragiMaterial.ITEM {

    init {
        creativeTab = HiiragiCreativeTabs.MATERIAL_ITEM
    }

    //    Client    //

    @SideOnly(Side.CLIENT)
    override fun getItemStackDisplayName(stack: ItemStack): String =
        HiiragiRegistries.MATERIAL_INDEX.getValue(stack.metadata)
            ?.let(shape::getTranslatedName)
            ?: super.getItemStackDisplayName(stack)

    @SideOnly(Side.CLIENT)
    override fun getSubItems(tab: CreativeTabs, subItems: NonNullList<ItemStack>) {
        if (!isInCreativeTab(tab)) return
        HiiragiRegistries.MATERIAL_INDEX.getValues()
            .filter(HiiragiMaterial::isValidIndex)
            .filter(shape::isValid)
            .map(::itemStack)
            .forEach(subItems::add)
    }

    //    HiiragiEntry    //

    override fun onRegister() {
        HiiragiRegistries.MATERIAL_ITEM.register(shape, this)
    }

    override fun registerOreDict() {
        HiiragiRegistries.MATERIAL.getValues()
            .filter(shape::isValid)
            .forEach { material: HiiragiMaterial ->
                shape.getOreDicts(material).forEach {
                    OreDictionary.registerOre(it, itemStack(material))
                }
            }
    }

    override fun registerRecipe() {
        HiiragiRegistries.MATERIAL_INDEX.getValues()
            .filter { material: HiiragiMaterial -> material.isSolid() && shape.isValid(material) }
            .forEach { recipe(this, it) }
    }

    @SideOnly(Side.CLIENT)
    override fun registerItemColor(itemColors: ItemColors) {
        itemColors.registerItemColorHandler(HiiragiMaterial.ITEM_COLOR, this)
    }

    @SideOnly(Side.CLIENT)
    override fun registerModel() = model(this)

}