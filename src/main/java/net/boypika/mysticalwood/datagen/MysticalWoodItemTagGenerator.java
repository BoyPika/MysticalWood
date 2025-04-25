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
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(MysticalWood.MYSTICAL_WOODEN_AXE)
                .add(MysticalWood.MYSTICAL_STONE_AXE)
                .add(MysticalWood.MYSTICAL_IRON_AXE)
                .add(MysticalWood.MYSTICAL_GOLDEN_AXE)
                .add(MysticalWood.MYSTICAL_DIAMOND_AXE)
                .add(MysticalWood.MYSTICAL_NETHERITE_AXE);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(MysticalWood.MYSTICAL_WOODEN_HOE)
                .add(MysticalWood.MYSTICAL_STONE_HOE)
                .add(MysticalWood.MYSTICAL_IRON_HOE)
                .add(MysticalWood.MYSTICAL_GOLDEN_HOE)
                .add(MysticalWood.MYSTICAL_DIAMOND_HOE)
                .add(MysticalWood.MYSTICAL_NETHERITE_HOE);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(MysticalWood.MYSTICAL_WOODEN_PICKAXE)
                .add(MysticalWood.MYSTICAL_STONE_PICKAXE)
                .add(MysticalWood.MYSTICAL_IRON_PICKAXE)
                .add(MysticalWood.MYSTICAL_GOLDEN_PICKAXE)
                .add(MysticalWood.MYSTICAL_DIAMOND_PICKAXE)
                .add(MysticalWood.MYSTICAL_NETHERITE_PICKAXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(MysticalWood.MYSTICAL_WOODEN_SHOVEL)
                .add(MysticalWood.MYSTICAL_STONE_SHOVEL)
                .add(MysticalWood.MYSTICAL_IRON_SHOVEL)
                .add(MysticalWood.MYSTICAL_GOLDEN_SHOVEL)
                .add(MysticalWood.MYSTICAL_DIAMOND_SHOVEL)
                .add(MysticalWood.MYSTICAL_NETHERITE_SHOVEL);
        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(MysticalWood.MYSTICAL_WOODEN_SWORD)
                .add(MysticalWood.MYSTICAL_STONE_SWORD)
                .add(MysticalWood.MYSTICAL_IRON_SWORD)
                .add(MysticalWood.MYSTICAL_GOLDEN_SWORD)
                .add(MysticalWood.MYSTICAL_DIAMOND_SWORD)
                .add(MysticalWood.MYSTICAL_NETHERITE_SWORD);
    }
}
