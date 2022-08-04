package com.example.examplemod;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.logging.log4j.core.pattern.AbstractStyleNameConverter;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,ExampleMod.MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,ExampleMod.MODID);
    public static final RegistryObject<Item> ROCK=ITEMS.register("rock",()-> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));
public static final RegistryObject<Block> FANCY_ORE = BLOCKS.register("fancy_ore", ()-> new Block(AbstractBlock.Properties.of(Material.STONE)));
public static final RegistryObject<BlockItem>Fancy_ore_item= ITEMS.register("fancy_ore_item",()-> new BlockItem(FANCY_ORE.get(),new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
public static final RegistryObject<Item>MY_AXE = ITEMS.register("my_axe", ()-> new AxeItem(ItemTier.DIAMOND, 5, -2.8f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
public static final RegistryObject<Item>MY_PICKAXE = ITEMS.register("my_pickaxe", ()-> new PickaxeItem(ItemTier.DIAMOND, 2, -1.08f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item>MY_SWORD = ITEMS.register("my_sword", ()-> new SwordItem(ItemTier.DIAMOND, 6, -1.08f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item>MY_SHOVEL = ITEMS.register("my_shovel", ()-> new ShovelItem(ItemTier.DIAMOND, 2, -1.08f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item>MY_HOE = ITEMS.register("my_hoe", ()-> new HoeItem(ItemTier.DIAMOND, 1, -1.08f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item>MY_BOW = ITEMS.register("my_bow", ()-> new BowItem( new Item.Properties().tab(ItemGroup.TAB_TOOLS).stacksTo(1)));
    public static final RegistryObject<Item>MY_FISH = ITEMS.register("my_fish", ()-> new SwordItem(ItemTier.DIAMOND, 20, -1.08f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item>MY_CAT = ITEMS.register("my_cat", ()-> new PickaxeItem(ItemTier.DIAMOND, 10, -1.08f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item>MY_DOG = ITEMS.register("my_dog", ()-> new AxeItem(ItemTier.DIAMOND, 21, -1.08f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item>MY_MOUSE = ITEMS.register("my_mouse", ()-> new HoeItem(ItemTier.DIAMOND, 5, -1.08f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item>BIG_RABBIT = ITEMS.register("big_rabbit", ()-> new ShovelItem(ItemTier.DIAMOND, 6, -1.08f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> PANCAKE=ITEMS.register("pancake",()-> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Block> MY_BLOCK = BLOCKS.register("my_block", ()-> new Block(AbstractBlock.Properties.of(Material.WOOL)));
    public static final RegistryObject<Item>MY_BOU = ITEMS.register("my_bou", ()-> new BowItem( new Item.Properties().tab(ItemGroup.TAB_TOOLS).stacksTo(1)));
    public static final RegistryObject<Item>MY_BOWW = ITEMS.register("my_boww", ()-> new BowItem( new Item.Properties().tab(ItemGroup.TAB_TOOLS).stacksTo(1)));
    public static final RegistryObject<Item>MY_BOWWW = ITEMS.register("my_bowww", ()-> new BowItem( new Item.Properties().tab(ItemGroup.TAB_TOOLS).stacksTo(1)));
    public static final RegistryObject<Item>MY_TRIDENT = ITEMS.register("my_trident", ()-> new BowItem( new Item.Properties().tab(ItemGroup.TAB_TOOLS).stacksTo(1)));
    public static final RegistryObject<Item>MY_SWOURD = ITEMS.register("my_swourd", ()-> new SwordItem(ItemTier.DIAMOND, 14, -1.08f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item>MY_SHOVE = ITEMS.register("my_shove", ()-> new ShovelItem(ItemTier.DIAMOND, 1000, -1.08f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item>MY_HOO = ITEMS.register("my_hoo", ()-> new HoeItem(ItemTier.DIAMOND, 1000000000, -1.08f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item>MY_AX = ITEMS.register("my_ax", ()-> new AxeItem(ItemTier.DIAMOND, 21, -1.08f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item>MY_BLOB= ITEMS.register("my_blob", ()-> new BowItem( new Item.Properties().tab(ItemGroup.TAB_TOOLS).stacksTo(1)));
    public static final RegistryObject<Item>MY_BLOBBY= ITEMS.register("my_blobby", ()-> new AxeItem(ItemTier.DIAMOND, 9, -1.08f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item>MY_BLOBBER= ITEMS.register("my_blobber", ()-> new PickaxeItem(ItemTier.DIAMOND, 5, -1.08f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item>MY_BLOBB = ITEMS.register("my_blobb", ()-> new ShovelItem(ItemTier.DIAMOND, 3, -1.08f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item>MY_BLOBBIE = ITEMS.register("my_blobbie", ()-> new HoeItem(ItemTier.DIAMOND, 1, -1.08f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item>MY_BLOBSWORD = ITEMS.register("my_blobsword", ()-> new SwordItem(ItemTier.DIAMOND, 14, -1.08f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item>MY_BOB = ITEMS.register("my_bob", ()-> new BowItem( new Item.Properties().tab(ItemGroup.TAB_TOOLS).stacksTo(1)));
    public static final RegistryObject<Item>MY_CARSWORD = ITEMS.register("my_carsword", ()-> new SwordItem(ItemTier.DIAMOND, 14, -1.08f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item>MY_CUPCAKE= ITEMS.register("my_cupcake", ()-> new BowItem( new Item.Properties().tab(ItemGroup.TAB_TOOLS).stacksTo(1)));
    public static final RegistryObject<Item>MY_RAINBOW= ITEMS.register("my_rainbow", ()-> new BowItem( new Item.Properties().tab(ItemGroup.TAB_TOOLS).stacksTo(1)));
    public static final RegistryObject<Item>MY_EGGS= ITEMS.register("my_eggs", ()-> new BowItem( new Item.Properties().tab(ItemGroup.TAB_TOOLS).stacksTo(1)));


}
