package com.cinemamod.fabric.block;

import com.cinemamod.fabric.init.BlockEntityInit;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;

public class PreviewScreenBlockEntity extends BlockEntity {

    public PreviewScreenBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

    public PreviewScreenBlockEntity(BlockPos pos, BlockState state) {
        super(BlockEntityInit.PREVIEW_SCREEN_BLOCK_ENTITY, pos, state);
    }

}
