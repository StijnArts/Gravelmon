package drai.dev.gravelmon.forge;

import com.cobblemon.mod.common.*;
import com.cobblemon.mod.common.api.*;
import com.cobblemon.mod.common.item.*;
import com.cobblemon.mod.common.item.group.*;
import com.cobblemon.mod.common.platform.events.*;
import com.cobblemon.mod.common.util.*;
import drai.dev.gravelmon.*;
import drai.dev.gravelmon.registries.*;
import kotlin.*;
import net.minecraft.*;
import net.minecraft.locale.*;
import net.minecraft.network.chat.*;
import net.minecraft.world.item.*;
import net.minecraftforge.api.distmarker.*;
import net.minecraftforge.event.*;
import net.minecraftforge.eventbus.api.*;
import net.minecraftforge.fml.common.*;

import java.util.stream.*;

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
            event.getEntries().put(GravelmonItems.TERRESTRIAL_RING.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(GravelmonItems.XENOVERSAL_RING.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(GravelmonItems.INDUCTIVE_RING.get().asItem().getDefaultInstance(),
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
            event.getEntries().put(GravelmonItems.GOLDEN_FEATHER.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(GravelmonItems.PIXIE_DUST.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(GravelmonItems.OCARINA.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(GravelmonItems.ROYAL_JELLY.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(GravelmonItems.COCONUT_MILK.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(GravelmonItems.CARROT_WINE.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(GravelmonItems.URANIUM_CORE.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(GravelmonItems.PREADITE.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(GravelmonItems.EMPTY_SKULL.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(GravelmonItems.KEYBONE.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(GravelmonItems.BACCHUS_LAUREL.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(GravelmonItems.FOREIGN_HAT.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(GravelmonItems.PRIM_SHEARS.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(GravelmonItems.HAIR_TONIC.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(GravelmonItems.GROWTH_MULCH.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }

        if(event.getTab() == CobblemonItemGroups.getBLOCKS()) {
            event.getEntries().putBefore(CobblemonItems.DAWN_STONE_ORE.asItem().getDefaultInstance(),
                    GravelmonItems.AIR_STONE_ORE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putBefore(CobblemonItems.DAWN_STONE_ORE.asItem().getDefaultInstance(),
                    GravelmonItems.DEEPSLATE_AIR_STONE_ORE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putBefore(CobblemonItems.DAWN_STONE_ORE.asItem().getDefaultInstance(),
                    GravelmonItems.ASTRAL_STONE_ORE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putBefore(CobblemonItems.DAWN_STONE_ORE.asItem().getDefaultInstance(),
                    GravelmonItems.DEEPSLATE_ASTRAL_STONE_ORE.get().asItem().getDefaultInstance(),
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
            event.getEntries().put(GravelmonItems.X_RAY_SPECS.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(GravelmonItems.FOUL_ROCK.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(GravelmonItems.RAGGED_PEBBLE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(GravelmonItems.POLISHED_SPHERE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(GravelmonItems.CORRUPTED_SEED.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(CobblemonItems.FLAME_ORB.asItem().getDefaultInstance(),
                    GravelmonItems.BOLT_ORB.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(CobblemonItems.EVIOLITE.asItem().getDefaultInstance(),
                    GravelmonItems.IVEOLITE.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putBefore(CobblemonItems.HEAT_ROCK.asItem().getDefaultInstance(),
                    GravelmonItems.DARK_ROCK.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }

        if(event.getTab() == CobblemonItemGroups.getAGRICULTURE()) {
            event.getEntries().putBefore(CobblemonItems.PINK_APRICORN.asItem().getDefaultInstance(),
                    GravelmonItems.ORANGE_APRICORN.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(CobblemonItems.PINK_APRICORN.asItem().getDefaultInstance(),
                    GravelmonItems.PURPLE_APRICORN.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putBefore(CobblemonItems.PINK_APRICORN_SEED.asItem().getDefaultInstance(),
                    GravelmonItems.ORANGE_APRICORN_SEED.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(CobblemonItems.PINK_APRICORN_SEED.asItem().getDefaultInstance(),
                    GravelmonItems.PURPLE_APRICORN_SEED.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }

        if(event.getTab() == CobblemonItemGroups.getPOKEBALLS()) {
            event.getEntries().putAfter(CobblemonItems.CITRINE_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.MAUVE_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(CobblemonItems.CITRINE_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.CORAL_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(CobblemonItems.DUSK_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.DAWN_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putBefore(CobblemonItems.MOON_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.SUN_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(CobblemonItems.HEAVY_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.FEATHER_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(CobblemonItems.QUICK_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.TYPING_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(CobblemonItems.ULTRA_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.ULTRA_ROCKET_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(CobblemonItems.ULTRA_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.GREAT_ROCKET_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(CobblemonItems.ULTRA_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.ROCKET_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(CobblemonItems.NET_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.NUCLEAR_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(CobblemonItems.BEAST_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.ATOM_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(CobblemonItems.NET_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.DELTA_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putBefore(CobblemonItems.BEAST_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.ANCIENT_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(CobblemonItems.QUICK_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.SNORE_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putBefore(CobblemonItems.MASTER_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.SHINY_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(CobblemonItems.CHERISH_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.NUZLOCKE_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(CobblemonItems.CHERISH_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.LUSTER_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(CobblemonItems.MASTER_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.ARK_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(CobblemonItems.GREAT_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.LIME_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(CobblemonItems.DIVE_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.LAKE_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(CobblemonItems.SAFARI_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.FISHING_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(CobblemonItems.SAFARI_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.ANIME_SAFARI_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(CobblemonItems.SAFARI_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.MANGA_SAFARI_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(CobblemonItems.ULTRA_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.ANNIE_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(CobblemonItems.ULTRA_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.OAKLEY_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(CobblemonItems.PREMIER_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.GS_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(CobblemonItems.PREMIER_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.ANIME_GS_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(CobblemonItems.LURE_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.GEN2_LURE_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(CobblemonItems.BEAST_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.XENO_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(GravelmonItems.GAY_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(GravelmonItems.LESBIAN_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(GravelmonItems.BI_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(GravelmonItems.PAN_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(GravelmonItems.TRANS_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(GravelmonItems.NON_BINARY_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(GravelmonItems.ACE_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(GravelmonItems.ARO_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(CobblemonItems.ANCIENT_CITRINE_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.ANCIENT_CORAL_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(CobblemonItems.ANCIENT_CITRINE_BALL.asItem().getDefaultInstance(),
                    GravelmonItems.ANCIENT_MAUVE_BALL.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
    }
}
