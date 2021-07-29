package com.pandaboi.better.copper.blocks;

import com.pandaboi.better.copper.BetterCopper;
import net.minecraft.block.TrapdoorBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CopperTrapdoor extends TrapdoorBlock {

    public CopperTrapdoor(Settings settings, String name) {
        super(settings);
        Registry.register(Registry.BLOCK, new Identifier(BetterCopper.MOD_ID, name), this);
        Registry.register(Registry.ITEM, new Identifier(BetterCopper.MOD_ID, name), new BlockItem(this, new Item.Settings().group(ItemGroup.REDSTONE)));
    }

}

