package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Electone extends drai.dev.data.pokemon.Pokemon {
    public Electone() {
        super("Electone",
                Type.ROCK, Type.ELECTRIC,
                new Stats(55,
                        80,
                        65,
                        95,
                        65,
                        60),
                List.of(Ability.LEVITATE), Ability.LIGHTNING_ROD,
                14, 740,
                new Stats(0,1,0,1,0,0), 0,
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
           setLangFileName("Electone");

    }


}
