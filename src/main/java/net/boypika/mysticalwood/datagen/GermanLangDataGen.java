package net.boypika.mysticalwood.datagen;

import net.boypika.mysticalwood.MysticalWood;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class GermanLangDataGen extends FabricLanguageProvider {
    protected GermanLangDataGen(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "de_de", registryLookup);
    }
    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("itemGroup.mysticalwood", "Mystischeholz");
        translationBuilder.add(MysticalWood.MYSTICAL_LOG, "Mystischestamm");
        translationBuilder.add(MysticalWood.MYSTICAL_LOG_ITEM, "Mystischestamm");
        translationBuilder.add(MysticalWood.STRIPPED_MYSTICAL_LOG, "Entrindeter Mystischestamm");
        translationBuilder.add(MysticalWood.STRIPPED_MYSTICAL_LOG_ITEM, "Entrindeter Mystischestamm");
        translationBuilder.add("advancements.mysticalwood.get_mystical_wood.title", "Mystischeholz");
        translationBuilder.add("advancements.mysticalwood.get_mystical_wood.description", "Krieg Mystischeholz");
        translationBuilder.add(MysticalWood.MYSTICAL_WOODEN_SWORD, "Mystisches Holzschwert");
        translationBuilder.add(MysticalWood.MYSTICAL_STONE_SWORD, "Mystisches Steinschwert");
        translationBuilder.add(MysticalWood.MYSTICAL_IRON_SWORD, "Mystisches Eisenschwert");
        translationBuilder.add(MysticalWood.MYSTICAL_GOLDEN_SWORD, "Mystisches Goldschwert");
        translationBuilder.add(MysticalWood.MYSTICAL_DIAMOND_SWORD, "Mystisches Diamondschwert");
        translationBuilder.add(MysticalWood.MYSTICAL_NETHERITE_SWORD, "Mystisches Netheritschwert");

        translationBuilder.add(MysticalWood.MYSTICAL_WOODEN_PICKAXE, "Mystische Holzspitzhacke");
        translationBuilder.add(MysticalWood.MYSTICAL_STONE_PICKAXE, "Mystische Steinspitzhacke");
        translationBuilder.add(MysticalWood.MYSTICAL_IRON_PICKAXE, "Mystische Eisenspitzhacke");
        translationBuilder.add(MysticalWood.MYSTICAL_GOLDEN_PICKAXE, "Mystische Goldspitzhacke");
        translationBuilder.add(MysticalWood.MYSTICAL_DIAMOND_PICKAXE, "Mystische Diamantspitzhacke");
        translationBuilder.add(MysticalWood.MYSTICAL_NETHERITE_PICKAXE, "Mystische Netheritspitzhacke");

        translationBuilder.add(MysticalWood.MYSTICAL_WOODEN_AXE, "Mystische Holzaxt");
        translationBuilder.add(MysticalWood.MYSTICAL_STONE_AXE, "Mystische Steinaxt");
        translationBuilder.add(MysticalWood.MYSTICAL_IRON_AXE, "Mystische Eisenaxt");
        translationBuilder.add(MysticalWood.MYSTICAL_GOLDEN_AXE, "Mystische Goldaxt");
        translationBuilder.add(MysticalWood.MYSTICAL_DIAMOND_AXE, "Mystische Diamantaxt");
        translationBuilder.add(MysticalWood.MYSTICAL_NETHERITE_AXE, "Mystische Netheritaxt");

        translationBuilder.add(MysticalWood.MYSTICAL_WOODEN_SHOVEL, "Mystische Holzschaufel");
        translationBuilder.add(MysticalWood.MYSTICAL_STONE_SHOVEL, "Mystische Steinschaufel");
        translationBuilder.add(MysticalWood.MYSTICAL_IRON_SHOVEL, "Mystische Eisenschaufel");
        translationBuilder.add(MysticalWood.MYSTICAL_GOLDEN_SHOVEL, "Mystische Goldschaufel");
        translationBuilder.add(MysticalWood.MYSTICAL_DIAMOND_SHOVEL, "Mystische Diamantschaufel");
        translationBuilder.add(MysticalWood.MYSTICAL_NETHERITE_SHOVEL, "Mystische Netheritschaufel");

        translationBuilder.add(MysticalWood.MYSTICAL_WOODEN_HOE, "Mystische Holzhacke");
        translationBuilder.add(MysticalWood.MYSTICAL_STONE_HOE, "Mystische Steinhacke");
        translationBuilder.add(MysticalWood.MYSTICAL_IRON_HOE, "Mystische Eisenhacke");
        translationBuilder.add(MysticalWood.MYSTICAL_GOLDEN_HOE, "Mystische Goldhacke");
        translationBuilder.add(MysticalWood.MYSTICAL_DIAMOND_HOE, "Mystische Diamanthacke");
        translationBuilder.add(MysticalWood.MYSTICAL_NETHERITE_HOE, "Mystische Netherithacke");

        translationBuilder.add(MysticalWood.MYSTICAL_PLANKS_ITEM, "Mystischeholzbretter");
        translationBuilder.add(MysticalWood.MYSTICAL_STAIRS_ITEM, "Mystischeholztreppe");
        translationBuilder.add(MysticalWood.MYSTICAL_SLAB_ITEM, "Mystischeholzstufe");

        translationBuilder.add(MysticalWood.MYSTICAL_WOOD, "Mystischeholz");
        translationBuilder.add(MysticalWood.MYSTICAL_WOOD_ITEM, "Mystischeholz");
        translationBuilder.add(MysticalWood.STRIPPED_MYSTICAL_WOOD, "Entrindetes Mystischeholz");
        translationBuilder.add(MysticalWood.STRIPPED_MYSTICAL_WOOD_ITEM, "Entrindetes Mystischeholz");
    }
}
