package drai.dev.data.pokemon.tokas;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Erliber extends drai.dev.data.pokemon.Pokemon {
    public Erliber() {
        super("Erliber",
                Type.FLYING, Type.GRASS,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.EARLY_BIRD), Ability.EARLY_BIRD,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Both mouths of erliber nourish the bird in a symbiotic relationship developed when a baby erliber falls from its nest."),
                List.of(),
                List.of(),
                List.of(Label.TOKAS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Erliber");

    }


}
