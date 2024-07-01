package drai.dev.gravelmon.jsonwriters;

import drai.dev.gravelmon.games.registry.*;

public class JSONOutputGenerator {
    public static void generate(String resourcesDir) {
        GameRegistry.games.forEach(game -> game.init());
        SpeciesAdditionsWriter.writeAdditions(resourcesDir);
        AdditionalFormAssetsJSONWriter.writeSpecies(resourcesDir);
        AdditionSpawnPoolWorldJSONWriter.writeSpawns(resourcesDir);
        for(Game game : GameRegistry.games){
            generateJsonFiles(game,resourcesDir);
        }
        //LangJSONWriter.writePlaceholder();
        //SpeciesDataJSONWriter.writePlaceholder(resourcesDir);
        //Additional Forms
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
