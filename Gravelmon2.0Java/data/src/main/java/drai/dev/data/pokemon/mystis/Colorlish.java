package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Colorlish extends drai.dev.data.pokemon.Pokemon {
    public Colorlish() {
        super("Colorlish",
                Type.WATER,
                new Stats(50,
                        30,
                        50,
                        40,
                        50,
                        30),
                List.of(Ability.SECRETINSIGHT), Ability.MARVEL_SCALE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Colorish's scales have grown over its eyes. Thankfully, it is so dull it often isn't noticed until it bites or rams into others. It hunts using a mystic power."),
                List.of(),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Colorlish");

    }


}
