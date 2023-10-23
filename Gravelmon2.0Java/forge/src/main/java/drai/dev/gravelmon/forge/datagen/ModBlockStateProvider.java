package drai.dev.gravelmon.forge.datagen;

import dev.architectury.registry.registries.*;
import drai.dev.gravelmon.*;
import drai.dev.gravelmon.registries.*;
import net.minecraft.data.*;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.*;
import net.minecraftforge.common.data.*;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Gravelmon.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(GravelmonBlocks.ASTRAL_STONE_ORE);
        blockWithItem(GravelmonBlocks.DEEPSLATE_ASTRAL_STONE_ORE);
        blockWithItem(GravelmonBlocks.AIR_STONE_ORE);
        blockWithItem(GravelmonBlocks.DEEPSLATE_AIR_STONE_ORE);
        blockWithItem(GravelmonBlocks.MYSTIC_STONE_ORE);
        blockWithItem(GravelmonBlocks.DEEPSLATE_MYSTIC_STONE_ORE);
        blockWithItem(GravelmonBlocks.SOLID_STONE_ORE);
        blockWithItem(GravelmonBlocks.DEEPSLATE_SOLID_STONE_ORE);
    }

    private void blockWithItem(RegistrySupplier<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
