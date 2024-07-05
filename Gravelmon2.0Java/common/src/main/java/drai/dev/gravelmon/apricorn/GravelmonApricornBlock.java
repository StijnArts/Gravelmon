package drai.dev.gravelmon.apricorn;

import com.cobblemon.mod.common.api.tags.*;
import com.cobblemon.mod.common.block.*;
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
    public static IntegerProperty AGE;
    public static final DirectionProperty FACING;
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
    public VoxelShape getOcclusionShape(BlockState state, BlockGetter level, BlockPos pos) {
        return EAST_AABB[3];
    }
    @Override
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return getVoxelShape(state);
    }
    @Override
    public boolean isPathfindable(BlockState state, BlockGetter level, BlockPos pos, PathComputationType type) {
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
    public BlockState rotate(BlockState state, Rotation rotation) {
        return (BlockState)state.setValue(FACING, rotation.rotate(state.getValue(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, Mirror mirror) {
        return state.rotate(mirror.getRotation(state.getValue(FACING)));
    }
    @Override
    public BlockState updateShape(BlockState state, Direction direction, BlockState neighborState, LevelAccessor level, BlockPos pos, BlockPos neighborPos) {
        return (direction == state.getValue(FACING) && !state.canSurvive(level, pos)) ? Blocks.AIR.defaultBlockState() :
        super.updateShape(state, direction, neighborState, level, pos, neighborPos);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        if (state.getValue(AGE) != MAX_AGE) {
            return super.use(state, level, pos, player, hand, hit);
        }

        var resetState = this.harvest(level, state, pos);
        level.gameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Context.of(player, resetState));

        if (!level.isClientSide) {
            level.playSound(null, pos.getX(), pos.getY(), pos.getZ(), SoundEvents.ITEM_PICKUP, SoundSource.NEUTRAL, 0.7F, 1.4F);
        }
        return InteractionResult.PASS;
    }
    public ItemStack getCloneItemStack(BlockGetter level, BlockPos pos, BlockState state) {
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
    public boolean isValidBonemealTarget(LevelReader level, BlockPos pos, BlockState state, boolean isClient) {
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

    public BlockState harvest(Level world, BlockState state, BlockPos pos)  {
        // Uses loot tables, to change the drops use 'data/cobblemon/loot_tables/blocks/<color>_apricorn.json'
        Block.dropResources(state, world, pos);
        // Don't use default as we want to keep the facing
        var resetState = state.setValue(AGE, MIN_AGE);
        world.setBlock(pos, resetState, Block.UPDATE_CLIENTS);
        return resetState;
    }
    private static VoxelShape[] NORTH_AABB;
    private static VoxelShape[] SOUTH_AABB;
    private static VoxelShape[] EAST_AABB;
    private static VoxelShape[] WEST_AABB;
    static {
        AGE = BlockStateProperties.AGE_3;
        MAX_AGE = BlockStateProperties.MAX_AGE_3;
        MIN_AGE = 0;
        FACING = BlockStateProperties.HORIZONTAL_FACING;
        // North
        // Stage 1
         VoxelShape NORTH_TOP_STAGE_1 = Block.box(7.0, 11.0, 0.5, 9.0, 11.5, 2.5);
         VoxelShape NORTH_BODY_STAGE_1 = Block.box(6.5, 9.0, 0.0, 9.5, 11.0, 3.0);
         VoxelShape NORTH_BOTTOM_STAGE_1 = Block.box(7.0, 8.5, 0.5, 9.0, 9.0, 2.5);

        // Stage 2
         VoxelShape NORTH_TOP_STAGE_2 = Block.box(6.5, 10.5, 0.5, 9.5, 11.0, 3.5);
         VoxelShape NORTH_BODY_STAGE_2 = Block.box(6.0, 7.5, 0.0, 10.0, 10.5, 4.0);
         VoxelShape NORTH_BOTTOM_STAGE_2 = Block.box(6.5, 7.0, 0.5, 9.5, 7.5, 3.5);

        // Stage 3
         VoxelShape NORTH_TOP_STAGE_3 = Block.box(6.0, 9.75, 0.5, 10.0, 10.5, 4.5);
         VoxelShape NORTH_BODY_STAGE_3 = Block.box(5.5, 5.75, 0.0, 10.5, 9.75, 5.0);
         VoxelShape NORTH_BOTTOM_STAGE_3 = Block.box(6.0, 5.0, 0.5, 10.0, 5.75, 4.5);

        // Full fruit
         VoxelShape NORTH_TOP_FRUIT = Block.box(6.0, 9.0, 1.0, 10.0, 10.0, 5.0);
         VoxelShape NORTH_BODY_FRUIT = Block.box(5.0, 4.0, 0.0, 11.0, 9.0, 6.0);
         VoxelShape NORTH_BOTTOM_FRUIT = Block.box(5.5, 3.0, 0.5, 10.5, 4.0, 5.5);

        NORTH_AABB = new VoxelShape[]{
                Shapes.or(NORTH_BODY_STAGE_1, NORTH_TOP_STAGE_1, NORTH_BOTTOM_STAGE_1),
                Shapes.or(NORTH_BODY_STAGE_2, NORTH_TOP_STAGE_2, NORTH_BOTTOM_STAGE_2),
                Shapes.or(NORTH_BODY_STAGE_3, NORTH_TOP_STAGE_3, NORTH_BOTTOM_STAGE_3),
                Shapes.or(NORTH_BODY_FRUIT, NORTH_TOP_FRUIT, NORTH_BOTTOM_FRUIT)
        };

        // South
        // Stage 1
         VoxelShape SOUTH_TOP_STAGE_1 = Block.box(7.0, 11.0, 13.5, 9.0, 11.5, 15.5);
         VoxelShape SOUTH_BODY_STAGE_1 = Block.box(6.5, 9.0, 13.0, 9.5, 11.0, 16.0);
         VoxelShape SOUTH_BOTTOM_STAGE_1 = Block.box(7.0, 8.5, 13.5, 9.0, 9.0, 15.5);

        // Stage 2
         VoxelShape SOUTH_TOP_STAGE_2 = Block.box(6.5, 10.5, 12.5, 9.5, 11.0, 15.5);
         VoxelShape SOUTH_BODY_STAGE_2 = Block.box(6.0, 7.5, 12.0, 10.0, 10.5, 16.0);
         VoxelShape SOUTH_BOTTOM_STAGE_2 = Block.box(6.5, 7.0, 12.5, 9.5, 7.5, 15.5);

        // Stage 3
         VoxelShape SOUTH_TOP_STAGE_3 = Block.box(6.0, 9.75, 11.5, 10.0, 10.5, 15.5);
         VoxelShape SOUTH_BODY_STAGE_3 = Block.box(5.5, 5.75, 11.0, 10.5, 9.75, 16.0);
         VoxelShape SOUTH_BOTTOM_STAGE_3 = Block.box(6.0, 5.0, 11.5, 10.0, 5.75, 15.5);

        // Full fruit
         VoxelShape SOUTH_TOP_FRUIT = Block.box(6.0, 9.0, 11.0, 10.0, 10.0, 15.0);
         VoxelShape SOUTH_BODY_FRUIT = Block.box(5.0, 4.0, 10.0, 11.0, 9.0, 16.0);
         VoxelShape SOUTH_BOTTOM_FRUIT = Block.box(5.5, 3.0, 10.5, 10.5, 4.0, 15.5);

        SOUTH_AABB = new VoxelShape[]{
                Shapes.or(SOUTH_BODY_STAGE_1, SOUTH_TOP_STAGE_1, SOUTH_BOTTOM_STAGE_1),
                Shapes.or(SOUTH_BODY_STAGE_2, SOUTH_TOP_STAGE_2, SOUTH_BOTTOM_STAGE_2),
                Shapes.or(SOUTH_BODY_STAGE_3, SOUTH_TOP_STAGE_3, SOUTH_BOTTOM_STAGE_3),
                Shapes.or(SOUTH_BODY_FRUIT, SOUTH_TOP_FRUIT, SOUTH_BOTTOM_FRUIT)
        };

        // East
        // Stage 1
         VoxelShape EAST_TOP_STAGE_1 = Block.box(13.5, 11.0, 7.0, 15.5, 11.5, 9.0);
         VoxelShape EAST_BODY_STAGE_1 = Block.box(13.0, 9.0, 6.5, 16.0, 11.0, 9.5);
         VoxelShape EAST_BOTTOM_STAGE_1 = Block.box(13.5, 8.5, 7.0, 15.5, 9.0, 9.0);

        // Stage 2
         VoxelShape EAST_TOP_STAGE_2 = Block.box(12.5, 10.5, 6.5, 15.5, 11.0, 9.5);
         VoxelShape EAST_BODY_STAGE_2 = Block.box(12.0, 7.5, 6.0, 16.0, 10.5, 10.0);
         VoxelShape EAST_BOTTOM_STAGE_2 = Block.box(12.5, 7.0, 6.5, 15.5, 7.5, 9.5);

        // Stage 3
         VoxelShape EAST_TOP_STAGE_3 = Block.box(11.5, 9.75, 6.0, 15.5, 10.5, 10.0);
         VoxelShape EAST_BODY_STAGE_3 = Block.box(11.0, 5.75, 5.5, 16.0, 9.75, 10.5);
         VoxelShape EAST_BOTTOM_STAGE_3 = Block.box(11.5, 5.0, 6.0, 15.5, 5.75, 10.0);

        // Full fruit
         VoxelShape EAST_TOP_FRUIT = Block.box(11.0, 9.0, 6.0, 15.0, 10.0, 10.0);
         VoxelShape EAST_BODY_FRUIT = Block.box(10.0, 4.0, 5.0, 16.0, 9.0, 11.0);
         VoxelShape EAST_BOTTOM_FRUIT = Block.box(10.5, 3.0, 5.5, 15.5, 4.0, 10.5);

        EAST_AABB = new VoxelShape[]{
                Shapes.or(EAST_BODY_STAGE_1, EAST_TOP_STAGE_1, EAST_BOTTOM_STAGE_1),
                Shapes.or(EAST_BODY_STAGE_2, EAST_TOP_STAGE_2, EAST_BOTTOM_STAGE_2),
                Shapes.or(EAST_BODY_STAGE_3, EAST_TOP_STAGE_3, EAST_BOTTOM_STAGE_3),
                Shapes.or(EAST_BODY_FRUIT, EAST_TOP_FRUIT, EAST_BOTTOM_FRUIT)
        };

        // West
        // Stage 1
         VoxelShape WEST_TOP_STAGE_1 = Block.box(0.5, 11.0, 7.0, 2.5, 11.5, 9.0);
         VoxelShape WEST_BODY_STAGE_1 = Block.box(0.0, 9.0, 6.5, 3.0, 11.0, 9.5);
         VoxelShape WEST_BOTTOM_STAGE_1 = Block.box(0.5, 8.5, 7.0, 2.5, 9.0, 9.0);

        // Stage 2
         VoxelShape WEST_TOP_STAGE_2 = Block.box(0.5, 10.5, 6.5, 3.5, 11.0, 9.5);
         VoxelShape WEST_BODY_STAGE_2 = Block.box(0.0, 7.5, 6.0, 4.0, 10.5, 10.0);
         VoxelShape WEST_BOTTOM_STAGE_2 = Block.box(0.5, 7.0, 6.5, 3.5, 7.5, 9.5);

        // Stage 3
         VoxelShape WEST_TOP_STAGE_3 = Block.box(0.5, 9.75, 6.0, 4.5, 10.5, 10.0);
         VoxelShape WEST_BODY_STAGE_3 = Block.box(0.0, 5.75, 5.5, 5.0, 9.75, 10.5);
         VoxelShape WEST_BOTTOM_STAGE_3 = Block.box(0.5, 5.0, 6.0, 4.5, 5.75, 10.0);

        // Full fruit
         VoxelShape WEST_TOP_FRUIT = Block.box(1.0, 9.0, 6.0, 5.0, 10.0, 10.0);
         VoxelShape WEST_BODY_FRUIT = Block.box(0.0, 4.0, 5.0, 6.0, 9.0, 11.0);
         VoxelShape WEST_BOTTOM_FRUIT = Block.box(0.5, 3.0, 5.5, 5.5, 4.0, 10.5);
        
        WEST_AABB = new VoxelShape[]{
                Shapes.or(WEST_BODY_STAGE_1, WEST_TOP_STAGE_1, WEST_BOTTOM_STAGE_1),
                Shapes.or(WEST_BODY_STAGE_2, WEST_TOP_STAGE_2, WEST_BOTTOM_STAGE_2),
                Shapes.or(WEST_BODY_STAGE_3, WEST_TOP_STAGE_3, WEST_BOTTOM_STAGE_3),
                Shapes.or(WEST_BODY_FRUIT, WEST_TOP_FRUIT, WEST_BOTTOM_FRUIT)
        };
    }
}
