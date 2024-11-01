package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Scrambird extends drai.dev.data.pokemon.Pokemon {
    public Scrambird() {
        super("Scrambird",
                Type.FLYING,
                new Stats(80,
                        50,
                        50,
                        50,
                        40,
                        50),
                List.of(Ability.EARLYBIRD), Ability.FLUFFY,
                11, 0,
                new Stats(2,0,0,0,0,0), 120,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("This pokemon is cloaked in a warm, pleasant aroma that often attracts the attention of small bug-type pokemon, making finding food for Scrambirds relatively easy."),
                List.of(new EvolutionEntry("omeledoodle", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"34")))),
                List.of(                        ),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 15, 38, 1.1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_PLAINS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL, SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Scrambird");

    }


}
