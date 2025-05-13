package drai.dev.data.jsonwriters.assets;

import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.*;
import drai.dev.gravelmon.mega.*;
import org.apache.commons.lang3.*;

public class LanguageGenerator {
    public static void generateLangFile(){
        //Menu
        LangJSONWriter.writeTranslationKey("gravelmon.midnightconfig.title","Gravelmon Config");

        //Evolution Ore
        LangJSONWriter.writeTranslationKey("block.gravelmon.air_stone_ore","Air Stone Ore");
        LangJSONWriter.writeTranslationKey("block.gravelmon.deepslate_air_stone_ore","Deepslate Air Stone Ore");
        LangJSONWriter.writeTranslationKey("block.gravelmon.astral_stone_ore","Astral Stone Ore");
        LangJSONWriter.writeTranslationKey("block.gravelmon.deepslate_astral_stone_ore","Deepslate Astral Stone Ore");
        LangJSONWriter.writeTranslationKey("block.gravelmon.solid_stone_ore","Solid Stone Ore");
        LangJSONWriter.writeTranslationKey("block.gravelmon.deepslate_solid_stone_ore","Deepslate Solid Stone Ore");
        LangJSONWriter.writeTranslationKey("block.gravelmon.mystic_stone_ore","Mystic Stone Ore");
        LangJSONWriter.writeTranslationKey("block.gravelmon.deepslate_mystic_stone_ore","Deepslate Mystic Stone Ore");
        LangJSONWriter.writeTranslationKey("block.gravelmon.astral_stone_block","Astral Stone Block");
        LangJSONWriter.writeTranslationKey("block.gravelmon.mystic_stone_block","Mystic Stone Block");
        LangJSONWriter.writeTranslationKey("block.gravelmon.solid_stone_block","Solid Stone Block");
        LangJSONWriter.writeTranslationKey("block.gravelmon.varia_stone_block","Varia Stone Block");
        LangJSONWriter.writeTranslationKey("block.gravelmon.air_stone_block","Air Stone Block");

        //evolution items
        LangJSONWriter.writeTranslationKey("item.gravelmon.astral_stone","Astral Stone");
        LangJSONWriter.writeTranslationKey("item.gravelmon.varia_stone","Varia Stone");
        LangJSONWriter.writeTranslationKey("item.gravelmon.air_stone","Air Stone");
        LangJSONWriter.writeTranslationKey("item.gravelmon.mystic_stone","Mystic Stone");
        LangJSONWriter.writeTranslationKey("item.gravelmon.solid_stone","Solid Stone");
        LangJSONWriter.writeTranslationKey("item.gravelmon.xenolith","Xenolith");
        LangJSONWriter.writeTranslationKey("item.gravelmon.ancient_glyph","Ancient Glyph");
        LangJSONWriter.writeTranslationKey("item.gravelmon.quantum_upgrade","Quantum Upgrade");
        LangJSONWriter.writeTranslationKey("item.gravelmon.wes_update","WES Update");
        LangJSONWriter.writeTranslationKey("item.gravelmon.silver_scale","Silver Scale");
        LangJSONWriter.writeTranslationKey("item.gravelmon.murky_claw","Murky Claw");
        LangJSONWriter.writeTranslationKey("item.gravelmon.corrupted_disc","Corrupted Disc");
        LangJSONWriter.writeTranslationKey("item.gravelmon.kaleidoscope","Kaleidoscope");
        LangJSONWriter.writeTranslationKey("item.gravelmon.long_club","Long Club");
        LangJSONWriter.writeTranslationKey("item.gravelmon.terrestrial_ring","Terrestrial Ring");
        LangJSONWriter.writeTranslationKey("item.gravelmon.xenoversal_ring","Xenoversal Ring");
        LangJSONWriter.writeTranslationKey("item.gravelmon.inductive_ring","Inductive Ring");
        LangJSONWriter.writeTranslationKey("item.gravelmon.slowpoke_tail","Slowpoke Tail");
        LangJSONWriter.writeTranslationKey("item.gravelmon.magic_cookie","Magic Cookie");
        LangJSONWriter.writeTranslationKey("item.gravelmon.dread_pendant","Dread Pendant");
        LangJSONWriter.writeTranslationKey("item.gravelmon.golden_feather","Golden Feather");
        LangJSONWriter.writeTranslationKey("item.gravelmon.pixie_dust","Pixie Dust");
        LangJSONWriter.writeTranslationKey("item.gravelmon.ocarina","Ocarina");
        LangJSONWriter.writeTranslationKey("item.gravelmon.royal_jelly","Royal Jelly");
        LangJSONWriter.writeTranslationKey("item.gravelmon.coconut_milk","Coconut Milk");
        LangJSONWriter.writeTranslationKey("item.gravelmon.carrot_wine","Carrot Wine");
        LangJSONWriter.writeTranslationKey("item.gravelmon.uranium_core","Uranium Core");
        LangJSONWriter.writeTranslationKey("item.gravelmon.preadite","Preadite");
        LangJSONWriter.writeTranslationKey("item.gravelmon.empty_skull","Empty Skull");
        LangJSONWriter.writeTranslationKey("item.gravelmon.foreign_hat","Foreign Hat");
        LangJSONWriter.writeTranslationKey("item.gravelmon.prim_shears","Prim Shears");
        LangJSONWriter.writeTranslationKey("item.gravelmon.hair_tonic","Hair Tonic");
        LangJSONWriter.writeTranslationKey("item.gravelmon.growth_mulch","Growth Mulch");
        LangJSONWriter.writeTranslationKey("item.gravelmon.x_ray_specs","X Ray Specs");
        LangJSONWriter.writeTranslationKey("item.gravelmon.foul_rock","Foul Rock");
        LangJSONWriter.writeTranslationKey("item.gravelmon.ragged_pebble","Ragged Pebble");
        LangJSONWriter.writeTranslationKey("item.gravelmon.polished_sphere","Polished Sphere");
        LangJSONWriter.writeTranslationKey("item.gravelmon.corrupted_seed","Corrupted Seed");
        LangJSONWriter.writeTranslationKey("item.gravelmon.iveolite","Iveolite");
        LangJSONWriter.writeTranslationKey("item.gravelmon.bolt_orb","Bolt Orb");
        LangJSONWriter.writeTranslationKey("item.gravelmon.ice_shard","Ice Shard");
        LangJSONWriter.writeTranslationKey("item.gravelmon.hafli_berry","Hafli Berry");
        LangJSONWriter.writeTranslationKey("item.gravelmon.moss_shard","Moss Shard");
        LangJSONWriter.writeTranslationKey("item.gravelmon.pretty_ribbon","Pretty Ribbon");
        LangJSONWriter.writeTranslationKey("item.gravelmon.dark_rock","Dark Rock");
        LangJSONWriter.writeTranslationKey("item.gravelmon.spare_parts","Spare Parts");
        LangJSONWriter.writeTranslationKey("item.gravelmon.orange_apricorn","Orange Apricorn");
        LangJSONWriter.writeTranslationKey("item.gravelmon.purple_apricorn","Purple Apricorn");
        LangJSONWriter.writeTranslationKey("item.gravelmon.purple_apricorn_sapling","Purple Apricorn Sprout");
        LangJSONWriter.writeTranslationKey("block.gravelmon.purple_apricorn_sapling","Purple Apricorn Sprout");
        LangJSONWriter.writeTranslationKey("item.gravelmon.orange_apricorn_sapling","Orange Apricorn Sprout");
        LangJSONWriter.writeTranslationKey("block.gravelmon.orange_apricorn_sapling","Orange Apricorn Sprout");

        LangJSONWriter.writeTranslationKey("item.gravelmon.mauve_ball","Mauve Ball");
        LangJSONWriter.writeTranslationKey("item.gravelmon.ancient_ball","Ancient Ball");
        LangJSONWriter.writeTranslationKey("item.gravelmon.shiny_ball","Shiny Ball");
        LangJSONWriter.writeTranslationKey("item.gravelmon.nuzlocke_ball","Nuzlocke Ball");
        LangJSONWriter.writeTranslationKey("item.gravelmon.snore_ball","Snore Ball");
        LangJSONWriter.writeTranslationKey("item.gravelmon.ark_ball","Ark Ball");
        LangJSONWriter.writeTranslationKey("item.gravelmon.xeno_ball","Xeno Ball");
        LangJSONWriter.writeTranslationKey("item.gravelmon.ancient_mauve_ball","Ancient Mauve Ball");
        LangJSONWriter.writeTranslationKey("item.gravelmon.ancient_coral_ball","Ancient Coral Ball");
        LangJSONWriter.writeTranslationKey("item.gravelmon.rocket_ball","Rocket Ball");
        LangJSONWriter.writeTranslationKey("item.gravelmon.ultra_rocket_ball","Ultra Rocket Ball");
        LangJSONWriter.writeTranslationKey("item.gravelmon.lake_ball","Lake Ball");
        LangJSONWriter.writeTranslationKey("item.gravelmon.anime_safari_ball","Anime Safari Ball");
        LangJSONWriter.writeTranslationKey("item.gravelmon.annie_ball","Annie Ball");
        LangJSONWriter.writeTranslationKey("item.gravelmon.oakley_ball","Oakley Ball");
        LangJSONWriter.writeTranslationKey("item.gravelmon.fishing_ball","Fishing Ball");
        LangJSONWriter.writeTranslationKey("item.gravelmon.anime_gs_ball","Anime GS Ball");
        LangJSONWriter.writeTranslationKey("item.gravelmon.manga_safari_ball","Manga Safari Ball");
        LangJSONWriter.writeTranslationKey("item.gravelmon.great_rocket_ball","Great Rocket Ball");
        LangJSONWriter.writeTranslationKey("item.gravelmon.gay_ball","Gay Ball");
        LangJSONWriter.writeTranslationKey("item.gravelmon.lesbian_ball","Lesbian Ball");
        LangJSONWriter.writeTranslationKey("item.gravelmon.bi_ball","Bi Ball");
        LangJSONWriter.writeTranslationKey("item.gravelmon.pan_ball","Pan Ball");
        LangJSONWriter.writeTranslationKey("item.gravelmon.trans_ball","Trans Ball");
        LangJSONWriter.writeTranslationKey("item.gravelmon.non_binary_ball","Non Binary Ball");
        LangJSONWriter.writeTranslationKey("item.gravelmon.ace_ball","Ace Ball");
        LangJSONWriter.writeTranslationKey("item.gravelmon.aro_ball","Aro Ball");
        LangJSONWriter.writeTranslationKey("item.gravelmon.coral_ball","Coral Ball");
        LangJSONWriter.writeTranslationKey("item.gravelmon.lime_ball","Lime Ball");
        LangJSONWriter.writeTranslationKey("item.gravelmon.luster_ball","Luster Ball");
        LangJSONWriter.writeTranslationKey("item.gravelmon.sun_ball","Sun Ball");
        LangJSONWriter.writeTranslationKey("item.gravelmon.dawn_ball","Dawn Ball");
        LangJSONWriter.writeTranslationKey("item.gravelmon.feather_ball","Feather Ball");
        LangJSONWriter.writeTranslationKey("item.gravelmon.nuclear_ball","Nuclear Ball");
        LangJSONWriter.writeTranslationKey("item.gravelmon.atom_ball","Atom Ball");
        LangJSONWriter.writeTranslationKey("item.gravelmon.delta_ball","Delta Ball");
        LangJSONWriter.writeTranslationKey("item.gravelmon.gen2_lure_ball","Gen 2 Lure Ball");
        LangJSONWriter.writeTranslationKey("item.gravelmon.gs_ball","GS Ball");
        LangJSONWriter.writeTranslationKey("item.gravelmon.typing_ball","Typing Ball");

        addTooltips();

        Gravelmon.FOSSIL_MAP.keySet().forEach(fossil->{
            LangJSONWriter.writeTranslationKey("item.gravelmon."+fossil, StringUtils.capitalize(fossil.replaceAll("_"," ")));
        });
        LangJSONWriter.writeTranslationKey("itemGroup.gravelmon.gravelmon_mega_stones_tab","Gravelmon Mega Stones");
        AbstractPokemon.MEGA_EVOLUTIONS.entrySet().forEach(set->{
            var pokemonId = set.getKey();
            var megaStoneBaseName = MegaStoneNameGenerator.generateMegaStoneName(pokemonId);
            for(var mega:set.getValue()){
                String megaStoneName = mega.getMegaStoneName(megaStoneBaseName);
                LangJSONWriter.writeTranslationKey("item.gravelmon."+ megaStoneName, StringUtils.capitalize(megaStoneName.replaceAll("_"," ")));
            }
        });

        //Starters
        LangJSONWriter.writeTranslationKey("cobblemon.starterselection.category.ayreikanto","Ayrei - Kanto");
        LangJSONWriter.writeTranslationKey("cobblemon.starterselection.category.eghokanto","Egho - Kanto");
        LangJSONWriter.writeTranslationKey("cobblemon.starterselection.category.ayreijohto","Ayrei - Johto");
        LangJSONWriter.writeTranslationKey("cobblemon.starterselection.category.eghojohto","Egho - Johto");
        LangJSONWriter.writeTranslationKey("cobblemon.starterselection.category.torren","Torren");
        LangJSONWriter.writeTranslationKey("cobblemon.starterselection.category.postcatastrophe","Hoenn - Post Catastrophe");
        LangJSONWriter.writeTranslationKey("cobblemon.starterselection.category.zakos","Zakos");
        LangJSONWriter.writeTranslationKey("cobblemon.starterselection.category.theeternalforest","Eternal Forest");
        LangJSONWriter.writeTranslationKey("cobblemon.starterselection.category.altera","Altera");
        LangJSONWriter.writeTranslationKey("cobblemon.starterselection.category.egho","Egho");
        LangJSONWriter.writeTranslationKey("cobblemon.starterselection.category.kaskade","Kaskade");
        LangJSONWriter.writeTranslationKey("cobblemon.starterselection.category.iberia","Iberia");
        LangJSONWriter.writeTranslationKey("cobblemon.starterselection.category.cefiran","Cefiran");
        LangJSONWriter.writeTranslationKey("cobblemon.starterselection.category.esoteria","Esoteria");
        LangJSONWriter.writeTranslationKey("cobblemon.starterselection.category.urobos","Urobos");
        LangJSONWriter.writeTranslationKey("cobblemon.starterselection.category.vereshad","Vereshad");
        LangJSONWriter.writeTranslationKey("cobblemon.starterselection.category.eldiw","Eldiw");
        LangJSONWriter.writeTranslationKey("cobblemon.starterselection.category.xenoverse","Xenoverse");
        LangJSONWriter.writeTranslationKey("cobblemon.starterselection.category.signet","Signet");
        LangJSONWriter.writeTranslationKey("cobblemon.starterselection.category.rica","Rica");
        LangJSONWriter.writeTranslationKey("cobblemon.starterselection.category.ferroa","Ferroa");
        LangJSONWriter.writeTranslationKey("cobblemon.starterselection.category.enriko","Enriko");
        LangJSONWriter.writeTranslationKey("cobblemon.starterselection.category.tandor","Tandor");
        LangJSONWriter.writeTranslationKey("cobblemon.starterselection.category.hiza","Hiza");
        LangJSONWriter.writeTranslationKey("cobblemon.starterselection.category.junnin","Junnin");
        LangJSONWriter.writeTranslationKey("cobblemon.starterselection.category.nosto","Nosto");
        LangJSONWriter.writeTranslationKey("cobblemon.starterselection.category.qamor","Qamor");
        LangJSONWriter.writeTranslationKey("cobblemon.starterselection.category.isiah","Isiah");
        LangJSONWriter.writeTranslationKey("cobblemon.starterselection.category.midamis","Midamis");
        LangJSONWriter.writeTranslationKey("cobblemon.starterselection.category.novrai","Novrai");
        LangJSONWriter.writeTranslationKey("cobblemon.starterselection.category.atlas","Atlas");
        LangJSONWriter.writeTranslationKey("cobblemon.starterselection.category.fliga","Fliga");
        LangJSONWriter.writeTranslationKey("cobblemon.starterselection.category.orohnhavai","Orohn-Havai");
        LangJSONWriter.writeTranslationKey("cobblemon.starterselection.category.kuria","Kuria");
        LangJSONWriter.writeTranslationKey("cobblemon.starterselection.category.amavi","Amavi");
        LangJSONWriter.writeTranslationKey("cobblemon.starterselection.category.mythire","Mythire");
        LangJSONWriter.writeTranslationKey("cobblemon.starterselection.category.interregional","Interregional");
        LangJSONWriter.writeTranslationKey("cobblemon.starterselection.category.lagoone","Lagoone");
        LangJSONWriter.writeTranslationKey("cobblemon.starterselection.category.norheim","Norheim");
        LangJSONWriter.writeTranslationKey("cobblemon.starterselection.category.oceane","Oceane");
        LangJSONWriter.writeTranslationKey("cobblemon.species.eppv11.name","EPP_v1.1");
    }

