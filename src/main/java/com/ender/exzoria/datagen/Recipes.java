package com.ender.exzoria.datagen;

import com.ender.exzoria.setup.Registration;
import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.item.Items;

import java.util.function.Consumer;

public class Recipes extends RecipeProvider {

    public Recipes(DataGenerator generatorIn) {super(generatorIn);}

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        ShapedRecipeBuilder.shapedRecipe(Registration.VOIDSTEEL_PICKAXE.get(), 1)
                .patternLine("XXX")
                .patternLine(" S ")
                .patternLine(" S ")
                .key('X', Registration.VOIDSTEEL.get())
                .key('S', Items.STICK)
                .addCriterion("has_voidsteel", this.hasItem(Registration.VOIDSTEEL.get()))
                .build(consumer);
    }
}
