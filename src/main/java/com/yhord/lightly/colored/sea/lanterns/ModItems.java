package com.yhord.lightly.colored.sea.lanterns;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final BlockItem WHITE_SEA_LANTERN = new BlockItem(ModBlocks.WHITE_SEA_LANTERN, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem ORANGE_SEA_LANTERN = new BlockItem(ModBlocks.ORANGE_SEA_LANTERN, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem MAGENTA_SEA_LANTERN = new BlockItem(ModBlocks.MAGENTA_SEA_LANTERN, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem LIGHT_BLUE_SEA_LANTERN = new BlockItem(ModBlocks.LIGHT_BLUE_SEA_LANTERN, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem YELLOW_SEA_LANTERN = new BlockItem(ModBlocks.YELLOW_SEA_LANTERN, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem LIME_SEA_LANTERN = new BlockItem(ModBlocks.LIME_SEA_LANTERN, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem PINK_SEA_LANTERN = new BlockItem(ModBlocks.PINK_SEA_LANTERN, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem GRAY_SEA_LANTERN = new BlockItem(ModBlocks.GRAY_SEA_LANTERN, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem LIGHT_GRAY_SEA_LANTERN = new BlockItem(ModBlocks.LIGHT_GRAY_SEA_LANTERN, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem CYAN_SEA_LANTERN = new BlockItem(ModBlocks.CYAN_SEA_LANTERN, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem PURPLE_SEA_LANTERN = new BlockItem(ModBlocks.PURPLE_SEA_LANTERN, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem BLUE_SEA_LANTERN = new BlockItem(ModBlocks.BLUE_SEA_LANTERN, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem BROWN_SEA_LANTERN = new BlockItem(ModBlocks.BROWN_SEA_LANTERN, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem GREEN_SEA_LANTERN = new BlockItem(ModBlocks.GREEN_SEA_LANTERN, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem RED_SEA_LANTERN = new BlockItem(ModBlocks.RED_SEA_LANTERN, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem BLACK_SEA_LANTERN = new BlockItem(ModBlocks.BLACK_SEA_LANTERN, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(LightlyColoredSeaLanterns.MOD_ID, "white_sea_lantern"), WHITE_SEA_LANTERN);
        Registry.register(Registry.ITEM, new Identifier(LightlyColoredSeaLanterns.MOD_ID, "orange_sea_lantern"), ORANGE_SEA_LANTERN);
        Registry.register(Registry.ITEM, new Identifier(LightlyColoredSeaLanterns.MOD_ID, "magenta_sea_lantern"), MAGENTA_SEA_LANTERN);
        Registry.register(Registry.ITEM, new Identifier(LightlyColoredSeaLanterns.MOD_ID, "light_blue_sea_lantern"), LIGHT_BLUE_SEA_LANTERN);
        Registry.register(Registry.ITEM, new Identifier(LightlyColoredSeaLanterns.MOD_ID, "yellow_sea_lantern"), YELLOW_SEA_LANTERN);
        Registry.register(Registry.ITEM, new Identifier(LightlyColoredSeaLanterns.MOD_ID, "lime_sea_lantern"), LIME_SEA_LANTERN);
        Registry.register(Registry.ITEM, new Identifier(LightlyColoredSeaLanterns.MOD_ID, "pink_sea_lantern"), PINK_SEA_LANTERN);
        Registry.register(Registry.ITEM, new Identifier(LightlyColoredSeaLanterns.MOD_ID, "gray_sea_lantern"), GRAY_SEA_LANTERN);
        Registry.register(Registry.ITEM, new Identifier(LightlyColoredSeaLanterns.MOD_ID, "light_gray_sea_lantern"), LIGHT_GRAY_SEA_LANTERN);
        Registry.register(Registry.ITEM, new Identifier(LightlyColoredSeaLanterns.MOD_ID, "cyan_sea_lantern"), CYAN_SEA_LANTERN);
        Registry.register(Registry.ITEM, new Identifier(LightlyColoredSeaLanterns.MOD_ID, "purple_sea_lantern"), PURPLE_SEA_LANTERN);
        Registry.register(Registry.ITEM, new Identifier(LightlyColoredSeaLanterns.MOD_ID, "blue_sea_lantern"), BLUE_SEA_LANTERN);
        Registry.register(Registry.ITEM, new Identifier(LightlyColoredSeaLanterns.MOD_ID, "brown_sea_lantern"), BROWN_SEA_LANTERN);
        Registry.register(Registry.ITEM, new Identifier(LightlyColoredSeaLanterns.MOD_ID, "green_sea_lantern"), GREEN_SEA_LANTERN);
        Registry.register(Registry.ITEM, new Identifier(LightlyColoredSeaLanterns.MOD_ID, "red_sea_lantern"), RED_SEA_LANTERN);
        Registry.register(Registry.ITEM, new Identifier(LightlyColoredSeaLanterns.MOD_ID, "black_sea_lantern"), BLACK_SEA_LANTERN);
    }
}
