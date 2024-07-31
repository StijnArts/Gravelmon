package drai.dev.data.pokemon.ionos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Deoxavir extends drai.dev.data.pokemon.Pokemon {
    public Deoxavir(Stats stats) {
        super("Deoxavir",
                Type.POISON, Type.PSYCHIC,
                new Stats(50,
                        75,
                        50,
                        50,
                        25,
                        75),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                2, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 13, 33, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_END))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Deoxavir");

    }


}
