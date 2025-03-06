package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Punkosom extends drai.dev.data.pokemon.Pokemon {
    public Punkosom() {
        super("Punkosom",
                Type.DARK,
                new Stats(85,
                        85,
                        60,
                        70,
                        60,
                        100),
                List.of(Ability.PICKPOCKET), Ability.PRANKSTER,
                15, 64,
                new Stats(0,0,0,0,0,2), 95,
                0.5,
                161, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Punkosom");

    }


}
