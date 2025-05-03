package net.boypika.mysticalwood.datagen;

import net.boypika.mysticalwood.MysticalWood;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancement.AdvancementCriterion;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.data.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class MysticalWoodRecipeDataGen extends FabricRecipeProvider {
    public MysticalWoodRecipeDataGen(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                createShaped(RecipeCategory.MISC, MysticalWood.MYSTICAL_UPGRADE_TEMPLATE)
                        .pattern("LLL")
                        .pattern("LEL")
                        .pattern("LLL")
                        .input('L', MysticalWood.MYSTICAL_LOG_ITEM)
                        .input('E', Items.EMERALD)
                        .criterion("has_mystic_log", conditionsFromItem(MysticalWood.MYSTICAL_LOG_ITEM))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, MysticalWood.MYSTICAL_WOOD_ITEM, 3)
                        .pattern("##")
                        .pattern("##")
                        .input('#', MysticalWood.MYSTICAL_LOG_ITEM)
                        .criterion("has_mystic_log", conditionsFromItem(MysticalWood.MYSTICAL_LOG_ITEM))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, MysticalWood.MYSTICAL_STAIRS_ITEM, 4)
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .input('#', MysticalWood.MYSTICAL_PLANKS_ITEM)
                        .criterion("has_mystic_log", conditionsFromItem(MysticalWood.MYSTICAL_LOG_ITEM))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, MysticalWood.MYSTICAL_SLAB_ITEM, 6)
                        .pattern("###")
                        .input('#', MysticalWood.MYSTICAL_PLANKS_ITEM)
                        .criterion("has_mystic_log", conditionsFromItem(MysticalWood.MYSTICAL_LOG_ITEM))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.BUILDING_BLOCKS, MysticalWood.MYSTICAL_PLANKS_ITEM, 4)
                        .input(MysticalWoodItemTagGenerator.LOG_ITEMS)
                        .criterion("has_mystic_log", conditionsFromItem(MysticalWood.MYSTICAL_LOG_ITEM))
                        .offerTo(exporter);
                smithing(MysticalWood.MYSTICAL_UPGRADE_TEMPLATE, Items.WOODEN_SWORD, MysticalWood.MYSTICAL_LOG_ITEM, RecipeCategory.TOOLS, MysticalWood.MYSTICAL_WOODEN_SWORD, "has_mystic_log", InventoryChangedCriterion.Conditions.items(MysticalWood.MYSTICAL_LOG_ITEM), exporter);
                smithing(MysticalWood.MYSTICAL_UPGRADE_TEMPLATE, Items.WOODEN_PICKAXE, MysticalWood.MYSTICAL_LOG_ITEM, RecipeCategory.TOOLS, MysticalWood.MYSTICAL_WOODEN_PICKAXE, "has_mystic_log", InventoryChangedCriterion.Conditions.items(MysticalWood.MYSTICAL_LOG_ITEM), exporter);
                smithing(MysticalWood.MYSTICAL_UPGRADE_TEMPLATE, Items.WOODEN_AXE, MysticalWood.MYSTICAL_LOG_ITEM, RecipeCategory.TOOLS, MysticalWood.MYSTICAL_WOODEN_AXE, "has_mystic_log", InventoryChangedCriterion.Conditions.items(MysticalWood.MYSTICAL_LOG_ITEM), exporter);
                smithing(MysticalWood.MYSTICAL_UPGRADE_TEMPLATE, Items.WOODEN_SHOVEL, MysticalWood.MYSTICAL_LOG_ITEM, RecipeCategory.TOOLS, MysticalWood.MYSTICAL_WOODEN_SHOVEL, "has_mystic_log", InventoryChangedCriterion.Conditions.items(MysticalWood.MYSTICAL_LOG_ITEM), exporter);
                smithing(MysticalWood.MYSTICAL_UPGRADE_TEMPLATE, Items.WOODEN_HOE, MysticalWood.MYSTICAL_LOG_ITEM, RecipeCategory.TOOLS, MysticalWood.MYSTICAL_WOODEN_HOE, "has_mystic_log", InventoryChangedCriterion.Conditions.items(MysticalWood.MYSTICAL_LOG_ITEM), exporter);

                smithing(MysticalWood.MYSTICAL_UPGRADE_TEMPLATE, Items.STONE_SWORD, MysticalWood.MYSTICAL_LOG_ITEM, RecipeCategory.TOOLS, MysticalWood.MYSTICAL_STONE_SWORD, "has_mystic_log", InventoryChangedCriterion.Conditions.items(MysticalWood.MYSTICAL_LOG_ITEM), exporter);
                smithing(MysticalWood.MYSTICAL_UPGRADE_TEMPLATE, Items.STONE_PICKAXE, MysticalWood.MYSTICAL_LOG_ITEM, RecipeCategory.TOOLS, MysticalWood.MYSTICAL_STONE_PICKAXE, "has_mystic_log", InventoryChangedCriterion.Conditions.items(MysticalWood.MYSTICAL_LOG_ITEM), exporter);
                smithing(MysticalWood.MYSTICAL_UPGRADE_TEMPLATE, Items.STONE_AXE, MysticalWood.MYSTICAL_LOG_ITEM, RecipeCategory.TOOLS, MysticalWood.MYSTICAL_STONE_AXE, "has_mystic_log", InventoryChangedCriterion.Conditions.items(MysticalWood.MYSTICAL_LOG_ITEM), exporter);
                smithing(MysticalWood.MYSTICAL_UPGRADE_TEMPLATE, Items.STONE_SHOVEL, MysticalWood.MYSTICAL_LOG_ITEM, RecipeCategory.TOOLS, MysticalWood.MYSTICAL_STONE_SHOVEL, "has_mystic_log", InventoryChangedCriterion.Conditions.items(MysticalWood.MYSTICAL_LOG_ITEM), exporter);
                smithing(MysticalWood.MYSTICAL_UPGRADE_TEMPLATE, Items.STONE_HOE, MysticalWood.MYSTICAL_LOG_ITEM, RecipeCategory.TOOLS, MysticalWood.MYSTICAL_STONE_HOE, "has_mystic_log", InventoryChangedCriterion.Conditions.items(MysticalWood.MYSTICAL_LOG_ITEM), exporter);

                smithing(MysticalWood.MYSTICAL_UPGRADE_TEMPLATE, Items.IRON_SWORD, MysticalWood.MYSTICAL_LOG_ITEM, RecipeCategory.TOOLS, MysticalWood.MYSTICAL_IRON_SWORD, "has_mystic_log", InventoryChangedCriterion.Conditions.items(MysticalWood.MYSTICAL_LOG_ITEM), exporter);
                smithing(MysticalWood.MYSTICAL_UPGRADE_TEMPLATE, Items.IRON_PICKAXE, MysticalWood.MYSTICAL_LOG_ITEM, RecipeCategory.TOOLS, MysticalWood.MYSTICAL_IRON_PICKAXE, "has_mystic_log", InventoryChangedCriterion.Conditions.items(MysticalWood.MYSTICAL_LOG_ITEM), exporter);
                smithing(MysticalWood.MYSTICAL_UPGRADE_TEMPLATE, Items.IRON_AXE, MysticalWood.MYSTICAL_LOG_ITEM, RecipeCategory.TOOLS, MysticalWood.MYSTICAL_IRON_AXE, "has_mystic_log", InventoryChangedCriterion.Conditions.items(MysticalWood.MYSTICAL_LOG_ITEM), exporter);
                smithing(MysticalWood.MYSTICAL_UPGRADE_TEMPLATE, Items.IRON_SHOVEL, MysticalWood.MYSTICAL_LOG_ITEM, RecipeCategory.TOOLS, MysticalWood.MYSTICAL_IRON_SHOVEL, "has_mystic_log", InventoryChangedCriterion.Conditions.items(MysticalWood.MYSTICAL_LOG_ITEM), exporter);
                smithing(MysticalWood.MYSTICAL_UPGRADE_TEMPLATE, Items.IRON_HOE, MysticalWood.MYSTICAL_LOG_ITEM, RecipeCategory.TOOLS, MysticalWood.MYSTICAL_IRON_HOE, "has_mystic_log", InventoryChangedCriterion.Conditions.items(MysticalWood.MYSTICAL_LOG_ITEM), exporter);

                smithing(MysticalWood.MYSTICAL_UPGRADE_TEMPLATE, Items.GOLDEN_SWORD, MysticalWood.MYSTICAL_LOG_ITEM, RecipeCategory.TOOLS, MysticalWood.MYSTICAL_GOLDEN_SWORD, "has_mystic_log", InventoryChangedCriterion.Conditions.items(MysticalWood.MYSTICAL_LOG_ITEM), exporter);
                smithing(MysticalWood.MYSTICAL_UPGRADE_TEMPLATE, Items.GOLDEN_PICKAXE, MysticalWood.MYSTICAL_LOG_ITEM, RecipeCategory.TOOLS, MysticalWood.MYSTICAL_GOLDEN_PICKAXE, "has_mystic_log", InventoryChangedCriterion.Conditions.items(MysticalWood.MYSTICAL_LOG_ITEM), exporter);
                smithing(MysticalWood.MYSTICAL_UPGRADE_TEMPLATE, Items.GOLDEN_AXE, MysticalWood.MYSTICAL_LOG_ITEM, RecipeCategory.TOOLS, MysticalWood.MYSTICAL_GOLDEN_AXE, "has_mystic_log", InventoryChangedCriterion.Conditions.items(MysticalWood.MYSTICAL_LOG_ITEM), exporter);
                smithing(MysticalWood.MYSTICAL_UPGRADE_TEMPLATE, Items.GOLDEN_SHOVEL, MysticalWood.MYSTICAL_LOG_ITEM, RecipeCategory.TOOLS, MysticalWood.MYSTICAL_GOLDEN_SHOVEL, "has_mystic_log", InventoryChangedCriterion.Conditions.items(MysticalWood.MYSTICAL_LOG_ITEM), exporter);
                smithing(MysticalWood.MYSTICAL_UPGRADE_TEMPLATE, Items.GOLDEN_HOE, MysticalWood.MYSTICAL_LOG_ITEM, RecipeCategory.TOOLS, MysticalWood.MYSTICAL_GOLDEN_HOE, "has_mystic_log", InventoryChangedCriterion.Conditions.items(MysticalWood.MYSTICAL_LOG_ITEM), exporter);

                smithing(MysticalWood.MYSTICAL_UPGRADE_TEMPLATE, Items.DIAMOND_SWORD, MysticalWood.MYSTICAL_LOG_ITEM, RecipeCategory.TOOLS, MysticalWood.MYSTICAL_DIAMOND_SWORD, "has_mystic_log", InventoryChangedCriterion.Conditions.items(MysticalWood.MYSTICAL_LOG_ITEM), exporter);
                smithing(MysticalWood.MYSTICAL_UPGRADE_TEMPLATE, Items.DIAMOND_PICKAXE, MysticalWood.MYSTICAL_LOG_ITEM, RecipeCategory.TOOLS, MysticalWood.MYSTICAL_DIAMOND_PICKAXE, "has_mystic_log", InventoryChangedCriterion.Conditions.items(MysticalWood.MYSTICAL_LOG_ITEM), exporter);
                smithing(MysticalWood.MYSTICAL_UPGRADE_TEMPLATE, Items.DIAMOND_AXE, MysticalWood.MYSTICAL_LOG_ITEM, RecipeCategory.TOOLS, MysticalWood.MYSTICAL_DIAMOND_AXE, "has_mystic_log", InventoryChangedCriterion.Conditions.items(MysticalWood.MYSTICAL_LOG_ITEM), exporter);
                smithing(MysticalWood.MYSTICAL_UPGRADE_TEMPLATE, Items.DIAMOND_SHOVEL, MysticalWood.MYSTICAL_LOG_ITEM, RecipeCategory.TOOLS, MysticalWood.MYSTICAL_DIAMOND_SHOVEL, "has_mystic_log", InventoryChangedCriterion.Conditions.items(MysticalWood.MYSTICAL_LOG_ITEM), exporter);
                smithing(MysticalWood.MYSTICAL_UPGRADE_TEMPLATE, Items.DIAMOND_HOE, MysticalWood.MYSTICAL_LOG_ITEM, RecipeCategory.TOOLS, MysticalWood.MYSTICAL_DIAMOND_HOE, "has_mystic_log", InventoryChangedCriterion.Conditions.items(MysticalWood.MYSTICAL_LOG_ITEM), exporter);

                smithing(MysticalWood.MYSTICAL_UPGRADE_TEMPLATE, Items.NETHERITE_SWORD, MysticalWood.MYSTICAL_LOG_ITEM, RecipeCategory.TOOLS, MysticalWood.MYSTICAL_NETHERITE_SWORD, "has_mystic_log", InventoryChangedCriterion.Conditions.items(MysticalWood.MYSTICAL_LOG_ITEM), exporter);
                smithing(MysticalWood.MYSTICAL_UPGRADE_TEMPLATE, Items.NETHERITE_PICKAXE, MysticalWood.MYSTICAL_LOG_ITEM, RecipeCategory.TOOLS, MysticalWood.MYSTICAL_NETHERITE_PICKAXE, "has_mystic_log", InventoryChangedCriterion.Conditions.items(MysticalWood.MYSTICAL_LOG_ITEM), exporter);
                smithing(MysticalWood.MYSTICAL_UPGRADE_TEMPLATE, Items.NETHERITE_AXE, MysticalWood.MYSTICAL_LOG_ITEM, RecipeCategory.TOOLS, MysticalWood.MYSTICAL_NETHERITE_AXE, "has_mystic_log", InventoryChangedCriterion.Conditions.items(MysticalWood.MYSTICAL_LOG_ITEM), exporter);
                smithing(MysticalWood.MYSTICAL_UPGRADE_TEMPLATE, Items.NETHERITE_SHOVEL, MysticalWood.MYSTICAL_LOG_ITEM, RecipeCategory.TOOLS, MysticalWood.MYSTICAL_NETHERITE_SHOVEL, "has_mystic_log", InventoryChangedCriterion.Conditions.items(MysticalWood.MYSTICAL_LOG_ITEM), exporter);
                smithing(MysticalWood.MYSTICAL_UPGRADE_TEMPLATE, Items.NETHERITE_HOE, MysticalWood.MYSTICAL_LOG_ITEM, RecipeCategory.TOOLS, MysticalWood.MYSTICAL_NETHERITE_HOE, "has_mystic_log", InventoryChangedCriterion.Conditions.items(MysticalWood.MYSTICAL_LOG_ITEM), exporter);

                smithingagain(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, MysticalWood.MYSTICAL_DIAMOND_SWORD, Items.NETHERITE_INGOT, RecipeCategory.TOOLS, MysticalWood.MYSTICAL_NETHERITE_SWORD, "has_netherite", InventoryChangedCriterion.Conditions.items(Items.NETHERITE_INGOT), exporter);
                smithingagain(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, MysticalWood.MYSTICAL_DIAMOND_PICKAXE, Items.NETHERITE_INGOT, RecipeCategory.TOOLS, MysticalWood.MYSTICAL_NETHERITE_PICKAXE, "has_netherite", InventoryChangedCriterion.Conditions.items(Items.NETHERITE_INGOT), exporter);
                smithingagain(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, MysticalWood.MYSTICAL_DIAMOND_AXE, Items.NETHERITE_INGOT, RecipeCategory.TOOLS, MysticalWood.MYSTICAL_NETHERITE_AXE, "has_netherite", InventoryChangedCriterion.Conditions.items(Items.NETHERITE_INGOT), exporter);
                smithingagain(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, MysticalWood.MYSTICAL_DIAMOND_SHOVEL, Items.NETHERITE_INGOT, RecipeCategory.TOOLS, MysticalWood.MYSTICAL_NETHERITE_SHOVEL, "has_netherite", InventoryChangedCriterion.Conditions.items(Items.NETHERITE_INGOT), exporter);
                smithingagain(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, MysticalWood.MYSTICAL_DIAMOND_HOE, Items.NETHERITE_INGOT, RecipeCategory.TOOLS, MysticalWood.MYSTICAL_NETHERITE_HOE, "has_netherite", InventoryChangedCriterion.Conditions.items(Items.NETHERITE_INGOT), exporter);
            }
        };
    }
    public void smithing(Item template, Item input, Item addition, RecipeCategory category, Item result, String criterionName, AdvancementCriterion<InventoryChangedCriterion.Conditions> criterion, RecipeExporter recipeExporter) {
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItem(template), Ingredient.ofItem(input), Ingredient.ofItem(addition), category, result).criterion(criterionName, criterion).offerTo(recipeExporter, RecipeGenerator.getItemPath(result) + "_smithing");
    }
    public void smithingagain(Item template, Item input, Item addition, RecipeCategory category, Item result, String criterionName, AdvancementCriterion<InventoryChangedCriterion.Conditions> criterion, RecipeExporter recipeExporter) {
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItem(template), Ingredient.ofItem(input), Ingredient.ofItem(addition), category, result).criterion(criterionName, criterion).offerTo(recipeExporter, RecipeGenerator.getItemPath(result) + "_smithing-with-netherite");
    }
    @Override
    public String getName() {
        return "MysticalWoodRecipeDataGen";
    }
}
