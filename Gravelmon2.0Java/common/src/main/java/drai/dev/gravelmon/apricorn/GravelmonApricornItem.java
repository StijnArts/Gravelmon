package drai.dev.gravelmon.apricorn;

import net.minecraft.world.entity.player.*;
import net.minecraft.world.item.*;
import net.minecraft.world.item.context.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.*;

public class GravelmonApricornItem extends BlockItem {
    public GravelmonApricornItem(Block block, Properties properties) {
        super(block, properties);
    }

    @Override
    protected boolean canPlace(BlockPlaceContext context, BlockState state) {
        Player player = context.getPlayer();
        assert player != null;
        return player.isCreative() || super.canPlace(context, state);
    }
}
