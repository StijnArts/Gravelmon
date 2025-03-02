package drai.dev.data.pokemon.olysos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Klepeck extends drai.dev.data.pokemon.Pokemon {
    public Klepeck() {
        super("Klepeck",
                Type.DARK, Type.FLYING,
                new Stats(40,
                        55,
                        30,
                        45,
                        40,
                        65),
                List.of(Ability.KEEN_EYE), Ability.PRANKSTER,
                3, 16,
                new Stats(0,0,0,0,0,1), 200,
                0.5,
                64, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("It is attracted to shiny objects, often collecting them in its nest. This little trickster is quick-witted and swift in flight, making it a challenge for Trainers to catch. It enjoys taunting other Pokémon and people, showcasing its intelligence by imitating various sounds it hears in its surroundings."),
                List.of(),
                List.of(),
                List.of(Label.OLYSOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Klepeck");

    }


}
