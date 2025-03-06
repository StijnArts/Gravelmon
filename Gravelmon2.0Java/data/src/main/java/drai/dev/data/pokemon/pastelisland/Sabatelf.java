package drai.dev.data.pokemon.pastelisland;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Sabatelf extends drai.dev.data.pokemon.Pokemon {
    public Sabatelf() {
        super("Sabatelf",
                Type.FAIRY, Type.STEEL,
                new Stats(75,
                        75,
                        80,
                        55,
                        75,
                        65),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                4, 15,
                new Stats(0,0,0,0,0,0), 0,
                1.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FAIRY),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Sabatelf");

    }


}
