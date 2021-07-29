package com.pandaboi.better.copper;

import com.pandaboi.better.copper.registry.ModBlocks;
import com.pandaboi.better.copper.registry.ModItems;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class BetterCopper implements ModInitializer, ClientModInitializer {

    public static final String MOD_ID = "bettercopper";

    @Override
    public void onInitialize() {

        ModItems.registerItems();
        ModBlocks.registerBlocks();

    }

    @Override
    public void onInitializeClient() {

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.COPPER_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.COPPER_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.COPPER_BARS, RenderLayer.getCutout());

    }

}
