package drai.dev.data.pokemon.goetia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Sparassid extends drai.dev.data.pokemon.Pokemon {
    public Sparassid(Stats stats) {
        super("Sparassid",
                Type.BUG, Type.FIGHTING,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                7, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Sparassid’s unusual stature gives it an unusual advantage on other Fighting-type Pokemon in the boxing ring."),
                List.of(),
                List.of(),
                List.of(Label.GOETIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 23, 51, 2.2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BIRCH))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Sparassid");

    }


}
