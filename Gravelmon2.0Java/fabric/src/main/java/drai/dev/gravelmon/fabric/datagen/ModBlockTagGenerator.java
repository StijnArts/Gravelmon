package drai.dev.gravelmon.fabric.datagen;

import com.cobblemon.mod.common.api.tags.*;
import drai.dev.gravelmon.registries.*;
import net.fabricmc.fabric.api.datagen.v1.*;
import net.fabricmc.fabric.api.datagen.v1.provider.*;
import net.minecraft.core.*;
import net.minecraft.tags.*;

import java.util.concurrent.*;

public class ModBlockTagGenerator extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagGenerator(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {
        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(GravelmonBlocks.ASTRAL_STONE_ORE.get(),
                        GravelmonBlocks.DEEPSLATE_ASTRAL_STONE_ORE.get(),
                        GravelmonBlocks.AIR_STONE_ORE.get(),
                        GravelmonBlocks.DEEPSLATE_AIR_STONE_ORE.get(),
                        GravelmonBlocks.MYSTIC_STONE_ORE.get(),
                        GravelmonBlocks.DEEPSLATE_MYSTIC_STONE_ORE.get(),
                        GravelmonBlocks.SOLID_STONE_ORE.get(),
                        GravelmonBlocks.DEEPSLATE_SOLID_STONE_ORE.get());

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(GravelmonBlocks.DEEPSLATE_ASTRAL_STONE_ORE.get(),
                        GravelmonBlocks.DEEPSLATE_AIR_STONE_ORE.get(),
                        GravelmonBlocks.DEEPSLATE_MYSTIC_STONE_ORE.get(),
                        GravelmonBlocks.DEEPSLATE_SOLID_STONE_ORE.get());

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(GravelmonBlocks.ASTRAL_STONE_ORE.get(),
                        GravelmonBlocks.AIR_STONE_ORE.get(),
                        GravelmonBlocks.MYSTIC_STONE_ORE.get(),
                        GravelmonBlocks.SOLID_STONE_ORE.get());
    }
}
