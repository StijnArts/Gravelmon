package drai.dev.data.pokemon.ivris;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class DraNduja extends drai.dev.data.pokemon.Pokemon {
    public DraNduja() {
        super("DraNduja",
                Type.GRASS,Type.FIRE,
                new Stats(117,
                        41,
                        117,
                        139,
                        99,
                        23),
                List.of(), null,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.IVRIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Dra'Nduja");

    }


}
