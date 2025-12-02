package drai.dev.gravelmon.items.apricorn;

import com.cobblemon.mod.common.api.apricorn.*;
import com.cobblemon.mod.common.api.events.*;
import com.cobblemon.mod.common.api.events.farming.*;
import com.cobblemon.mod.common.api.tags.*;
import com.cobblemon.mod.common.block.*;
import com.mojang.serialization.*;
import com.mojang.serialization.codecs.*;
import kotlin.Unit;
import kotlin.jvm.functions.*;
import net.minecraft.core.*;
import net.minecraft.server.level.*;
import net.minecraft.sounds.*;
import net.minecraft.util.*;
import net.minecraft.world.*;
import net.minecraft.world.entity.player.*;
import net.minecraft.world.item.*;
import net.minecraft.world.item.context.*;
import net.minecraft.world.level.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.*;
import net.minecraft.world.level.block.state.properties.*;
import net.minecraft.world.level.gameevent.*;
import net.minecraft.world.level.pathfinder.*;
import net.minecraft.world.phys.*;
import net.minecraft.world.phys.shapes.*;
import org.jetbrains.annotations.*;

public class GravelmonApricornBlock extends HorizontalDirectionalBlock implements BonemealableBlock, ShearableBlock {
    public static final MapCodec<GravelmonApricornBlock> CODEC = RecordCodecBuilder.mapCodec((instance)->
            instance.group(propertiesCodec(), GravelmonApricorns.CODEC.fieldOf("apricorn")
                            .forGetter(GravelmonApricornBlock::getApricorn))
                    .apply(instance, GravelmonApricornBlock::new)
    );
    public static IntegerProperty AGE;
    public static int MAX_AGE;
    public static int MIN_AGE;
    public GravelmonApricorns apricorn;

