package com.cinemamod.fabric.block;

import com.cinemamod.fabric.init.BlockEntityInit;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;

public class ScreenBlockEntity extends BlockEntity {

    public ScreenBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

    public ScreenBlockEntity(BlockPos pos, BlockState state) {
        super(BlockEntityInit.SCREEN_BLOCK_ENTITY, pos, state);
    }
}
