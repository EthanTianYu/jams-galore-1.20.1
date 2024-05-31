package net.ethantianyu.jamsgalore.block;

import net.ethantianyu.jamsgalore.JamsGalore;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block GREAT_OAK_LOG = registerBlock("Great Oak Log",
    new Block(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(JamsGalore.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(JamsGalore.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks(){
        JamsGalore.LOGGER.info("Registering Mod BLocks for "+ JamsGalore.MOD_ID);
    }
}
