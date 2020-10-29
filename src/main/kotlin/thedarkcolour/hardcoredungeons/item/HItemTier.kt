package thedarkcolour.hardcoredungeons.item

import net.minecraft.item.IItemTier
import net.minecraft.item.Item
import net.minecraft.item.crafting.Ingredient
import net.minecraft.util.LazyValue
import net.minecraftforge.common.Tags

/**
 * Item Tier enum class for Hardcore Dungeons items.
 *
 * @property harvestLevel the harvest level of this tool material
 * @property durability the durability of this tool material
 * @property efficiency the efficiency of this tool material
 * @property damage the attack damage of this tool material
 * @property enchantability the enchantability of this tool material
 * @property repairMaterial the lazily initialized repair material for this tool material
 *
 * @author TheDarkColour
 */
enum class HItemTier(
    private val harvestLevel: Int,
    private val durability: Int,
    private val efficiency: Float,
    private val damage: Float,
    private val enchantability: Int,
    private val repairMaterial: LazyValue<Ingredient>
) : IItemTier {
    SHROOMY(4, 726, 7.0f, 3.0f, 17, Tags.Items.MUSHROOMS);

    constructor(
        harvestLevel: Int,
        durability: Int,
        efficiency: Float,
        damage: Float,
        enchantability: Int,
        repairMaterialTag: Tags.IOptionalNamedTag<Item>
    ) : this(harvestLevel, durability, efficiency, damage, enchantability, LazyValue { Ingredient.fromTag(repairMaterialTag) })

    override fun getRepairMaterial(): Ingredient = repairMaterial.value

    override fun getHarvestLevel() = harvestLevel

    override fun getMaxUses() = durability

    override fun getAttackDamage() = damage

    override fun getEnchantability() = enchantability

    override fun getEfficiency() = efficiency
}