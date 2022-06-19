package com.cinemamod.fabric.init;

import com.cinemamod.fabric.CinemaMod;
import com.cinemamod.fabric.block.PreviewScreenBlock;
import com.cinemamod.fabric.block.PreviewScreenBlockEntity;
import com.cinemamod.fabric.block.ScreenBlock;
import com.cinemamod.fabric.block.ScreenBlockEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.registry.Registry;

public class BlockEntityInit {

    public static BlockEntityType<ScreenBlockEntity> SCREEN_BLOCK_ENTITY;
    public static BlockEntityType<PreviewScreenBlockEntity> PREVIEW_SCREEN_BLOCK_ENTITY;

    public static void register() {
        SCREEN_BLOCK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, CinemaMod.MODID + ":screen_block_entity",
                FabricBlockEntityTypeBuilder.create(ScreenBlockEntity::new, ScreenBlock.SCREEN_BLOCK).build(null));
        PREVIEW_SCREEN_BLOCK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, CinemaMod.MODID + ":_preview_screen_block_entity",
                FabricBlockEntityTypeBuilder.create(PreviewScreenBlockEntity::new, PreviewScreenBlock.PREVIEW_SCREEN_BLOCK).build(null));
    }
}