    private static void addTooltips() {
    LangJSONWriter.writeTranslationKey("item.gravelmon.coral_ball.tooltip", "1× catch rate");
    LangJSONWriter.writeTranslationKey("item.gravelmon.mauve_ball.tooltip", "1× catch rate");
    LangJSONWriter.writeTranslationKey("item.gravelmon.ancient_coral_ball.tooltip", "1× catch rate");
    LangJSONWriter.writeTranslationKey("item.gravelmon.ancient_mauve_ball.tooltip", "1× catch rate");
    LangJSONWriter.writeTranslationKey("item.gravelmon.luster_ball.tooltip", "1× catch rate, makes the caught Pokemon Shiny");
    LangJSONWriter.writeTranslationKey("item.gravelmon.dawn_ball.tooltip", "3× during the morning and day");
    LangJSONWriter.writeTranslationKey("item.gravelmon.sun_ball.tooltip", "5× on Fire-types, Cosmic-types and Light-types");
    LangJSONWriter.writeTranslationKey("item.gravelmon.feather_ball.tooltip", "1× to 4×, decreased by the target's weight");
    LangJSONWriter.writeTranslationKey("item.gravelmon.typing_ball.tooltip", "1× to 4×, increased by the length of the target's name");
    LangJSONWriter.writeTranslationKey("item.gravelmon.rocket_ball.tooltip", "1× catch rate");
    LangJSONWriter.writeTranslationKey("item.gravelmon.great_rocket_ball.tooltip", "1.5× catch rate");
    LangJSONWriter.writeTranslationKey("item.gravelmon.ultra_rocket_ball.tooltip", "2× catch rate");
    LangJSONWriter.writeTranslationKey("item.gravelmon.nuclear_ball.tooltip", "3× on Nuclear-types");
    LangJSONWriter.writeTranslationKey("item.gravelmon.atom_ball.tooltip", "5× on Nuclear-types");
    LangJSONWriter.writeTranslationKey("item.gravelmon.delta_ball.tooltip", "4× on Delta Pokemon");
    LangJSONWriter.writeTranslationKey("item.gravelmon.ancient_ball.tooltip", "8× on Legendary and Mythical Pokemon");
    LangJSONWriter.writeTranslationKey("item.gravelmon.shiny_ball.tooltip", "Guaranteed to catch shiny Pokemon, 1× catch rate on normal Pokemon");
    LangJSONWriter.writeTranslationKey("item.gravelmon.nuzlocke_ball.tooltip1", "2.5× catch rate");
    LangJSONWriter.writeTranslationKey("item.gravelmon.nuzlocke_ball.tooltip2", "RELEASES YOUR POKEMON WHEN THEY FAINT");
    LangJSONWriter.writeTranslationKey("item.gravelmon.snore_ball.tooltip", "5× catch rate if the Pokemon is asleep");
    LangJSONWriter.writeTranslationKey("item.gravelmon.ark_ball.tooltip", "Guaranteed capture");
    LangJSONWriter.writeTranslationKey("item.gravelmon.lime_ball.tooltip", "1.5× catch rate");
    LangJSONWriter.writeTranslationKey("item.gravelmon.lake_ball.tooltip", "3× on Pokémon submerged in water");
    LangJSONWriter.writeTranslationKey("item.gravelmon.anime_safari_ball.tooltip", "1.5× outside of battle");
    LangJSONWriter.writeTranslationKey("item.gravelmon.manga_safari_ball.tooltip", "1.5× outside of battle");
    LangJSONWriter.writeTranslationKey("item.gravelmon.annie_ball.tooltip", "1× catch rate");
    LangJSONWriter.writeTranslationKey("item.gravelmon.oakley_ball.tooltip", "1× catch rate");
    LangJSONWriter.writeTranslationKey("item.gravelmon.fishing_ball.tooltip", "1.5× on Pokémon submerged in water");
    LangJSONWriter.writeTranslationKey("item.gravelmon.gs_ball.tooltip", "1× catch rate");
    LangJSONWriter.writeTranslationKey("item.gravelmon.anime_gs_ball.tooltip", "1× catch rate");
    LangJSONWriter.writeTranslationKey("item.gravelmon.gen2_lure_ball.tooltip", "2× on Water-types, until fishing is added");
    LangJSONWriter.writeTranslationKey("item.gravelmon.xeno_ball.tooltip", "2× on X Species, 1× otherwise");
    LangJSONWriter.writeTranslationKey("item.gravelmon.gay_ball.tooltip", "5× if the Pokemon is the same gender");
    LangJSONWriter.writeTranslationKey("item.gravelmon.lesbian_ball.tooltip", "5× if the Pokemon is the same gender");
    LangJSONWriter.writeTranslationKey("item.gravelmon.bi_ball.tooltip", "2.5× if the Pokemon is the same species");
    LangJSONWriter.writeTranslationKey("item.gravelmon.pan_ball.tooltip", "2× if the Pokemon isn't the same species");
    LangJSONWriter.writeTranslationKey("item.gravelmon.trans_ball.tooltip", "2× catch rate");
    LangJSONWriter.writeTranslationKey("item.gravelmon.non_binary_ball.tooltip", "3× if the Pokemon has no gender");
    LangJSONWriter.writeTranslationKey("item.gravelmon.ace_ball.tooltip", "2.5× if the Pokemon cannot be bred");
    LangJSONWriter.writeTranslationKey("item.gravelmon.aro_ball.tooltip", "2.5× if the Pokemon cannot be bred");
    }
}
