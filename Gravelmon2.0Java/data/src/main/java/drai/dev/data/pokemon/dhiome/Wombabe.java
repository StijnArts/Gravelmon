package drai.dev.data.pokemon.dhiome;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Wombabe extends drai.dev.data.pokemon.Pokemon {
    public Wombabe() {
        super("Wombabe",
                Type.NORMAL,
                new Stats(58,
                        50,
                        48,
                        30,
                        45,
                        39),
                List.of(Ability.SAP_SIPPER), Ability.GLUTTONY,
                4, 88,
                new Stats(1,0,0,0,0,0), 255,
                0.5,
                53, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("It uses the pouch on its belly to store food. It later shares the food with the rest of the colony."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.PLAY_NICE,7),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,10),
                        new MoveLearnSetEntry(Move.BITE,13),
                        new MoveLearnSetEntry(Move.HYPER_FANG,17),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,20),
                        new MoveLearnSetEntry(Move.SPIT_UP,23),
                        new MoveLearnSetEntry(Move.SWALLOW,23),
                        new MoveLearnSetEntry(Move.STOCKPILE,23),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,26),
                        new MoveLearnSetEntry(Move.SUPER_FANG,30),
                        new MoveLearnSetEntry(Move.REST,34),
                        new MoveLearnSetEntry(Move.BODY_SLAM,38),
                        new MoveLearnSetEntry(Move.SEED_BOMB,43),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,48)                        ),
                List.of(Label.DHIOME),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Wombabe");

    }


}
