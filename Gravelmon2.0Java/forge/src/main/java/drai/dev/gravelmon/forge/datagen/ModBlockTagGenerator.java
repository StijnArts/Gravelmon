package drai.dev.gravelmon.forge.datagen;

import com.cobblemon.mod.common.api.tags.*;
import drai.dev.gravelmon.*;
import drai.dev.gravelmon.registries.*;
import net.minecraft.core.*;
import net.minecraft.data.*;
import net.minecraft.tags.*;
import net.minecraftforge.common.*;
import net.minecraftforge.common.data.*;

import javax.annotation.*;
import java.util.concurrent.*;

public class ModBlockTagGenerator extends BlockTagsProvider{
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Gravelmon.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(GravelmonBlocks.ASTRAL_STONE_ORE.get(),
                        GravelmonBlocks.DEEPSLATE_ASTRAL_STONE_ORE.get(),
                        GravelmonBlocks.AIR_STONE_ORE.get(),
                        GravelmonBlocks.DEEPSLATE_AIR_STONE_ORE.get(),
                        GravelmonBlocks.MYSTIC_STONE_ORE.get(),
                        GravelmonBlocks.DEEPSLATE_MYSTIC_STONE_ORE.get(),
                        GravelmonBlocks.SOLID_STONE_ORE.get(),
                        GravelmonBlocks.DEEPSLATE_MYSTIC_STONE_ORE.get());


        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(GravelmonBlocks.DEEPSLATE_ASTRAL_STONE_ORE.get(),
                        GravelmonBlocks.DEEPSLATE_AIR_STONE_ORE.get(),
                        GravelmonBlocks.DEEPSLATE_MYSTIC_STONE_ORE.get(),
                        GravelmonBlocks.DEEPSLATE_MYSTIC_STONE_ORE.get());

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(GravelmonBlocks.ASTRAL_STONE_ORE.get(),
                        GravelmonBlocks.AIR_STONE_ORE.get(),
                        GravelmonBlocks.MYSTIC_STONE_ORE.get(),
                        GravelmonBlocks.SOLID_STONE_ORE.get());
    }
}