    public GravelmonApricornBlock(Properties properties, GravelmonApricorns apricorn) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(AGE,MIN_AGE).setValue(FACING,Direction.NORTH));
        this.apricorn = apricorn;
    }
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(AGE, FACING);
    }
    @Override
    public boolean isRandomlyTicking(BlockState state) {
        return state.getValue(AGE) < MAX_AGE;
    }

    @Override
    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (level.random.nextInt(5) == 0) {
            int currentAge = state.getValue(AGE);
            if (currentAge < MAX_AGE) {
                level.setBlock(pos, state.setValue(AGE, currentAge + 1), 2);
            }
        }
        this.tick(state, level, pos, random);
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        var facing = state.getValue(FACING);
        var blockState = level.getBlockState(pos.relative(facing));
        return blockState.is(CobblemonBlockTags.APRICORN_LEAVES);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        var blockState = this.defaultBlockState();
        var worldView = context.getLevel();
        var blockPos = context.getClickedPos();
        for (Direction direction: context.getNearestLookingDirections()) {
            if (direction.getAxis().isHorizontal()) {
                blockState = blockState.setValue(FACING, direction);
                if (blockState.canSurvive(worldView, blockPos)) {
                    return blockState;
                }
            }
        }
         return null;
    }
    @Override
    public @NotNull VoxelShape getOcclusionShape(BlockState state, BlockGetter level, BlockPos pos) {
        return EAST_AABB[3];
    }

    @Override
    public @NotNull RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }

    @Override
    public @NotNull VoxelShape getShape(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull CollisionContext context) {
        return getVoxelShape(state);
    }

    @Override
    public boolean isPathfindable(@NotNull BlockState state, @NotNull PathComputationType type) {
        return false;
    }

    private VoxelShape getVoxelShape(BlockState state) {
        var age = state.getValue(AGE);
        VoxelShape shape;
        switch(state.getValue(FACING)) {
            case EAST ->  shape = EAST_AABB[age];
            case SOUTH -> shape =  SOUTH_AABB[age];
            case WEST -> shape =  WEST_AABB[age];
            default -> shape =  NORTH_AABB[age];
        }
        return shape;
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return CODEC;
    }

    public GravelmonApricorns getApricorn() {
        return apricorn;
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rotation) {
        return (BlockState)state.setValue(FACING, rotation.rotate(state.getValue(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, Mirror mirror) {
        return state.rotate(mirror.getRotation(state.getValue(FACING)));
    }

    @Override
    public @NotNull BlockState updateShape(BlockState state, Direction direction, BlockState neighborState, LevelAccessor level, BlockPos pos, BlockPos neighborPos) {
        return (direction == state.getValue(FACING) && !state.canSurvive(level, pos)) ? Blocks.AIR.defaultBlockState() :
        super.updateShape(state, direction, neighborState, level, pos, neighborPos);
    }

    @Override
    public @NotNull InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hit) {
        if (state.getValue(AGE) != MAX_AGE) {
            return super.useWithoutItem(state, level, pos, player, hit);
        }

        doHarvest(level, state, pos, player);
        return InteractionResult.SUCCESS;
    }

    @Override
    public ItemStack getCloneItemStack(LevelReader levelReader, BlockPos blockPos, BlockState blockState) {
        return new ItemStack(apricorn.getItem());
    }

    @Override
    public boolean attemptShear(@NotNull Level world, @NotNull BlockState state, @NotNull BlockPos pos, @NotNull Function0<Unit> function0) {
        if (state.getValue(AGE) != MAX_AGE) {
            return false;
        }
        world.playSound(null, pos, SoundEvents.SHEEP_SHEAR, SoundSource.BLOCKS, 1F, 1F);
        this.harvest(world, state, pos);
        function0.invoke();
        world.gameEvent(null, GameEvent.SHEAR, pos);
        return true;
    }

    @Override
    public boolean isValidBonemealTarget(LevelReader level, BlockPos pos, BlockState state) {
        return state.getValue(AGE) < MAX_AGE;
    }

    @Override
    public boolean isBonemealSuccess(Level level, RandomSource random, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void performBonemeal(ServerLevel level, RandomSource random, BlockPos pos, BlockState state) {
        level.setBlock(pos, state.setValue(AGE, state.getValue(AGE) + 1), 2);
    }

    @Override
    protected void attack(BlockState blockState, Level level, BlockPos blockPos, Player player) {
        if (blockState.getValue(AGE) != MAX_AGE) {
            super.attack(blockState, level, blockPos, player);
            return;
        }

        doHarvest(level, blockState, blockPos, player);
    }

    public BlockState harvest(Level world, BlockState state, BlockPos pos)  {
        // Uses loot tables, to change the drops use 'data/cobblemon/loot_tables/blocks/<color>_apricorn.json'
        popResource(world, pos, new ItemStack(apricorn.getItem()));
        // Don't use default as we want to keep the facing
        var resetState = state.setValue(AGE, MIN_AGE);
        world.setBlock(pos, resetState, Block.UPDATE_CLIENTS);
        return resetState;
    }

    private void doHarvest(Level world, BlockState state, BlockPos pos, Player player) {
        var resetState = this.harvest(world, state, pos);
        world.gameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Context.of(player, resetState));

        if (!world.isClientSide) {
            world.playSound(null, pos, SoundEvents.ITEM_PICKUP, SoundSource.BLOCKS, 0.7F, 1.4F);
        }
    }

    private static VoxelShape[] NORTH_AABB;
    private static VoxelShape[] SOUTH_AABB;
    private static VoxelShape[] EAST_AABB;
    private static VoxelShape[] WEST_AABB;
    static {
        AGE = BlockStateProperties.AGE_3;
        MAX_AGE = BlockStateProperties.MAX_AGE_3;
        MIN_AGE = 0;

        // North
        // Stage 0
        VoxelShape NORTH_STAGE_0 = Shapes.box(0.40625, 0.5, 0.0, 0.59375, 0.6875, 0.1875);
        VoxelShape NORTH_CAP_STAGE_0 = Shapes.box(0.4375, 0.65625, 0.03125, 0.5625, 0.71875, 0.15625);
        // Stage 1
        VoxelShape NORTH_STAGE_1 = Shapes.box(0.375, 0.40625, 0.0, 0.625, 0.65625, 0.25);
        VoxelShape NORTH_CAP_STAGE_1 = Shapes.box(0.40625, 0.625, 0.03125, 0.59375, 0.6875, 0.21875);
        // Stage 2
        VoxelShape NORTH_STAGE_2 = Shapes.box(0.34375, 0.296875, 0.0, 0.65625, 0.609375, 0.3125);
        VoxelShape NORTH_CAP_STAGE_2 = Shapes.box(0.375, 0.59375, 0.03125, 0.625, 0.65625, 0.28125);
        // Stage 3 - Full Fruit
        VoxelShape NORTH_STAGE_3 = Shapes.box(0.3125, 0.1875, 0.0, 0.6875, 0.5625, 0.375);
        VoxelShape NORTH_CAP_STAGE_3 = Shapes.box(0.375, 0.5625, 0.0625, 0.625, 0.625, 0.3125);
        NORTH_AABB = new VoxelShape[]{
                Shapes.or(NORTH_STAGE_0, NORTH_CAP_STAGE_0),
                Shapes.or(NORTH_STAGE_1, NORTH_CAP_STAGE_1),
                Shapes.or(NORTH_STAGE_2, NORTH_CAP_STAGE_2),
                Shapes.or(NORTH_STAGE_3, NORTH_CAP_STAGE_3)
        };

        // South
        // Stage 0
        VoxelShape SOUTH_STAGE_0 = Shapes.box(0.40625, 0.5, 0.8125, 0.59375, 0.6875, 1.0);
        VoxelShape SOUTH_CAP_STAGE_0 = Shapes.box(0.4375, 0.65625, 0.84375, 0.5625, 0.71875, 0.96875);
        // Stage 1
        VoxelShape SOUTH_STAGE_1 = Shapes.box(0.375, 0.40625, 0.75, 0.625, 0.65625, 1.0);
        VoxelShape SOUTH_CAP_STAGE_1 = Shapes.box(0.40625, 0.625, 0.78125, 0.59375, 0.6875, 0.96875);
        // Stage 2
        VoxelShape SOUTH_STAGE_2 = Shapes.box(0.34375, 0.296875, 0.6875, 0.65625, 0.609375, 1.0);
        VoxelShape SOUTH_CAP_STAGE_2 = Shapes.box(0.375, 0.59375, 0.71875, 0.625, 0.65625, 0.96875);
        // Stage 3 - Full Fruit
        VoxelShape SOUTH_STAGE_3 = Shapes.box(0.3125, 0.1875, 0.625, 0.6875, 0.5625, 1.0);
        VoxelShape SOUTH_CAP_STAGE_3 = Shapes.box(0.375, 0.5625, 0.6875, 0.625, 0.625, 0.9375);
        SOUTH_AABB = new VoxelShape[]{
                Shapes.or(SOUTH_STAGE_0, SOUTH_CAP_STAGE_0),
                Shapes.or(SOUTH_STAGE_1, SOUTH_CAP_STAGE_1),
                Shapes.or(SOUTH_STAGE_2, SOUTH_CAP_STAGE_2),
                Shapes.or(SOUTH_STAGE_3, SOUTH_CAP_STAGE_3)
        };

        // East
        // Stage 0
        VoxelShape EAST_STAGE_0 = Shapes.box(0.8125, 0.5, 0.40625, 1.0, 0.6875, 0.59375);
        VoxelShape EAST_CAP_STAGE_0 = Shapes.box(0.84375, 0.65625, 0.4375, 0.96875, 0.71875, 0.5625);

        // Stage 1
        VoxelShape EAST_STAGE_1 = Shapes.box(0.75, 0.40625, 0.375, 1.0, 0.65625, 0.625);
        VoxelShape EAST_CAP_STAGE_1 = Shapes.box(0.78125, 0.625, 0.40625, 0.96875, 0.6875, 0.59375);

        // Stage 2
        VoxelShape EAST_STAGE_2 = Shapes.box(0.6875, 0.296875, 0.34375, 1.0, 0.609375, 0.65625);
        VoxelShape EAST_CAP_STAGE_2 = Shapes.box(0.71875, 0.59375, 0.375, 0.96875, 0.65625, 0.625);

        // Stage 3 - Full Fruit
        VoxelShape EAST_STAGE_3 = Shapes.box(0.625, 0.1875, 0.3125, 1.0, 0.5625, 0.6875);
        VoxelShape EAST_CAP_STAGE_3 = Shapes.box(0.6875, 0.5625, 0.375, 0.9375, 0.625, 0.625);

        EAST_AABB = new VoxelShape[]{
                Shapes.or(EAST_STAGE_0, EAST_CAP_STAGE_0),
                Shapes.or(EAST_STAGE_1, EAST_CAP_STAGE_1),
                Shapes.or(EAST_STAGE_2, EAST_CAP_STAGE_2),
                Shapes.or(EAST_STAGE_3, EAST_CAP_STAGE_3)
        };

        // West
        // Stage 0
        VoxelShape WEST_STAGE_0 = Shapes.box(0.0, 0.5, 0.40625, 0.1875, 0.6875, 0.59375);
        VoxelShape WEST_CAP_STAGE_0 = Shapes.box(0.03125, 0.65625, 0.4375, 0.15625, 0.71875, 0.5625);
        // Stage 1
        VoxelShape WEST_STAGE_1 = Shapes.box(0.0, 0.40625, 0.375, 0.25, 0.65625, 0.625);
        VoxelShape WEST_CAP_STAGE_1 = Shapes.box(0.03125, 0.625, 0.40625, 0.21875, 0.6875, 0.59375);
        // Stage 2
        VoxelShape WEST_STAGE_2 = Shapes.box(0.0, 0.296875, 0.34375, 0.3125, 0.609375, 0.65625);
        VoxelShape WEST_CAP_STAGE_2 = Shapes.box(0.03125, 0.59375, 0.375, 0.28125, 0.65625, 0.625);
        // Stage 3 - Full Fruit
        VoxelShape WEST_STAGE_3 = Shapes.box(0.0, 0.1875, 0.3125, 0.375, 0.5625, 0.6875);
        VoxelShape WEST_CAP_STAGE_3 = Shapes.box(0.0625, 0.5625, 0.375, 0.3125, 0.625, 0.625);

        WEST_AABB = new VoxelShape[]{
                Shapes.or(WEST_STAGE_0, WEST_CAP_STAGE_0),
                Shapes.or(WEST_STAGE_1, WEST_CAP_STAGE_1),
                Shapes.or(WEST_STAGE_2, WEST_CAP_STAGE_2),
                Shapes.or(WEST_STAGE_3, WEST_CAP_STAGE_3)
    };
    }
}
