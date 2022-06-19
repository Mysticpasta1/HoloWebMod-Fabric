package com.cinemamod.fabric;

import com.cinemamod.fabric.block.PreviewScreenBlock;
import com.cinemamod.fabric.block.PreviewScreenBlockEntity;
import com.cinemamod.fabric.block.ScreenBlock;
import com.cinemamod.fabric.block.ScreenBlockEntity;
import com.cinemamod.fabric.init.BlockEntityInit;
import com.cinemamod.fabric.items.Remote;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CinemaMod implements ModInitializer {

    public static final String MODID = "cinemamod";
    public static final Logger LOGGER = LogManager.getLogger(MODID);

    @Override
    public void onInitialize() {
        //Register Blocks
        ScreenBlock.register();
        PreviewScreenBlock.register();
        Remote.register();

        //Register Block Entities
        BlockEntityInit.register();
    }
}
