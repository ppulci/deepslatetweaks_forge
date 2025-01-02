package com.syco.deepslatetweaks.registry;

import com.syco.deepslatetweaks.DeepslateTweaks;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.EventPriority;
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

    // NEW
    @ObjectHolder(registryName = "minecraft:block", value = "minecraft:deepslate_gold_ore")
    public static final Block DEEPSLATE_GOLD_ORE = null;

    @ObjectHolder(registryName = "minecraft:block", value = "minecraft:deepslate_iron_ore")
    public static final Block DEEPSLATE_IRON_ORE = null;

    @ObjectHolder(registryName = "minecraft:block", value = "minecraft:deepslate_coal_ore")
    public static final Block DEEPSLATE_COAL_ORE = null;

    @ObjectHolder(registryName = "minecraft:block", value = "minecraft:deepslate_lapis_ore")
    public static final Block DEEPSLATE_LAPIS_ORE = null;

    @ObjectHolder(registryName = "minecraft:block", value = "minecraft:deepslate_diamond_ore")
    public static final Block DEEPSLATE_DIAMOND_ORE = null;

    @ObjectHolder(registryName = "minecraft:block", value = "minecraft:deepslate_redstone_ore")
    public static final Block DEEPSLATE_REDSTONE_ORE = null;

    @ObjectHolder(registryName = "minecraft:block", value = "minecraft:deepslate_emerald_ore")
    public static final Block DEEPSLATE_EMERALD_ORE = null;

    @ObjectHolder(registryName = "minecraft:block", value = "minecraft:deepslate_copper_ore")
    public static final Block DEEPSLATE_COPPER_ORE = null;

    @SubscribeEvent
    public static void registerBlocks(RegisterEvent event) {
        event.register(ForgeRegistries.Keys.BLOCKS, helper -> {

            helper.register(
                    ResourceLocation.tryParse("minecraft:deepslate"),
                    new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F).sound(SoundType.DEEPSLATE))
            );

            helper.register(ResourceLocation.tryParse("minecraft:cobbled_deepslate"),
                    new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE).strength(1.5F, 6.0F))
            );

            // New Blocks That Do Not Drop EXP
            helper.register(
                    ResourceLocation.tryParse("minecraft:deepslate_gold_ore"),
                    new DropExperienceBlock( UniformInt.of(0, 0), BlockBehaviour.Properties.of().mapColor(MapColor.GOLD).strength(1.5F, 3.0F))
            );

            helper.register(
                    ResourceLocation.tryParse("minecraft:deepslate_iron_ore"),
                    new DropExperienceBlock( UniformInt.of(0, 0), BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE).strength(1.5F, 3.0F))
            );

            helper.register(
                    ResourceLocation.tryParse("minecraft:deepslate_copper_ore"),
                    new DropExperienceBlock( UniformInt.of(0, 0), BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_COPPER_ORE).strength(1.5F, 3.0F))
            );

            // New Blocks That Drop EXP
            helper.register(
                    ResourceLocation.tryParse("minecraft:deepslate_coal_ore"),
                    new DropExperienceBlock( UniformInt.of(0, 2), BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_COAL_ORE).strength(1.5F, 3.0F))
            );

            helper.register(
                    ResourceLocation.tryParse("minecraft:deepslate_lapis_ore"),
                    new DropExperienceBlock( UniformInt.of(2, 5), BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_LAPIS_ORE).strength(1.5F, 3.0F))
            );

            helper.register(
                    ResourceLocation.tryParse("minecraft:deepslate_diamond_ore"),
                    new DropExperienceBlock( UniformInt.of(3, 7), BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_DIAMOND_ORE).strength(1.5F, 3.0F))
            );

            helper.register(
                    ResourceLocation.tryParse("minecraft:deepslate_redstone_ore"),
                    new RedStoneOreBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_REDSTONE_ORE).strength(1.5F, 3.0F)) // Redstone has innate EXP drop
            );

            helper.register(
                    ResourceLocation.tryParse("minecraft:deepslate_emerald_ore"),
                    new DropExperienceBlock( UniformInt.of(3, 7), BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_EMERALD_ORE).strength(1.5F, 3.0F))
            );


        });

        event.register(ForgeRegistries.Keys.ITEMS, helper -> {

            helper.register(
                    ResourceLocation.tryParse("minecraft:deepslate"),
                    new BlockItem(Blocks.DEEPSLATE, new Item.Properties())
            );

            helper.register(
                    ResourceLocation.tryParse("minecraft:cobbled_deepslate"),
                    new BlockItem(Blocks.COBBLED_DEEPSLATE, new Item.Properties())
            );

            helper.register(
                    ResourceLocation.tryParse("minecraft:deepslate_gold_ore"),
                    new BlockItem(DEEPSLATE_GOLD_ORE, new Item.Properties())
            );

            helper.register(
                    ResourceLocation.tryParse("minecraft:deepslate_iron_ore"),
                    new BlockItem(DEEPSLATE_IRON_ORE, new Item.Properties())
            );

            helper.register(
                    ResourceLocation.tryParse("minecraft:deepslate_coal_ore"),
                    new BlockItem(DEEPSLATE_COAL_ORE, new Item.Properties())
            );

            helper.register(
                    ResourceLocation.tryParse("minecraft:deepslate_lapis_ore"),
                    new BlockItem(DEEPSLATE_LAPIS_ORE, new Item.Properties())
            );

            helper.register(
                    ResourceLocation.tryParse("minecraft:deepslate_diamond_ore"),
                    new BlockItem(DEEPSLATE_DIAMOND_ORE, new Item.Properties())
            );

            helper.register(
                    ResourceLocation.tryParse("minecraft:deepslate_redstone_ore"),
                    new BlockItem(DEEPSLATE_REDSTONE_ORE, new Item.Properties())
            );

            helper.register(
                    ResourceLocation.tryParse("minecraft:deepslate_emerald_ore"),
                    new BlockItem(DEEPSLATE_EMERALD_ORE, new Item.Properties())
            );

            helper.register(
                    ResourceLocation.tryParse("minecraft:deepslate_copper_ore"),
                    new BlockItem(DEEPSLATE_COPPER_ORE, new Item.Properties())
            );

        });
    }
}