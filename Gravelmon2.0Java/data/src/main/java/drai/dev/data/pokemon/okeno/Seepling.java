package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Seepling extends drai.dev.data.pokemon.Pokemon {
    public Seepling() {
        super("Seepling",
                Type.GRASS, Type.ROCK,
                new Stats(90,
                        50,
                        50,
                        45,
                        45,
                        33),
                List.of(Ability.LEAF_GUARD), Ability.FIREPROOF,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.MONSTER),
                List.of("Bamboo ShotSTAB Grass"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BAMBOOSHOT,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Seepling");

    }


}
