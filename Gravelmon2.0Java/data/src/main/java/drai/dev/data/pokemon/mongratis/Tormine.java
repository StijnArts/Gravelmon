package drai.dev.data.pokemon.mongratis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Tormine extends drai.dev.data.pokemon.Pokemon {
    public Tormine() {
        super("Tormine",
                Type.FIRE, Type.ROCK,
                new Stats(85,
                        88,
                        162,
                        88,
                        95,
                        20),
                List.of(Ability.WHITE_SMOKE,Ability.DROUGHT), Ability.SHELL_ARMOR,
                13, 1206,
                new Stats(0,0,3,0,0,0), 60,
                0.5,
                195, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("When threatened, Tormine swiftly ignites its coal stores and produces a powerful blast of heat and gas, hot enough to melt metal ore, to ward away its attacker."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FISSURE,"tm"),
                        new MoveLearnSetEntry(Move.SKULL_BASH,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.YAWN,"tm"),
                        new MoveLearnSetEntry(Move.ERUPTION,"tm"),
                        new MoveLearnSetEntry(Move.FLAME_BURST,"tm"),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,"tm")                        ),
                List.of(Label.MONGRATIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Tormine");

    }


}
