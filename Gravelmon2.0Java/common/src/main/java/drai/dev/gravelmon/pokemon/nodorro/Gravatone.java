package drai.dev.gravelmon.pokemon.nodorro;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Gravatone extends drai.dev.gravelmon.pokemon.Pokemon {
    public Gravatone() {
        super("Gravatone",
                Type.ROCK,Type.ELECTRIC,
                new Stats(70,
                        105,
                        80,
                        125,
                        90,
                        80),
                List.of(Ability.LEVITATE), Ability.LIGHTNING_ROD,
                18, 2080,
                new Stats(0,1,0,2,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Gravatone");

    }


}
