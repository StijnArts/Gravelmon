package drai.dev.data.pokemon.okeno;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Psykton extends drai.dev.data.pokemon.Pokemon {
    public Psykton() {
        super("Plankton",
                Type.ROCK,Type.PSYCHIC,
                new Stats(100,
                        125,
                        60,
                        60,
                        60,
                        60),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                5, 0,
                new Stats(0,2,0,0,0,0), 110,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 13, 34, 1.4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_CAVE))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Plankton");

    }


}
