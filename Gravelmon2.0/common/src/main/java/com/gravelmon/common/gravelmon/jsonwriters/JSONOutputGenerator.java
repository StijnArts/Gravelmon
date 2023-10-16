package com.gravelmon.common.gravelmon.jsonwriters;

import com.gravelmon.common.gravelmon.games.*;

public class JSONOutputGenerator {
    public static void generate() {
        for(Game game : GameRegistry.games){
            generateJsonFiles(game);
        }
        com.gravelmon.common.gravelmon.jsonwriters.LangJSONWriter.writePlaceholder();
        com.gravelmon.common.gravelmon.jsonwriters.SpeciesDataJSONWriter.writePlaceholder();
        com.gravelmon.common.gravelmon.jsonwriters.LangJSONWriter.finalizeLang();
        com.gravelmon.common.gravelmon.jsonwriters.SpeciesFeaturesJSONWriter.writeFeatures();
    }

    private static void generateJsonFiles(Game game) {
        com.gravelmon.common.gravelmon.jsonwriters.SpeciesDataJSONWriter.writeSpecies(game);
        com.gravelmon.common.gravelmon.jsonwriters.SpeciesAssetsJSONWriter.writeSpecies(game);
        com.gravelmon.common.gravelmon.jsonwriters.SpawnPoolWorldJSONWriter.writeSpawns(game);
        com.gravelmon.common.gravelmon.jsonwriters.PoserJSONWriter.writeSpecies(game);
        com.gravelmon.common.gravelmon.jsonwriters.LangJSONWriter.writeLang(game);
    }
}
