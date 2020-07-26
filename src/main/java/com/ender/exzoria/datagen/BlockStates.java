package com.ender.exzoria.datagen;

import com.ender.exzoria.Exzoria;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ExistingFileHelper;

public class BlockStates extends BlockStateProvider {


    public BlockStates(DataGenerator gen,  ExistingFileHelper exFileHelper) {
        super(gen, Exzoria.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

    }
}
