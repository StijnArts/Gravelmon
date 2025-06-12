package drai.dev.data.pokemon;

import drai.dev.data.attributes.*;
import drai.dev.data.util.*;
import drai.dev.gravelmon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import org.apache.commons.lang3.*;
import org.jetbrains.annotations.*;
import org.reflections.*;

import java.lang.reflect.*;
import java.util.*;

import static drai.dev.data.jsonwriters.assets.AdditionalFormAssetsJSONWriter.numberWordToInt;
import static drai.dev.data.pokemon.AbstractPokemon.*;
import static drai.dev.data.pokemon.Pokemon.*;

public class PostRegistration {


    public static void postRegistration() {
        List<Pokemon> zeroStatPokemon = new ArrayList<>();
        List<Pokemon> pokemonWithNoPreferredBlocks = new ArrayList<>();
        var evaluatedMons = new ArrayList<>();
        StringBuilder pokemonWithZeroCatchrate = new StringBuilder("Pokemon with 0 catch-rate: \n");
        StringBuilder pokemonWithZeroBaseStats = new StringBuilder("Pokemon with 0 Base Stats: \n");
        StringBuilder pokemonWithMoreThanTwoSpawnPresets = new StringBuilder("Pokemon with more than 1 spawn preset: \n");
        var sortedPokemonList = POKEMON_REGISTRY.values().stream().sorted(Comparator.comparing(Pokemon::getPokedexNumber)).toList();
        for (var pokemon : sortedPokemonList) {
            if (pokemon.getCatchRate() == 0)
                pokemonWithZeroCatchrate.append(pokemon.getLabels().stream().findFirst().orElse(Label.MISSING).getName()).append(": ").append(pokemon.getCleanName()).append(",\n");
            for (var spawnData : pokemon.getSpawnData()) {
                if (spawnData.getSpawnPresets().size() > 1) {
                    pokemonWithMoreThanTwoSpawnPresets.append(pokemon.getLabels().stream().findFirst().orElse(Label.MISSING).getName()).append(": ").append(pokemon.getCleanName()).append(", being: ");
                    for (var preset : spawnData.getSpawnPresets()) {
                        pokemonWithMoreThanTwoSpawnPresets.append(preset).append(",");
                    }
                    pokemonWithMoreThanTwoSpawnPresets.append("\n");
                }
                if (spawnData.getPreferredBlocks().isEmpty()) {
                    pokemonWithNoPreferredBlocks.add(pokemon);
                }
            }

            if (pokemon.getEggGroups().isEmpty()) {
                pokemon.eggGroups = new ArrayList<>(pokemon.eggGroups);
                pokemon.eggGroups.add(EggGroup.FIELD);
            }
            if (pokemon.stats.isEmpty()) {
                zeroStatPokemon.add(pokemon);
            }

            for (EvolutionEntry evolutionEntry : pokemon.getEvolutions()) {
                Pokemon result = getPokemonById(evolutionEntry.getResult());
                if (result != null) {
                    if (evolutionEntry.getRequiredContext() != null) {
                        addItemAsDrop(pokemon, evolutionEntry.getRequiredContext(), result);
                    } else {
                        evolutionEntry.getRequirements().stream().filter(entry -> entry.getCondition().equals("itemCondition")).forEach(entry -> addItemAsDrop(pokemon, entry.getConditionParameter().replace("", ""), result));
                    }
                    if (result.getLangFileName() != null) {
                        if (result.getLangFileName().equalsIgnoreCase(pokemon.getName())) continue;
                        if (pokemon.getLangFileName() != null) {
                            if (result.getLangFileName().equalsIgnoreCase(pokemon.getLangFileName())) continue;
                        }
                    } else if (pokemon.getLangFileName() != null) {
                        if (pokemon.getLangFileName().equalsIgnoreCase(result.getName())) continue;
                    }

                    if (evaluatedMons.contains(result)) continue;
                    evaluatedMons.add(result);
                    if (result.getCleanName().equals(pokemon.getCleanName())) {
                        pokemonThatEvolveIntoThemselves += pokemon.getCleanName() + ",\n";
                    }

                    if (result.preEvolution != null && Pokemon.isAnAdditionalForm(pokemon)) {
                        continue;
                    }
                    if (!isBasedOnOriginalPokemon(pokemon)) {
                        result.getLabels().add(Label.FAKEMON);
                    }
                    result.setNormalizedPreEvolution(pokemon.getCleanName());
                    if (Pokemon.isAnAdditionalForm(pokemon)) {
                        var resultName = getKeysByValue(ADDITIONAL_FORMS, pokemon).stream().findFirst();
                        resultName.ifPresent(s -> result.setPreEvolution(s + " form=" + pokemon.getAdditionalAspect().name().toLowerCase()));
                    } else {
                        result.setPreEvolution(pokemon.getCleanName());
                    }
                }
            }
            var evaluatedForms = new ArrayList<>();
            for (PokemonForm form : pokemon.getForms()) {
                if (pokemon.getCatchRate() == 0)
                    pokemonWithZeroCatchrate.append(pokemon.getCleanName()).append(", Aspect: ").append(form.getAspects()).append(",\n");
                if (form.getStats().getTotal() == 0)
                    pokemonWithZeroBaseStats.append(form.getLabels().stream().findFirst().orElse(Label.MISSING).getName()).append(": ").append(pokemon.getCleanName()).append(", Aspect: ").append(form.getAspects()).append(",\n");
                for (EvolutionEntry evolutionEntry : form.getEvolutions()) {
                    String resultName = evolutionEntry.getResult();

                    PokemonForm result = POKEMON_REGISTRY.values().stream().filter(p -> p.getName().equalsIgnoreCase(resultName)).map(Pokemon::getForms).flatMap(List::stream).filter(pokemonForm -> new HashSet<>(pokemonForm.getAspects()).containsAll(evolutionEntry.getAspects())).findFirst().orElse(null);
                    if (result != null) {
                        if (evolutionEntry.getRequiredContext() != null) {
                            addItemAsDrop(form, evolutionEntry.getRequiredContext(), result);
                        } else {
                            evolutionEntry.getRequirements().stream().filter(entry -> entry.getCondition().equals("itemCondition")).forEach(entry -> addItemAsDrop(form, entry.getConditionParameter().replace("", ""), result));
                        }


                        if (evaluatedForms.contains(result)) continue;
                        evaluatedForms.add(result);
                        if (result.preEvolution != null) {
                            continue;
                        }
                        if (result.getCleanName().equals(pokemon.getCleanName())) {
                            pokemonThatEvolveIntoThemselves += pokemon.getCleanName() + ", Aspect: " + evolutionEntry.getAspects() + ",\n";
                        }
                        if (!isBasedOnOriginalPokemon(pokemon)) {
                            result.getLabels().add(Label.FAKEMON);
                        }
                        String aspect = evolutionEntry.getAspects().stream().findFirst().isEmpty() ? "" : " form=" + evolutionEntry.getAspects().stream().findFirst().get().name();
                        result.setPreEvolution(pokemon.getCleanName() + aspect);
                        result.setNormalizedPreEvolution(pokemon.getCleanName());
                    }
                }
            }
        }
        System.out.println(pokemonThatEvolveIntoThemselves);
        System.out.println(pokemonWithMoreThanTwoSpawnPresets);
        System.out.println("Evolution Items:");
        for (String item : EVOLUTION_ITEMS) System.out.println(item + ",");

        for (int i = zeroStatPokemon.size() - 1; i > -1; i--) {
            var pokemon = zeroStatPokemon.get(i);
            if (!pokemon.evolutions.isEmpty()) {
                Optional<Pokemon> pokemonToCopy = pokemon.evolutions.stream().map(evolutionEntry -> evolutionEntry.getResult().toLowerCase())
//                            .filter(result -> POKEMON_REGISTRY.containsKey(result))
                        .map(result -> POKEMON_REGISTRY.get(result))
                        .filter(Objects::nonNull)
                        .min(Comparator.comparing(pokemon1 -> pokemon1.stats.getTotal()));

                if (pokemonToCopy.isPresent()) {
                    var evolutionStats = pokemonToCopy.get().stats;
                    pokemon.stats = new Stats(evolutionStats, 0.7);
                }
            }
        }

        for (int i = pokemonWithNoPreferredBlocks.size() - 1; i > -1; i--) {
            var pokemon = pokemonWithNoPreferredBlocks.get(i);
            pokemon.spawnData.forEach(pokemonSpawnData -> {
                if (pokemonSpawnData.getPreferredBlocks().isEmpty())
                    pokemonSpawnData.getPreferredBlocks().add(pokemon.primaryType.getPreferredBlock());
            });
        }
        for (var pokemon : sortedPokemonList) {
            for (EvolutionEntry evolutionEntry : pokemon.getEvolutions()) {
                var evoResult = evolutionEntry.getResult();
                if (evoResult.contains(" ")) {
                    var parts = evoResult.split(" ");
                    if (hasTrailingNumber(parts[0])) {
                        evoResult = evoResult.replace(" ", "");
                    } else evoResult = (parts[1].contains("=false")
                            ? ""
                            : parts[1].replaceAll("=true", "") + " ") + parts[0];
                }
                String finalEvoResult = evoResult;
                Pokemon result = getPokemonById(finalEvoResult);
                if (result != null) {
                    if (isAnAdditionalForm(result)) {
                        var resultName = getKeysByValue(ADDITIONAL_FORMS, result).stream().findFirst();
                        resultName.ifPresent(s -> evolutionEntry.setResult(s + " " + result.getAdditionalAspect().name().toLowerCase()));
                    }
                } else {
                    if (!evolutionEntry.getResult().contains(" "))
                        ADDITIONAL_PRE_EVOLUTIONS.put(evolutionEntry.getResult().toLowerCase(), pokemon.getCleanName());
                }
            }

            for (var form : pokemon.getForms()) {
                form.getLearnSet().add(new MoveLearnSetEntry(Move.TERA_BLAST, "tm"));
                if (form.getAbilities().contains(form.getHiddenAbility())) {
                    form.setHiddenAbility(null);
                }
                for (EvolutionEntry evolutionEntry : form.getEvolutions()) {
                    Pokemon result = getPokemonById(evolutionEntry.getResult());
                    if (result != null) {
                        if (isAnAdditionalForm(result)) {
                            var resultName = getKeysByValue(ADDITIONAL_FORMS, result).stream().findFirst();
                            resultName.ifPresent(s -> evolutionEntry.setResult(s + " " + result.getAdditionalAspect().name().toLowerCase()));
                        }
                    }
                }
            }
        }

        for (var pokemon : sortedPokemonList) {
            pokemon.getLearnSet().add(new MoveLearnSetEntry(Move.TERA_BLAST, "tm"));
            if (pokemon.baseExperienceYield == 0) {
                pokemon.baseExperienceYield = 512 / (pokemon.stats.getHP() / 255);
            }
            if (pokemon.stats.isEmpty()) {
                pokemonWithZeroBaseStats.append(pokemon.getLabels().stream().findFirst().orElse(Label.MISSING).getName()).append(": ").append(pokemon.getCleanName()).append(",\n");
            }
            if (pokemon.getAbilities().isEmpty()) pokemon.getAbilities().add(Ability.KEEN_EYE);
            if (pokemon.getAbilities().contains(pokemon.hiddenAbility)) {
                pokemon.hiddenAbility = null;
            }

            if (Gravelmon.FOSSIL_MAP.containsValue(pokemon.getCleanName()) || Gravelmon.FOSSIL_MAP.containsValue(pokemon.getPreEvolution())) {
                FOSSIL_POKEMON.add(pokemon);
                pokemon.labels.add(Label.FOSSIL);
            }

            if (pokemon.getLearnSet().isEmpty() || pokemon.getLearnSet().stream().noneMatch(moveLearnSetEntry -> StringUtils.isNumeric(moveLearnSetEntry.getCondition()))) {
                var newMoveSet = MoveListFiller.resolveMoveList(pokemon);
                newMoveSet.addAll(pokemon.getLearnSet());
                pokemon.setLearnSet(newMoveSet);
            }

            if (0 == pokemon.getCatchRate()) {
                var baseStatTotal = pokemon.getStats().getTotal();
                if (baseStatTotal == 600) {
                    pokemon.setCatchRate(45);
                } else if (baseStatTotal > 570) {
                    pokemon.setCatchRate(3);
                } else {
                    pokemon.setCatchRate(resolveNumber(baseStatTotal));
                }
            }

            checkEvolutionStatus(pokemon);
            SpawnDefinitionConverter.updateSpawnDefinitionInFile(pokemon);
        }
        System.out.println(pokemonWithZeroBaseStats);

        for (var additionalEvolutionEntrySet : ADDITIONAL_EVOLUTIONS.entrySet()) {
            var pokemon = POKEMON_REGISTRY.get(additionalEvolutionEntrySet.getKey());
            for (var evolutionEntry : additionalEvolutionEntrySet.getValue()) {
                Pokemon result = getPokemonById(evolutionEntry.getResult());
                if (result == null) continue;
                if (pokemon == null) {
                    if (evolutionEntry.getRequiredContext() != null) {
                        addAdditionalItemDrop(additionalEvolutionEntrySet.getKey(), evolutionEntry.getRequiredContext(), result);
                    } else {
                        evolutionEntry.getRequirements().stream().filter(entry -> entry.getCondition().equals("itemCondition"))
                                .forEach(entry -> addAdditionalItemDrop(additionalEvolutionEntrySet.getKey(), entry.getConditionParameter().replace("", ""), result));
                    }

                    result.setPreEvolution(evolutionEntry.getResult());
                    result.evolutionStage = OriginalPokemonByStage.lookUpEvolutionStage(evolutionEntry.getResult()) + 1;
                } else {
                    if (evolutionEntry.getRequiredContext() != null) {
                        addItemAsDrop(pokemon, evolutionEntry.getRequiredContext(), result);
                    } else {
                        evolutionEntry.getRequirements().stream().filter(entry -> entry.getCondition().equals("itemCondition"))
                                .forEach(entry -> addItemAsDrop(pokemon, entry.getConditionParameter().replace("", ""), result));
                    }
                    if (result.getPreEvolution() != null) continue;

                    result.setNormalizedPreEvolution(pokemon.getCleanName());
                    if (Pokemon.isAnAdditionalForm(pokemon)) {
                        var resultName = getKeysByValue(ADDITIONAL_FORMS, pokemon).stream().findFirst();
                        resultName.ifPresent(s -> result.setPreEvolution(s + " form=" + pokemon.getAdditionalAspect().name().toLowerCase()));
                    } else {
                        result.setPreEvolution(pokemon.getCleanName());
                    }
                    checkEvolutionStatus(result);
                }
                SpawnDefinitionConverter.updateSpawnDefinitionInFile(result);
            }
        }

        fixSpawnsForAllPokemon();
//
//        POKEMON_REGISTRY.values().forEach(SpawnDefinitionConverter::updateSpawnDefinitionInFile);
    }

