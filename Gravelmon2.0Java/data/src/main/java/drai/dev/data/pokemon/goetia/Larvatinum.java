package drai.dev.data.pokemon.goetia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Larvatinum extends drai.dev.data.pokemon.Pokemon {
    public Larvatinum(Stats stats) {
        super("Larvatinum",
                Type.FIGHTING, Type.POISON,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                1, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Its “true forme” is tiny and weak, only when it creates a second body out of slime is its inner strength revealed. In this “armed forme”, it is able to protect itself by launching flurries of punches at blinding speed. If the armed forme becomes damaged beyond repair, Larvatinum will use it as a decoy while escaping."),
                List.of(),
                List.of(),
                List.of(Label.GOETIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 13, 33, 2.1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SWAMP))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Larvatinum");

    }


}
