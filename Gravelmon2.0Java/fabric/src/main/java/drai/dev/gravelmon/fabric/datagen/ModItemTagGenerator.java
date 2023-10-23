package drai.dev.gravelmon.fabric.datagen;

import com.cobblemon.mod.common.api.tags.*;
import drai.dev.gravelmon.*;
import drai.dev.gravelmon.registries.*;
import net.fabricmc.fabric.api.datagen.v1.*;
import net.fabricmc.fabric.api.datagen.v1.provider.*;
import net.minecraft.core.*;
import net.minecraft.resources.*;

import java.util.concurrent.*;

public class ModItemTagGenerator extends FabricTagProvider.ItemTagProvider {
    public ModItemTagGenerator(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {
        getOrCreateTagBuilder(CobblemonItemTags.EVOLUTION_STONES)
                .add(GravelmonItems.ASTRAL_STONE_ORE.get(),
                        GravelmonItems.AIR_STONE_ORE.get(),
                        GravelmonItems.MYSTIC_STONE_ORE.get(),
                        GravelmonItems.MYSTIC_STONE_ORE.get(),
                        GravelmonItems.XENOLITH.get());
         var generatedFolder = pathProvider.file(new ResourceLocation("cobblemon","blocks"),".json")
                .getParent().getParent().getParent().getParent().getParent().getParent().toString()+"\\resources";
        LanguageGenerator.generateLangFile();
        GravelmonJsonGenerator.run(generatedFolder);
        getOrCreateTagBuilder(CobblemonItemTags.EVOLUTION_ITEMS)
                .add(GravelmonItems.CORRUPTED_DISC.get(),
                        GravelmonItems.QUANTUM_UPGRADE.get(),
                        GravelmonItems.KALEIDOSCOPE.get(),
                        GravelmonItems.WES_UPDATE.get(),
                        GravelmonItems.MURKY_CLAW.get(),
                        GravelmonItems.SILVER_SCALE.get(),
                        GravelmonItems.ANCIENT_GLYPH.get(),
                        GravelmonItems.VOIDIX.get(),
                        GravelmonItems.ELECTRIX.get(),
                        GravelmonItems.BURIX.get(),
                        GravelmonItems.AQUIX.get(),
                        GravelmonItems.VERDIX.get(),
                        GravelmonItems.ZERIX.get(),
                        GravelmonItems.PATHIX.get(),
                        GravelmonItems.PIXIX.get(),
                        GravelmonItems.SLOWPOKE_TAIL.get(),
                        GravelmonItems.DREAD_PENDANT.get(),
                        GravelmonItems.SPARE_PARTS.get(),
                        GravelmonItems.MAGIC_COOKIE.get());

        getOrCreateTagBuilder(CobblemonItemTags.ANY_HELD_ITEM)
                .add(GravelmonItems.LONG_CLUB.get(),
                        GravelmonItems.TERRESTRIAL_RING.get(),
                        GravelmonItems.XENOVERSAL_RING.get(),
                        GravelmonItems.INDUCTIVE_RING.get());
    }
}
