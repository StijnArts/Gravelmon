package drai.dev.data.pokemon.terranov;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Palico extends drai.dev.data.pokemon.Pokemon {
    public Palico() {
        super("Palico",
                Type.NORMAL, Type.FIGHTING,
                new Stats(80,
                        85,
                        95,
                        75,
                        65,
                        100),
                List.of(Ability.PRANKSTER), Ability.PRANKSTER,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.TERRANOV),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Palico");

    }


}
