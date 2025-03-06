package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Wispall extends drai.dev.data.pokemon.Pokemon {
    public Wispall() {
        super("Wispall",
                Type.PSYCHIC,
                new Stats(30,
                        20,
                        15,
                        60,
                        40,
                        30),
                List.of(Ability.LEVITATE), Ability.WEAK_ARMOR,
                1, 3,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                39, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("With closed eyes, Wispall sees the near future. Its fragile body is easy to break-- if this happens, Wispall must find a new one or it will dissipate."),
                List.of(),
                List.of(),
                List.of(Label.KORZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Wispall");

    }


}
