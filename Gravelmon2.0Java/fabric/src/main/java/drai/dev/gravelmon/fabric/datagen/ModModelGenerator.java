package drai.dev.gravelmon.fabric.datagen;

import dev.architectury.registry.registries.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.*;
import drai.dev.gravelmon.mega.*;
import drai.dev.gravelmon.registries.*;
import net.fabricmc.fabric.api.datagen.v1.*;
import net.fabricmc.fabric.api.datagen.v1.provider.*;
import net.minecraft.core.registries.*;
import net.minecraft.data.models.*;
import net.minecraft.data.models.model.*;
import net.minecraft.resources.*;
import net.minecraft.world.item.*;

import java.util.function.*;

public class ModModelGenerator extends FabricModelProvider {
    public ModModelGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
        blockStateModelGenerator.createTrivialCube(GravelmonBlocks.ASTRAL_STONE_ORE.get());
        blockStateModelGenerator.createTrivialCube(GravelmonBlocks.DEEPSLATE_ASTRAL_STONE_ORE.get());
        blockStateModelGenerator.createTrivialCube(GravelmonBlocks.ASTRAL_STONE_BLOCK.get());
        blockStateModelGenerator.createTrivialCube(GravelmonBlocks.AIR_STONE_ORE.get());
        blockStateModelGenerator.createTrivialCube(GravelmonBlocks.DEEPSLATE_AIR_STONE_ORE.get());
        blockStateModelGenerator.createTrivialCube(GravelmonBlocks.AIR_STONE_BLOCK.get());
        blockStateModelGenerator.createTrivialCube(GravelmonBlocks.MYSTIC_STONE_ORE.get());
        blockStateModelGenerator.createTrivialCube(GravelmonBlocks.DEEPSLATE_MYSTIC_STONE_ORE.get());
        blockStateModelGenerator.createTrivialCube(GravelmonBlocks.MYSTIC_STONE_BLOCK.get());
        blockStateModelGenerator.createTrivialCube(GravelmonBlocks.SOLID_STONE_ORE.get());
        blockStateModelGenerator.createTrivialCube(GravelmonBlocks.DEEPSLATE_SOLID_STONE_ORE.get());
        blockStateModelGenerator.createTrivialCube(GravelmonBlocks.SOLID_STONE_BLOCK.get());
        blockStateModelGenerator.createTrivialCube(GravelmonBlocks.VARIA_STONE_BLOCK.get());
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
        simpleItem(GravelmonItems.VARIA_STONE,itemModelGenerator);
        simpleItem(GravelmonItems.ASTRAL_STONE,itemModelGenerator);
        simpleItem(GravelmonItems.AIR_STONE,itemModelGenerator);
        simpleItem(GravelmonItems.MYSTIC_STONE,itemModelGenerator);
        simpleItem(GravelmonItems.SOLID_STONE,itemModelGenerator);
        simpleItem(GravelmonItems.XENOLITH,itemModelGenerator);
        simpleItem(GravelmonItems.QUANTUM_UPGRADE,itemModelGenerator);
        simpleItem(GravelmonItems.KALEIDOSCOPE,itemModelGenerator);
        simpleItem(GravelmonItems.CORRUPTED_DISC,itemModelGenerator);
        simpleItem(GravelmonItems.WES_UPDATE,itemModelGenerator);
        simpleItem(GravelmonItems.MURKY_CLAW,itemModelGenerator);
        simpleItem(GravelmonItems.SILVER_SCALE,itemModelGenerator);
        simpleItem(GravelmonItems.ANCIENT_GLYPH,itemModelGenerator);
//        simpleItem(GravelmonItems.VOIDIX,itemModelGenerator);
//        simpleItem(GravelmonItems.ELECTRIX,itemModelGenerator);
//        simpleItem(GravelmonItems.BURIX,itemModelGenerator);
//        simpleItem(GravelmonItems.AQUIX,itemModelGenerator);
//        simpleItem(GravelmonItems.VERDIX,itemModelGenerator);
//        simpleItem(GravelmonItems.ZERIX,itemModelGenerator);
//        simpleItem(GravelmonItems.PATHIX,itemModelGenerator);
//        simpleItem(GravelmonItems.PIXIX,itemModelGenerator);
        simpleItem(GravelmonItems.LONG_CLUB,itemModelGenerator);
        simpleItem(GravelmonItems.TERRESTRIAL_RING,itemModelGenerator);
        simpleItem(GravelmonItems.XENOVERSAL_RING,itemModelGenerator);
        simpleItem(GravelmonItems.SLOWPOKE_TAIL,itemModelGenerator);
        simpleItem(GravelmonItems.DREAD_PENDANT,itemModelGenerator);
        simpleItem(GravelmonItems.SPARE_PARTS,itemModelGenerator);
        simpleItem(GravelmonItems.MAGIC_COOKIE,itemModelGenerator);
        simpleItem(GravelmonItems.INDUCTIVE_RING,itemModelGenerator);
        simpleItem(GravelmonItems.X_RAY_SPECS,itemModelGenerator);
        simpleItem(GravelmonItems.FOUL_ROCK,itemModelGenerator);
        simpleItem(GravelmonItems.RAGGED_PEBBLE,itemModelGenerator);
        simpleItem(GravelmonItems.POLISHED_SPHERE,itemModelGenerator);
        simpleItem(GravelmonItems.CORRUPTED_SEED,itemModelGenerator);
        simpleItem(GravelmonItems.BOLT_ORB,itemModelGenerator);
        simpleItem(GravelmonItems.IVEOLITE,itemModelGenerator);
        simpleItem(GravelmonItems.ICE_SHARD,itemModelGenerator);
                //Xenoverse
        simpleItem(GravelmonItems.HAFLI_BERRY,itemModelGenerator);
        simpleItem(GravelmonItems.MOSS_SHARD,itemModelGenerator);
        simpleItem(GravelmonItems.PRETTY_RIBBON,itemModelGenerator);
                //insurgence
        simpleItem(GravelmonItems.DARK_ROCK,itemModelGenerator);
        simpleItem(GravelmonItems.GOLDEN_FEATHER,itemModelGenerator);
        simpleItem(GravelmonItems.PIXIE_DUST,itemModelGenerator);
        simpleItem(GravelmonItems.OCARINA,itemModelGenerator);
        simpleItem(GravelmonItems.ROYAL_JELLY,itemModelGenerator);
        simpleItem(GravelmonItems.COCONUT_MILK,itemModelGenerator);
        simpleItem(GravelmonItems.CARROT_WINE,itemModelGenerator);
        simpleItem(GravelmonItems.URANIUM_CORE,itemModelGenerator);
        simpleItem(GravelmonItems.PREADITE,itemModelGenerator);
        simpleItem(GravelmonItems.EMPTY_SKULL,itemModelGenerator);
        simpleItem(GravelmonItems.FOREIGN_HAT,itemModelGenerator);
        simpleItem(GravelmonItems.PRIM_SHEARS,itemModelGenerator);
        simpleItem(GravelmonItems.HAIR_TONIC,itemModelGenerator);
        simpleItem(GravelmonItems.GROWTH_MULCH,itemModelGenerator);

