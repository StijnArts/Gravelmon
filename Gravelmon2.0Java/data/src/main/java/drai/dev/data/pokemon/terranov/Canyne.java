package drai.dev.data.pokemon.terranov;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Canyne extends drai.dev.data.pokemon.Pokemon {
    public Canyne() {
        super("Canyne",
                Type.NORMAL,
                new Stats(45,
                        75,
                        45,
                        45,
                        40,
                        80),
                List.of(Ability.UNNERVE), Ability.UNNERVE,
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
           setLangFileName("Canyne");

    }


}
