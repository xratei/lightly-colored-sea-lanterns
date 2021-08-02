package com.yhord.lightly.colored.sea.lanterns;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block WHITE_SEA_LANTERN = new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).luminance(15));
    public static final Block ORANGE_SEA_LANTERN = new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).luminance(15));
    public static final Block MAGENTA_SEA_LANTERN = new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).luminance(15));
    public static final Block LIGHT_BLUE_SEA_LANTERN = new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).luminance(15));
    public static final Block YELLOW_SEA_LANTERN = new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).luminance(15));
    public static final Block LIME_SEA_LANTERN = new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).luminance(15));
    public static final Block PINK_SEA_LANTERN = new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).luminance(15));
    public static final Block GRAY_SEA_LANTERN = new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).luminance(15));
    public static final Block LIGHT_GRAY_SEA_LANTERN = new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).luminance(15));
    public static final Block CYAN_SEA_LANTERN = new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).luminance(15));
    public static final Block PURPLE_SEA_LANTERN = new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).luminance(15));
    public static final Block BLUE_SEA_LANTERN = new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).luminance(15));
    public static final Block BROWN_SEA_LANTERN = new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).luminance(15));
    public static final Block GREEN_SEA_LANTERN = new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).luminance(15));
    public static final Block RED_SEA_LANTERN = new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).luminance(15));
    public static final Block BLACK_SEA_LANTERN = new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f, 1.5f).sounds(BlockSoundGroup.GLASS).luminance(15));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(LightlyColoredSeaLanterns.MOD_ID, "white_sea_lantern"), WHITE_SEA_LANTERN);
        Registry.register(Registry.BLOCK, new Identifier(LightlyColoredSeaLanterns.MOD_ID, "orange_sea_lantern"), ORANGE_SEA_LANTERN);
        Registry.register(Registry.BLOCK, new Identifier(LightlyColoredSeaLanterns.MOD_ID, "magenta_sea_lantern"), MAGENTA_SEA_LANTERN);
        Registry.register(Registry.BLOCK, new Identifier(LightlyColoredSeaLanterns.MOD_ID, "light_blue_sea_lantern"), LIGHT_BLUE_SEA_LANTERN);
        Registry.register(Registry.BLOCK, new Identifier(LightlyColoredSeaLanterns.MOD_ID, "yellow_sea_lantern"), YELLOW_SEA_LANTERN);
        Registry.register(Registry.BLOCK, new Identifier(LightlyColoredSeaLanterns.MOD_ID, "lime_sea_lantern"), LIME_SEA_LANTERN);
        Registry.register(Registry.BLOCK, new Identifier(LightlyColoredSeaLanterns.MOD_ID, "pink_sea_lantern"), PINK_SEA_LANTERN);
        Registry.register(Registry.BLOCK, new Identifier(LightlyColoredSeaLanterns.MOD_ID, "gray_sea_lantern"), GRAY_SEA_LANTERN);
        Registry.register(Registry.BLOCK, new Identifier(LightlyColoredSeaLanterns.MOD_ID, "light_gray_sea_lantern"), LIGHT_GRAY_SEA_LANTERN);
        Registry.register(Registry.BLOCK, new Identifier(LightlyColoredSeaLanterns.MOD_ID, "cyan_sea_lantern"), CYAN_SEA_LANTERN);
        Registry.register(Registry.BLOCK, new Identifier(LightlyColoredSeaLanterns.MOD_ID, "purple_sea_lantern"), PURPLE_SEA_LANTERN);
        Registry.register(Registry.BLOCK, new Identifier(LightlyColoredSeaLanterns.MOD_ID, "blue_sea_lantern"), BLUE_SEA_LANTERN);
        Registry.register(Registry.BLOCK, new Identifier(LightlyColoredSeaLanterns.MOD_ID, "brown_sea_lantern"), BROWN_SEA_LANTERN);
        Registry.register(Registry.BLOCK, new Identifier(LightlyColoredSeaLanterns.MOD_ID, "green_sea_lantern"), GREEN_SEA_LANTERN);
        Registry.register(Registry.BLOCK, new Identifier(LightlyColoredSeaLanterns.MOD_ID, "red_sea_lantern"), RED_SEA_LANTERN);
        Registry.register(Registry.BLOCK, new Identifier(LightlyColoredSeaLanterns.MOD_ID, "black_sea_lantern"), BLACK_SEA_LANTERN);
    }
}
