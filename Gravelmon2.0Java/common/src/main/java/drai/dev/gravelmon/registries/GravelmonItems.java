package drai.dev.gravelmon.registries;

import com.cobblemon.mod.common.*;
import com.cobblemon.mod.common.api.data.*;
import com.cobblemon.mod.common.api.pokeball.*;
import com.cobblemon.mod.common.item.*;
import com.cobblemon.mod.common.pokeball.*;
import com.google.gson.*;
import dev.architectury.registry.registries.*;
import drai.dev.gravelmon.apricorn.*;
import drai.dev.gravelmon.pokeballs.*;
import kotlin.jvm.*;
import net.minecraft.core.registries.*;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.*;

import java.util.*;

import static drai.dev.gravelmon.Gravelmon.MOD_ID;

public class GravelmonItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registries.ITEM);
    public static final ArrayList<RegistrySupplier<PokeBallItem>> POKE_BALLS = new ArrayList();

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

    //Pokeballs
    public static RegistrySupplier<PokeBallItem> MAUVE_BALL;
    public static RegistrySupplier<PokeBallItem> CORAL_BALL;
    public static RegistrySupplier<PokeBallItem> LIME_BALL;
    public static RegistrySupplier<PokeBallItem> LUSTER_BALL;
    public static RegistrySupplier<PokeBallItem> SUN_BALL;
    public static RegistrySupplier<PokeBallItem> DAWN_BALL;
    public static RegistrySupplier<PokeBallItem> FEATHER_BALL;
    public static RegistrySupplier<PokeBallItem> NUCLEAR_BALL;
    public static RegistrySupplier<PokeBallItem> ATOM_BALL;
    public static RegistrySupplier<PokeBallItem> DELTA_BALL;
    public static RegistrySupplier<PokeBallItem> ANCIENT_BALL;
    public static RegistrySupplier<PokeBallItem> SHINY_BALL;
    public static RegistrySupplier<PokeBallItem> NUZLOCKE_BALL;
    public static RegistrySupplier<PokeBallItem> SNORE_BALL;
    public static RegistrySupplier<PokeBallItem> ARK_BALL;
    public static RegistrySupplier<PokeBallItem> XENO_BALL;

    //Official Game Poke balls
    public static RegistrySupplier<PokeBallItem> TYPING_BALL;
    public static RegistrySupplier<PokeBallItem> GS_BALL;
    public static RegistrySupplier<PokeBallItem> GEN2_LURE_BALL;

    //Anime Poke balls
    public static RegistrySupplier<PokeBallItem> ROCKET_BALL;
    public static RegistrySupplier<PokeBallItem> ULTRA_ROCKET_BALL;
    public static RegistrySupplier<PokeBallItem> LAKE_BALL;
    public static RegistrySupplier<PokeBallItem> ANIME_SAFARI_BALL;
    public static RegistrySupplier<PokeBallItem> ANNIE_BALL;
    public static RegistrySupplier<PokeBallItem> OAKLEY_BALL;
    public static RegistrySupplier<PokeBallItem> FISHING_BALL;
    public static RegistrySupplier<PokeBallItem> ANIME_GS_BALL;

    //Manga Poke balls
    public static RegistrySupplier<PokeBallItem> MANGA_SAFARI_BALL;

    //TCG Poke balls
    public static RegistrySupplier<PokeBallItem> GREAT_ROCKET_BALL;

    //LGBTQ+ balls
    public static RegistrySupplier<PokeBallItem> GAY_BALL;
    public static RegistrySupplier<PokeBallItem> LESBIAN_BALL;
    public static RegistrySupplier<PokeBallItem> BI_BALL;
    public static RegistrySupplier<PokeBallItem> PAN_BALL;
    public static RegistrySupplier<PokeBallItem> TRANS_BALL;
    public static RegistrySupplier<PokeBallItem> NON_BINARY_BALL;
    public static RegistrySupplier<PokeBallItem> ACE_BALL;
    public static RegistrySupplier<PokeBallItem> ARO_BALL;


    public static RegistrySupplier<GravelmonApricornItem> PURPLE_APRICORN = apricronItem("purple_apricorn", GravelmonBlocks.PURPLE_APRICORN);

    public static RegistrySupplier<GravelmonApricornItem> ORANGE_APRICORN = apricronItem("orange_apricorn", GravelmonBlocks.ORANGE_APRICORN);


    public static RegistrySupplier<GravelmonApricornSeedItem> PURPLE_APRICORN_SEED = apricronSeedItem("purple_apricorn_seed", GravelmonBlocks.PURPLE_APRICORN_SAPLING);

    public static RegistrySupplier<GravelmonApricornSeedItem> ORANGE_APRICORN_SEED = apricronSeedItem("orange_apricorn_seed", GravelmonBlocks.ORANGE_APRICORN_SAPLING);

    public static RegistrySupplier<GravelmonApricornSeedItem> apricronSeedItem(String name, RegistrySupplier<GravelmonApricornSaplingBlock> block){
        return ITEMS.register(name,() -> new GravelmonApricornSeedItem(block.get()));
    }

    public static RegistrySupplier<PokeBallItem> pokeballItem(String name, PokeBall pokeBall){
        var item = ITEMS.register(name,() -> new PokeBallItem(pokeBall));
        POKE_BALLS.add(item);
        return item;
    }

    public static RegistrySupplier<Item> item(String name){
        return ITEMS.register(name,() -> new Item(new Item.Properties()));
    }
    public static RegistrySupplier<GravelmonApricornItem> apricronItem(String name, RegistrySupplier<GravelmonApricornBlock> block){
        return ITEMS.register(name,() -> new GravelmonApricornItem(block.get(),new Item.Properties()));
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
