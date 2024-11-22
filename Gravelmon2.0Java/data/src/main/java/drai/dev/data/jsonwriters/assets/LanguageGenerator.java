package drai.dev.data.jsonwriters.assets;

import drai.dev.gravelmon.*;
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
        LangJSONWriter.writeTranslationKey("item.gravelmon.orange_apricorn","Orange Apricorn");
        LangJSONWriter.writeTranslationKey("item.gravelmon.purple_apricorn","Purple Apricorn");
        Gravelmon.FOSSIL_MAP.keySet().forEach(fossil->{
            LangJSONWriter.writeTranslationKey("item.gravelmon."+fossil, StringUtils.capitalize(fossil.replaceAll("_"," ")));
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
}
