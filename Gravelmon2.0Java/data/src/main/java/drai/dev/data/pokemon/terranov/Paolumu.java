package drai.dev.data.pokemon.terranov;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Paolumu extends drai.dev.data.pokemon.Pokemon {
    public Paolumu() {
        super("Paolumu",
                Type.FLYING, Type.FAIRY,
                new Stats(100,
                        75,
                        50,
                        95,
                        95,
                        70),
                List.of(Ability.OVERCOAT), Ability.OVERCOAT,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.TERRANOV),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Paolumu");

    }


}
