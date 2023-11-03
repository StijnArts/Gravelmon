package drai.dev.gravelmon.apricorn;

import com.cobblemon.mod.common.api.apricorn.*;
import com.cobblemon.mod.common.block.*;
import drai.dev.gravelmon.registries.*;
import net.minecraft.world.level.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.material.*;

public enum GravelmonApricorns {
    ORANGE,
    PURPLE;


    public ItemLike getItem() {
        return switch (this){
            //TODO CompostingChangeRegistry on fabric and forge
            case ORANGE -> GravelmonItems.ORANGE_APRICORN.get();
            case PURPLE -> GravelmonItems.PURPLE_APRICORN.get();
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
}
