package drai.dev.gravelmon.registries;

import com.cobblemon.mod.common.item.*;
import com.cobblemon.mod.common.pokeball.*;
import com.cobblemon.mod.common.pokemon.helditem.*;
import dev.architectury.registry.registries.*;
import drai.dev.gravelmon.*;
import drai.dev.gravelmon.items.apricorn.*;
import drai.dev.gravelmon.pokeballs.*;
import drai.dev.gravelsextendedbattles.loot.*;
import net.minecraft.core.registries.*;
import net.minecraft.network.chat.*;
import net.minecraft.resources.*;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.*;

import java.util.*;

import static drai.dev.gravelmon.Gravelmon.*;

public class GravelmonItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registries.ITEM);
    public static final ArrayList<RegistrySupplier<PokeBallItem>> POKE_BALLS = new ArrayList<>();
    private static final List<Runnable> LATE_HELD_ITEM_REGISTRATIONS = new ArrayList<>();

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
    //    public static RegistrySupplier<Item> VOIDIX = item("voidix");
    //    public static RegistrySupplier<Item> ELECTRIX = item("electrix");
    //    public static RegistrySupplier<Item> BURIX = item("burix");
    //    public static RegistrySupplier<Item> AQUIX = item("aquix");
    //    public static RegistrySupplier<Item> VERDIX = item("verdix");
    //    public static RegistrySupplier<Item> ZERIX = item("zerix");
    //    public static RegistrySupplier<Item> PATHIX = item("pathix");
    //    public static RegistrySupplier<Item> PIXIX = item("pixix");
    public static RegistrySupplier<Item> SLOWPOKE_TAIL = item("slowpoke_tail");
    public static RegistrySupplier<Item> DREAD_PENDANT = item("dread_pendant");
    public static RegistrySupplier<Item> SPARE_PARTS = item("spare_parts");
    public static RegistrySupplier<Item> MAGIC_COOKIE = item("magic_cookie");
    public static RegistrySupplier<Item> TERRESTRIAL_RING = item("terrestrial_ring");
    public static RegistrySupplier<Item> XENOVERSAL_RING = item("xenoversal_ring");
    public static RegistrySupplier<Item> INDUCTIVE_RING = item("inductive_ring");

    public static RegistrySupplier<Item> GOLDEN_FEATHER = item("golden_feather");
    public static RegistrySupplier<Item> PIXIE_DUST = item("pixie_dust");
    public static RegistrySupplier<Item> OCARINA = item("ocarina");
    public static RegistrySupplier<Item> ROYAL_JELLY = item("royal_jelly");
    public static RegistrySupplier<Item> COCONUT_MILK = item("coconut_milk");
    public static RegistrySupplier<Item> CARROT_WINE = item("carrot_wine");
    public static RegistrySupplier<Item> URANIUM_CORE = item("uranium_core");
    public static RegistrySupplier<Item> PREADITE = item("preadite");
    public static RegistrySupplier<Item> EMPTY_SKULL = item("empty_skull");
    public static RegistrySupplier<Item> FOREIGN_HAT = item("foreign_hat");
    public static RegistrySupplier<Item> PRIM_SHEARS = item("prim_shears");
    public static RegistrySupplier<Item> HAIR_TONIC = item("hair_tonic");
    public static RegistrySupplier<Item> GROWTH_MULCH = item("growth_mulch");
