package drai.dev.gravelmon.fabric;

import net.fabricmc.fabric.api.biome.v1.*;
import net.minecraft.core.registries.*;
import net.minecraft.resources.*;
import net.minecraft.world.level.levelgen.*;
import net.minecraft.world.level.levelgen.placement.*;

public class GravelmonFeatures {

    public static final ResourceKey<PlacedFeature> ASTRAL_ORE_PLACED_KEY =
            ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation("gravelmon","overworld_astral_ore"));
    public static final ResourceKey<PlacedFeature> AIR_ORE_PLACED_KEY =
            ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation("gravelmon","overworld_air_ore"));
    public static final ResourceKey<PlacedFeature> MYSTIC_ORE_PLACED_KEY =
            ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation("gravelmon","overworld_mystic_ore"));
    public static final ResourceKey<PlacedFeature> SOLID_ORE_PLACED_KEY =
            ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation("gravelmon","overworld_solid_ore"));
    public static void registerFeatures(){
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES, ASTRAL_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES, AIR_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES, MYSTIC_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES, SOLID_ORE_PLACED_KEY);
    }
}
