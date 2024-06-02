package net.ethantianyu.jamsgalore.item;

import net.ethantianyu.jamsgalore.JamsGalore;
import net.ethantianyu.jamsgalore.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup JAMSGALORE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(JamsGalore.MOD_ID, "leaf"),
            FabricItemGroup.builder().displayName(Text.translatable("jams galore"))
                    .icon(() -> new ItemStack(ModItems.LEAF)).entries((displayContext, entries) -> {
                        entries.add(ModItems.JAR);
                        entries.add(ModItems.LEAF);
                        entries.add(ModBlocks.LEAF_BLOCK);
                        entries.add(ModItems.METAL_DETECTOR);
                        entries.add(ModBlocks.SOUND_BLOCK);
                        entries.add(ModItems.LEMON);
                        entries.add(ModItems.LEMON_PIE);

                    }).build());

    public static void registerItemgroups(){
        JamsGalore.LOGGER.info("Registering Item Groups for " + JamsGalore.MOD_ID);

    }
}
