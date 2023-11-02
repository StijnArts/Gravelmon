package drai.dev.gravelmon.apricorn;

import drai.dev.gravelmon.*;
import net.minecraft.resources.*;
import net.minecraft.util.*;
import net.minecraft.world.level.block.grower.*;
import net.minecraft.world.level.levelgen.feature.*;
import org.jetbrains.annotations.*;

public class GravelmonApricornTreeGrower extends AbstractTreeGrower {
    private final GravelmonApricorns apricorn;

    public GravelmonApricornTreeGrower(GravelmonApricorns apricorn){
        this.apricorn = apricorn;
    }
    @Nullable
    @Override
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource random, boolean hasFlowers) {
        return switch(apricorn){
            case PURPLE -> GravelmonConfiguredFeatures.PURPLE_APRICORN_TREE_KEY;
            case ORANGE -> GravelmonConfiguredFeatures.ORANGE_APRICORN_TREE_KEY;
        };
    }
}