        for (Supplier<Item> value : Gravelmon.FOSSIL_ITEM_MAP.values()) {
            ModelTemplates.FLAT_ITEM.create(ModelLocationUtils.getModelLocation(value.get()),
                    TextureMapping.layer0(BuiltInRegistries.ITEM.getKey(value.get()).withPrefix("item/fossils/")),
                    itemModelGenerator.output);
        }

        for (Supplier<Item> value : GravelmonMegas.MEGA_STONE_SUPPLIERS_IDS.keySet()) {
            ModelTemplates.FLAT_ITEM.create(ModelLocationUtils.getModelLocation(value.get()),
                    TextureMapping.layer0(BuiltInRegistries.ITEM.getKey(value.get()).withPrefix("item/megastones/")),
                    itemModelGenerator.output);
        }

        for (var value : GravelmonItems.POKE_BALLS) {
            ModelTemplates.FLAT_ITEM.create(ModelLocationUtils.getModelLocation(value.get()),
                    TextureMapping.layer0(BuiltInRegistries.ITEM.getKey(value.get()).withPrefix("item/poke_balls/")),
                    itemModelGenerator.output);
        }
    }

    public void simpleItem(RegistrySupplier<Item> item, ItemModelGenerators itemModelGenerator){
        itemModelGenerator.generateFlatItem(item.get(), ModelTemplates.FLAT_ITEM);
    }
}