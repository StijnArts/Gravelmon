package drai.dev.gravelmon.items.apricorn;

import com.mojang.serialization.*;
import drai.dev.gravelmon.*;
import drai.dev.gravelmon.registries.*;
import net.minecraft.resources.*;
import net.minecraft.util.*;
import net.minecraft.world.level.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.levelgen.feature.*;
import net.minecraft.world.level.material.*;
import org.jetbrains.annotations.*;

public enum GravelmonApricorns implements StringRepresentable{
    ORANGE,
    PURPLE;


    public ItemLike getItem() {
        return switch (this){
            //TODO CompostingChangeRegistry on fabric and forge
            case ORANGE -> GravelmonItems.ORANGE_APRICORN.get();
            case PURPLE -> GravelmonItems.PURPLE_APRICORN.get();
        };
    }

    public ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(){
        return switch(this){
            case PURPLE -> GravelmonConfiguredFeatures.PURPLE_APRICORN_TREE_KEY;
            case ORANGE -> GravelmonConfiguredFeatures.ORANGE_APRICORN_TREE_KEY;
        };
    }

    public MapColor getMapColor(){
        return switch (this){
            case ORANGE -> MapColor.COLOR_ORANGE;
            case PURPLE -> MapColor.COLOR_PURPLE;
        };
    }

    public Block getBlock(){
        return switch (this){
            case ORANGE -> GravelmonBlocks.ORANGE_APRICORN.get();
            case PURPLE -> GravelmonBlocks.PURPLE_APRICORN.get();
        };
    }

    public Block getSapling(){
        return switch (this){
            case ORANGE -> GravelmonBlocks.ORANGE_APRICORN_SAPLING.get();
            case PURPLE -> GravelmonBlocks.PURPLE_APRICORN_SAPLING.get();
        };
    }

    public static Codec<GravelmonApricorns> CODEC = StringRepresentable.fromValues(GravelmonApricorns::values);

    @Override
    public @NotNull String getSerializedName() {
        return this.name().toLowerCase();
    }
}
