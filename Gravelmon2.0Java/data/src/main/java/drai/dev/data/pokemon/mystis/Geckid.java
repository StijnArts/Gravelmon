package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Geckid extends drai.dev.data.pokemon.Pokemon {
    public Geckid() {
        super("Geckid",
                Type.WATER,
                new Stats(55,
                        35,
                        65,
                        70,
                        65,
                        60),
                List.of(Ability.WATER_ABSORB,Ability.PRANKSTER), Ability.HYDRATION,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Geckid");

    }


}
