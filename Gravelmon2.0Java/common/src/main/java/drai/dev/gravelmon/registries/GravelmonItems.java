package drai.dev.gravelmon.registries;

import dev.architectury.registry.registries.*;
import net.minecraft.core.registries.*;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.*;

import static drai.dev.gravelmon.Gravelmon.MOD_ID;

public class GravelmonItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registries.ITEM);

    //Evolution Items
    public static RegistrySupplier<Item> VARIA_STONE = item("varia_stone");
    public static RegistrySupplier<Item> ASTRAL_STONE = item("astral_stone");
    public static RegistrySupplier<Item> AIR_STONE = item("air_stone");
    public static RegistrySupplier<Item> MYSTIC_STONE = item("mystic_stone");
    public static RegistrySupplier<Item> SOLID_STONE = item("solid_stone");
    public static RegistrySupplier<Item> XENOLITH = item("xenolith");
    public static RegistrySupplier<Item> QUANTUM_UPGRADE = item("quantum_upgrade");
    public static RegistrySupplier<Item> KALEIDOSCOPE = item("kaleidoscope");
    public static RegistrySupplier<Item> CORRUPTED_DISC = item("corrupted_disc");
    public static RegistrySupplier<Item> WES_UPDATE = item("wes_update");
    public static RegistrySupplier<Item> MURKY_CLAW = item("murky_claw");
    public static RegistrySupplier<Item> SILVER_SCALE = item("silver_scale");
    public static RegistrySupplier<Item> ANCIENT_GLYPH = item("ancient_glyph");
    public static RegistrySupplier<Item> VOIDIX = item("voidix");
    public static RegistrySupplier<Item> ELECTRIX = item("electrix");
    public static RegistrySupplier<Item> BURIX = item("burix");
    public static RegistrySupplier<Item> AQUIX = item("aquix");
    public static RegistrySupplier<Item> VERDIX = item("verdix");
    public static RegistrySupplier<Item> ZERIX = item("zerix");
    public static RegistrySupplier<Item> PATHIX = item("pathix");
    public static RegistrySupplier<Item> PIXIX = item("pixix");
    public static RegistrySupplier<Item> SLOWPOKE_TAIL = item("slowpoke_tail");
    public static RegistrySupplier<Item> DREAD_PENDANT = item("dread_pendant");
    public static RegistrySupplier<Item> SPARE_PARTS = item("spare_parts");
    public static RegistrySupplier<Item> MAGIC_COOKIE = item("magic_cookie");

    //Held Items
    public static RegistrySupplier<Item> LONG_CLUB = heldItem("long_club");
    public static RegistrySupplier<Item> TERRESTRIAL_RING = heldItem("terrestrial_ring");
    public static RegistrySupplier<Item> XENOVERSAL_RING = heldItem("xenoversal_ring");

    public static RegistrySupplier<Item> INDUCTIVE_RING = heldItem("inductive_ring");
    //Other Items
    public static RegistrySupplier<Item> TUSK_FOSSIL = item("tusk_fossil");
    
    public static RegistrySupplier<Item> HORN_FOSSIL = item("horn_fossil");

    //Block Items
    public static RegistrySupplier<Item> ASTRAL_STONE_ORE = blockItem("astral_stone_ore_block_item", GravelmonBlocks.ASTRAL_STONE_ORE);
    public static RegistrySupplier<Item> DEEPSLATE_ASTRAL_STONE_ORE = blockItem("deepslate_astral_stone_ore_block_item", GravelmonBlocks.DEEPSLATE_ASTRAL_STONE_ORE);
    public static RegistrySupplier<Item> AIR_STONE_ORE = blockItem("air_stone_ore",GravelmonBlocks.AIR_STONE_ORE);
    public static RegistrySupplier<Item> DEEPSLATE_AIR_STONE_ORE = blockItem("deepslate_air_stone_ore",GravelmonBlocks.DEEPSLATE_AIR_STONE_ORE);
    public static RegistrySupplier<Item> MYSTIC_STONE_ORE = blockItem("mystic_stone_ore",GravelmonBlocks.MYSTIC_STONE_ORE);
    public static RegistrySupplier<Item> DEEPSLATE_MYSTIC_STONE_ORE = blockItem("deepslate_mystic_stone_ore",GravelmonBlocks.DEEPSLATE_MYSTIC_STONE_ORE);
    public static RegistrySupplier<Item> SOLID_STONE_ORE = blockItem("solid_stone_ore",GravelmonBlocks.SOLID_STONE_ORE);
    public static RegistrySupplier<Item> DEEPSLATE_SOLID_STONE_ORE = blockItem("deepslate_solid_stone_ore",GravelmonBlocks.DEEPSLATE_SOLID_STONE_ORE);
    public static RegistrySupplier<Item> item(String name){
        return ITEMS.register(name,() -> new Item(new Item.Properties()));
    }

    public static RegistrySupplier<Item> blockItem(String name, RegistrySupplier<Block> block){
        return ITEMS.register(name,() -> new BlockItem(block.get(),new Item.Properties()));
    }

    private static RegistrySupplier<Item> heldItem(String name) {
        var heldItem = ITEMS.register(name, ()-> new Item(new Item.Properties()));
        //CobblemonHeldItemManager.INSTANCE.registerRemap(heldItem.get(),name);
        return heldItem;
    }

    public static void touch(){

    }
}
