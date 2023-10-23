package drai.dev.gravelmon.registries;

import dev.architectury.registry.registries.*;
import net.minecraft.core.registries.*;
import net.minecraft.util.valueproviders.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.*;

import static drai.dev.gravelmon.Gravelmon.*;

public class GravelmonBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(MOD_ID, Registries.BLOCK);
    public static RegistrySupplier<Block> ASTRAL_STONE_ORE = evolutionStoneOre("astral_stone_ore");
    public static RegistrySupplier<Block> DEEPSLATE_ASTRAL_STONE_ORE = deepslateEvolutionStoneOre("deepslate_astral_stone_ore");
    public static RegistrySupplier<Block> AIR_STONE_ORE = evolutionStoneOre("air_stone_ore");
    public static RegistrySupplier<Block> DEEPSLATE_AIR_STONE_ORE = deepslateEvolutionStoneOre("deepslate_air_stone_ore");
    public static RegistrySupplier<Block> MYSTIC_STONE_ORE = evolutionStoneOre("mystic_stone_ore");
    public static RegistrySupplier<Block> DEEPSLATE_MYSTIC_STONE_ORE = deepslateEvolutionStoneOre("deepslate_mystic_stone_ore");
    public static RegistrySupplier<Block> SOLID_STONE_ORE = evolutionStoneOre("solid_stone_ore");
    public static RegistrySupplier<Block> DEEPSLATE_SOLID_STONE_ORE = deepslateEvolutionStoneOre("deepslate_solid_stone_ore");

    public static  RegistrySupplier<Block> evolutionStoneOre(String name){
        return BLOCKS.register(name, () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE), UniformInt.of(1, 2)));
    }
    public static void touch(){

    }
    public static  RegistrySupplier<Block> deepslateEvolutionStoneOre(String name){
        return BLOCKS.register(name, () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE), UniformInt.of(1, 2)));
    }
}
