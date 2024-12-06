package drai.dev.data.jsonwriters.data;

import com.google.gson.*;
import drai.dev.data.attributes.*;
import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.*;
import java.util.*;

import drai.dev.data.util.*;
import drai.dev.gravelmon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import org.apache.commons.lang3.*;

import java.io.*;
import java.nio.file.*;

public class SpeciesDataJSONWriter {
    private static String RESOURCES_DIR;
    public static void writeSpecies(Game game, String resourcesDir) {
        RESOURCES_DIR = resourcesDir;
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        game.getNewPokemon().forEach(pokemon -> {
            if (!Pokemon.isAnAdditionalForm(pokemon)) {
                try {
                    var dir = resourcesDir + "\\data\\cobblemon\\species\\" + game.getName().toLowerCase() + "\\";
                    Files.createDirectories(new File(dir).toPath());
                    writePokemon(pokemon, dir, gson);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    private static void writePokemon(Pokemon pokemon, String dir, Gson gson) throws IOException {
        if (pokemon.getPrimaryType() == null) {
            System.out.println(pokemon.getName());
        }
        var fileContents = pokemonJsonObject(pokemon);
        fileContents.addProperty("nationalPokedexNumber", pokemon.getPokedexNumber());
        fileContents.addProperty("shoulderMountable", pokemon.isShoulderMountable());
        if (pokemon.getShoulderMountEffect() != null) {
            var shoulderMountEffects = new JsonArray();
            shoulderMountEffects.add(pokemon.getShoulderMountEffect());
            fileContents.add("shoulderEffects", shoulderMountEffects);
        }
        fileContents.add("behaviour", getBehaviour(pokemon));
        fileContents.add("hitbox", getHitbox(pokemon.getHitboxWidth(), pokemon.getHitboxHeight()));
        fileContents.add("features", getFeatures(pokemon.getForms()));
        fileContents.addProperty("implemented", true);
        var forms = getForms(pokemon.getForms());
        fileContents.add("forms", forms);

        BufferedWriter writer = new BufferedWriter(new FileWriter(dir + pokemon.getCleanName() + ".json"));
        writer.write(gson.toJson(fileContents));
        writer.close();
    }

    private static JsonObject pokemonJsonObject(AbstractPokemon abstractPokemon) {
        var fileContents = new JsonObject();
        String aspect = null;
        if(abstractPokemon instanceof Pokemon pokemon && AbstractPokemon.isAnAdditionalForm(pokemon)){
            aspect = getAccurateAspect(RESOURCES_DIR, pokemon);
        }
        var name = (aspect == null ? StringUtils.capitalize(abstractPokemon.getCleanName()): StringUtils.capitalize(aspect));
        fileContents.addProperty("name", name);
        fileContents.addProperty("primaryType", abstractPokemon.getPrimaryType().getName());
        if (abstractPokemon.getSecondaryType() != null) {
            fileContents.addProperty("secondaryType", abstractPokemon.getSecondaryType().getName());
        }
        fileContents.addProperty("catchRate", abstractPokemon.getCatchRate());
        fileContents.addProperty("maleRatio", abstractPokemon.getMaleRatio());
        fileContents.addProperty("baseExperienceYield", abstractPokemon.getBaseExperienceYield());
        fileContents.addProperty("experienceGroup", abstractPokemon.getExperienceGroup().getName());
        fileContents.addProperty("eggCycles", abstractPokemon.getEggCycles());
        fileContents.addProperty("baseFriendship", abstractPokemon.getBaseFriendship());
        if (abstractPokemon.getPreEvolution() != null) {
            fileContents.addProperty("preEvolution", abstractPokemon.getPreEvolution());
        }
        fileContents.addProperty("baseScale", abstractPokemon.getBaseScale());
        fileContents.addProperty("cannotDynamax", abstractPokemon.getCannotDynamax());
        fileContents.add("abilities", getAbilities(abstractPokemon));
        fileContents.add("baseStats", abstractPokemon.getStats().getJsonRepresentation());
        fileContents.add("evYield", abstractPokemon.getEvYield().getJsonRepresentation());
        fileContents.add("eggGroups", getEggGroups(abstractPokemon));
        fileContents.add("drops", getDrops(abstractPokemon.getDropAmount(), abstractPokemon.getDrops()));
        fileContents.add("moves", getMoves(abstractPokemon.getLearnSet()));
        fileContents.add("labels", getLabels(abstractPokemon.getLabels()));
        fileContents.add("pokedex", getPokedexEntries(abstractPokemon.getDexEntries(), abstractPokemon.getCleanName()));
        fileContents.addProperty("height", abstractPokemon.getHeight());
        fileContents.addProperty("weight", abstractPokemon.getWeight());
        fileContents.add("aspects", getAspects(abstractPokemon.getAspects(), aspect));
        fileContents.add("evolutions", getEvolutions(abstractPokemon.getEvolutions(), abstractPokemon.getCleanName()));

        return fileContents;
    }

    public static <T extends AbstractPokemon> JsonElement getFeatures(List<T> forms) {
        var features = new JsonArray();
        for (var form : forms) {
            if(form instanceof Pokemon pokemon&& AbstractPokemon.isAnAdditionalForm(pokemon)){
                var aspect = getAccurateAspect(RESOURCES_DIR, pokemon);
                features.add(aspect);
                continue;
            }
            features.add(form.getCleanName());
        }
        return features;
    }

    private static JsonElement getAspects(List<Aspect> aspectList, String additionalSpeciesAspect) {
        var aspects = new JsonArray();
        if(additionalSpeciesAspect != null) {
            aspects.add(additionalSpeciesAspect);
            return aspects;
        }

        for (var aspect : aspectList) {
            aspects.add(GravelmonUtils.getCleanName(aspect.getName()));
        }
        return aspects;
    }

    private static JsonElement getHitbox(double hitboxWidth, double hitboxHeight) {
        var hitbox = new JsonObject();
        hitbox.addProperty("width", hitboxWidth);
        hitbox.addProperty("height", hitboxHeight);
        hitbox.addProperty("fixed", false);
        return hitbox;
    }

    private static JsonElement getPokedexEntries(List<String> entries, String cleanName) {
        var pokedex = new JsonArray();
        int dexEntryCounter = 1;
        for (int i = 0; i < entries.size(); i++) {

            pokedex.add("cobblemon.species." + cleanName + ".desc" + dexEntryCounter);
        }
        return pokedex;
    }

    private static JsonElement getLabels(List<Label> labelList) {
        var labels = new JsonArray();
        labelList.forEach(label -> labels.add(label.getName()));
        return labels;
    }

    public static JsonElement getDrops(int dropAmount, List<ItemDrop> dropList) {
        var drops = new JsonObject();
        if (!dropList.isEmpty()) {
            drops.addProperty("amount", dropAmount);
            var entries = new JsonArray();
            for (ItemDrop itemDrop : dropList) {
                var entry = new JsonObject();
                entries.add(entry);
                entry.addProperty("item", itemDrop.getItemId());
                entry.addProperty("quantityRange", itemDrop.getQuantityMin() + "-" + itemDrop.getQuantityMax());
                entry.addProperty("percentage", itemDrop.getChance());
            }
        }
        return drops;
    }

    private static JsonElement getEggGroups(AbstractPokemon pokemon) {
        var eggGroups = new JsonArray();
        for (EggGroup eggGroup : pokemon.getEggGroups()) {
            if (eggGroup.isImplemented()) {
                eggGroups.add(eggGroup.name().toLowerCase());
            } else {
                eggGroups.add(EggGroup.UNDISCOVERED.name().toLowerCase());
            }

        }
        return eggGroups;
    }

    public static <T extends AbstractPokemon> JsonArray getForms(List<T> formList) {
        var forms = new JsonArray();

        if (formList.size() > 0) {
            for (AbstractPokemon form : formList) {
                forms.add(generateForm(form));
            }
        }
        return forms;
    }

    private static String getAccurateAspect(String resourcesDir, Pokemon pokemon) {
        var aspect = pokemon.getAdditionalAspect().getName();
        var pokemonName = pokemon.getName();
        for (int i = 0; i < 20; i++) {
            String numberAsWord = EnglishNumberToWords.convert(i);
            if(pokemonName.endsWith(StringUtils.capitalize(numberAsWord.toLowerCase()))){
                aspect += EnglishNumberToWords.convert(i+1);
                try {
                    SpeciesFeaturesJSONWriter.writeFeature(aspect, resourcesDir);
                } catch (IOException e) {
                    System.out.println("oops");
                }
                return aspect;
            }
        }
        return aspect.replaceAll("_", "");
    }

    private static JsonObject getBehaviour(Pokemon pokemon) {
        var behaviour = new JsonObject();
        var resting = new JsonObject();
        resting.addProperty("canSleep", pokemon.canSleep());
        resting.addProperty("willSleepOnBed", pokemon.willSleepOnBed());
        resting.addProperty("depth", "normal");
        resting.addProperty("light", pokemon.getLightLevelMinSleep() + "-" + pokemon.getLightLevelMaxSleep());
        behaviour.add("resting", resting);
        var moving = new JsonObject();
        var fly = new JsonObject();
        fly.addProperty("canFly", pokemon.canFly());
        moving.add("fly", fly);
        moving.addProperty("canLook", pokemon.canLookAround());
        var walk = new JsonObject();
        walk.addProperty("canWalk", pokemon.canWalk());
        walk.addProperty("avoidsLand", pokemon.avoidsLand());
        moving.add("walk", walk);
        var swim = new JsonObject();
        swim.addProperty("swimSpeed", pokemon.getSwimSpeed());
        swim.addProperty("canSwimInWater", pokemon.canSwim());
        swim.addProperty("canBreatheUnderwater", pokemon.canBreathUnderwater());
        if (pokemon.getSpawnData().stream().anyMatch(data -> data.spawnContext() == SpawnContext.SURFACE))
            swim.addProperty("canWalkOnWater", true);
        moving.add("swim", swim);
        behaviour.add("moving", moving);
        return behaviour;
    }

    private static JsonArray getAbilities(AbstractPokemon pokemon) {
        var abilities = new JsonArray();
        int abilityCount = 0;
        for (Ability ability : pokemon.getAbilities()) {
            if (ability.isImplemented()) {
                abilities.add(ability.getName());
                abilityCount++;
            }
        }
        if (abilityCount == 0) {
            abilities.add(Ability.KEEN_EYE.getName());
        }
        if (pokemon.getHiddenAbility() != null && pokemon.getHiddenAbility().isImplemented()) {
            abilities.add("h:" + pokemon.getHiddenAbility().getName());
        }
        return abilities;
    }

    private static JsonElement getMoves(List<MoveLearnSetEntry> learnSetEntries) {
        var moves = new JsonArray();
        for (MoveLearnSetEntry moveLearnsetEntry : learnSetEntries) {
            var move = moveLearnsetEntry.getMove();
            var moveName = move.getName();
            if (move.isImplemented()) {
                moves.add(moveLearnsetEntry.getCondition() + ":" + moveName);
            }
        }
        return moves;
    }

    public static JsonArray getEvolutions(List<EvolutionEntry> evolutionEntries, String original) {
        var evolutions = new JsonArray();
        if (!evolutionEntries.isEmpty()) {
            for (EvolutionEntry evolution : evolutionEntries) {
                evolutions.add(getEvolutionJson(evolution, original));

            }
        }
        return evolutions;
    }

    private static JsonObject generateForm (AbstractPokemon form){
        var fileContents = pokemonJsonObject(form);
        if(form instanceof PokemonForm pokemonForm) {
            fileContents.addProperty("battleOnly", pokemonForm.isBattleOnly());
        } else if(form instanceof Pokemon pokemon){
            fileContents.addProperty("shoulderMountable", pokemon.isShoulderMountable());
            if (pokemon.getShoulderMountEffect() != null) {
                var shoulderMountEffects = new JsonArray();
                shoulderMountEffects.add(pokemon.getShoulderMountEffect());
                fileContents.add("shoulderEffects", shoulderMountEffects);
            }
            fileContents.add("behaviour", getBehaviour(pokemon));
            fileContents.add("hitbox", getHitbox(pokemon.getHitboxWidth(), pokemon.getHitboxHeight()));
        }
        return fileContents;
    }

    private static JsonElement getEvolutionJson(EvolutionEntry evolution, String original) {
        var evolutionJson = new JsonObject();
        evolutionJson.addProperty("id", original + "_" + GravelmonUtils.getCleanName(evolution.getResult()));
        evolutionJson.addProperty("variant", evolution.getKind().getName());
        StringBuilder aspects = new StringBuilder();
        if (!evolution.getAspects().isEmpty()) {
            for (Aspect aspect : evolution.getAspects()) {
                aspects.append(" ").append(aspect);
            }
        }
        evolutionJson.addProperty("result", evolution.getResult() + aspects);
        evolutionJson.addProperty("consumeHeldItem", evolution.consumesHeldItem());

        var learnableMoves = new JsonArray();
        evolutionJson.add("learnableMoves", learnableMoves);
        if (evolution.hasMoves()) {
            for (MoveLearnSetEntry moveLearnsetEntry : evolution.getMoves()) {
                if (moveLearnsetEntry.getMove().isImplemented()) {
                    learnableMoves.add(moveLearnsetEntry.getMove().getName());
                }
            }
        }

        var requirements = new JsonArray();
        evolutionJson.add("requirements", requirements);
        for (EvolutionRequirementEntry entry : evolution.getRequirements()) {
            var entryJson = new JsonObject();
            entryJson.addProperty("variant", entry.getRequirementKind());
            entryJson.addProperty(entry.getCondition(), entry.getConditionParameter());
            if (entry.getCondition().equals(EvolutionRequirementCondition.PARTY_MEMBER.getCondition()))
                entryJson.addProperty("contains", true);
            requirements.add(entryJson);
        }
        if (evolution.getRequiredContext() != null) {
            evolutionJson.addProperty("requiredContext", evolution.getRequiredContext());
        }
        evolutionJson.addProperty("permanent", true);

        return evolutionJson;
    }
}
