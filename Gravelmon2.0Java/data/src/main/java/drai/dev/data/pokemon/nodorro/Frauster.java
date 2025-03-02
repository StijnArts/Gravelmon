package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Frauster extends drai.dev.data.pokemon.Pokemon {
    public Frauster() {
        super("Frauster",
                Type.ICE, Type.DARK,
                new Stats(100,
                        129,
                        92,
                        70,
                        79,
                        60),
                List.of(Ability.SNOW_WARNING,Ability.INTIMIDATE), Ability.SHEER_FORCE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.25,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.NODORRO),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Frauster");

    }


}
