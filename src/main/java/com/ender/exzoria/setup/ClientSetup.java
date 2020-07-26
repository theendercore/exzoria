package com.ender.exzoria.setup;


import com.ender.exzoria.Exzoria;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = Exzoria.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ClientSetup {
    public static void init(final FMLCommonSetupEvent event) {}
}
