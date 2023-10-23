package drai.dev.gravelmon.forge;

import com.cobblemon.mod.common.*;
import com.cobblemon.mod.common.item.group.*;
import drai.dev.gravelmon.*;
import drai.dev.gravelmon.registries.*;
import net.minecraft.world.item.*;
import net.minecraftforge.api.distmarker.*;
import net.minecraftforge.event.*;
import net.minecraftforge.eventbus.api.*;
import net.minecraftforge.fml.common.*;

@Mod.EventBusSubscriber(modid = Gravelmon.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CreativeTabInit {

    @SubscribeEvent
    public static void buildContents(BuildCreativeModeTabContentsEvent event) {
        if(event.getTab() == CobblemonItemGroups.getEVOLUTION_ITEMS()) {
            //evolution stones
            event.getEntries().putAfter(CobblemonItems.ICE_STONE.getDefaultInstance(),
                    GravelmonItems.XENOLITH.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(CobblemonItems.ICE_STONE.getDefaultInstance(),
                    GravelmonItems.SOLID_STONE.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(CobblemonItems.ICE_STONE.getDefaultInstance(),
                    GravelmonItems.MYSTIC_STONE.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(CobblemonItems.ICE_STONE.getDefaultInstance(),
                    GravelmonItems.AIR_STONE.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(CobblemonItems.ICE_STONE.getDefaultInstance(),
                    GravelmonItems.VARIA_STONE.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(CobblemonItems.ICE_STONE.getDefaultInstance(),
                    GravelmonItems.ASTRAL_STONE.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            //evolution held items
            event.getEntries().putAfter(CobblemonItems.DUBIOUS_DISC.getDefaultInstance(),
                    GravelmonItems.WES_UPDATE.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(CobblemonItems.DUBIOUS_DISC.getDefaultInstance(),
                    GravelmonItems.QUANTUM_UPGRADE.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            /*event.getEntries().putAfter(CobblemonItems.LINK_CABLE.getDefaultInstance(),
                    GravelmonItems.PIXIX.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(CobblemonItems.LINK_CABLE.getDefaultInstance(),
                    GravelmonItems.PATHIX.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(CobblemonItems.LINK_CABLE.getDefaultInstance(),
                    GravelmonItems.ZERIX.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(CobblemonItems.LINK_CABLE.getDefaultInstance(),
                    GravelmonItems.VERDIX.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(CobblemonItems.LINK_CABLE.getDefaultInstance(),
                    GravelmonItems.VOIDIX.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(CobblemonItems.LINK_CABLE.getDefaultInstance(),
                    GravelmonItems.AQUIX.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(CobblemonItems.LINK_CABLE.getDefaultInstance(),
                    GravelmonItems.BURIX.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(CobblemonItems.LINK_CABLE.getDefaultInstance(),
                    GravelmonItems.ELECTRIX.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);*/

            event.getEntries().putAfter(CobblemonItems.GALARICA_WREATH.getDefaultInstance(),
                    GravelmonItems.SLOWPOKE_TAIL.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putBefore(CobblemonItems.METAL_COAT.getDefaultInstance(),
                    GravelmonItems.ANCIENT_GLYPH.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().putBefore(CobblemonItems.PRISM_SCALE.getDefaultInstance(),
                    GravelmonItems.SILVER_SCALE.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putBefore(CobblemonItems.PRISM_SCALE.getDefaultInstance(),
                    GravelmonItems.MURKY_CLAW.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.getEntries().put(GravelmonItems.CORRUPTED_DISC.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(GravelmonItems.KALEIDOSCOPE.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(GravelmonItems.DREAD_PENDANT.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(GravelmonItems.SPARE_PARTS.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(GravelmonItems.MAGIC_COOKIE.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }

        if(event.getTab() == CobblemonItemGroups.getBLOCKS()) {
            event.getEntries().putAfter(CobblemonItems.APRICORN_LEAVES.asItem().getDefaultInstance(),
                    GravelmonItems.DEEPSLATE_ASTRAL_STONE_ORE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(CobblemonItems.APRICORN_LEAVES.asItem().getDefaultInstance(),
                    GravelmonItems.ASTRAL_STONE_ORE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(CobblemonItems.APRICORN_LEAVES.asItem().getDefaultInstance(),
                    GravelmonItems.DEEPSLATE_AIR_STONE_ORE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(CobblemonItems.APRICORN_LEAVES.asItem().getDefaultInstance(),
                    GravelmonItems.AIR_STONE_ORE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);


            event.getEntries().putBefore(CobblemonItems.MOON_STONE_ORE.asItem().getDefaultInstance(),
                    GravelmonItems.MYSTIC_STONE_ORE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putBefore(CobblemonItems.MOON_STONE_ORE.asItem().getDefaultInstance(),
                    GravelmonItems.DEEPSLATE_MYSTIC_STONE_ORE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);


            event.getEntries().putAfter(CobblemonItems.DEEPSLATE_SHINY_STONE_ORE.asItem().getDefaultInstance(),
                    GravelmonItems.DEEPSLATE_SOLID_STONE_ORE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(CobblemonItems.DEEPSLATE_SHINY_STONE_ORE.asItem().getDefaultInstance(),
                    GravelmonItems.SOLID_STONE_ORE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }

        if(event.getTab() == CobblemonItemGroups.getHELD_ITEMS()) {
            event.getEntries().put(GravelmonItems.LONG_CLUB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(GravelmonItems.TERRESTRIAL_RING.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(GravelmonItems.XENOVERSAL_RING.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(GravelmonItems.INDUCTIVE_RING.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
    }
}
