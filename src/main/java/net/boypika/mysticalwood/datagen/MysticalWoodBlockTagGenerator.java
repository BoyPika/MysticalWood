package net.boypika.mysticalwood.datagen;

import net.boypika.mysticalwood.MysticalWood;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class MysticalWoodBlockTagGenerator extends FabricTagProvider<Block> {

    public MysticalWoodBlockTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, RegistryKeys.BLOCK, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.LOGS)
                .add(MysticalWood.MYSTICAL_WOOD)
                .add(MysticalWood.MYSTICAL_LOG)
                .add(MysticalWood.STRIPPED_MYSTICAL_LOG)
                .add(MysticalWood.STRIPPED_MYSTICAL_WOOD);
        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(MysticalWood.MYSTICAL_WOOD)
                .add(MysticalWood.MYSTICAL_LOG)
                .add(MysticalWood.STRIPPED_MYSTICAL_LOG)
                .add(MysticalWood.STRIPPED_MYSTICAL_WOOD);
        getOrCreateTagBuilder(BlockTags.OVERWORLD_NATURAL_LOGS).add(MysticalWood.MYSTICAL_LOG);
        getOrCreateTagBuilder(BlockTags.PLANKS).add(MysticalWood.MYSTICAL_PLANKS);
        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS).add(MysticalWood.MYSTICAL_STAIRS);
        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS).add(MysticalWood.MYSTICAL_SLAB);
    }
}
