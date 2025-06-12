package drai.dev.data.pokemon.raian;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Colloestamp extends drai.dev.data.pokemon.Pokemon {
    public Colloestamp(Stats stats) {
        super("Colloestamp",
                Type.ROCK,Type.FAIRY,
                stats,
                List.of(Ability.STURDY), null,
                17, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("Doomonic", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.PARTY_MEMBER,"Poltamp"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.PARTY_MEMBER,"Farstamp"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.PARTY_MEMBER,"Finstamp")))),
                List.of(),
                List.of(Label.RAIAN),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 32, 45, .7, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DESERT)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Colloestamp");

    }


}
