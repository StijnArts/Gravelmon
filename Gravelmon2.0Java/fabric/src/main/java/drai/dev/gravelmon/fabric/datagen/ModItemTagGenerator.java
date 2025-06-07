package drai.dev.gravelmon.fabric.datagen;

import com.cobblemon.mod.common.api.tags.*;
import com.cobblemon.yajatkaul.mega_showdown.*;
import drai.dev.gravelmon.*;
import drai.dev.gravelmon.mega.*;
import drai.dev.gravelmon.registries.*;
import net.fabricmc.fabric.api.datagen.v1.*;
import net.fabricmc.fabric.api.datagen.v1.provider.*;
import net.minecraft.core.*;
import net.minecraft.core.registries.*;
import net.minecraft.resources.*;
import net.minecraft.tags.*;
import net.minecraft.world.item.*;

import java.util.concurrent.*;

public class ModItemTagGenerator extends FabricTagProvider.ItemTagProvider {
    public ModItemTagGenerator(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }
    @Override
    protected void addTags(HolderLookup.Provider arg) {
        getOrCreateTagBuilder(CobblemonItemTags.EVOLUTION_STONES)
                .add(GravelmonItems.ASTRAL_STONE.get(),
                        GravelmonItems.AIR_STONE.get(),
                        GravelmonItems.MYSTIC_STONE.get(),
                        GravelmonItems.SOLID_STONE.get(),
                        GravelmonItems.XENOLITH.get());
        getOrCreateTagBuilder(CobblemonItemTags.EVOLUTION_ITEMS)
                .add(GravelmonItems.CORRUPTED_DISC.get(),
                        GravelmonItems.QUANTUM_UPGRADE.get(),
                        GravelmonItems.KALEIDOSCOPE.get(),
                        GravelmonItems.WES_UPDATE.get(),
                        GravelmonItems.MURKY_CLAW.get(),
                        GravelmonItems.SILVER_SCALE.get(),
                        GravelmonItems.ANCIENT_GLYPH.get(),
//                        GravelmonItems.VOIDIX.get(),
//                        GravelmonItems.ELECTRIX.get(),
//                        GravelmonItems.BURIX.get(),
//                        GravelmonItems.AQUIX.get(),
//                        GravelmonItems.VERDIX.get(),
//                        GravelmonItems.ZERIX.get(),
//                        GravelmonItems.PATHIX.get(),
//                        GravelmonItems.PIXIX.get(),
                        GravelmonItems.SLOWPOKE_TAIL.get(),
                        GravelmonItems.DREAD_PENDANT.get(),
                        GravelmonItems.SPARE_PARTS.get(),
                        GravelmonItems.MAGIC_COOKIE.get(),
                        GravelmonItems.GOLDEN_FEATHER.get(),
                        GravelmonItems.PIXIE_DUST.get(),
                        GravelmonItems.OCARINA.get(),
                        GravelmonItems.ROYAL_JELLY.get(),
                        GravelmonItems.COCONUT_MILK.get(),
                        GravelmonItems.CARROT_WINE.get(),
                        GravelmonItems.URANIUM_CORE.get(),
                        GravelmonItems.PREADITE.get(),
                        GravelmonItems.EMPTY_SKULL.get(),
                        GravelmonItems.FOREIGN_HAT.get(),
                        GravelmonItems.PRIM_SHEARS.get(),
                        GravelmonItems.HAIR_TONIC.get(),
                        GravelmonItems.GROWTH_MULCH.get(),
                        GravelmonItems.TERRESTRIAL_RING.get(),
                        GravelmonItems.XENOVERSAL_RING.get(),
                        GravelmonItems.INDUCTIVE_RING.get()
                );

        getOrCreateTagBuilder(CobblemonItemTags.ANY_HELD_ITEM)
                .add(
                        GravelmonItems.LONG_CLUB.get(),
                        GravelmonItems.X_RAY_SPECS.get(),
                        GravelmonItems.FOUL_ROCK.get(),
                        GravelmonItems.RAGGED_PEBBLE.get(),
                        GravelmonItems.POLISHED_SPHERE.get(),
                        GravelmonItems.CORRUPTED_SEED.get(),
                        GravelmonItems.BOLT_ORB.get(),
                        GravelmonItems.IVEOLITE.get(),
                        GravelmonItems.ICE_SHARD.get(),
                        //Xenoverse
                        GravelmonItems.HAFLI_BERRY.get(),
                        GravelmonItems.MOSS_SHARD.get(),
                        GravelmonItems.PRETTY_RIBBON.get(),
                        //insurgence
                        GravelmonItems.DARK_ROCK.get()
                );
        var fossilTagBuilder = getOrCreateTagBuilder(CobblemonItemTags.FOSSILS);
        Gravelmon.FOSSIL_ITEM_MAP.forEach((key, value) -> fossilTagBuilder.add(value.get()));
        var pokeballTagBuilder = getOrCreateTagBuilder(CobblemonItemTags.POKE_BALLS);
        GravelmonItems.POKE_BALLS.forEach((key) -> pokeballTagBuilder.add(key.get()));
        var megaStoneTagBuilder = getOrCreateTagBuilder(GravelmonItemTags.MEGA_STONES);
        GravelmonMegas.MEGA_STONE_SUPPLIERS_IDS.keySet().forEach((key) -> megaStoneTagBuilder.add(key.get()));
    }
}
