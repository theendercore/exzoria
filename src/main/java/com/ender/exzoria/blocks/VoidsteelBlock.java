package com.ender.exzoria.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class VoidsteelBlock extends Block {

    public VoidsteelBlock() {
        super(Properties.create(Material.IRON)
            .sound(SoundType.METAL)
            .hardnessAndResistance(2.0f)
        );
    }
}
