package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Cookrush extends drai.dev.data.pokemon.Pokemon {
    public Cookrush() {
        super("Cookrush",
                Type.DARK, Type.FAIRY,
                new Stats(50,
                        80,
                        90,
                        70,
                        90,
                        100),
                List.of(Ability.RELENTLESS), Ability.JAWBREAKER,
                0, 0,
                new Stats(0,0,0,0,0,2), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It is notorious for two things: its eternal rivalry with Pastrella, and its mischievous behaviour of pretending to be a cookie, only to dash straight into the misfortunate Pokémon who stumbles upon it!"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FOUL_PLAY,1),
                        new MoveLearnSetEntry(Move.SWAGGER,1),
                        new MoveLearnSetEntry(Move.BODY_SLAM,1),
                        new MoveLearnSetEntry(Move.IRON_HEAD,1)                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Cookrush");

    }


}
