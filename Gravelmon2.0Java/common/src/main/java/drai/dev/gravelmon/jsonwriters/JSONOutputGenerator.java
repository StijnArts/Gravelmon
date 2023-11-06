package drai.dev.gravelmon.jsonwriters;

import drai.dev.gravelmon.games.registry.*;

public class JSONOutputGenerator {
    public static void generate(String resourcesDir) {
        for(Game game : GameRegistry.games){
            generateJsonFiles(game,resourcesDir);
        }
        //LangJSONWriter.writePlaceholder();
        //SpeciesDataJSONWriter.writePlaceholder(resourcesDir);
        LangJSONWriter.finalizeLang(resourcesDir);
        SpeciesFeaturesJSONWriter.writeFeatures(resourcesDir);
    }

    private static void generateJsonFiles(Game game,String resourcesDir) {
        SpeciesDataJSONWriter.writeSpecies(game,resourcesDir);
        SpeciesAssetsJSONWriter.writeSpecies(game,resourcesDir);
        SpawnPoolWorldJSONWriter.writeSpawns(game,resourcesDir);
        PoserJSONWriter.writeSpecies(game,resourcesDir);
        LangJSONWriter.writeLang(game,resourcesDir);
    }
}