//    public static RegistrySupplier<Item> ABYSSAL_STONE = item("abyssal_stone");

    //Held Items
    //Sage
    public static RegistrySupplier<Item> LONG_CLUB = heldItem("long_club");
    public static RegistrySupplier<Item> X_RAY_SPECS = heldItem("x_ray_specs");
    public static RegistrySupplier<Item> FOUL_ROCK = heldItem("foul_rock");
    public static RegistrySupplier<Item> RAGGED_PEBBLE = heldItem("ragged_pebble");
    public static RegistrySupplier<Item> POLISHED_SPHERE = heldItem("polished_sphere");
    public static RegistrySupplier<Item> CORRUPTED_SEED = heldItem("corrupted_seed");
    public static RegistrySupplier<Item> BOLT_ORB = heldItem("bolt_orb");
    public static RegistrySupplier<Item> IVEOLITE = heldItem("iveolite");
    //Xenoverse
    public static RegistrySupplier<Item> ICE_SHARD = heldItem("ice_shard");
    public static RegistrySupplier<Item> MOSS_SHARD = heldItem("moss_shard");
    public static RegistrySupplier<Item> PRETTY_RIBBON = heldItem("pretty_ribbon");
    public static RegistrySupplier<Item> HAFLI_BERRY = heldItem("hafli_berry");
    //insurgence
    public static RegistrySupplier<Item> DARK_ROCK = heldItem("dark_rock");

    //Block Items
    public static RegistrySupplier<Item> ASTRAL_STONE_ORE = blockItem("astral_stone_ore_block_item", GravelmonBlocks.ASTRAL_STONE_ORE);
    public static RegistrySupplier<Item> DEEPSLATE_ASTRAL_STONE_ORE = blockItem("deepslate_astral_stone_ore_block_item", GravelmonBlocks.DEEPSLATE_ASTRAL_STONE_ORE);
    public static RegistrySupplier<Item> ASTRAL_STONE_BLOCK = blockItem("astral_stone_block", GravelmonBlocks.ASTRAL_STONE_BLOCK);
    public static RegistrySupplier<Item> AIR_STONE_ORE = blockItem("air_stone_ore", GravelmonBlocks.AIR_STONE_ORE);
    public static RegistrySupplier<Item> DEEPSLATE_AIR_STONE_ORE = blockItem("deepslate_air_stone_ore", GravelmonBlocks.DEEPSLATE_AIR_STONE_ORE);
    public static RegistrySupplier<Item> AIR_STONE_BLOCK = blockItem("air_stone_block", GravelmonBlocks.AIR_STONE_BLOCK);
    public static RegistrySupplier<Item> MYSTIC_STONE_ORE = blockItem("mystic_stone_ore", GravelmonBlocks.MYSTIC_STONE_ORE);
    public static RegistrySupplier<Item> DEEPSLATE_MYSTIC_STONE_ORE = blockItem("deepslate_mystic_stone_ore", GravelmonBlocks.DEEPSLATE_MYSTIC_STONE_ORE);
    public static RegistrySupplier<Item> MYSTIC_STONE_BLOCK = blockItem("mystic_stone_block", GravelmonBlocks.MYSTIC_STONE_BLOCK);
    public static RegistrySupplier<Item> SOLID_STONE_ORE = blockItem("solid_stone_ore", GravelmonBlocks.SOLID_STONE_ORE);
    public static RegistrySupplier<Item> DEEPSLATE_SOLID_STONE_ORE = blockItem("deepslate_solid_stone_ore", GravelmonBlocks.DEEPSLATE_SOLID_STONE_ORE);
    public static RegistrySupplier<Item> SOLID_STONE_BLOCK = blockItem("solid_stone_block", GravelmonBlocks.SOLID_STONE_BLOCK);
    public static RegistrySupplier<Item> VARIA_STONE_BLOCK = blockItem("varia_stone_block", GravelmonBlocks.VARIA_STONE_BLOCK);

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

    //Ancient Pokeballs
    public static RegistrySupplier<PokeBallItem> ANCIENT_MAUVE_BALL;
    public static RegistrySupplier<PokeBallItem> ANCIENT_CORAL_BALL;

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

    public static RegistrySupplier<Item> PURPLE_APRICORN = item("purple_apricorn");
    public static RegistrySupplier<Item> ORANGE_APRICORN = item("orange_apricorn");

    public static RegistrySupplier<GravelmonApricornSeedItem> PURPLE_APRICORN_SEED = apricronSeedItem("purple_apricorn_seed", GravelmonBlocks.PURPLE_APRICORN_SAPLING, GravelmonBlocks.PURPLE_APRICORN);
    public static RegistrySupplier<GravelmonApricornSeedItem> ORANGE_APRICORN_SEED = apricronSeedItem("orange_apricorn_seed", GravelmonBlocks.ORANGE_APRICORN_SAPLING, GravelmonBlocks.ORANGE_APRICORN);

    public static RegistrySupplier<Item> fossilItem(List<ResourceLocation> lootTables, String itemName, String speciesName) {
        var item = item(itemName);
        GravelmonFossilManager.addFossil(lootTables, item);
        Gravelmon.FOSSIL_MAP.put(itemName, speciesName);
        Gravelmon.FOSSIL_ITEM_MAP.put(itemName, item::get);
        return item;
    }

    public static RegistrySupplier<PokeBallItem> pokeballItem(String name, GravelmonPokeBall pokeBall) {
        var item = ITEMS.register(name, () -> new PokeBallItem(pokeBall));
        POKE_BALLS.add(item);
        pokeBall.setPokeBallItem(item);
        return item;
    }

    public static RegistrySupplier<Item> item(String name) {
        return ITEMS.register(name, () -> new Item(new Item.Properties()));
    }

    public static RegistrySupplier<GravelmonApricornSeedItem> apricronSeedItem(String name, RegistrySupplier<GravelmonApricornSaplingBlock> apricornSaplingBlock, RegistrySupplier<GravelmonApricornBlock> block) {
        return ITEMS.register(name, () -> new GravelmonApricornSeedItem(apricornSaplingBlock.get(), block.get(), new Item.Properties()));
    }

    public static RegistrySupplier<Item> blockItem(String name, RegistrySupplier<Block> block) {
        return ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    private static RegistrySupplier<Item> heldItem(String name) {
        var item = ITEMS.register(name, () -> new Item(new Item.Properties()));
        LATE_HELD_ITEM_REGISTRATIONS.add(() -> CobblemonHeldItemManager.INSTANCE.registerRemap(item.get(), name.replaceAll("_", "")));
        return item;
    }

    public static void touch() {
        GravelmonFossilItems.touch();
    }

    public static void lateInit() {
        LATE_HELD_ITEM_REGISTRATIONS.forEach(Runnable::run);
    }

    public static RegistrySupplier<Item> megaItem(String megaStoneName) {
        Item item = new Item(new Item.Properties().arch$tab(GravelmonMegaStonesTab.GRAVELMON_MEGA_STONES_TAB)) {
            @Override
            public void appendHoverText(ItemStack itemStack, TooltipContext tooltipContext, List<Component> list, TooltipFlag tooltipFlag) {
                list.add(Component.translatable("tooltip.gravelmon."+megaStoneName+".tooltip"));
                super.appendHoverText(itemStack, tooltipContext, list, tooltipFlag);
            }
        };
        return ITEMS.register(megaStoneName, () -> item);
    }
}
