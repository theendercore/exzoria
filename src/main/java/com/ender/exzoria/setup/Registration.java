package com.ender.exzoria.setup;

import com.ender.exzoria.blocks.VoidsteelBlock;
import com.ender.exzoria.blocks.VoidsteelBricks;
import com.ender.exzoria.items.Voidsteel;
import com.ender.exzoria.items.VoidsteelBits;
import com.ender.exzoria.items.util.ModRarity;
import com.ender.exzoria.items.tools.VoidsteelPickaxe;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityType;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.common.ModDimension;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import static com.ender.exzoria.Exzoria.MODID;

public class Registration {

    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    private static final DeferredRegister<TileEntityType<?>> TILE_ENTITIES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, MODID);
    private static final DeferredRegister<ContainerType<?>> CONTAINERS = DeferredRegister.create(ForgeRegistries.CONTAINERS, MODID);
    private static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, MODID);
    private static final DeferredRegister<ModDimension> DIMENSIONS = DeferredRegister.create(ForgeRegistries.MOD_DIMENSIONS, MODID);

    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        TILE_ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
        CONTAINERS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
        DIMENSIONS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
    //Blocks
    public static final RegistryObject<VoidsteelBlock> VOIDSTEEL_BLOCK = BLOCKS.register("voidsteel_block", VoidsteelBlock::new);
    public static final RegistryObject<Item> VOIDSTEEL_BLOCK_ITEM = ITEMS.register("voidsteel_block", () -> new BlockItem(VOIDSTEEL_BLOCK.get(), new Item.Properties().group(ModSetup.EXZORIA).rarity(ModRarity.VOID)));

    public static final RegistryObject<VoidsteelBricks> VOIDSTEEL_BRICKS = BLOCKS.register("voidsteel_bricks", VoidsteelBricks::new);
    public static final RegistryObject<Item> VOIDSTEEL_BRICKS_ITEM = ITEMS.register("voidsteel_bricks", () -> new BlockItem(VOIDSTEEL_BRICKS.get(), new Item.Properties().group(ModSetup.EXZORIA).rarity(ModRarity.VOID)));

    //Items
    public static final RegistryObject<Voidsteel> VOIDSTEEL = ITEMS.register("voidsteel", Voidsteel::new);
    public static final RegistryObject<VoidsteelBits> VOIDSTEEL_BITS = ITEMS.register("voidsteel_bits", VoidsteelBits::new);
    public static final RegistryObject<VoidsteelPickaxe> VOIDSTEEL_PICKAXE = ITEMS.register("voidsteel_pickaxe", VoidsteelPickaxe::new);
}
