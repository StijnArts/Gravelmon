package drai.dev.gravelmon.fabric.datagen;

import drai.dev.gravelmon.registries.*;
import net.fabricmc.fabric.api.datagen.v1.*;
import net.fabricmc.fabric.api.datagen.v1.provider.*;
import net.minecraft.core.*;
import net.minecraft.data.loot.*;
import net.minecraft.world.level.storage.loot.entries.*;

import java.util.concurrent.*;

public class ModBlockLootTables extends FabricBlockLootTableProvider {


    protected ModBlockLootTables(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        add(GravelmonBlocks.ASTRAL_STONE_ORE.get(),
                createSilkTouchDispatchTable(GravelmonBlocks.ASTRAL_STONE_ORE.get(),
                        applyExplosionCondition(GravelmonBlocks.ASTRAL_STONE_ORE.get(),
                                LootItem.lootTableItem(GravelmonItems.ASTRAL_STONE.get()))));
        add(GravelmonBlocks.DEEPSLATE_ASTRAL_STONE_ORE.get(),
                createSilkTouchDispatchTable(GravelmonBlocks.DEEPSLATE_ASTRAL_STONE_ORE.get(),
                        applyExplosionCondition(GravelmonBlocks.DEEPSLATE_ASTRAL_STONE_ORE.get(),
                                LootItem.lootTableItem(GravelmonItems.ASTRAL_STONE.get()))));
        add(GravelmonBlocks.DEEPSLATE_MYSTIC_STONE_ORE.get(),
                createSilkTouchDispatchTable(GravelmonBlocks.DEEPSLATE_MYSTIC_STONE_ORE.get(),
                        applyExplosionCondition(GravelmonBlocks.DEEPSLATE_MYSTIC_STONE_ORE.get(),
                                LootItem.lootTableItem(GravelmonItems.MYSTIC_STONE.get()))));
        add(GravelmonBlocks.MYSTIC_STONE_ORE.get(),
                createSilkTouchDispatchTable(GravelmonBlocks.MYSTIC_STONE_ORE.get(),
                        applyExplosionCondition(GravelmonBlocks.MYSTIC_STONE_ORE.get(),
                                LootItem.lootTableItem(GravelmonItems.MYSTIC_STONE.get()))));
        add(GravelmonBlocks.AIR_STONE_ORE.get(),
                createSilkTouchDispatchTable(GravelmonBlocks.AIR_STONE_ORE.get(),
                        applyExplosionCondition(GravelmonBlocks.AIR_STONE_ORE.get(),
                                LootItem.lootTableItem(GravelmonItems.AIR_STONE.get()))));
        add(GravelmonBlocks.DEEPSLATE_AIR_STONE_ORE.get(),
                createSilkTouchDispatchTable(GravelmonBlocks.DEEPSLATE_AIR_STONE_ORE.get(),
                        applyExplosionCondition(GravelmonBlocks.DEEPSLATE_AIR_STONE_ORE.get(),
                                LootItem.lootTableItem(GravelmonItems.AIR_STONE.get()))));
        add(GravelmonBlocks.SOLID_STONE_ORE.get(),
                createSilkTouchDispatchTable(GravelmonBlocks.SOLID_STONE_ORE.get(),
                        applyExplosionCondition(GravelmonBlocks.SOLID_STONE_ORE.get(),
                                LootItem.lootTableItem(GravelmonItems.SOLID_STONE.get()))));
        add(GravelmonBlocks.DEEPSLATE_SOLID_STONE_ORE.get(),
                createSilkTouchDispatchTable(GravelmonBlocks.DEEPSLATE_SOLID_STONE_ORE.get(),
                        applyExplosionCondition(GravelmonBlocks.DEEPSLATE_SOLID_STONE_ORE.get(),
                                LootItem.lootTableItem(GravelmonItems.SOLID_STONE.get()))));

        dropSelf(GravelmonBlocks.ASTRAL_STONE_BLOCK.get());
        dropSelf(GravelmonBlocks.AIR_STONE_BLOCK.get());
        dropSelf(GravelmonBlocks.MYSTIC_STONE_BLOCK.get());
        dropSelf(GravelmonBlocks.SOLID_STONE_BLOCK.get());
    }
}
