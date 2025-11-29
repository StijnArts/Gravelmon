package drai.dev.data.attributes;

import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class PokemonForm extends AbstractPokemon {
    private final Boolean isBattleOnly;
    private boolean hasSeparateModel = false;
    private Pokemon formOf;

    public static PokemonForm fromPokemon(Pokemon pokemon, Aspect aspect) {
        var spawnData = pokemon.getSpawnData().getFirst();
        PokemonForm pokemonForm = new PokemonForm(aspect.getName(), false,
                pokemon.getPrimaryType(), pokemon.getSecondaryType(),
                pokemon.getStats(),
                pokemon.getAbilities(), pokemon.getHiddenAbility(), pokemon.getHeight(), pokemon.getWeight(),
                pokemon.getEvYield(), pokemon.getCatchRate(), pokemon.getMaleRatio(), pokemon.getBaseExperienceYield(),
                pokemon.getExperienceGroup(), pokemon.getBaseFriendship(),
                pokemon.getEggCycles(), pokemon.getEggGroups(),

                new ArrayList<>(List.of(aspect)),

                pokemon.getDexEntries(),

                pokemon.getEvolutions(),

                pokemon.getLearnSet(),

                pokemon.getLabels(),

                pokemon.getDropAmount(), pokemon.getDrops(),

                spawnData.spawnContext, spawnData.spawnPool,
                spawnData.minSpawnLevel, spawnData.maxSpawnLevel, spawnData.spawnWeight,
                spawnData.spawnConditions,
                spawnData.spawnAntiConditions, spawnData.spawnPresets);
        pokemonForm.formOf = pokemon;
        return pokemonForm;
    }

    public String getFormName() {
        return name;
    }

    public PokemonForm(String name, Boolean isBattleOnly,
                       Type primaryType, Stats stats,
                       List<Ability> abilities, Ability hiddenAbility, int height, int weight,
                       Stats evYield, int catchRate, double maleRatio, int baseExperienceYield,
                       ExperienceGroup experienceGroup, int baseFriendship,
                       int eggCycles, List<EggGroup> eggGroups,

                       List<Aspect> aspects,

                       List<String> dexEntries,

                       List<EvolutionEntry> evolutions,

                       List<MoveLearnSetEntry> learnSet,

                       List<Label> labels,

                       int dropAmount, List<ItemDrop> drops,

                       SpawnContext spawnContext, SpawnPool spawnPool,
                       int minSpawnLevel, int maxSpawnLevel, double spawnWeight,
                       List<SpawnCondition> spawnConditions,
                       List<SpawnCondition> spawnAntiConditions, List<SpawnPreset> spawnPresets

    ) {
        super(name, stats, primaryType, null, abilities, hiddenAbility, catchRate, maleRatio, baseExperienceYield, experienceGroup,
                eggCycles, eggGroups, dexEntries, evolutions, labels, dropAmount, drops, baseFriendship, evYield, learnSet, aspects, height, weight, List.of(
                        new PokemonSpawnData(spawnContext, spawnPool, minSpawnLevel, maxSpawnLevel, spawnWeight*1.5d, spawnConditions, spawnAntiConditions, spawnPresets, new ArrayList<>())
                ));
        this.name = name;
//        this.formOf = formOf;
        this.isBattleOnly = isBattleOnly;
    }

    public PokemonForm(String name, Boolean isBattleOnly,
                       Type primaryType, Type secondaryType,
                       Stats stats,
                       List<Ability> abilities, Ability hiddenAbility, int height, int weight,
                       Stats evYield, int catchRate, double maleRatio, int baseExperienceYield,
                       ExperienceGroup experienceGroup, int baseFriendship,
                       int eggCycles, List<EggGroup> eggGroups,

                       List<Aspect> aspects,

                       List<String> dexEntries,

                       List<EvolutionEntry> evolutions,

                       List<MoveLearnSetEntry> learnSet,

                       List<Label> labels,

                       int dropAmount, List<ItemDrop> drops,

                       SpawnContext spawnContext, SpawnPool spawnPool,
                       int minSpawnLevel, int maxSpawnLevel, double spawnWeight,
                       List<SpawnCondition> spawnConditions,
                       List<SpawnCondition> spawnAntiConditions, List<SpawnPreset> spawnPresets

    ) {
        this(name, isBattleOnly, primaryType, stats, abilities, hiddenAbility, height, weight, evYield, catchRate, maleRatio, baseExperienceYield, experienceGroup, baseFriendship, eggCycles, eggGroups, aspects, dexEntries, evolutions, learnSet, labels, dropAmount, drops, spawnContext, spawnPool, minSpawnLevel, maxSpawnLevel, spawnWeight, spawnConditions, spawnAntiConditions, spawnPresets);
        this.secondaryType = secondaryType;
    }

    public Boolean cannotDynamax() {
        return cannotDynamax;
    }

    public Boolean isBattleOnly() {
        return isBattleOnly;
    }

    public void setFormOf(Pokemon cleanName) {
        formOf = cleanName;
    }

    public Pokemon getFormOf() {
        return formOf;
    }

    public String getGameName(){
        return formOf.getGameName();
    }

    @Override
    public String getSpreadsheetName() {
        return getCleanName();
    }

    @Override
    public String getTextureName() {
        return getCleanName()+"_"+getFormOf().getCleanName();
    }

    @Override
    public String getBasePokemon() {
        return formOf.getBasePokemon();
    }

    public PokemonForm setEvolutions(List<EvolutionEntry> evolutions) {
        this.evolutions.clear();
        this.evolutions.addAll(evolutions);
        return this;
    }
}
