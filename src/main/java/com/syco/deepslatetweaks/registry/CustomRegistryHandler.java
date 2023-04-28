package com.syco.deepslatetweaks.registry;

import com.syco.deepslatetweaks.DeepslateTweaks;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = DeepslateTweaks.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CustomRegistryHandler {

    //REGISTERING ALL BLOCKS
    @ObjectHolder(registryName = "minecraft:block", value = "minecraft:deepslate")
    public static final Block DEEPSLATE_BLOCK = null;

    @ObjectHolder(registryName = "minecraft:block", value = "minecraft:cobbled_deepslate")
    public static final Block COBBLED_DEEPSLATE_BLOCK = null;

    @SubscribeEvent
    public static void registerBlocks(RegisterEvent event) {
        event.register(ForgeRegistries.Keys.BLOCKS, helper -> {

            helper.register(new ResourceLocation("minecraft", "deepslate"), new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DEEPSLATE).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.DEEPSLATE)));

            helper.register(new ResourceLocation("minecraft", "cobbled_deepslate"), new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).strength(1.5F, 6.0F)));

        });

        event.register(ForgeRegistries.Keys.ITEMS, helper -> {

            helper.register(new ResourceLocation("minecraft", "deepslate"), new BlockItem(DEEPSLATE_BLOCK, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

            helper.register(new ResourceLocation("minecraft", "cobbled_deepslate"), new BlockItem(COBBLED_DEEPSLATE_BLOCK, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

        });
    }
}