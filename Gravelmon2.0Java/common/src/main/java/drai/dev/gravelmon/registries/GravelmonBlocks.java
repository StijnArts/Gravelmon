package drai.dev.gravelmon.registries;

import dev.architectury.registry.registries.*;
import drai.dev.gravelmon.apricorn.*;
import net.minecraft.core.registries.*;
import net.minecraft.util.valueproviders.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.*;
import net.minecraft.world.level.material.*;

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

    public static RegistrySupplier<GravelmonApricornBlock> PURPLE_APRICORN = apricornBlock("purple_apricorn", GravelmonApricorns.PURPLE);
    public static RegistrySupplier<GravelmonApricornBlock> ORANGE_APRICORN = apricornBlock("orange_apricorn", GravelmonApricorns.ORANGE);

    public static RegistrySupplier<GravelmonApricornSaplingBlock> PURPLE_APRICORN_SAPLING = apricornSapling("purple_apricorn_sapling", GravelmonApricorns.PURPLE);
    public static RegistrySupplier<GravelmonApricornSaplingBlock> ORANGE_APRICORN_SAPLING = apricornSapling("orange_apricorn_sapling", GravelmonApricorns.ORANGE);

    public static  RegistrySupplier<GravelmonApricornBlock> apricornBlock(String name, GravelmonApricorns apricorn){
        return BLOCKS.register(name, () -> new GravelmonApricornBlock(
                BlockBehaviour.Properties.of()
                        .mapColor(apricorn.getMapColor())
                        .randomTicks()
                        .strength(Blocks.OAK_LOG.defaultDestroyTime(), Blocks.OAK_LOG.getExplosionResistance())
                        .sound(SoundType.WOOD)
                        .noOcclusion().forceSolidOn()
                , apricorn));
    }

    public static  RegistrySupplier<GravelmonApricornSaplingBlock> apricornSapling(String name, GravelmonApricorns apricorn){
        return BLOCKS.register(name, () -> new GravelmonApricornSaplingBlock(PLANT_PROPERTIES, apricorn));
    }
    public static  RegistrySupplier<Block> evolutionStoneOre(String name){
        return BLOCKS.register(name, () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE), UniformInt.of(1, 2)));
    }

    public static void touch(){
        GravelmonFossilItems.touch();
    }
    public static  RegistrySupplier<Block> deepslateEvolutionStoneOre(String name){
        return BLOCKS.register(name, () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE), UniformInt.of(1, 2)));
    }

    private static BlockBehaviour.Properties PLANT_PROPERTIES = BlockBehaviour.Properties.of().mapColor(MapColor.PLANT)
            .noCollission().dynamicShape().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY);
}
