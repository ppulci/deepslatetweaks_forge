package com.syco.deepslatetweaks;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(DeepslateTweaks.MOD_ID)
public class DeepslateTweaks
{
    public static final String MOD_ID = "deepslatetweaks";
    private static final Logger LOGGER = LogUtils.getLogger();

    public DeepslateTweaks()
    {
        FMLJavaModLoadingContext.get().getModEventBus();
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("DEEPSLATE TWEAKS!");
    }
}
