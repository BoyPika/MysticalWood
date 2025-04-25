package net.boypika.mysticalwood.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class MysticalWoodDataGen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(EnglishLangDataGen::new);
        pack.addProvider(GermanLangDataGen::new);
        pack.addProvider(MysticalWoodAdvancementsGen::new);
        pack.addProvider(LootTableDataGen::new);
        pack.addProvider(MysticalWoodItemTagGenerator::new);
        pack.addProvider(MysticalWoodBlockTagGenerator::new);
        pack.addProvider(MysticalWoodRecipeDataGen::new);
    }
}
