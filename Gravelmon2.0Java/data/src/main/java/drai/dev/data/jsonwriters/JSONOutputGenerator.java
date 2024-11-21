package drai.dev.data.jsonwriters;

import com.cobblemon.mod.common.api.pokedex.entry.*;
import drai.dev.data.games.registry.*;
import drai.dev.data.jsonwriters.assets.*;
import drai.dev.data.jsonwriters.data.*;

import static drai.dev.data.jsonwriters.assets.LanguageGenerator.generateLangFile;

public class JSONOutputGenerator {
    public static void generate(String resourcesDir) {
        GameRegistry.games.forEach(Game::init);
        SpeciesAdditionsWriter.writeAdditions(resourcesDir);
        PokedexEntryAdditionsWriter.writeAdditions(resourcesDir);
        AdditionalFormAssetsJSONWriter.writeSpecies(resourcesDir);
        AdditionSpawnPoolWorldJSONWriter.writeSpawns(resourcesDir);
        FossilJSONWriter.writeFossils(resourcesDir);
        PokeBallEffectWriter.writeEffects(resourcesDir);
        generateLangFile();
        for(Game game : GameRegistry.games){
            generateJsonFiles(game,resourcesDir);
            PokeDexWriter.write(game, resourcesDir);
            PokeDexAdditionsWriter.write(game, resourcesDir);
        }
        //LangJSONWriter.writePlaceholder();
        //SpeciesDataJSONWriter.writePlaceholder(resourcesDir);
        //Additional Forms
        LangJSONWriter.finalizeLang(resourcesDir);
        PokeDexWriter.finalizeDexes(resourcesDir);
        SpeciesFeaturesJSONWriter.writeFeatures(resourcesDir);
    }

    private static void generateJsonFiles(Game game,String resourcesDir) {
        SpeciesDataJSONWriter.writeSpecies(game,resourcesDir);
        SpeciesAssetsJSONWriter.writeSpecies(game,resourcesDir);
        SpawnPoolWorldJSONWriter.writeSpawns(game,resourcesDir);
        PoserJSONWriter.writeSpecies(game,resourcesDir);
        LangJSONWriter.writeLang(game,resourcesDir);
        PokeDexEntryWriter.write(game, resourcesDir);
    }
}
