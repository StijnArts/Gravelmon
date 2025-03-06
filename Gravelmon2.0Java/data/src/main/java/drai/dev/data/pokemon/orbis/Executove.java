package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Executove extends drai.dev.data.pokemon.Pokemon {
    public Executove() {
        super("Executove",
                Type.NORMAL, Type.FLYING,
                new Stats(65,
                        65,
                        42,
                        60,
                        55,
                        80),
                List.of(Ability.BIG_PECKS), Ability.GALE_WINGS,
                8, 170,
                new Stats(0,0,0,0,0,0), 0,
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
           setLangFileName("Executove");

    }


}
