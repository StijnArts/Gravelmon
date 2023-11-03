package drai.dev.gravelmon.fabric;

import com.cobblemon.mod.common.*;
import com.cobblemon.mod.common.item.group.*;
import drai.dev.gravelmon.registries.*;
import net.fabricmc.fabric.api.itemgroup.v1.*;
import net.minecraft.world.item.*;

public class CreativeTabsInit {
    public static void initCreativeTabs(){
        ItemGroupEvents.modifyEntriesEvent(CobblemonItemGroups.getEVOLUTION_ITEMS_KEY()).register(entries -> {
            //evolution stones

            entries.addAfter(CobblemonItems.ICE_STONE.getDefaultInstance(),
                    GravelmonItems.XENOLITH.get().getDefaultInstance());
            entries.addAfter(CobblemonItems.ICE_STONE.getDefaultInstance(),
                    GravelmonItems.SOLID_STONE.get().getDefaultInstance());
            entries.addAfter(CobblemonItems.ICE_STONE.getDefaultInstance(),
                    GravelmonItems.MYSTIC_STONE.get().getDefaultInstance());
            entries.addAfter(CobblemonItems.ICE_STONE.getDefaultInstance(),
                    GravelmonItems.AIR_STONE.get().getDefaultInstance());
            entries.addAfter(CobblemonItems.ICE_STONE.getDefaultInstance(),
                    GravelmonItems.VARIA_STONE.get().getDefaultInstance());
            entries.addAfter(CobblemonItems.ICE_STONE.getDefaultInstance(),
                    GravelmonItems.ASTRAL_STONE.get().getDefaultInstance());

            //evolution held items
            entries.addAfter(CobblemonItems.DUBIOUS_DISC.getDefaultInstance(),
                    GravelmonItems.WES_UPDATE.get().getDefaultInstance());
            entries.addAfter(CobblemonItems.DUBIOUS_DISC.getDefaultInstance(),
                    GravelmonItems.QUANTUM_UPGRADE.get().getDefaultInstance());

            /*entries.addAfter(CobblemonItems.LINK_CABLE.getDefaultInstance(),
                    GravelmonItems.PIXIX.get().getDefaultInstance());
            entries.addAfter(CobblemonItems.LINK_CABLE.getDefaultInstance(),
                    GravelmonItems.PATHIX.get().getDefaultInstance());
            entries.addAfter(CobblemonItems.LINK_CABLE.getDefaultInstance(),
                    GravelmonItems.ZERIX.get().getDefaultInstance());
            entries.addAfter(CobblemonItems.LINK_CABLE.getDefaultInstance(),
                    GravelmonItems.VERDIX.get().getDefaultInstance());
            entries.addAfter(CobblemonItems.LINK_CABLE.getDefaultInstance(),
                    GravelmonItems.VOIDIX.get().getDefaultInstance());
            entries.addAfter(CobblemonItems.LINK_CABLE.getDefaultInstance(),
                    GravelmonItems.AQUIX.get().getDefaultInstance());
            entries.addAfter(CobblemonItems.LINK_CABLE.getDefaultInstance(),
                    GravelmonItems.BURIX.get().getDefaultInstance());
            entries.addAfter(CobblemonItems.LINK_CABLE.getDefaultInstance(),
                    GravelmonItems.ELECTRIX.get().getDefaultInstance());*/

            entries.addAfter(CobblemonItems.GALARICA_WREATH.getDefaultInstance(),
                    GravelmonItems.SLOWPOKE_TAIL.get().getDefaultInstance());

            entries.addBefore(CobblemonItems.METAL_COAT.getDefaultInstance(),
                    GravelmonItems.ANCIENT_GLYPH.get().getDefaultInstance());

            entries.addBefore(CobblemonItems.PRISM_SCALE.getDefaultInstance(),
                    GravelmonItems.SILVER_SCALE.get().getDefaultInstance());
            entries.addBefore(CobblemonItems.PRISM_SCALE.getDefaultInstance(),
                    GravelmonItems.MURKY_CLAW.get().getDefaultInstance());

            entries.accept(GravelmonItems.CORRUPTED_DISC.get().getDefaultInstance());
            entries.accept(GravelmonItems.KALEIDOSCOPE.get().getDefaultInstance());
            entries.accept(GravelmonItems.DREAD_PENDANT.get().getDefaultInstance());
            entries.accept(GravelmonItems.SPARE_PARTS.get().getDefaultInstance());
            entries.accept(GravelmonItems.MAGIC_COOKIE.get().getDefaultInstance());
        });

        ItemGroupEvents.modifyEntriesEvent(CobblemonItemGroups.getBLOCKS_KEY()).register(entries -> {
            entries.addAfter(CobblemonItems.APRICORN_LEAVES.asItem().getDefaultInstance(),
                    GravelmonItems.DEEPSLATE_ASTRAL_STONE_ORE.get().asItem().getDefaultInstance());
            entries.addAfter(CobblemonItems.APRICORN_LEAVES.asItem().getDefaultInstance(),
                    GravelmonItems.ASTRAL_STONE_ORE.get().asItem().getDefaultInstance());
            entries.addAfter(CobblemonItems.APRICORN_LEAVES.asItem().getDefaultInstance(),
                    GravelmonItems.DEEPSLATE_AIR_STONE_ORE.get().asItem().getDefaultInstance());
            entries.addAfter(CobblemonItems.APRICORN_LEAVES.asItem().getDefaultInstance(),
                    GravelmonItems.AIR_STONE_ORE.get().asItem().getDefaultInstance());

            entries.addBefore(CobblemonItems.MOON_STONE_ORE.asItem().getDefaultInstance(),
                    GravelmonItems.MYSTIC_STONE_ORE.get().asItem().getDefaultInstance());
            entries.addBefore(CobblemonItems.MOON_STONE_ORE.asItem().getDefaultInstance(),
                    GravelmonItems.DEEPSLATE_MYSTIC_STONE_ORE.get().asItem().getDefaultInstance());

            entries.addAfter(CobblemonItems.DEEPSLATE_SHINY_STONE_ORE.asItem().getDefaultInstance(),
                    GravelmonItems.DEEPSLATE_SOLID_STONE_ORE.get().asItem().getDefaultInstance());
            entries.addAfter(CobblemonItems.DEEPSLATE_SHINY_STONE_ORE.asItem().getDefaultInstance(),
                    GravelmonItems.SOLID_STONE_ORE.get().asItem().getDefaultInstance());
            entries.accept(CobblemonItems.DEEPSLATE_SHINY_STONE_ORE.asItem().getDefaultInstance());
        });

        ItemGroupEvents.modifyEntriesEvent(CobblemonItemGroups.getHELD_ITEMS_KEY()).register(entries -> {
            entries.accept(GravelmonItems.LONG_CLUB.get().asItem().getDefaultInstance());
            entries.accept(GravelmonItems.TERRESTRIAL_RING.get().asItem().getDefaultInstance());
            entries.accept(GravelmonItems.XENOVERSAL_RING.get().asItem().getDefaultInstance());
            entries.accept(GravelmonItems.INDUCTIVE_RING.get().asItem().getDefaultInstance());
        });

        ItemGroupEvents.modifyEntriesEvent(CobblemonItemGroups.getAGRICULTURE_KEY()).register(entries -> {
            entries.addBefore(CobblemonItems.PINK_APRICORN.asItem().getDefaultInstance(),
                    GravelmonItems.ORANGE_APRICORN.get().asItem().getDefaultInstance());
            entries.addAfter(CobblemonItems.PINK_APRICORN.asItem().getDefaultInstance(),
                    GravelmonItems.PURPLE_APRICORN.get().asItem().getDefaultInstance());

            entries.addBefore(CobblemonItems.PINK_APRICORN_SEED.asItem().getDefaultInstance(),
                    GravelmonItems.ORANGE_APRICORN_SEED.get().asItem().getDefaultInstance());
            entries.addAfter(CobblemonItems.PINK_APRICORN_SEED.asItem().getDefaultInstance(),
                    GravelmonItems.PURPLE_APRICORN_SEED.get().asItem().getDefaultInstance());
        });
    }
}
