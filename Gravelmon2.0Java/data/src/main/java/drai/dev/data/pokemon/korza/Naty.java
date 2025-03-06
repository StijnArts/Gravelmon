package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Naty extends drai.dev.data.pokemon.Pokemon {
    public Naty() {
        super("Naty",
                Type.GRASS,
                new Stats(52,
                        34,
                        31,
                        44,
                        42,
                        5),
                List.of(Ability.OVERGROW), Ability.NATURAL_CURE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                42, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Small and frail, Naty hide in fields to camouflage. If no fields are available, they will gather in bunches to make their own camouflage together."),
                List.of(),
                List.of(),
                List.of(Label.KORZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Naty");

    }


}
