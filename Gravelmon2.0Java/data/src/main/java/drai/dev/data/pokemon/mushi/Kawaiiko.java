package drai.dev.data.pokemon.mushi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Kawaiiko extends drai.dev.data.pokemon.Pokemon {
    public Kawaiiko() {
        super("Kawaiiko",
                Type.NORMAL,
                new Stats(45,
                        40,
                        55,
                        35,
                        40,
                        20),
                List.of(Ability.OVERCOAT), Ability.FLUFFY,
                0, 0,
                new Stats(0,0,1,0,0,0), 255,
                0.5,
                51, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG,EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MUSHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Kawaiiko");

    }


}
