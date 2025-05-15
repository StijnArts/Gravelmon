package drai.dev.data;

import drai.dev.data.games.registry.*;
import drai.dev.data.item.*;
import drai.dev.data.jsonwriters.assets.*;
import drai.dev.data.jsonwriters.data.*;
import drai.dev.data.pokemon.*;
import drai.dev.data.util.*;
import drai.dev.gravelmon.mega.*;

import static drai.dev.data.jsonwriters.assets.LanguageGenerator.*;

public class JSONOutputGenerator {
    public static void generate(String resourcesDir) {
        GameRegistry.games.forEach(game -> {
            game.init(resourcesDir);
            game.getNewPokemon().forEach(pokemon -> pokemon.processAssets(resourcesDir));
        });
        GravelmonMegas.MEGA_EVOLUTIONS.forEach((name, megaEvolutions) -> {
            var baseStoneName = MegaStoneNameGenerator.generateMegaStoneName(name);
            megaEvolutions.forEach(megaEvolution -> {
                megaEvolution.processPokemonAssets(resourcesDir);
                PokeDexEntryWriter.writeMega(megaEvolution, resourcesDir);
                MegaStoneGenerator.createMegaStoneTexture(resourcesDir, baseStoneName, megaEvolution);
            });
        });
        ArmoredForm.ARMORED_FORMS.forEach((name, form) -> {
           form.processPokemonAssets(resourcesDir);
        });
        LangJSONWriter.writeStarterCategories();
        generateLangFile();
        for(Game game : GameRegistry.games){
            generateJsonFiles(game,resourcesDir);
            PokeDexWriter.write(game, resourcesDir);
            PokeDexAdditionsWriter.write(game, resourcesDir);
        }
        SpeciesAdditionsWriter.writeAdditions(resourcesDir);
        PokedexEntryAdditionsWriter.writeAdditions(resourcesDir);
        AdditionalFormAssetsJSONWriter.writeSpecies(resourcesDir);
        AdditionSpawnPoolWorldJSONWriter.writeSpawns(resourcesDir);
        FossilJSONWriter.writeFossils(resourcesDir);
        PokeBallEffectWriter.writeEffects(resourcesDir);

        PoserJSONWriter.writeStandardizedForms(resourcesDir);
        PoserJSONWriter.writeStandardizedForms(resourcesDir);
        LangJSONWriter.writeMegas();
        LangJSONWriter.writeArmored();
        //Additional Forms
        LangJSONWriter.finalizeLang(resourcesDir);
        PokeDexWriter.finalizeDexes(resourcesDir);
        SpeciesFeaturesJSONWriter.writeFeatures(resourcesDir);

        if(false){
            ExcelExporter.exportPokemonData(GameRegistry.games, "Gravelmon Fakemon Data",true);
        }
        ExcelExporter.exportPokemonData(GameRegistry.games, "Gravelmon Password Fakemon Data",false);

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
