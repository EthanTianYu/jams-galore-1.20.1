package net.ethantianyu.jamsgalore.item;

import net.ethantianyu.jamsgalore.JamsGalore;
import net.ethantianyu.jamsgalore.item.custom.MetalDetectorItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item JAR = registerItem("jar", new Item(new FabricItemSettings()));
    public static final Item LEAF = registerItem("leaf", new Item(new FabricItemSettings()));
    public static final Item LEMON = registerItem("lemon", new Item(new FabricItemSettings().food(ModFoodComponents.LEMON)));
    public static final Item LEMON_PIE = registerItem("lemon_pie", new Item(new FabricItemSettings().food(ModFoodComponents.LEMON_PIE)));
    public static final Item METAL_DETECTOR = registerItem("metal_detector",
            new MetalDetectorItem(new FabricItemSettings().maxDamage(64)));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries){
        entries.add(JAR);
        entries.add(LEAF);
    }
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(JamsGalore.MOD_ID, name), item);
    }

    public static void registerModItems() {
        JamsGalore.LOGGER.info("Registering Mod Items for " + JamsGalore.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
