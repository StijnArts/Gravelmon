
package com.gravelmon.common

import com.cobblemon.mod.common.CobblemonItems
import com.cobblemon.mod.common.item.CobblemonItem
import com.cobblemon.mod.common.platform.PlatformRegistry
import com.cobblemon.mod.common.pokemon.helditem.CobblemonHeldItemManager
import net.minecraft.block.Block
import net.minecraft.item.BlockItem
import net.minecraft.item.*
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.registry.RegistryKey
import net.minecraft.registry.RegistryKeys

object GravelmonItems : PlatformRegistry<Registry<Item>, RegistryKey<Registry<Item>>, Item>() {

    override val registry: Registry<Item> = Registries.ITEM
    override val registryKey: RegistryKey<Registry<Item>> = RegistryKeys.ITEM
    //Evolution Items
    @JvmField
    val VARIA_STONE = item("varia_stone")
    @JvmField
    val ASTRAL_STONE = item("astral_stone")
    @JvmField
    val AIR_STONE = item("air_stone")
    @JvmField
    val MYSTIC_STONE = item("mystic_stone")
    @JvmField
    val SOLID_STONE = item("solid_stone")
    @JvmField
    val QUANTUM_UPGRADE = item("quantum_upgrade")
    @JvmField
    val KALEIDOSCOPE = heldItem("kaleidoscope")
    @JvmField
    val CORRUPTED_DISC = heldItem("corrupted_disc")
    @JvmField
    val WES_UPDATE = heldItem("wes_update")
    @JvmField
    val MURKY_CLAW = heldItem("murky_claw")
    @JvmField
    val SILVER_SCALE = heldItem("silver_scale")
    @JvmField
    val ANCIENT_GLYPH = heldItem("ancient_glyph")
    @JvmField
    val VOIDIX = heldItem("voidix")
    @JvmField
    val ELECTRIX = heldItem("electrix")
    @JvmField
    val BURIX = heldItem("burix")
    @JvmField
    val AQUIX = heldItem("aquix")
    @JvmField
    val VERDIX = heldItem("verdix")
    @JvmField
    val ZERIX = heldItem("zerix")
    @JvmField
    val PATHIX = heldItem("pathix")
    @JvmField
    val PIXIX = heldItem("pixix")

    //Held Items
    @JvmField
    val LONG_BONE = heldItem("long_bone")
    @JvmField
    val MICLE_BERRY = heldItem("micle_berry")
    @JvmField
    val TERRESTRIAL_RING = heldItem("terrestrial_ring")
    @JvmField
    val XENOVERSAL_RING = heldItem("xenoversal_ring")

    //Other Items
    @JvmField
    val TUSK_FOSSIL = item("tusk_fossil")
    @JvmField
    val HORN_FOSSIL = item("horn_fossil")

    //Block Items
    @JvmField
    val ASTRAL_STONE_ORE_BLOCK_ITEM = blockItem("astral_stone_ore_block_item", GravelmonBlocks.ASTRAL_STONE_ORE)
    @JvmField
    val DEEPSLATE_ASTRAL_STONE_ORE_BLOCK_ITEM = blockItem("deepslate_astral_stone_ore_block_item", GravelmonBlocks.DEEPSLATE_ASTRAL_STONE_ORE)

    private fun blockItem(name:String, block: Block): BlockItem = this.create(name, BlockItem(block, Item.Settings()))

    fun item(name:String): Item = this.create(name, CobblemonItem(Item.Settings()))

    private fun heldItem(name: String, remappedName: String? = null): CobblemonItem = CobblemonItems.create(
        name,
        CobblemonItem(Item.Settings()).also {
            if (remappedName != null) {
                CobblemonHeldItemManager.registerRemap(it, remappedName)
            }
        }
    )
}