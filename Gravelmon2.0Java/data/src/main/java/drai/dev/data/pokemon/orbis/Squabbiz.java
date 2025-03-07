package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Squabbiz extends drai.dev.data.pokemon.Pokemon {
    public Squabbiz() {
        super("Squabbiz",
                Type.NORMAL, Type.FLYING,
                new Stats(45,
                        35,
                        30,
                        30,
                        40,
                        60),
                List.of(Ability.BIG_PECKS), Ability.GALE_WINGS,
                3, 50,
                new Stats(0,0,0,0,0,0), 255,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.ORBIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Squabbiz");

    }


}