    private static void fixSpawnsForAllPokemon() {
        var allPokemonClasses = getAllPokemonClasses();
        for (var pokemon : allPokemonClasses) {
            SpawnDefinitionConverter.updateSpawnDefinitionInFile(pokemon);
        }
    }

    private static List<Pokemon> getAllPokemonClasses() {
        Reflections reflections = new Reflections("drai.dev.data.pokemon");
        var pokemon = new ArrayList<Pokemon>();
        Set<Class<? extends Pokemon>> subclasses = reflections.getSubTypesOf(Pokemon.class);

        for (Class<? extends Pokemon> clazz : subclasses) {
            if (SpawnDefinitionConverter.convertedClasses.contains(clazz.getName())) continue;
            try {
                Pokemon instance = null;

                // Try constructor with (String, Aspect)
                for (Constructor<?> constructor : clazz.getConstructors()) {
                    Class<?>[] params = constructor.getParameterTypes();

                    if (params.length == 0) {
                        instance = (Pokemon) constructor.newInstance();
                        break;
                    }if (params.length == 2 && params[0] == String.class && params[1] == Aspect.class) {
                        instance = (Pokemon) constructor.newInstance("", Aspect.NOSTAN);
                        break;
                    } else if (params.length == 1 && params[0] == Stats.class) {
                        instance = (Pokemon) constructor.newInstance(new Stats(0, 0, 0, 0, 0, 0));
                        break;
                    } else if (params.length == 3 && params[0] == String.class && params[2] == Stats.class && params[1] == Aspect.class) {
                        instance = (Pokemon) constructor.newInstance("", Aspect.NOSTAN, new Stats(0, 0, 0, 0, 0, 0));
                        break;
                    }
                }

                if (instance != null) {
                    pokemon.add(instance);
                } else {
                    System.out.println("No valid constructor for: " + clazz.getName());
                }
            } catch (Exception e) {
                System.out.println("Error creating instance of " + clazz.getName() + ": " + e.getMessage());
            }
        }

        return pokemon;
    }

