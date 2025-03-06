package drai.dev.data.pokemon.terranov;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Ceanataur extends drai.dev.data.pokemon.Pokemon {
    public Ceanataur() {
        super("Ceanataur",
                Type.WATER, Type.STEEL,
                new Stats(60,
                        65,
                        70,
                        50,
                        85,
                        60),
                List.of(Ability.TOUGH_CLAWS), Ability.TOUGH_CLAWS,
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
           setLangFileName("Ceanataur");

    }


}
