package net.ethantianyu.jamsgalore.datagen;

import net.ethantianyu.jamsgalore.block.ModBlocks;
import net.ethantianyu.jamsgalore.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.ShapedRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {

    public static final List<ItemConvertible> LEMON_SMELTABLE = List.of(ModBlocks.LEAF_BLOCK, ModBlocks.SOUND_BLOCK);
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, LEMON_SMELTABLE, RecipeCategory.FOOD, ModItems.LEMON, 0.7f, 200, "lemon");
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.JAR, 1)
                .pattern("   ")
                .pattern("B B")
                .pattern("BBB")
                .input('B', Items.GLASS)
                .criterion(hasItem(Items.GLASS), conditionsFromItem(Items.GLASS))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.JAR)));




    }
}
