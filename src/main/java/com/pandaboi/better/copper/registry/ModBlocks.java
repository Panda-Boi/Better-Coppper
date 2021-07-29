package com.pandaboi.better.copper.registry;

import com.pandaboi.better.copper.blocks.CopperBars;
import com.pandaboi.better.copper.blocks.CopperDoor;
import com.pandaboi.better.copper.blocks.CopperTrapdoor;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class ModBlocks {

    public static CopperTrapdoor COPPER_TRAPDOOR;
    public static CopperDoor COPPER_DOOR;
    public static CopperBars COPPER_BARS;


    public static void registerBlocks() {

        COPPER_TRAPDOOR = new CopperTrapdoor(Block.Settings.copy(Blocks.IRON_TRAPDOOR), "copper_trapdoor");
        COPPER_DOOR = new CopperDoor(Block.Settings.copy(Blocks.IRON_DOOR), "copper_door");
        COPPER_BARS = new CopperBars(Block.Settings.copy(Blocks.IRON_BARS), "copper_bars");

    }

}
