package com.syco.deepslatetweaks.registry;

import com.syco.deepslatetweaks.DeepslateTweaks;
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
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = DeepslateTweaks.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CustomRegistryHandler
{
    //REGISTERING ALL BLOCKS
    @ObjectHolder("minecraft:deepslate")
    public static final Block DEEPSLATE_BLOCK = null;

    @ObjectHolder("minecraft:cobbled_deepslate")
    public static final Block COBBLED_DEEPSLATE_BLOCK = null;

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        //event.getRegistry().registerAll(
                //new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DEEPSLATE).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.DEEPSLATE)).setRegistryName("minecraft:deepslate")
                //,
                //new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).strength(1.5F, 6.0F)).setRegistryName("minecraft:cobbled_deepslate")
        //);
        //event.getRegistry().register(new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DEEPSLATE).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.DEEPSLATE)).setRegistryName("minecraft:deepslate"));
        //event.getRegistry().register(new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).strength(1.5F, 6.0F)).setRegistryName("minecraft:cobbled_deepslate"));
    }

    //REGISTERING ALL ITEMS
    @ObjectHolder("minecraft:deepslate")
    public static final Item DEEPSLATE_ITEM = null;

    @ObjectHolder("minecraft:cobbled_deepslate")
    public static final Item COBBLED_DEEPSLATE_ITEM = null;

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(
                new BlockItem(DEEPSLATE_BLOCK, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)).setRegistryName("minecraft:deepslate"),
                new BlockItem(COBBLED_DEEPSLATE_BLOCK, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)).setRegistryName("minecraft:cobbled_deepslate")
        );
    }
}
