package net.boypika.mysticalwood.datagen;

import net.boypika.mysticalwood.MysticalWood;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class EnglishLangDataGen extends FabricLanguageProvider {
    protected EnglishLangDataGen(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }
    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("itemGroup.mysticalwood", "Mystical Wood");
        translationBuilder.add(MysticalWood.MYSTICAL_LOG, "Mystical Log");
        translationBuilder.add(MysticalWood.MYSTICAL_LOG_ITEM, "Mystical Log");
        translationBuilder.add(MysticalWood.STRIPPED_MYSTICAL_LOG, "Stripped Mystical Log");
        translationBuilder.add(MysticalWood.STRIPPED_MYSTICAL_LOG_ITEM, "Stripped Mystical Log");
        translationBuilder.add("advancements.mysticalwood.get_mystical_wood.title", "Mystical Wood");
        translationBuilder.add("advancements.mysticalwood.get_mystical_wood.description", "Get Mystical Wood");
        translationBuilder.add(MysticalWood.MYSTICAL_WOODEN_SWORD, "Mystical Wooden Sword");
        translationBuilder.add(MysticalWood.MYSTICAL_STONE_SWORD, "Mystical Stone Sword");
        translationBuilder.add(MysticalWood.MYSTICAL_IRON_SWORD, "Mystical Iron Sword");
        translationBuilder.add(MysticalWood.MYSTICAL_GOLDEN_SWORD, "Mystical Gold Sword");
        translationBuilder.add(MysticalWood.MYSTICAL_DIAMOND_SWORD, "Mystical Diamond Sword");
        translationBuilder.add(MysticalWood.MYSTICAL_NETHERITE_SWORD, "Mystical Netherite Sword");

        translationBuilder.add(MysticalWood.MYSTICAL_WOODEN_PICKAXE, "Mystical Wooden Pickaxe");
        translationBuilder.add(MysticalWood.MYSTICAL_STONE_PICKAXE, "Mystical Stone Pickaxe");
        translationBuilder.add(MysticalWood.MYSTICAL_IRON_PICKAXE, "Mystical Iron Pickaxe");
        translationBuilder.add(MysticalWood.MYSTICAL_GOLDEN_PICKAXE, "Mystical Gold Pickaxe");
        translationBuilder.add(MysticalWood.MYSTICAL_DIAMOND_PICKAXE, "Mystical Diamond Pickaxe");
        translationBuilder.add(MysticalWood.MYSTICAL_NETHERITE_PICKAXE, "Mystical Netherite Pickaxe");

        translationBuilder.add(MysticalWood.MYSTICAL_WOODEN_AXE, "Mystical Wooden Axe");
        translationBuilder.add(MysticalWood.MYSTICAL_STONE_AXE, "Mystical Stone Axe");
        translationBuilder.add(MysticalWood.MYSTICAL_IRON_AXE, "Mystical Iron Axe");
        translationBuilder.add(MysticalWood.MYSTICAL_GOLDEN_AXE, "Mystical Gold Axe");
        translationBuilder.add(MysticalWood.MYSTICAL_DIAMOND_AXE, "Mystical Diamond Axe");
        translationBuilder.add(MysticalWood.MYSTICAL_NETHERITE_AXE, "Mystical Netherite Axe");

        translationBuilder.add(MysticalWood.MYSTICAL_WOODEN_SHOVEL, "Mystical Wooden Shovel");
        translationBuilder.add(MysticalWood.MYSTICAL_STONE_SHOVEL, "Mystical Stone Shovel");
        translationBuilder.add(MysticalWood.MYSTICAL_IRON_SHOVEL, "Mystical Iron Shovel");
        translationBuilder.add(MysticalWood.MYSTICAL_GOLDEN_SHOVEL, "Mystical Gold Shovel");
        translationBuilder.add(MysticalWood.MYSTICAL_DIAMOND_SHOVEL, "Mystical Diamond Shovel");
        translationBuilder.add(MysticalWood.MYSTICAL_NETHERITE_SHOVEL, "Mystical Netherite Shovel");

        translationBuilder.add(MysticalWood.MYSTICAL_WOODEN_HOE, "Mystical Wooden Hoe");
        translationBuilder.add(MysticalWood.MYSTICAL_STONE_HOE, "Mystical Stone Hoe");
        translationBuilder.add(MysticalWood.MYSTICAL_IRON_HOE, "Mystical Iron Hoe");
        translationBuilder.add(MysticalWood.MYSTICAL_GOLDEN_HOE, "Mystical Gold Hoe");
        translationBuilder.add(MysticalWood.MYSTICAL_DIAMOND_HOE, "Mystical Diamond Hoe");
        translationBuilder.add(MysticalWood.MYSTICAL_NETHERITE_HOE, "Mystical Netherite Hoe");

        translationBuilder.add(MysticalWood.MYSTICAL_PLANKS_ITEM, "Mystical Planks");
        translationBuilder.add(MysticalWood.MYSTICAL_STAIRS_ITEM, "Mystical Stairs");
        translationBuilder.add(MysticalWood.MYSTICAL_SLAB_ITEM, "Mystical Slabs");

        translationBuilder.add(MysticalWood.MYSTICAL_WOOD, "Mystical Wood");
        translationBuilder.add(MysticalWood.MYSTICAL_WOOD_ITEM, "Mystical Wood");
        translationBuilder.add(MysticalWood.STRIPPED_MYSTICAL_WOOD, "Stripped Mystical Wood");
        translationBuilder.add(MysticalWood.STRIPPED_MYSTICAL_WOOD_ITEM, "Stripped Mystical Wood");
    }
}
