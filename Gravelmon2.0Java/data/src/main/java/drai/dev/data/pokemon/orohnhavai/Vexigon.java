package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Vexigon extends drai.dev.data.pokemon.Pokemon {
    public Vexigon() {
        super("Vexigon",
                Type.DRAGON,
                new Stats(40,
                        70,
                        50,
                        45,
                        35,
                        60),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Vexigon can be quite a handful for Trainers. They like causing ruckus and disobeying commands. These stubborn Pokemon can go hours or even days of causing trouble."),
                List.of(),
                List.of(),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Vexigon");

    }


}
