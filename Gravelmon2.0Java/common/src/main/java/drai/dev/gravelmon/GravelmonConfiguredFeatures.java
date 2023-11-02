package drai.dev.gravelmon;

import net.minecraft.core.registries.*;
import net.minecraft.resources.*;
import net.minecraft.world.level.levelgen.feature.*;
import net.minecraft.world.level.levelgen.placement.*;

public class GravelmonConfiguredFeatures {
    public static ResourceKey<ConfiguredFeature<?,?>> PURPLE_APRICORN_TREE_KEY = of("purple_apricorn_tree");
    public static ResourceKey<ConfiguredFeature<?,?>> ORANGE_APRICORN_TREE_KEY = of("orange_apricorn_tree");
    private static ResourceKey<ConfiguredFeature<?,?>> of(String id) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation("gravelmon",id));
    }

}
