package com.gravelmon.common

import com.cobblemon.mod.common.CobblemonItems
import com.cobblemon.mod.common.item.group.CobblemonItemGroups
import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier

class GravelmonFabric : ModInitializer{

    override fun onInitialize() {
        registerBlocks()
        registerItems()
        itemGroups()
    }



    private fun itemGroups(){
        ItemGroupEvents.modifyEntriesEvent(CobblemonItemGroups.BLOCKS_KEY).register { entries ->
            entries.addAfter(CobblemonItems.APRICORN_LEAVES, GravelmonItems.ASTRAL_STONE_ORE_BLOCK_ITEM)
            entries.addAfter(CobblemonItems.APRICORN_LEAVES, GravelmonItems.DEEPSLATE_ASTRAL_STONE_ORE_BLOCK_ITEM)
        }
        ItemGroupEvents.modifyEntriesEvent(CobblemonItemGroups.EVOLUTION_ITEMS_KEY).register { entries ->
            entries.addAfter(CobblemonItems.ICE_STONE, GravelmonItems.VARIA_STONE)
            entries.addAfter(CobblemonItems.ICE_STONE, GravelmonItems.ASTRAL_STONE)
        }
    }
    private fun registerBlocks() {
        Registry.register(Registries.BLOCK, id("astral_stone_ore"), GravelmonBlocks.ASTRAL_STONE_ORE)
        Registry.register(Registries.BLOCK, id("deepslate_astral_stone_ore"),  GravelmonBlocks.DEEPSLATE_ASTRAL_STONE_ORE)
    }

    private fun registerItems(){
        Registry.register(Registries.ITEM, id("varia_stone"), GravelmonItems.VARIA_STONE)
        Registry.register(Registries.ITEM, id("astral_stone_ore"), GravelmonItems.ASTRAL_STONE_ORE_BLOCK_ITEM)
        Registry.register(Registries.ITEM, id("deepslate_astral_stone_ore"), GravelmonItems.DEEPSLATE_ASTRAL_STONE_ORE_BLOCK_ITEM)
        Registry.register(Registries.ITEM, id("astral_stone"), GravelmonItems.ASTRAL_STONE)
    }

    fun id(path: String): Identifier {
        return Identifier("gravelmon", path)
    }
}