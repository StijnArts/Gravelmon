package drai.dev.data.pokemon.raian;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Collecrok extends drai.dev.data.pokemon.Pokemon {
    public Collecrok() {
        super("Collecrok",
                Type.ROCK,Type.FIGHTING,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(), null,
                17, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("Dracnarok", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.PARTY_MEMBER,"envirock"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.PARTY_MEMBER,"envirock-cave"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.PARTY_MEMBER,"envirock-forest"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.PARTY_MEMBER,"envirock-sea")))),
                List.of(),
                List.of(Label.RAIAN),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 32, 45, .7, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.JUNGLE_PYRAMID),
                0.28, 0.3,
                List.of());
           setLangFileName("Collecrok");

    }


}
