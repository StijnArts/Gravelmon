package drai.dev.data.pokemon.terranov;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Ukanlos extends drai.dev.data.pokemon.Pokemon {
    public Ukanlos(Stats stats) {
        super("Ukanlos",
                Type.ICE, Type.GROUND,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("An enigmatic dragon sighted only deep within the most remote extremes. Its jaws are capable of crushing ice and rock alike. The natives of one region claim its appearance mirrors that of the white god of their legends."),
                List.of(),
                List.of(),
                List.of(Label.TERRANOV),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Ukanlos");

    }


}
