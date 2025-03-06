package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Pastone extends drai.dev.data.pokemon.Pokemon {
    public Pastone() {
        super("Pastone",
                Type.ROCK, Type.GRASS,
                new Stats(80,
                        90,
                        80,
                        60,
                        65,
                        45),
                List.of(Ability.GREENTHUMB), Ability.GREENTHUMB,
                15, 1200,
                new Stats(0,1,1,0,0,0), 100,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.NODORRO),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Pastone");

    }


}
