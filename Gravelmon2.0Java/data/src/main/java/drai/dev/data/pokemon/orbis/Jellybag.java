package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Jellybag extends drai.dev.data.pokemon.Pokemon {
    public Jellybag() {
        super("Jellybag",
                Type.GHOST,
                new Stats(40,
                        30,
                        35,
                        55,
                        65,
                        55),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                2, 1,
                new Stats(0,0,0,0,1,0), 255,
                0.5,
                49, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("Jellybag are unique in the way they dispose of every item they see, no matter what it is."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.RECYCLE,1),
                        new MoveLearnSetEntry(Move.ASTONISH,1)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Jellybag");

    }


}
