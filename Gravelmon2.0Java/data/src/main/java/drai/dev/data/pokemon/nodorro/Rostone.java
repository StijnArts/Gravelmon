package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Rostone extends drai.dev.data.pokemon.Pokemon {
    public Rostone() {
        super("Rostone",
                Type.ROCK,
                new Stats(50,
                        50,
                        50,
                        50,
                        50,
                        50),
                List.of(Ability.STURDY,Ability.SOLID_ROCK), Ability.CLEAR_BODY,
                6, 560,
                new Stats(1,0,0,0,0,0), 155,
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
           setLangFileName("Rostone");

    }


}
