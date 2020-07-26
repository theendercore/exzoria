package com.ender.exzoria.setup;

import com.ender.exzoria.Exzoria;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = Exzoria.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModSetup {

    public static final ItemGroup EXZORIA = new ItemGroup("exzoria") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Registration.VOIDSTEEL_BLOCK.get());
        }
    };
    public static void init(final FMLCommonSetupEvent event) {}
}
