package drai.dev.gravelmon.forge.datagen;

import com.cobblemon.mod.common.api.tags.*;
import drai.dev.gravelmon.*;
import drai.dev.gravelmon.registries.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;


import java.util.concurrent.*;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                               CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, Gravelmon.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(CobblemonItemTags.EVOLUTION_STONES)
                .add(GravelmonItems.ASTRAL_STONE_ORE.get(),
                        GravelmonItems.AIR_STONE_ORE.get(),
                        GravelmonItems.MYSTIC_STONE_ORE.get(),
                        GravelmonItems.MYSTIC_STONE_ORE.get());

        this.tag(CobblemonItemTags.EVOLUTION_ITEMS)
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
                        GravelmonItems.PIXIX.get());

        this.tag(CobblemonItemTags.ANY_HELD_ITEM)
                .add(GravelmonItems.LONG_CLUB.get(),
                        GravelmonItems.TERRESTRIAL_RING.get(),
                        GravelmonItems.XENOVERSAL_RING.get());
    }
}