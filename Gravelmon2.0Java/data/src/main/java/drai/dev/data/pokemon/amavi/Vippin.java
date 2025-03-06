package drai.dev.data.pokemon.amavi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Vippin extends drai.dev.data.pokemon.Pokemon {
    public Vippin() {
        super("Vippin",
                Type.GRASS, Type.POISON,
                new Stats(85,
                        20,
                        20,
                        35,
                        45,
                        105),
                List.of(Ability.OVERGROW), Ability.OVERGROW,
                4, 57,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.AMAVI),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Vippin");

    }


}
