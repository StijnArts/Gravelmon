package drai.dev.gravelmon.items.apricorn;

import net.minecraft.world.entity.player.*;
import net.minecraft.world.item.*;
import net.minecraft.world.item.context.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.*;
import org.jetbrains.annotations.*;

public class GravelmonApricornSeedItem extends BlockItem {
    private GravelmonApricornBlock apricornBlock;
    public GravelmonApricornSeedItem(Block block, GravelmonApricornBlock gravelmonApricornBlock, Properties properties) {
        super(block, properties);
        this.apricornBlock = gravelmonApricornBlock;
    }

    @Override
    protected boolean canPlace(BlockPlaceContext context, BlockState state) {
        Player player = context.getPlayer();
        assert player != null;
        return player.isCreative() || super.canPlace(context, state);
    }

    @Nullable
    @Override
    protected BlockState getPlacementState(BlockPlaceContext blockPlaceContext) {
        if(apricornBlock.isEnabled(blockPlaceContext.getLevel().enabledFeatures())){
            var apricornState = this.apricornBlock.getStateForPlacement(blockPlaceContext);
            if(apricornState != null && this.canPlace(blockPlaceContext, apricornState)){
                return apricornState;
            }
        }
        return super.getPlacementState(blockPlaceContext);
    }
}
