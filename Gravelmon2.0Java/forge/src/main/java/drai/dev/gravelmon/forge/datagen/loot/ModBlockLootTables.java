package drai.dev.gravelmon.forge.datagen.loot;

import drai.dev.gravelmon.registries.*;
import net.minecraft.data.loot.*;
import net.minecraft.world.flag.*;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.storage.loot.*;
import net.minecraft.world.level.storage.loot.entries.*;
import net.minecraft.world.level.storage.loot.functions.*;
import net.minecraft.world.level.storage.loot.providers.number.*;

import java.util.*;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.add(GravelmonBlocks.ASTRAL_STONE_ORE.get(),
                block -> createCopperLikeOreDrops(GravelmonBlocks.ASTRAL_STONE_ORE.get(), GravelmonItems.ASTRAL_STONE.get()));
        this.add(GravelmonBlocks.DEEPSLATE_ASTRAL_STONE_ORE.get(),
                block -> createCopperLikeOreDrops(GravelmonBlocks.DEEPSLATE_ASTRAL_STONE_ORE.get(), GravelmonItems.ASTRAL_STONE.get()));
        this.add(GravelmonBlocks.AIR_STONE_ORE.get(),
                block -> createCopperLikeOreDrops(GravelmonBlocks.AIR_STONE_ORE.get(), GravelmonItems.AIR_STONE.get()));
        this.add(GravelmonBlocks.DEEPSLATE_AIR_STONE_ORE.get(),
                block -> createCopperLikeOreDrops(GravelmonBlocks.DEEPSLATE_AIR_STONE_ORE.get(), GravelmonItems.AIR_STONE.get()));
        this.add(GravelmonBlocks.MYSTIC_STONE_ORE.get(),
                block -> createCopperLikeOreDrops(GravelmonBlocks.MYSTIC_STONE_ORE.get(), GravelmonItems.MYSTIC_STONE.get()));
        this.add(GravelmonBlocks.DEEPSLATE_MYSTIC_STONE_ORE.get(),
                block -> createCopperLikeOreDrops(GravelmonBlocks.DEEPSLATE_MYSTIC_STONE_ORE.get(), GravelmonItems.MYSTIC_STONE.get()));
        this.add(GravelmonBlocks.SOLID_STONE_ORE.get(),
                block -> createCopperLikeOreDrops(GravelmonBlocks.SOLID_STONE_ORE.get(), GravelmonItems.SOLID_STONE.get()));
        this.add(GravelmonBlocks.DEEPSLATE_SOLID_STONE_ORE.get(),
                block -> createCopperLikeOreDrops(GravelmonBlocks.DEEPSLATE_SOLID_STONE_ORE.get(), GravelmonItems.SOLID_STONE.get()));

    }

    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 1.0F)))));
    }
}
