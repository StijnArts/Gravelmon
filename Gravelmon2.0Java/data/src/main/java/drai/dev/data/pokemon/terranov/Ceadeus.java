package drai.dev.data.pokemon.terranov;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Ceadeus extends drai.dev.data.pokemon.Pokemon {
    public Ceadeus(Stats stats) {
        super("Ceadeus",
                Type.WATER, Type.DRAGON,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Legendary elder dragons known as both 'shining giants of the depths' and 'great sea dragons.' Not confirmed to exist until recently. The Moga quakes were due to a Ceadeus butting its abnormally long horns into the earth."),
                List.of(),
                List.of(),
                List.of(Label.TERRANOV),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Ceadeus");

    }


}
