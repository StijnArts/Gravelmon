package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Grabbem extends drai.dev.data.pokemon.Pokemon {
    public Grabbem() {
        super("Grabbem",
                Type.ROCK, Type.PSYCHIC,
                new Stats(60,
                        90,
                        60,
                        90,
                        60,
                        25),
                List.of(Ability.REFLEXSTRIKE), Ability.REFLEXSTRIKE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It used to be capable of delivering powerful blows in this form, and has devastating counterattacks. Time has weakened its body. Despite this, it is still marginally strong. It rests dormant, still protecting the same areas from thousands of years ago."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CRUSH_GRIP,1)                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Grabbem");

    }


}
