package net.boypika.mysticalwood.datagen;

import net.boypika.mysticalwood.MysticalWood;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementEntry;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class MysticalWoodAdvancementsGen extends FabricAdvancementProvider {
    protected MysticalWoodAdvancementsGen(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(output, registryLookup);
    }

    @Override
    public void generateAdvancement(RegistryWrapper.WrapperLookup wrapperLookup, Consumer<AdvancementEntry> consumer) {
        AdvancementEntry getMysticalWood = Advancement.Builder.create()
                .display(
                        MysticalWood.MYSTICAL_LOG,
                        Text.translatable("advancements.mysticalwood.get_mystical_wood.title"),
                        Text.translatable("advancements.mysticalwood.get_mystical_wood.description"),
                        Identifier.of(MysticalWood.MOD_ID, "block/mystical_wood"),
                        AdvancementFrame.TASK,
                        true,
                        true,
                        true
                )
                .criterion("get_mystical_wood", InventoryChangedCriterion.Conditions.items(MysticalWood.MYSTICAL_LOG_ITEM))
                .build(consumer, MysticalWood.MOD_ID +":get_mystical_wood");
    }
}
