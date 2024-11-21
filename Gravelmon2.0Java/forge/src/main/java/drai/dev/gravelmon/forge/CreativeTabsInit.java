package drai.dev.gravelmon.forge;

import com.cobblemon.mod.common.*;
import com.cobblemon.mod.common.api.fossil.*;
import com.cobblemon.mod.common.item.group.*;
import drai.dev.gravelmon.*;
import drai.dev.gravelmon.registries.*;
import drai.dev.gravelsextendedbattles.*;
import net.minecraft.resources.*;
import net.minecraft.world.item.*;
import net.neoforged.api.distmarker.*;
import net.neoforged.bus.api.*;
import net.neoforged.fml.common.*;
import net.neoforged.neoforge.event.*;

import java.util.function.*;

import static drai.dev.gravelmon.Gravelmon.FOSSIL_ITEM_MAP;

@EventBusSubscriber(modid = Gravelmon.MOD_ID)
public class CreativeTabsInit {

    @SubscribeEvent
    public static void buildContents(BuildCreativeModeTabContentsEvent event) {
        if(event.getTab() == CobblemonItemGroups.getEVOLUTION_ITEMS()) {
            //evolution stones
            event.insertAfter(CobblemonItems.ICE_STONE.getDefaultInstance(),
                    GravelmonItems.XENOLITH.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(CobblemonItems.ICE_STONE.getDefaultInstance(),
                    GravelmonItems.SOLID_STONE.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(CobblemonItems.ICE_STONE.getDefaultInstance(),
                    GravelmonItems.MYSTIC_STONE.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(CobblemonItems.ICE_STONE.getDefaultInstance(),
                    GravelmonItems.AIR_STONE.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(CobblemonItems.ICE_STONE.getDefaultInstance(),
                    GravelmonItems.VARIA_STONE.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(CobblemonItems.ICE_STONE.getDefaultInstance(),
                    GravelmonItems.ASTRAL_STONE.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            //evolution held items
            event.insertAfter(CobblemonItems.DUBIOUS_DISC.getDefaultInstance(),
                    GravelmonItems.WES_UPDATE.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(CobblemonItems.DUBIOUS_DISC.getDefaultInstance(),
                    GravelmonItems.QUANTUM_UPGRADE.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            /*event.insertAfter(CobblemonItems.LINK_CABLE.getDefaultInstance(),
                    GravelmonItems.PIXIX.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(CobblemonItems.LINK_CABLE.getDefaultInstance(),
                    GravelmonItems.PATHIX.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(CobblemonItems.LINK_CABLE.getDefaultInstance(),
                    GravelmonItems.ZERIX.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(CobblemonItems.LINK_CABLE.getDefaultInstance(),
                    GravelmonItems.VERDIX.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(CobblemonItems.LINK_CABLE.getDefaultInstance(),
                    GravelmonItems.VOIDIX.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(CobblemonItems.LINK_CABLE.getDefaultInstance(),
                    GravelmonItems.AQUIX.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(CobblemonItems.LINK_CABLE.getDefaultInstance(),
                    GravelmonItems.BURIX.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(CobblemonItems.LINK_CABLE.getDefaultInstance(),
                    GravelmonItems.ELECTRIX.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);*/

            event.insertAfter(CobblemonItems.GALARICA_WREATH.getDefaultInstance(),
                    GravelmonItems.SLOWPOKE_TAIL.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.insertBefore(CobblemonItems.METAL_COAT.getDefaultInstance(),
                    GravelmonItems.ANCIENT_GLYPH.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.insertBefore(CobblemonItems.PRISM_SCALE.getDefaultInstance(),
                    GravelmonItems.SILVER_SCALE.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertBefore(CobblemonItems.PRISM_SCALE.getDefaultInstance(),
                    GravelmonItems.MURKY_CLAW.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(GravelmonItems.TERRESTRIAL_RING.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(GravelmonItems.XENOVERSAL_RING.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(GravelmonItems.INDUCTIVE_RING.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.accept(GravelmonItems.CORRUPTED_DISC.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(GravelmonItems.KALEIDOSCOPE.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(GravelmonItems.DREAD_PENDANT.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(GravelmonItems.SPARE_PARTS.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(GravelmonItems.MAGIC_COOKIE.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(GravelmonItems.GOLDEN_FEATHER.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(GravelmonItems.PIXIE_DUST.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(GravelmonItems.OCARINA.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(GravelmonItems.ROYAL_JELLY.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(GravelmonItems.COCONUT_MILK.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(GravelmonItems.CARROT_WINE.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(GravelmonItems.URANIUM_CORE.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(GravelmonItems.PREADITE.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(GravelmonItems.EMPTY_SKULL.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(GravelmonItems.FOREIGN_HAT.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(GravelmonItems.PRIM_SHEARS.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(GravelmonItems.HAIR_TONIC.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(GravelmonItems.GROWTH_MULCH.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }

        if(event.getTab() == CobblemonItemGroups.getBLOCKS()) {
            event.insertBefore(CobblemonItems.DAWN_STONE_ORE.asItem().getDefaultInstance(),
                    GravelmonItems.AIR_STONE_ORE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertBefore(CobblemonItems.DAWN_STONE_ORE.asItem().getDefaultInstance(),
                    GravelmonItems.DEEPSLATE_AIR_STONE_ORE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertBefore(CobblemonItems.DAWN_STONE_ORE.asItem().getDefaultInstance(),
                    GravelmonItems.ASTRAL_STONE_ORE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertBefore(CobblemonItems.DAWN_STONE_ORE.asItem().getDefaultInstance(),
                    GravelmonItems.DEEPSLATE_ASTRAL_STONE_ORE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);


            event.insertBefore(CobblemonItems.MOON_STONE_ORE.asItem().getDefaultInstance(),
                    GravelmonItems.MYSTIC_STONE_ORE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertBefore(CobblemonItems.MOON_STONE_ORE.asItem().getDefaultInstance(),
                    GravelmonItems.DEEPSLATE_MYSTIC_STONE_ORE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);


            event.insertAfter(CobblemonItems.DEEPSLATE_SHINY_STONE_ORE.asItem().getDefaultInstance(),
                    GravelmonItems.DEEPSLATE_SOLID_STONE_ORE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(CobblemonItems.DEEPSLATE_SHINY_STONE_ORE.asItem().getDefaultInstance(),
                    GravelmonItems.SOLID_STONE_ORE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }

        if(event.getTab() == CobblemonItemGroups.getHELD_ITEMS()) {
            event.accept(GravelmonItems.LONG_CLUB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(GravelmonItems.ICE_SHARD.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(GravelmonItems.PRETTY_RIBBON.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(GravelmonItems.MOSS_SHARD.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(GravelmonItems.X_RAY_SPECS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(GravelmonItems.FOUL_ROCK.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(GravelmonItems.RAGGED_PEBBLE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(GravelmonItems.POLISHED_SPHERE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(GravelmonItems.CORRUPTED_SEED.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(CobblemonItems.FLAME_ORB.asItem().getDefaultInstance(),
                    GravelmonItems.BOLT_ORB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(CobblemonItems.EVIOLITE.asItem().getDefaultInstance(),
                    GravelmonItems.IVEOLITE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertBefore(CobblemonItems.HEAT_ROCK.asItem().getDefaultInstance(),
                    GravelmonItems.DARK_ROCK.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }

        if(event.getTab() == CobblemonItemGroups.getAGRICULTURE()) {
            event.insertBefore(CobblemonItems.PINK_APRICORN.asItem().getDefaultInstance(),
                    GravelmonItems.ORANGE_APRICORN.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(CobblemonItems.PINK_APRICORN.asItem().getDefaultInstance(),
                    GravelmonItems.PURPLE_APRICORN.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertBefore(CobblemonItems.PINK_APRICORN_SEED.asItem().getDefaultInstance(),
                    GravelmonItems.ORANGE_APRICORN_SEED.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(CobblemonItems.PINK_APRICORN_SEED.asItem().getDefaultInstance(),
                    GravelmonItems.PURPLE_APRICORN_SEED.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(GravelmonItems.HAFLI_BERRY.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(GravelmonItems.HAFLI_BERRY.get().asItem().getDefaultInstance());
        }

        if(event.getTab() == CobblemonItemGroups.getUTILITY_ITEMS()) {
            event.insertAfter(CobblemonItems.CITRINE_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.MAUVE_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(CobblemonItems.CITRINE_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.CORAL_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(CobblemonItems.DUSK_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.DAWN_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertBefore(CobblemonItems.MOON_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.SUN_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(CobblemonItems.HEAVY_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.FEATHER_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(CobblemonItems.QUICK_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.TYPING_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(CobblemonItems.ULTRA_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.ULTRA_ROCKET_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(CobblemonItems.ULTRA_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.GREAT_ROCKET_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(CobblemonItems.ULTRA_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.ROCKET_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(CobblemonItems.NET_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.NUCLEAR_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(CobblemonItems.BEAST_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.ATOM_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(CobblemonItems.NET_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.DELTA_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertBefore(CobblemonItems.BEAST_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.ANCIENT_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(CobblemonItems.QUICK_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.SNORE_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertBefore(CobblemonItems.MASTER_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.SHINY_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(CobblemonItems.CHERISH_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.NUZLOCKE_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(CobblemonItems.CHERISH_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.LUSTER_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(CobblemonItems.MASTER_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.ARK_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(CobblemonItems.GREAT_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.LIME_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(CobblemonItems.DIVE_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.LAKE_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(CobblemonItems.SAFARI_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.FISHING_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(CobblemonItems.SAFARI_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.ANIME_SAFARI_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(CobblemonItems.SAFARI_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.MANGA_SAFARI_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(CobblemonItems.ULTRA_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.ANNIE_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(CobblemonItems.ULTRA_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.OAKLEY_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(CobblemonItems.PREMIER_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.GS_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(CobblemonItems.PREMIER_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.ANIME_GS_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(CobblemonItems.LURE_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.GEN2_LURE_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(CobblemonItems.BEAST_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.XENO_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(GravelmonItems.GAY_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(GravelmonItems.LESBIAN_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(GravelmonItems.BI_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(GravelmonItems.PAN_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(GravelmonItems.TRANS_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(GravelmonItems.NON_BINARY_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(GravelmonItems.ACE_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.accept(GravelmonItems.ARO_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(CobblemonItems.ANCIENT_CITRINE_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.ANCIENT_CORAL_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(CobblemonItems.ANCIENT_CITRINE_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.ANCIENT_MAUVE_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }

        if(event.getTab() == CobblemonItemGroups.getARCHAEOLOGY()) {
            Consumer<ItemStack> fossilConsumer = (fossil)-> event.insertAfter(CobblemonItems.FOSSILIZED_DINO.asItem().getDefaultInstance(), fossil,
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            Gravelmon.FOSSIL_MAP.forEach((key, value) -> {
                var fossil = Fossils.INSTANCE.getByIdentifier(ResourceLocation.fromNamespaceAndPath("cobblemon", value.split(" ")[0]));
                if(fossil == null) return;
                if(SpeciesManager.containsBannedLabels(fossil.getResult().getSpecies(), fossil.getResult().getForm())) return;
                fossilConsumer.accept(FOSSIL_ITEM_MAP.get(key).get().getDefaultInstance());
            });
        }
    }
}
