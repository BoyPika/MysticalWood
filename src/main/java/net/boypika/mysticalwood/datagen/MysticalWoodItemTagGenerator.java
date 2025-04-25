package net.boypika.mysticalwood.datagen;

import net.boypika.mysticalwood.MysticalWood;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class MysticalWoodItemTagGenerator extends FabricTagProvider<Item> {

    public MysticalWoodItemTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, RegistryKeys.ITEM, registriesFuture);
    }

    public static final TagKey<Item> LOG_ITEMS = TagKey.of(RegistryKeys.ITEM, Identifier.of(MysticalWood.MOD_ID, "mystical_wood"));

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(LOG_ITEMS)
                .add(MysticalWood.MYSTICAL_WOOD_ITEM)
                .add(MysticalWood.MYSTICAL_LOG_ITEM)
                .add(MysticalWood.STRIPPED_MYSTICAL_LOG_ITEM)
                .add(MysticalWood.STRIPPED_MYSTICAL_WOOD_ITEM)
                .setReplace(true);
    }
}
