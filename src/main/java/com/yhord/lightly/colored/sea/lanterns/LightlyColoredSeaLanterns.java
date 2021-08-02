package com.yhord.lightly.colored.sea.lanterns;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class LightlyColoredSeaLanterns implements ModInitializer {

    public static final String MOD_ID = "lcsl";

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(
            new Identifier("lcsl", "general"))
            .icon(() -> new ItemStack(Items.SEA_LANTERN))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(ModBlocks.WHITE_SEA_LANTERN));
                stacks.add(new ItemStack(ModBlocks.ORANGE_SEA_LANTERN));
                stacks.add(new ItemStack(ModBlocks.MAGENTA_SEA_LANTERN));
                stacks.add(new ItemStack(ModBlocks.LIGHT_BLUE_SEA_LANTERN));
                stacks.add(new ItemStack(ModBlocks.YELLOW_SEA_LANTERN));
                stacks.add(new ItemStack(ModBlocks.LIME_SEA_LANTERN));
                stacks.add(new ItemStack(ModBlocks.PINK_SEA_LANTERN));
                stacks.add(new ItemStack(ModBlocks.GRAY_SEA_LANTERN));
                stacks.add(new ItemStack(ModBlocks.LIGHT_GRAY_SEA_LANTERN));
                stacks.add(new ItemStack(ModBlocks.CYAN_SEA_LANTERN));
                stacks.add(new ItemStack(ModBlocks.PURPLE_SEA_LANTERN));
                stacks.add(new ItemStack(ModBlocks.BLUE_SEA_LANTERN));
                stacks.add(new ItemStack(ModBlocks.BROWN_SEA_LANTERN));
                stacks.add(new ItemStack(ModBlocks.GREEN_SEA_LANTERN));
                stacks.add(new ItemStack(ModBlocks.RED_SEA_LANTERN));
                stacks.add(new ItemStack(ModBlocks.BLACK_SEA_LANTERN));
            })
            .build();

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
    }
}
