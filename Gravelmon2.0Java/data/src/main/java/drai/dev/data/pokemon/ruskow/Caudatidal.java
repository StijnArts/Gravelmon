package drai.dev.data.pokemon.ruskow;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Caudatidal extends drai.dev.data.pokemon.Pokemon {
    public Caudatidal(Stats stats) {
        super("Caudatidal",
                Type.WATER, Type.POISON,
                stats,
                List.of(Ability.TORRENT), Ability.POISON_POINT,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.RUSKOW),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Caudatidal");

    }


}
