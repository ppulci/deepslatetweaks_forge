package com.syco.deepslatetweaks;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(DeepslateTweaks.MOD_ID)
public class DeepslateTweaks
{
    public static final String MOD_ID = "deepslatetweaks";

    public DeepslateTweaks()
    {
        FMLJavaModLoadingContext.get().getModEventBus();

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {

    }
}
