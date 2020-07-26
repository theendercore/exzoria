package com.ender.exzoria;

import com.ender.exzoria.setup.ClientSetup;
import com.ender.exzoria.setup.ModSetup;
import com.ender.exzoria.setup.Registration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Exzoria.MODID)
public class Exzoria {

    public static final String MODID = "exzoria";

    private static final Logger LOGGER = LogManager.getLogger();

    public Exzoria() {

        Registration.init();

        FMLJavaModLoadingContext.get().getModEventBus().addListener(ModSetup::init);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(ClientSetup::init);
    }

}
