package drai.dev.data.pokemon.avalos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Galahaus extends drai.dev.data.pokemon.Pokemon {
    public Galahaus() {
        super("Galahaus",
                Type.ICE, Type.FAIRY,
                new Stats(100,
                        100,
                        100,
                        100,
                        100,
                        100),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.AVALOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Galahaus");

    }


}
