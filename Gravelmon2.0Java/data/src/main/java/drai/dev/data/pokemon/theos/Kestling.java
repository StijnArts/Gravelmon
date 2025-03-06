package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Kestling extends drai.dev.data.pokemon.Pokemon {
    public Kestling() {
        super("Kestling",
                Type.FLYING,
                new Stats(45,
                        50,
                        45,
                        40,
                        40,
                        60),
                List.of(Ability.LIMBER), Ability.HUSTLE,
                3, 18,
                new Stats(0,0,0,0,0,1), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FLYING),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Kestling");

    }


}
