package drai.dev.data.pokemon.mongratis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Nuenflu extends drai.dev.data.pokemon.Pokemon {
    public Nuenflu(Stats stats) {
        super("Nuenflu",
                Type.NORMAL, Type.ICE,
                stats,
                List.of(Ability.PICKUP), Ability.PICKUP,
                8, 48,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Nuenflu secretly spreads diseases during the winter months."),
                List.of(),
                List.of(),
                List.of(Label.MONGRATIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Nuenflu");

    }


}
