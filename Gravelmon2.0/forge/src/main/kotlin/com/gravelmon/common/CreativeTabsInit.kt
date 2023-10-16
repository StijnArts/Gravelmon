package com.gravelmon.common

import com.cobblemon.mod.common.CobblemonItems
import com.cobblemon.mod.common.item.group.CobblemonItemGroups
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent
import net.minecraftforge.eventbus.api.SubscribeEvent

class CreativeTabsInit {

    @SubscribeEvent
    fun addToGroups(event: BuildCreativeModeTabContentsEvent) {
        if (event.tabKey == CobblemonItemGroups.BLOCKS_KEY) {
            //event.entries.putAfter(CobblemonItems.APRICORN_LEAVES.defaultInstance, GravelmonItems.ASTRAL_STONE.asItem())
        }
    }
}