package drai.dev.data.attributes;

import com.cobblemon.mod.common.pokemon.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class PokemonForm extends AbstractPokemon {
    private final Boolean isBattleOnly;
    private boolean hasSeparateModel = false;

    public String getFormName() {
        return name;
    }

    public PokemonForm(String name, Boolean isBattleOnly,
                       Type primaryType, Stats stats,
                       List<Ability> abilities, Ability hiddenAbility, int height, int weight,
                       Stats evYield, int catchRate, double maleRatio, int baseExperienceYield, ExperienceGroup experienceGroup, int baseFriendship,
                       int eggCycles, List<EggGroup> eggGroups,

                       List<Aspect> aspects,

                       List<String> dexEntries,

                       List<EvolutionEntry> evolutions,

                       List<MoveLearnSetEntry> learnSet,

                       List<Label> labels,

                       int dropAmount, List<ItemDrop> drops,

                       SpawnContext spawnContext, SpawnPool spawnPool,
                       int minSpawnLevel, int maxSpawnLevel, double spawnWeight, List<SpawnCondition> spawnConditions,
                       List<SpawnCondition> spawnAntiConditions, List<SpawnPreset> spawnPresets,

                       double baseScale, double portraitScale

    ) {
        super(name, stats, primaryType, abilities, hiddenAbility, catchRate, maleRatio, baseExperienceYield, experienceGroup,
                eggCycles, eggGroups, dexEntries, evolutions, labels, dropAmount, drops, baseFriendship, evYield, learnSet, aspects, height, weight, spawnContext, spawnPool, minSpawnLevel,
                maxSpawnLevel, spawnWeight, spawnConditions, spawnAntiConditions, spawnPresets);
        this.name = name;
        this.isBattleOnly = isBattleOnly;
    }

    public PokemonForm(String name, Boolean isBattleOnly,
                       Type primaryType, Type secondaryType,
                       Stats stats,
                       List<Ability> abilities, Ability hiddenAbility, int height, int weight,
                       Stats evYield, int catchRate, double maleRatio, int baseExperienceYield, ExperienceGroup experienceGroup, int baseFriendship,
                       int eggCycles, List<EggGroup> eggGroups,

                       List<Aspect> aspects,

                       List<String> dexEntries,

                       List<EvolutionEntry> evolutions,

                       List<MoveLearnSetEntry> learnSet,

                       List<Label> labels,

                       int dropAmount, List<ItemDrop> drops,

                       SpawnContext spawnContext, SpawnPool spawnPool,
                       int minSpawnLevel, int maxSpawnLevel, double spawnWeight, List<SpawnCondition> spawnConditions,
                       List<SpawnCondition> spawnAntiConditions, List<SpawnPreset> spawnPresets,

                       double baseScale, double portraitScale

    ) {
        this(name, isBattleOnly, primaryType, stats, abilities, hiddenAbility, height, weight, evYield, catchRate, maleRatio, baseExperienceYield, experienceGroup, baseFriendship, eggCycles, eggGroups, aspects, dexEntries, evolutions, learnSet, labels, dropAmount, drops, spawnContext, spawnPool, minSpawnLevel, maxSpawnLevel, spawnWeight, spawnConditions, spawnAntiConditions, spawnPresets, baseScale, portraitScale);
        this.secondaryType = secondaryType;
    }

    public boolean hasSeparateModel() {
        return hasSeparateModel;
    }

    public void setHasSeparateModel(boolean hasSeparateModel) {
        this.hasSeparateModel = hasSeparateModel;
    }

    public Boolean cannotDynamax() {
        return cannotDynamax;
    }

    public Boolean isBattleOnly() {
        return isBattleOnly;
    }
}
