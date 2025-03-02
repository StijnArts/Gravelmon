package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Hopple extends drai.dev.data.pokemon.Pokemon {
    public Hopple() {
        super("Hopple",
                Type.FAIRY,
                new Stats(60,
                        45,
                        45,
                        45,
                        45,
                        50),
                List.of(Ability.CUTE_CHARM,Ability.FRIEND_GUARD), Ability.CLOUD_NINE,
                3, 27,
                new Stats(1,0,0,0,0,0), 200,
                0.5,
                56, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Hopple are very up-beat. Pre-schools often have them as class pets because they love to play with children."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Hopple");

    }


}
