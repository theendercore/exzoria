package com.ender.exzoria.datagen;

import com.ender.exzoria.Exzoria;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import net.minecraftforge.client.model.generators.ItemModelProvider;

public class Items extends ItemModelProvider {

    public Items(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Exzoria.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

    }
}
