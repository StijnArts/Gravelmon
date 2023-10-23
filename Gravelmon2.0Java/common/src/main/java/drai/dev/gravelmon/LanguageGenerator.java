package drai.dev.gravelmon;

import drai.dev.gravelmon.jsonwriters.*;
import drai.dev.gravelmon.registries.*;

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
        LangJSONWriter.writeTranslationKey("block.gravelmon.xenolith","Xenolith");
        LangJSONWriter.writeTranslationKey("block.gravelmon.dread_pendant","Dread Pendant");

        //evolution items
        LangJSONWriter.writeTranslationKey("item.gravelmon.astral_stone","Astral Stone");
        LangJSONWriter.writeTranslationKey("item.gravelmon.varia_stone","Varia Stone");
        LangJSONWriter.writeTranslationKey("item.gravelmon.air_stone","Air Stone");
        LangJSONWriter.writeTranslationKey("item.gravelmon.mystic_stone","Mystic Stone");
        LangJSONWriter.writeTranslationKey("item.gravelmon.solid_stone","Solid Stone");
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
        LangJSONWriter.writeTranslationKey("item.gravelmon.spare_parts","Spare Parts");
    }
}
