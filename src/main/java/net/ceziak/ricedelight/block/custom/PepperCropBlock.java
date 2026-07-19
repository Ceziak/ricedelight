package net.ceziak.ricedelight.block.custom;

import net.ceziak.ricedelight.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class PepperCropBlock extends CropBlock {
    public static final int MAX_AGE = 4;
    public static final IntegerProperty AGE =
            BlockStateProperties.AGE_4;

    private static final VoxelShape[] SHAPES = {
            Block.box(0, 0, 0, 16, 3, 16),
            Block.box(0, 0, 0, 16, 6, 16),
            Block.box(0, 0, 0, 16, 9, 16),
            Block.box(0, 0, 0, 16, 13, 16),
            Block.box(0, 0, 0, 16, 16, 16)
    };

    public PepperCropBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected IntegerProperty getAgeProperty() {
        return AGE;
    }

    @Override
    public int getMaxAge() {
        return MAX_AGE;
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.PEPPER_SEEDS.get();
    }

    @Override
    protected void createBlockStateDefinition(
            StateDefinition.Builder<Block, BlockState> builder
    ) {
        builder.add(AGE);
    }

    @Override
    public VoxelShape getShape(
            BlockState state,
            BlockGetter level,
            BlockPos pos,
            CollisionContext context
    ) {
        return SHAPES[getAge(state)];
    }
}

