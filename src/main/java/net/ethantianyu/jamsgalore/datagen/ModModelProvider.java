package net.ethantianyu.jamsgalore.datagen;

import net.ethantianyu.jamsgalore.block.ModBlocks;
import net.ethantianyu.jamsgalore.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

import javax.annotation.processing.Generated;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LEAF_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SOUND_BLOCK);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.LEMON, Models.GENERATED);
        itemModelGenerator.register(ModItems.JAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.LEMON_MUFFIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.RASPBERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.RASPBERRY_MUFFIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.RHUBARB, Models.GENERATED);
        itemModelGenerator.register(ModItems.MANCHINEEL_APPLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.METAL_DETECTOR, Models.GENERATED);

    }
    //8:26
}
