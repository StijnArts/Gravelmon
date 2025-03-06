package drai.dev.data.pokemon.ivris;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class IronSail extends drai.dev.data.pokemon.Pokemon {
    public IronSail() {
        super("IronSail",
                Type.DARK,Type.WATER,
                new Stats(152,
                        43,
                        67,
                        67,
                        204,
                        24),
                List.of(Ability.QUARK_DRIVE), null,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.IVRIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Iron Sail");

    }


}