    private static void checkEvolutionStatus(Pokemon pokemon) {
        if (pokemon.getNormalizedPreEvolution() != null && !pokemon.getNormalizedPreEvolution().isEmpty()) {
            var preEvo = POKEMON_REGISTRY.values().stream().filter(p -> p.getName().equalsIgnoreCase(pokemon.getNormalizedPreEvolution())).findFirst().orElse(null);
            if (pokemon.evolutions.isEmpty()) {
                if (preEvo != null) {
                    if (preEvo.getNormalizedPreEvolution() == null) pokemon.evolutionStage = 2;
                    else pokemon.evolutionStage = 3;
                }
            } else pokemon.evolutionStage = 2;

            if(preEvo != null){
                pokemon.setPreEvolutionSpawnPool(preEvo.getSpawnData().getFirst().getSpawnPool());
                pokemon.preEvolutionSpawnWeight = preEvo.getSpawnData().getFirst().getSpawnWeight();
            }
        }
    }

    public static int resolveNumber(int inputNumber) {
        // Define the input and output ranges
        int inputMin = 180;
        int inputMax = 570;
        int outputMin = 30;
        int outputMax = 255;

        // Ensure the input number is within the expected range
        if (inputNumber < inputMin) {
            inputNumber = inputMin;
        } else if (inputNumber > inputMax) {
            inputNumber = inputMax;
        }

        // Calculate the output using linear interpolation
        double outputNumber = outputMax - ((double) (inputNumber - inputMin) / (inputMax - inputMin)) * (outputMax - outputMin);

        return (int) Math.round(outputNumber);
    }

    public static boolean hasTrailingNumber(String input) {
        for (String numberWord : numberWordToInt.keySet()) {
            if (input.toLowerCase().endsWith(numberWord)) {
                return true;
            }
        }
        return false;
    }
}
