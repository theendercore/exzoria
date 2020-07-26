package com.ender.exzoria.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class VoidsteelBricks extends Block {

    public VoidsteelBricks() {
        super(Properties.create(Material.ROCK)
            .sound(SoundType.STONE)
            .hardnessAndResistance(2.0f)
        );
    }
}
