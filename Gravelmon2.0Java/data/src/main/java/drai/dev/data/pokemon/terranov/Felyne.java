package drai.dev.data.pokemon.terranov;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Felyne extends drai.dev.data.pokemon.Pokemon {
    public Felyne() {
        super("Felyne",
                Type.NORMAL,
                new Stats(60,
                        50,
                        45,
                        45,
                        60,
                        70),
                List.of(Ability.TRIAGE), Ability.TRIAGE,
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
           setLangFileName("Felyne");

    }


}
