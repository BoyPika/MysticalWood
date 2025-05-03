package net.boypika.mysticalwood;

import net.boypika.mysticalwood.block.MysticalLogBlock;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.*;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class MysticalWood implements ModInitializer {

    public static final String MOD_ID = "mysticalwood";
    public static final Logger LOGGER = LoggerFactory.getLogger("MysticalWood");


    public static final SimpleParticleType MYSTICAL_PARTICLE = FabricParticleTypes.simple();

    public static final RegistryKey<Block> MYSTICAL_LOG_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mystical_log"));
    public static final Block MYSTICAL_LOG = new MysticalLogBlock(AbstractBlock.Settings.create().burnable().luminance((state) -> 7).strength(2.0F).sounds(BlockSoundGroup.WOOD).instrument(NoteBlockInstrument.BASS).registryKey(MYSTICAL_LOG_KEY));
    public static final RegistryKey<Block> STRIPPED_MYSTICAL_LOG_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "stripped_mystical_log"));
    public static final Block STRIPPED_MYSTICAL_LOG = new MysticalLogBlock(AbstractBlock.Settings.create().burnable().luminance((state) -> 7).strength(2.0F).sounds(BlockSoundGroup.WOOD).instrument(NoteBlockInstrument.BASS).registryKey(STRIPPED_MYSTICAL_LOG_KEY));
    public static final RegistryKey<Item> MYSTICAL_LOG_ITEM_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "mystical_log"));
    public static final Item MYSTICAL_LOG_ITEM = new BlockItem(MYSTICAL_LOG, new Item.Settings().registryKey(MYSTICAL_LOG_ITEM_KEY));
    public static final RegistryKey<Item> STRIPPED_MYSTICAL_LOG_ITEM_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "stripped_mystical_log"));
    public static final Item STRIPPED_MYSTICAL_LOG_ITEM = new BlockItem(STRIPPED_MYSTICAL_LOG, new Item.Settings().registryKey(STRIPPED_MYSTICAL_LOG_ITEM_KEY));
    public static final RegistryKey<Block> MYSTICAL_WOOD_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mystical_wood"));
    public static final Block MYSTICAL_WOOD = new MysticalLogBlock(AbstractBlock.Settings.create().burnable().luminance((state) -> 7).strength(2.0F).sounds(BlockSoundGroup.WOOD).instrument(NoteBlockInstrument.BASS).registryKey(MYSTICAL_WOOD_KEY));
    public static final RegistryKey<Block> STRIPPED_MYSTICAL_WOOD_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "stripped_mystical_wood"));
    public static final Block STRIPPED_MYSTICAL_WOOD = new MysticalLogBlock(AbstractBlock.Settings.create().burnable().luminance((state) -> 7).strength(2.0F).sounds(BlockSoundGroup.WOOD).instrument(NoteBlockInstrument.BASS).registryKey(STRIPPED_MYSTICAL_WOOD_KEY));
    public static final RegistryKey<Item> MYSTICAL_WOOD_ITEM_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "mystical_wood"));
    public static final Item MYSTICAL_WOOD_ITEM = new BlockItem(MYSTICAL_WOOD, new Item.Settings().registryKey(MYSTICAL_WOOD_ITEM_KEY));
    public static final RegistryKey<Item> STRIPPED_MYSTICAL_WOOD_ITEM_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "stripped_mystical_wood"));
    public static final Item STRIPPED_MYSTICAL_WOOD_ITEM = new BlockItem(STRIPPED_MYSTICAL_WOOD, new Item.Settings().registryKey(STRIPPED_MYSTICAL_WOOD_ITEM_KEY));

    public static final RegistryKey<Block> MYSTICAL_PLANKS_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mystical_planks"));
    public static final Block MYSTICAL_PLANKS = new Block(AbstractBlock.Settings.create().burnable().luminance((state) -> 7).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).registryKey(MYSTICAL_PLANKS_KEY));
    public static final RegistryKey<Item> MYSTICAL_PLANKS_ITEM_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "mystical_planks"));
    public static final Item MYSTICAL_PLANKS_ITEM = new BlockItem(MYSTICAL_PLANKS, new Item.Settings().registryKey(MYSTICAL_PLANKS_ITEM_KEY));

    public static final RegistryKey<Block> MYSTICAL_STAIRS_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mystical_stairs"));
    public static final Block MYSTICAL_STAIRS = new StairsBlock(MYSTICAL_PLANKS.getDefaultState(), AbstractBlock.Settings.create().luminance((state) -> 7).sounds(BlockSoundGroup.WOOD).registryKey(MYSTICAL_STAIRS_KEY));
    public static final RegistryKey<Item> MYSTICAL_STAIRS_ITEM_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "mystical_stairs"));
    public static final Item MYSTICAL_STAIRS_ITEM = new BlockItem(MYSTICAL_STAIRS, new Item.Settings().registryKey(MYSTICAL_STAIRS_ITEM_KEY));

    public static final RegistryKey<Block> MYSTICAL_SLAB_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mystical_slab"));
    public static final Block MYSTICAL_SLAB = new SlabBlock(AbstractBlock.Settings.create().luminance((state) -> 7).sounds(BlockSoundGroup.WOOD).burnable().registryKey(MYSTICAL_SLAB_KEY));
    public static final RegistryKey<Item> MYSTICAL_SLAB_ITEM_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "mystical_slab"));
    public static final Item MYSTICAL_SLAB_ITEM = new BlockItem(MYSTICAL_SLAB, new Item.Settings().registryKey(MYSTICAL_SLAB_ITEM_KEY));

    public static final RegistryKey<Item> MYSTICAL_UPGRADE_TEMPLATE_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "mystical_upgrade_template"));
    public static final Item MYSTICAL_UPGRADE_TEMPLATE = new SmithingTemplateItem(
            Text.translatable("item.mysticalwood.mystical_upgrade_template.appliesTo").formatted(Formatting.BLUE),
            Text.translatable("item.mysticalwood.mystical_upgrade_template.ingredients").formatted(Formatting.BLUE),
            Text.translatable("item.mysticalwood.mystical_upgrade_template.baseSlot"),
            Text.translatable("item.mysticalwood.mystical_upgrade_template.additionsSlot"),
            List.of(Identifier.ofVanilla("container/slot/hoe"), Identifier.ofVanilla("container/slot/axe"), Identifier.ofVanilla("container/slot/sword"), Identifier.ofVanilla("container/slot/shovel"), Identifier.ofVanilla("container/slot/pickaxe")),
            List.of(Identifier.of(MOD_ID, "container/slot/block")),
            new Item.Settings().rarity(Rarity.UNCOMMON).registryKey(MYSTICAL_UPGRADE_TEMPLATE_KEY));

    public static final RegistryKey<Item> MYSTICAL_WOODEN_SWORD_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "mystical_wooden_sword"));
    public static final Item MYSTICAL_WOODEN_SWORD = new Item(new Item.Settings().registryKey(MYSTICAL_WOODEN_SWORD_KEY).sword(ToolMaterial.WOOD, 3.0F, -2.4F).enchantable(100));
    public static final RegistryKey<Item> MYSTICAL_STONE_SWORD_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "mystical_stone_sword"));
    public static final Item MYSTICAL_STONE_SWORD = new Item(new Item.Settings().registryKey(MYSTICAL_STONE_SWORD_KEY).sword(ToolMaterial.STONE, 3.0F, -2.4F).enchantable(100));
    public static final RegistryKey<Item> MYSTICAL_IRON_SWORD_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "mystical_iron_sword"));
    public static final Item MYSTICAL_IRON_SWORD = new Item(new Item.Settings().registryKey(MYSTICAL_IRON_SWORD_KEY).sword(ToolMaterial.IRON, 3.0F, -2.4F).enchantable(100));
    public static final RegistryKey<Item> MYSTICAL_GOLDEN_SWORD_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "mystical_golden_sword"));
    public static final Item MYSTICAL_GOLDEN_SWORD = new Item(new Item.Settings().registryKey(MYSTICAL_GOLDEN_SWORD_KEY).sword(ToolMaterial.GOLD, 3.0F, -2.4F).enchantable(100));
    public static final RegistryKey<Item> MYSTICAL_DIAMOND_SWORD_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "mystical_diamond_sword"));
    public static final Item MYSTICAL_DIAMOND_SWORD = new Item(new Item.Settings().registryKey(MYSTICAL_DIAMOND_SWORD_KEY).sword(ToolMaterial.DIAMOND, 3.0F, -2.4F).enchantable(100));
    public static final RegistryKey<Item> MYSTICAL_NETHERITE_SWORD_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "mystical_netherite_sword"));
    public static final Item MYSTICAL_NETHERITE_SWORD = new Item(new Item.Settings().registryKey(MYSTICAL_NETHERITE_SWORD_KEY).sword(ToolMaterial.NETHERITE, 3.0F, -2.4F).fireproof().enchantable(100));

    public static final RegistryKey<Item> MYSTICAL_WOODEN_PICKAXE_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "mystical_wooden_pickaxe"));
    public static final Item MYSTICAL_WOODEN_PICKAXE = new Item(new Item.Settings().registryKey(MYSTICAL_WOODEN_PICKAXE_KEY).pickaxe(ToolMaterial.WOOD, 1.0F, -2.8F).enchantable(100));
    public static final RegistryKey<Item> MYSTICAL_STONE_PICKAXE_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "mystical_stone_pickaxe"));
    public static final Item MYSTICAL_STONE_PICKAXE = new Item(new Item.Settings().registryKey(MYSTICAL_STONE_PICKAXE_KEY).pickaxe(ToolMaterial.STONE, 1.0F, -2.8F).enchantable(100));
    public static final RegistryKey<Item> MYSTICAL_IRON_PICKAXE_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "mystical_iron_pickaxe"));
    public static final Item MYSTICAL_IRON_PICKAXE = new Item(new Item.Settings().registryKey(MYSTICAL_IRON_PICKAXE_KEY).pickaxe(ToolMaterial.IRON, 1.0F, -2.8F).enchantable(100));
    public static final RegistryKey<Item> MYSTICAL_GOLDEN_PICKAXE_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "mystical_golden_pickaxe"));
    public static final Item MYSTICAL_GOLDEN_PICKAXE = new Item(new Item.Settings().registryKey(MYSTICAL_GOLDEN_PICKAXE_KEY).pickaxe(ToolMaterial.GOLD, 1.0F, -2.8F).enchantable(100));
    public static final RegistryKey<Item> MYSTICAL_DIAMOND_PICKAXE_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "mystical_diamond_pickaxe"));
    public static final Item MYSTICAL_DIAMOND_PICKAXE = new Item(new Item.Settings().registryKey(MYSTICAL_DIAMOND_PICKAXE_KEY).pickaxe(ToolMaterial.DIAMOND, 1.0F, -2.8F).enchantable(100));
    public static final RegistryKey<Item> MYSTICAL_NETHERITE_PICKAXE_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "mystical_netherite_pickaxe"));
    public static final Item MYSTICAL_NETHERITE_PICKAXE = new Item(new Item.Settings().registryKey(MYSTICAL_NETHERITE_PICKAXE_KEY).pickaxe(ToolMaterial.NETHERITE, 1.0F, -2.8F).fireproof().enchantable(100));

    public static final RegistryKey<Item> MYSTICAL_WOODEN_AXE_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "mystical_wooden_axe"));
    public static final Item MYSTICAL_WOODEN_AXE = new AxeItem(ToolMaterial.WOOD, 6.0F, -3.2F, new Item.Settings().registryKey(MYSTICAL_WOODEN_AXE_KEY).enchantable(100));
    public static final RegistryKey<Item> MYSTICAL_STONE_AXE_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "mystical_stone_axe"));
    public static final Item MYSTICAL_STONE_AXE = new AxeItem(ToolMaterial.STONE, 7.0F, -3.2F, new Item.Settings().registryKey(MYSTICAL_STONE_AXE_KEY).enchantable(100));
    public static final RegistryKey<Item> MYSTICAL_IRON_AXE_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "mystical_iron_axe"));
    public static final Item MYSTICAL_IRON_AXE = new AxeItem(ToolMaterial.IRON, 6.0F, -3.1F, new Item.Settings().registryKey(MYSTICAL_IRON_AXE_KEY).enchantable(100));
    public static final RegistryKey<Item> MYSTICAL_GOLDEN_AXE_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "mystical_golden_axe"));
    public static final Item MYSTICAL_GOLDEN_AXE = new AxeItem(ToolMaterial.GOLD, 6.0F, -3.0F, new Item.Settings().registryKey(MYSTICAL_GOLDEN_AXE_KEY).enchantable(100));
    public static final RegistryKey<Item> MYSTICAL_DIAMOND_AXE_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "mystical_diamond_axe"));
    public static final Item MYSTICAL_DIAMOND_AXE = new AxeItem(ToolMaterial.DIAMOND, 5.0F, -3.0F, new Item.Settings().registryKey(MYSTICAL_DIAMOND_AXE_KEY).enchantable(100));
    public static final RegistryKey<Item> MYSTICAL_NETHERITE_AXE_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "mystical_netherite_axe"));
    public static final Item MYSTICAL_NETHERITE_AXE = new AxeItem(ToolMaterial.NETHERITE, 5.0F, -3.0F, new Item.Settings().registryKey(MYSTICAL_NETHERITE_AXE_KEY).fireproof().enchantable(100));

    public static final RegistryKey<Item> MYSTICAL_WOODEN_SHOVEL_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "mystical_wooden_shovel"));
    public static final Item MYSTICAL_WOODEN_SHOVEL = new ShovelItem(ToolMaterial.WOOD, 1.5F, -3.0F, new Item.Settings().registryKey(MYSTICAL_WOODEN_SHOVEL_KEY).enchantable(100));
    public static final RegistryKey<Item> MYSTICAL_STONE_SHOVEL_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "mystical_stone_shovel"));
    public static final Item MYSTICAL_STONE_SHOVEL = new ShovelItem(ToolMaterial.STONE, 1.5F, -3.0F, new Item.Settings().registryKey(MYSTICAL_STONE_SHOVEL_KEY).enchantable(100));
    public static final RegistryKey<Item> MYSTICAL_IRON_SHOVEL_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "mystical_iron_shovel"));
    public static final Item MYSTICAL_IRON_SHOVEL = new ShovelItem(ToolMaterial.IRON, 1.5F, -3.0F, new Item.Settings().registryKey(MYSTICAL_IRON_SHOVEL_KEY).enchantable(100));
    public static final RegistryKey<Item> MYSTICAL_GOLDEN_SHOVEL_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "mystical_golden_shovel"));
    public static final Item MYSTICAL_GOLDEN_SHOVEL = new ShovelItem(ToolMaterial.GOLD, 1.5F, -3.0F, new Item.Settings().registryKey(MYSTICAL_GOLDEN_SHOVEL_KEY).enchantable(100));
    public static final RegistryKey<Item> MYSTICAL_DIAMOND_SHOVEL_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "mystical_diamond_shovel"));
    public static final Item MYSTICAL_DIAMOND_SHOVEL = new ShovelItem(ToolMaterial.DIAMOND, 1.5F, -3.0F, new Item.Settings().registryKey(MYSTICAL_DIAMOND_SHOVEL_KEY).enchantable(100));
    public static final RegistryKey<Item> MYSTICAL_NETHERITE_SHOVEL_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "mystical_netherite_shovel"));
    public static final Item MYSTICAL_NETHERITE_SHOVEL = new ShovelItem(ToolMaterial.NETHERITE, 1.5F, -3.0F, new Item.Settings().registryKey(MYSTICAL_NETHERITE_SHOVEL_KEY).fireproof().enchantable(100));

    public static final RegistryKey<Item> MYSTICAL_WOODEN_HOE_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "mystical_wooden_hoe"));
    public static final Item MYSTICAL_WOODEN_HOE = new HoeItem(ToolMaterial.WOOD, 0.0F, -3.0F, new Item.Settings().registryKey(MYSTICAL_WOODEN_HOE_KEY).enchantable(100));
    public static final RegistryKey<Item> MYSTICAL_STONE_HOE_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "mystical_stone_hoe"));
    public static final Item MYSTICAL_STONE_HOE = new HoeItem(ToolMaterial.STONE, -1.0F, -2.0F, new Item.Settings().registryKey(MYSTICAL_STONE_HOE_KEY).enchantable(100));
    public static final RegistryKey<Item> MYSTICAL_IRON_HOE_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "mystical_iron_hoe"));
    public static final Item MYSTICAL_IRON_HOE = new HoeItem(ToolMaterial.IRON, -2.0F, -1.0F, new Item.Settings().registryKey(MYSTICAL_IRON_HOE_KEY).enchantable(100));
    public static final RegistryKey<Item> MYSTICAL_GOLDEN_HOE_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "mystical_golden_hoe"));
    public static final Item MYSTICAL_GOLDEN_HOE = new HoeItem(ToolMaterial.GOLD, 0.0F, -3.0F, new Item.Settings().registryKey(MYSTICAL_GOLDEN_HOE_KEY).enchantable(100));
    public static final RegistryKey<Item> MYSTICAL_DIAMOND_HOE_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "mystical_diamond_hoe"));
    public static final Item MYSTICAL_DIAMOND_HOE = new HoeItem(ToolMaterial.DIAMOND, -3.0F, 0.0F, new Item.Settings().registryKey(MYSTICAL_DIAMOND_HOE_KEY).enchantable(100));
    public static final RegistryKey<Item> MYSTICAL_NETHERITE_HOE_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, "mystical_netherite_hoe"));
    public static final Item MYSTICAL_NETHERITE_HOE = new HoeItem(ToolMaterial.NETHERITE, -4.0F, 0.0F, new Item.Settings().registryKey(MYSTICAL_NETHERITE_HOE_KEY).fireproof().enchantable(100));

    public static final RegistryKey<ItemGroup> ITEM_GROUP_REGISTRY_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(MOD_ID, "mystical_wood_group"));
    public static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(MYSTICAL_LOG_ITEM))
            .displayName(Text.translatable("itemGroup.mysticalwood"))
            .build();

    public static final RegistryKey<PlacedFeature> MYSTICAL_LOG_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(MOD_ID, "mystical_tree"));

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing MysticalWood");
        Registry.register(Registries.PARTICLE_TYPE, Identifier.of(MOD_ID, "mystical_particle"), MYSTICAL_PARTICLE);

        Registry.register(Registries.BLOCK, MYSTICAL_LOG_KEY, MYSTICAL_LOG);
        Registry.register(Registries.ITEM, MYSTICAL_LOG_ITEM_KEY, MYSTICAL_LOG_ITEM);

        Registry.register(Registries.BLOCK, STRIPPED_MYSTICAL_LOG_KEY, STRIPPED_MYSTICAL_LOG);
        Registry.register(Registries.ITEM, STRIPPED_MYSTICAL_LOG_ITEM_KEY, STRIPPED_MYSTICAL_LOG_ITEM);

        Registry.register(Registries.BLOCK, MYSTICAL_WOOD_KEY, MYSTICAL_WOOD);
        Registry.register(Registries.ITEM, MYSTICAL_WOOD_ITEM_KEY, MYSTICAL_WOOD_ITEM);

        Registry.register(Registries.BLOCK, STRIPPED_MYSTICAL_WOOD_KEY, STRIPPED_MYSTICAL_WOOD);
        Registry.register(Registries.ITEM, STRIPPED_MYSTICAL_WOOD_ITEM_KEY, STRIPPED_MYSTICAL_WOOD_ITEM);

        Registry.register(Registries.BLOCK, MYSTICAL_PLANKS_KEY, MYSTICAL_PLANKS);
        Registry.register(Registries.ITEM, MYSTICAL_PLANKS_ITEM_KEY, MYSTICAL_PLANKS_ITEM);

        Registry.register(Registries.BLOCK, MYSTICAL_STAIRS_KEY, MYSTICAL_STAIRS);
        Registry.register(Registries.ITEM, MYSTICAL_STAIRS_ITEM_KEY, MYSTICAL_STAIRS_ITEM);

        Registry.register(Registries.BLOCK, MYSTICAL_SLAB_KEY, MYSTICAL_SLAB);
        Registry.register(Registries.ITEM, MYSTICAL_SLAB_ITEM_KEY, MYSTICAL_SLAB_ITEM);

        Registry.register(Registries.ITEM, MYSTICAL_UPGRADE_TEMPLATE_KEY, MYSTICAL_UPGRADE_TEMPLATE);

        Registry.register(Registries.ITEM, MYSTICAL_WOODEN_SWORD_KEY, MYSTICAL_WOODEN_SWORD);
        Registry.register(Registries.ITEM, MYSTICAL_STONE_SWORD_KEY, MYSTICAL_STONE_SWORD);
        Registry.register(Registries.ITEM, MYSTICAL_IRON_SWORD_KEY, MYSTICAL_IRON_SWORD);
        Registry.register(Registries.ITEM, MYSTICAL_GOLDEN_SWORD_KEY, MYSTICAL_GOLDEN_SWORD);
        Registry.register(Registries.ITEM, MYSTICAL_DIAMOND_SWORD_KEY, MYSTICAL_DIAMOND_SWORD);
        Registry.register(Registries.ITEM, MYSTICAL_NETHERITE_SWORD_KEY, MYSTICAL_NETHERITE_SWORD);

        Registry.register(Registries.ITEM, MYSTICAL_WOODEN_PICKAXE_KEY, MYSTICAL_WOODEN_PICKAXE);
        Registry.register(Registries.ITEM, MYSTICAL_STONE_PICKAXE_KEY, MYSTICAL_STONE_PICKAXE);
        Registry.register(Registries.ITEM, MYSTICAL_IRON_PICKAXE_KEY, MYSTICAL_IRON_PICKAXE);
        Registry.register(Registries.ITEM, MYSTICAL_GOLDEN_PICKAXE_KEY, MYSTICAL_GOLDEN_PICKAXE);
        Registry.register(Registries.ITEM, MYSTICAL_DIAMOND_PICKAXE_KEY, MYSTICAL_DIAMOND_PICKAXE);
        Registry.register(Registries.ITEM, MYSTICAL_NETHERITE_PICKAXE_KEY, MYSTICAL_NETHERITE_PICKAXE);

        Registry.register(Registries.ITEM, MYSTICAL_WOODEN_AXE_KEY, MYSTICAL_WOODEN_AXE);
        Registry.register(Registries.ITEM, MYSTICAL_STONE_AXE_KEY, MYSTICAL_STONE_AXE);
        Registry.register(Registries.ITEM, MYSTICAL_IRON_AXE_KEY, MYSTICAL_IRON_AXE);
        Registry.register(Registries.ITEM, MYSTICAL_GOLDEN_AXE_KEY, MYSTICAL_GOLDEN_AXE);
        Registry.register(Registries.ITEM, MYSTICAL_DIAMOND_AXE_KEY, MYSTICAL_DIAMOND_AXE);
        Registry.register(Registries.ITEM, MYSTICAL_NETHERITE_AXE_KEY, MYSTICAL_NETHERITE_AXE);

        Registry.register(Registries.ITEM, MYSTICAL_WOODEN_SHOVEL_KEY, MYSTICAL_WOODEN_SHOVEL);
        Registry.register(Registries.ITEM, MYSTICAL_STONE_SHOVEL_KEY, MYSTICAL_STONE_SHOVEL);
        Registry.register(Registries.ITEM, MYSTICAL_IRON_SHOVEL_KEY, MYSTICAL_IRON_SHOVEL);
        Registry.register(Registries.ITEM, MYSTICAL_GOLDEN_SHOVEL_KEY, MYSTICAL_GOLDEN_SHOVEL);
        Registry.register(Registries.ITEM, MYSTICAL_DIAMOND_SHOVEL_KEY, MYSTICAL_DIAMOND_SHOVEL);
        Registry.register(Registries.ITEM, MYSTICAL_NETHERITE_SHOVEL_KEY, MYSTICAL_NETHERITE_SHOVEL);

        Registry.register(Registries.ITEM, MYSTICAL_WOODEN_HOE_KEY, MYSTICAL_WOODEN_HOE);
        Registry.register(Registries.ITEM, MYSTICAL_STONE_HOE_KEY, MYSTICAL_STONE_HOE);
        Registry.register(Registries.ITEM, MYSTICAL_IRON_HOE_KEY, MYSTICAL_IRON_HOE);
        Registry.register(Registries.ITEM, MYSTICAL_GOLDEN_HOE_KEY, MYSTICAL_GOLDEN_HOE);
        Registry.register(Registries.ITEM, MYSTICAL_DIAMOND_HOE_KEY, MYSTICAL_DIAMOND_HOE);
        Registry.register(Registries.ITEM, MYSTICAL_NETHERITE_HOE_KEY, MYSTICAL_NETHERITE_HOE);

        Registry.register(Registries.ITEM_GROUP, ITEM_GROUP_REGISTRY_KEY, ITEM_GROUP);
        LOGGER.debug("Item Group initialized");
        ItemGroupEvents.modifyEntriesEvent(ITEM_GROUP_REGISTRY_KEY).register(itemGroup -> {
            itemGroup.add(MYSTICAL_LOG_ITEM);
            itemGroup.add(MYSTICAL_WOOD_ITEM);
            itemGroup.add(STRIPPED_MYSTICAL_LOG);
            itemGroup.add(STRIPPED_MYSTICAL_WOOD_ITEM);
            itemGroup.add(MYSTICAL_PLANKS_ITEM);
            itemGroup.add(MYSTICAL_STAIRS_ITEM);
            itemGroup.add(MYSTICAL_SLAB_ITEM);
            itemGroup.add(MYSTICAL_WOODEN_SWORD);
            itemGroup.add(MYSTICAL_STONE_SWORD);
            itemGroup.add(MYSTICAL_IRON_SWORD);
            itemGroup.add(MYSTICAL_GOLDEN_SWORD);
            itemGroup.add(MYSTICAL_DIAMOND_SWORD);
            itemGroup.add(MYSTICAL_NETHERITE_SWORD);
            itemGroup.add(MYSTICAL_WOODEN_PICKAXE);
            itemGroup.add(MYSTICAL_STONE_PICKAXE);
            itemGroup.add(MYSTICAL_IRON_PICKAXE);
            itemGroup.add(MYSTICAL_GOLDEN_PICKAXE);
            itemGroup.add(MYSTICAL_DIAMOND_PICKAXE);
            itemGroup.add(MYSTICAL_NETHERITE_PICKAXE);
            itemGroup.add(MYSTICAL_WOODEN_AXE);
            itemGroup.add(MYSTICAL_STONE_AXE);
            itemGroup.add(MYSTICAL_IRON_AXE);
            itemGroup.add(MYSTICAL_GOLDEN_AXE);
            itemGroup.add(MYSTICAL_DIAMOND_AXE);
            itemGroup.add(MYSTICAL_NETHERITE_AXE);
            itemGroup.add(MYSTICAL_WOODEN_SHOVEL);
            itemGroup.add(MYSTICAL_STONE_SHOVEL);
            itemGroup.add(MYSTICAL_IRON_SHOVEL);
            itemGroup.add(MYSTICAL_GOLDEN_SHOVEL);
            itemGroup.add(MYSTICAL_DIAMOND_SHOVEL);
            itemGroup.add(MYSTICAL_NETHERITE_SHOVEL);
            itemGroup.add(MYSTICAL_WOODEN_HOE);
            itemGroup.add(MYSTICAL_STONE_HOE);
            itemGroup.add(MYSTICAL_IRON_HOE);
            itemGroup.add(MYSTICAL_GOLDEN_HOE);
            itemGroup.add(MYSTICAL_DIAMOND_HOE);
            itemGroup.add(MYSTICAL_NETHERITE_HOE);
            itemGroup.add(MYSTICAL_UPGRADE_TEMPLATE);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(itemGroup -> {
            itemGroup.add(MYSTICAL_WOODEN_SWORD);
            itemGroup.add(MYSTICAL_STONE_SWORD);
            itemGroup.add(MYSTICAL_IRON_SWORD);
            itemGroup.add(MYSTICAL_GOLDEN_SWORD);
            itemGroup.add(MYSTICAL_DIAMOND_SWORD);
            itemGroup.add(MYSTICAL_NETHERITE_SWORD);
            itemGroup.add(MYSTICAL_WOODEN_AXE);
            itemGroup.add(MYSTICAL_STONE_AXE);
            itemGroup.add(MYSTICAL_IRON_AXE);
            itemGroup.add(MYSTICAL_GOLDEN_AXE);
            itemGroup.add(MYSTICAL_DIAMOND_AXE);
            itemGroup.add(MYSTICAL_NETHERITE_AXE);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(itemGroup -> {
            itemGroup.add(MYSTICAL_WOODEN_PICKAXE);
            itemGroup.add(MYSTICAL_STONE_PICKAXE);
            itemGroup.add(MYSTICAL_IRON_PICKAXE);
            itemGroup.add(MYSTICAL_GOLDEN_PICKAXE);
            itemGroup.add(MYSTICAL_DIAMOND_PICKAXE);
            itemGroup.add(MYSTICAL_NETHERITE_PICKAXE);
            itemGroup.add(MYSTICAL_WOODEN_AXE);
            itemGroup.add(MYSTICAL_STONE_AXE);
            itemGroup.add(MYSTICAL_IRON_AXE);
            itemGroup.add(MYSTICAL_GOLDEN_AXE);
            itemGroup.add(MYSTICAL_DIAMOND_AXE);
            itemGroup.add(MYSTICAL_NETHERITE_AXE);
            itemGroup.add(MYSTICAL_WOODEN_SHOVEL);
            itemGroup.add(MYSTICAL_STONE_SHOVEL);
            itemGroup.add(MYSTICAL_IRON_SHOVEL);
            itemGroup.add(MYSTICAL_GOLDEN_SHOVEL);
            itemGroup.add(MYSTICAL_DIAMOND_SHOVEL);
            itemGroup.add(MYSTICAL_NETHERITE_SHOVEL);
            itemGroup.add(MYSTICAL_WOODEN_HOE);
            itemGroup.add(MYSTICAL_STONE_HOE);
            itemGroup.add(MYSTICAL_IRON_HOE);
            itemGroup.add(MYSTICAL_GOLDEN_HOE);
            itemGroup.add(MYSTICAL_DIAMOND_HOE);
            itemGroup.add(MYSTICAL_NETHERITE_HOE);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(itemGroup -> {
            itemGroup.add(MYSTICAL_LOG_ITEM);
            itemGroup.add(STRIPPED_MYSTICAL_LOG_ITEM);
            itemGroup.add(MYSTICAL_WOOD_ITEM);
            itemGroup.add(STRIPPED_MYSTICAL_WOOD_ITEM);
            itemGroup.add(MYSTICAL_PLANKS_ITEM);
            itemGroup.add(MYSTICAL_STAIRS_ITEM);
            itemGroup.add(MYSTICAL_SLAB_ITEM);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(itemGroup -> itemGroup.add(MYSTICAL_LOG_ITEM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(itemGroup -> itemGroup.add(MYSTICAL_UPGRADE_TEMPLATE));
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.VEGETAL_DECORATION, MYSTICAL_LOG_PLACED_KEY);
        StrippableBlockRegistry.register(MYSTICAL_LOG, STRIPPED_MYSTICAL_LOG);
    }
}
