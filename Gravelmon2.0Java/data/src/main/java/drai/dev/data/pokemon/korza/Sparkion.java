package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Sparkion extends drai.dev.data.pokemon.Pokemon {
    public Sparkion() {
        super("Sparkion",
                Type.ELECTRIC,Type.POISON,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.PLUS), Ability.PLUS,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("This mon detects surroundings using electric fields to make up for poor vision. It is almost impossible to find two positive or negative Sparkion together in the wild."),
                List.of(),
                List.of(),
                List.of(Label.KORZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Sparkion");

    }


}
