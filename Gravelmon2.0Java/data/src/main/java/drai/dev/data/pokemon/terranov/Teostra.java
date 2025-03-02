package drai.dev.data.pokemon.terranov;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Teostra extends drai.dev.data.pokemon.Pokemon {
    public Teostra() {
        super("Teostra",
                Type.FIRE, Type.DRAGON,
                new Stats(90,
                        95,
                        108,
                        127,
                        100,
                        80),
                List.of(Ability.DROUGHT), Ability.DROUGHT,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                1.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Brutal elder dragons wreathed in flames that spew blazing fire. Teostra are of such a fierce and deadly nature that the Guild closely monitors their movements."),
                List.of(),
                List.of(),
                List.of(Label.TERRANOV),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Teostra");

    }


}
