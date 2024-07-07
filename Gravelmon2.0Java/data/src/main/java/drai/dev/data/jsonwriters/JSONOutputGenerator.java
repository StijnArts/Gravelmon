package drai.dev.data.jsonwriters;

import drai.dev.data.games.registry.*;

import static drai.dev.data.jsonwriters.LanguageGenerator.generateLangFile;

public class JSONOutputGenerator {
    public static void generate(String resourcesDir) {
        GameRegistry.games.forEach(Game::init);
        SpeciesAdditionsWriter.writeAdditions(resourcesDir);
        AdditionalFormAssetsJSONWriter.writeSpecies(resourcesDir);
        AdditionSpawnPoolWorldJSONWriter.writeSpawns(resourcesDir);
        FossilJSONWriter.writeFossils(resourcesDir);
        PokeBallEffectWriter.writeEffects(resourcesDir);
        generateLangFile();
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
