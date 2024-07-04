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
            entries.accept(GravelmonItems.TERRESTRIAL_RING.get().asItem().getDefaultInstance());
            entries.accept(GravelmonItems.XENOVERSAL_RING.get().asItem().getDefaultInstance());
            entries.accept(GravelmonItems.INDUCTIVE_RING.get().asItem().getDefaultInstance());

            entries.accept(GravelmonItems.GOLDEN_FEATHER.get().getDefaultInstance());
            entries.accept(GravelmonItems.PIXIE_DUST.get().getDefaultInstance());
            entries.accept(GravelmonItems.OCARINA.get().getDefaultInstance());
            entries.accept(GravelmonItems.ROYAL_JELLY.get().getDefaultInstance());
            entries.accept(GravelmonItems.COCONUT_MILK.get().getDefaultInstance());
            entries.accept(GravelmonItems.CARROT_WINE.get().getDefaultInstance());
            entries.accept(GravelmonItems.URANIUM_CORE.get().getDefaultInstance());
            entries.accept(GravelmonItems.PREADITE.get().getDefaultInstance());
            entries.accept(GravelmonItems.EMPTY_SKULL.get().getDefaultInstance());
            entries.accept(GravelmonItems.FOREIGN_HAT.get().getDefaultInstance());
            entries.accept(GravelmonItems.PRIM_SHEARS.get().getDefaultInstance());
            entries.accept(GravelmonItems.HAIR_TONIC.get().getDefaultInstance());
            entries.accept(GravelmonItems.GROWTH_MULCH.get().getDefaultInstance());
        });

        ItemGroupEvents.modifyEntriesEvent(CobblemonItemGroups.getBLOCKS_KEY()).register(entries -> {
            entries.addBefore(CobblemonItems.DAWN_STONE_ORE.asItem().getDefaultInstance(),
                    GravelmonItems.AIR_STONE_ORE.get().asItem().getDefaultInstance());
            entries.addBefore(CobblemonItems.DAWN_STONE_ORE.asItem().getDefaultInstance(),
                    GravelmonItems.DEEPSLATE_AIR_STONE_ORE.get().asItem().getDefaultInstance());
            entries.addBefore(CobblemonItems.DAWN_STONE_ORE.asItem().getDefaultInstance(),
                    GravelmonItems.ASTRAL_STONE_ORE.get().asItem().getDefaultInstance());
            entries.addBefore(CobblemonItems.DAWN_STONE_ORE.asItem().getDefaultInstance(),
                    GravelmonItems.DEEPSLATE_ASTRAL_STONE_ORE.get().asItem().getDefaultInstance());

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
            entries.accept(GravelmonItems.X_RAY_SPECS.get().asItem().getDefaultInstance());
            entries.accept(GravelmonItems.FOUL_ROCK.get().asItem().getDefaultInstance());
            entries.accept(GravelmonItems.RAGGED_PEBBLE.get().asItem().getDefaultInstance());
            entries.accept(GravelmonItems.POLISHED_SPHERE.get().asItem().getDefaultInstance());
            entries.accept(GravelmonItems.CORRUPTED_SEED.get().asItem().getDefaultInstance());
            entries.addAfter(CobblemonItems.FLAME_ORB.asItem().getDefaultInstance(),
                    GravelmonItems.BOLT_ORB.get().asItem().getDefaultInstance());
            entries.addAfter(CobblemonItems.EVIOLITE.asItem().getDefaultInstance(),
                    GravelmonItems.IVEOLITE.get().asItem().getDefaultInstance());
            entries.addBefore(CobblemonItems.HEAT_ROCK.asItem().getDefaultInstance(),
                    GravelmonItems.DARK_ROCK.get().asItem().getDefaultInstance());
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

        ItemGroupEvents.modifyEntriesEvent(CobblemonItemGroups.getPOKEBALLS_KEY()).register(entries -> {
            entries.addAfter(CobblemonItems.CITRINE_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.MAUVE_BALL.get().asItem().getDefaultInstance());
            entries.addAfter(CobblemonItems.CITRINE_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.CORAL_BALL.get().asItem().getDefaultInstance());
            entries.addAfter(CobblemonItems.ANCIENT_CITRINE_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.ANCIENT_CORAL_BALL.get().asItem().getDefaultInstance());
            entries.addAfter(CobblemonItems.ANCIENT_CITRINE_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.ANCIENT_MAUVE_BALL.get().asItem().getDefaultInstance());
            entries.addAfter(CobblemonItems.DUSK_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.DAWN_BALL.get().asItem().getDefaultInstance());
            entries.addBefore(CobblemonItems.MOON_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.SUN_BALL.get().asItem().getDefaultInstance());
            entries.addAfter(CobblemonItems.HEAVY_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.FEATHER_BALL.get().asItem().getDefaultInstance());
            entries.addAfter(CobblemonItems.QUICK_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.TYPING_BALL.get().asItem().getDefaultInstance());
            entries.addAfter(CobblemonItems.ULTRA_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.ULTRA_ROCKET_BALL.get().asItem().getDefaultInstance());
            entries.addAfter(CobblemonItems.ULTRA_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.GREAT_ROCKET_BALL.get().asItem().getDefaultInstance());
            entries.addAfter(CobblemonItems.ULTRA_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.ROCKET_BALL.get().asItem().getDefaultInstance());
            entries.addAfter(CobblemonItems.NET_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.NUCLEAR_BALL.get().asItem().getDefaultInstance());
            entries.addAfter(CobblemonItems.BEAST_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.ATOM_BALL.get().asItem().getDefaultInstance());
            entries.addAfter(CobblemonItems.NET_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.DELTA_BALL.get().asItem().getDefaultInstance());
            entries.addBefore(CobblemonItems.BEAST_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.ANCIENT_BALL.get().asItem().getDefaultInstance());
            entries.addAfter(CobblemonItems.QUICK_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.SNORE_BALL.get().asItem().getDefaultInstance());
            entries.addBefore(CobblemonItems.MASTER_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.SHINY_BALL.get().asItem().getDefaultInstance());
            entries.addAfter(CobblemonItems.CHERISH_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.NUZLOCKE_BALL.get().asItem().getDefaultInstance());
            entries.addAfter(CobblemonItems.CHERISH_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.LUSTER_BALL.get().asItem().getDefaultInstance());
            entries.addAfter(CobblemonItems.MASTER_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.ARK_BALL.get().asItem().getDefaultInstance());
            entries.addAfter(CobblemonItems.GREAT_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.LIME_BALL.get().asItem().getDefaultInstance());
            entries.addAfter(CobblemonItems.DIVE_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.LAKE_BALL.get().asItem().getDefaultInstance());
            entries.addAfter(CobblemonItems.SAFARI_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.FISHING_BALL.get().asItem().getDefaultInstance());
            entries.addAfter(CobblemonItems.SAFARI_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.ANIME_SAFARI_BALL.get().asItem().getDefaultInstance());
            entries.addAfter(CobblemonItems.SAFARI_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.MANGA_SAFARI_BALL.get().asItem().getDefaultInstance());
            entries.addAfter(CobblemonItems.ULTRA_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.ANNIE_BALL.get().asItem().getDefaultInstance());
            entries.addAfter(CobblemonItems.ULTRA_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.OAKLEY_BALL.get().asItem().getDefaultInstance());
            entries.addAfter(CobblemonItems.PREMIER_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.GS_BALL.get().asItem().getDefaultInstance());
            entries.addAfter(CobblemonItems.PREMIER_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.ANIME_GS_BALL.get().asItem().getDefaultInstance());
            entries.addAfter(CobblemonItems.LURE_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.GEN2_LURE_BALL.get().asItem().getDefaultInstance());
            entries.addAfter(CobblemonItems.BEAST_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.XENO_BALL.get().asItem().getDefaultInstance());
            entries.accept(GravelmonItems.GAY_BALL.get().asItem().getDefaultInstance());
            entries.accept(GravelmonItems.LESBIAN_BALL.get().asItem().getDefaultInstance());
            entries.accept(GravelmonItems.BI_BALL.get().asItem().getDefaultInstance());
            entries.accept(GravelmonItems.PAN_BALL.get().asItem().getDefaultInstance());
            entries.accept(GravelmonItems.TRANS_BALL.get().asItem().getDefaultInstance());
            entries.accept(GravelmonItems.NON_BINARY_BALL.get().asItem().getDefaultInstance());
            entries.accept(GravelmonItems.ACE_BALL.get().asItem().getDefaultInstance());
            entries.accept(GravelmonItems.ARO_BALL.get().asItem().getDefaultInstance());
        });
    }
}
