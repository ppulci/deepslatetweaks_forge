package com.syco.deepslatetweaks;

import com.mojang.logging.LogUtils;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(DeepslateTweaks.MOD_ID)
public class DeepslateTweaks
{
    public static final String MOD_ID = "deepslatetweaks";
    private static final Logger LOGGER = LogUtils.getLogger();

    public DeepslateTweaks(FMLJavaModLoadingContext context)
    {
        var modBusGroup = context.getModBusGroup();

        // Register the commonSetup method for modloading
        FMLCommonSetupEvent.getBus(modBusGroup).addListener(this::commonSetup);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Startup self-check: vanilla values here mean the mixin did not apply; wrong control
        // values mean a slice anchor widened and clobbered unrelated blocks.
        LOGGER.info("Effective hardness — deepslate: {}, cobbled: {}, deepslate iron ore: {} (expected 1.5/2.0/3.0); controls — stone: {}, dirt: {} (expected 1.5/0.5)",
                Blocks.DEEPSLATE.defaultDestroyTime(),
                Blocks.COBBLED_DEEPSLATE.defaultDestroyTime(),
                Blocks.DEEPSLATE_IRON_ORE.defaultDestroyTime(),
                Blocks.STONE.defaultDestroyTime(),
                Blocks.DIRT.defaultDestroyTime());
    }
}
