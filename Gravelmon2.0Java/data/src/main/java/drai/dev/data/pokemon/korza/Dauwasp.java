package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Dauwasp extends drai.dev.data.pokemon.Pokemon {
    public Dauwasp() {
        super("Dauwasp",
                Type.BUG,Type.ROCK,
                new Stats(50,
                        125,
                        60,
                        50,
                        60,
                        115),
                List.of(Ability.ANTICIPATION), Ability.MOXIE,
                8, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                161, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Dauwasp are specialized to hunt Orweaves. The nests they make have long pipes, and are constructed out of rock and clay."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.BUG_BITE,4),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,10),
                        new MoveLearnSetEntry(Move.TWINEEDLE,15),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,21),
                        new MoveLearnSetEntry(Move.ACCELEROCK,26),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,30),
                        new MoveLearnSetEntry(Move.XSCISSOR,35),
                        new MoveLearnSetEntry(Move.STONE_EDGE,42),
                        new MoveLearnSetEntry(Move.UTURN,47),
                        new MoveLearnSetEntry(Move.FELL_STINGER,53),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,58),
                        new MoveLearnSetEntry(Move.FINAL_GAMBIT,61)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Dauwasp");

    }


}
