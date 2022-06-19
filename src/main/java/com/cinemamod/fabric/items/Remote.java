package com.cinemamod.fabric.items;

import com.cinemamod.fabric.CinemaMod;
import com.cinemamod.fabric.block.ScreenBlock;
import com.cinemamod.fabric.gui.VideoSettingsScreen;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.MinecraftClient;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Remote extends Item {

    public static Item REMOTE;

    public Remote(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if(context.getWorld().isClient) {
            if (context.getWorld().getBlockState(context.getBlockPos()) == ScreenBlock.SCREEN_BLOCK.getDefaultState()) {
                MinecraftClient.getInstance().setScreen(new VideoSettingsScreen());
                return ActionResult.SUCCESS;
            }
        }
        return ActionResult.PASS;
    }

    public static void register() {
        REMOTE = Registry.register(Registry.ITEM, new Identifier(CinemaMod.MODID, "remote"),
                new Remote(new FabricItemSettings().maxCount(1).group(ItemGroup.MISC)));
    }
}
