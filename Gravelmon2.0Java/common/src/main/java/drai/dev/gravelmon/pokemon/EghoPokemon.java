package drai.dev.gravelmon.pokemon;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class EghoPokemon extends Pokemon{
    public static List<Pokemon> placeholders = new ArrayList<>();
    public EghoPokemon(String name, Type primaryType, Type secondaryType, List<EvolutionEntry> evolutions, List<Label> labels) {
        super(name.replace("Ehgo","Egho"), primaryType, secondaryType, evolutions, labels);
        createPlaceholderPokemon(name, primaryType, secondaryType, labels);
    }

    public EghoPokemon(String name, Type primaryType, Type secondaryType, Stats stats, List<Ability> abilities, Ability hiddenAbility, int height, int weight, Stats evYield, int catchRate, double maleRatio, int baseExperienceYield, ExperienceGroup experienceGroup, int baseFriendship, int eggCycles, List<EggGroup> eggGroups, List<String> dexEntries, List<EvolutionEntry> evolutions, List<MoveLearnSetEntry> learnSet, List<Label> labels, int dropAmount, List<ItemDrop> drops, SpawnContext spawnContext, SpawnPool spawnPool, int minSpawnLevel, int maxSpawnLevel, double spawnWeight, List<SpawnCondition> spawnConditions, List<SpawnCondition> spawnAntiConditions, List<SpawnPreset> spawnPresets, double baseScale, double portraitScale, List<PokemonForm> forms) {
        super(name.replace("Ehgo","Egho"), primaryType, secondaryType, stats, abilities, hiddenAbility, height, weight, evYield, catchRate, maleRatio, baseExperienceYield, experienceGroup, baseFriendship, eggCycles, eggGroups, dexEntries, evolutions, learnSet, labels, dropAmount, drops, spawnContext, spawnPool, minSpawnLevel, maxSpawnLevel, spawnWeight, spawnConditions, spawnAntiConditions, spawnPresets, baseScale, portraitScale, forms);
        createPlaceholderPokemon(name, primaryType, secondaryType, labels);
    }

    public EghoPokemon(int dexNo, String name, Type primaryType, Type secondaryType, Stats stats, List<Ability> abilities, Ability hiddenAbility, int height, int weight, Stats evYield, int catchRate, double maleRatio, int baseExperienceYield, ExperienceGroup experienceGroup, int baseFriendship, int eggCycles, List<EggGroup> eggGroups, List<String> dexEntries, List<EvolutionEntry> evolutions, List<MoveLearnSetEntry> learnSet, List<Label> labels, int dropAmount, List<ItemDrop> drops, SpawnContext spawnContext, SpawnPool spawnPool, int minSpawnLevel, int maxSpawnLevel, double spawnWeight, List<SpawnCondition> spawnConditions, List<SpawnCondition> spawnAntiConditions, List<SpawnPreset> spawnPresets, double baseScale, double portraitScale, List<PokemonForm> forms) {
        super(dexNo, name.replace("Ehgo","Egho"), primaryType, secondaryType, stats, abilities, hiddenAbility, height, weight, evYield, catchRate, maleRatio, baseExperienceYield, experienceGroup, baseFriendship, eggCycles, eggGroups, dexEntries, evolutions, learnSet, labels, dropAmount, drops, spawnContext, spawnPool, minSpawnLevel, maxSpawnLevel, spawnWeight, spawnConditions, spawnAntiConditions, spawnPresets, baseScale, portraitScale, forms);
        createPlaceholderPokemon(dexNo, name, primaryType, secondaryType, labels);
    }

    public EghoPokemon(String name, Type primaryType, Stats stats, List<Ability> abilities, Ability hiddenAbility, int height, int weight, Stats evYield, int catchRate, double maleRatio, int baseExperienceYield, ExperienceGroup experienceGroup, int baseFriendship, int eggCycles, List<EggGroup> eggGroups, List<String> dexEntries, List<EvolutionEntry> evolutions, List<MoveLearnSetEntry> learnSet, List<Label> labels, int dropAmount, List<ItemDrop> drops, SpawnContext spawnContext, SpawnPool spawnPool, int minSpawnLevel, int maxSpawnLevel, double spawnWeight, List<SpawnCondition> spawnConditions, List<SpawnCondition> spawnAntiConditions, List<SpawnPreset> spawnPresets, double baseScale, double portraitScale, List<PokemonForm> forms) {
        super(name.replace("Ehgo","Egho"), primaryType, stats, abilities, hiddenAbility, height, weight, evYield, catchRate, maleRatio, baseExperienceYield, experienceGroup, baseFriendship, eggCycles, eggGroups, dexEntries, evolutions, learnSet, labels, dropAmount, drops, spawnContext, spawnPool, minSpawnLevel, maxSpawnLevel, spawnWeight, spawnConditions, spawnAntiConditions, spawnPresets, baseScale, portraitScale, forms);
        createPlaceholderPokemon(name, primaryType, secondaryType, labels);
    }

    public EghoPokemon(int dexNo, String name, Type primaryType, Stats stats, List<Ability> abilities, Ability hiddenAbility, int height, int weight, Stats evYield, int catchRate, double maleRatio, int baseExperienceYield, ExperienceGroup experienceGroup, int baseFriendship, int eggCycles, List<EggGroup> eggGroups, List<String> dexEntries, List<EvolutionEntry> evolutions, List<MoveLearnSetEntry> learnSet, List<Label> labels, int dropAmount, List<ItemDrop> drops, SpawnContext spawnContext, SpawnPool spawnPool, int minSpawnLevel, int maxSpawnLevel, double spawnWeight, List<SpawnCondition> spawnConditions, List<SpawnCondition> spawnAntiConditions, List<SpawnPreset> spawnPresets, double baseScale, double portraitScale, List<PokemonForm> forms) {
        super(dexNo, name.replace("Ehgo","Egho"), primaryType, stats, abilities, hiddenAbility, height, weight, evYield, catchRate, maleRatio, baseExperienceYield, experienceGroup, baseFriendship, eggCycles, eggGroups, dexEntries, evolutions, learnSet, labels, dropAmount, drops, spawnContext, spawnPool, minSpawnLevel, maxSpawnLevel, spawnWeight, spawnConditions, spawnAntiConditions, spawnPresets, baseScale, portraitScale, forms);
        createPlaceholderPokemon(dexNo, name, primaryType, secondaryType, labels);
    }

    private void createPlaceholderPokemon(int dexNo, String name, Type primaryType, Type secondaryType, List<Label> labels) {
        PokemonDummy placeholderPokemon = new PokemonDummy(dexNo, name.replace("egho","ehgo"), primaryType, secondaryType,
                List.of(new EvolutionEntry(this.getCleanName(), EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"1")))), labels);
        placeholderPokemon.setLangFileName("Evolve me to fix me!");
        placeholders.add(placeholderPokemon);
    }

    private void createPlaceholderPokemon(String name, Type primaryType, Type secondaryType, List<Label> labels) {
        PokemonDummy placeholderPokemon = new PokemonDummy(this.getPokedexNumber(), name.replace("egho","ehgo"), primaryType, secondaryType,
                List.of(new EvolutionEntry(this.getCleanName(), EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"1")))), labels);
        placeholderPokemon.setLangFileName("Evolve me to fix me!");
        placeholders.add(placeholderPokemon);
    }
}
