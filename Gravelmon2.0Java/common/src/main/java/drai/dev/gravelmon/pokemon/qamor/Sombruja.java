package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Sombruja extends drai.dev.gravelmon.pokemon.Pokemon {
    public Sombruja() {
        super("Sombruja",
                Type.DARK,Type.FAIRY,
                new Stats(60,
                        90,
                        63,
                        99,
                        70,
                        110),
                List.of(Ability.TANGLING_HAIR), Ability.DARKHOLD,
                8, 165,
                new Stats(0,0,0,1,0,1), 50,
                0.5,
                173, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FAIRY),
                List.of("Sombruja have long, braided hair that it often use as weaposn to whip opponents and prey. Although considered top predators with an immense skill for stealthy kills, these Pokemon are actually incredibly timid yet curious, they often silently follow trainers traversing through their jungle homes, careful not to alarm suspicion."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FALSE_SURRENDER,1),
                        new MoveLearnSetEntry(Move.SING,15),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,20),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,27),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,31),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,36),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,41),
                        new MoveLearnSetEntry(Move.NIGHT_DAZE,48),
                        new MoveLearnSetEntry(Move.PARTING_SHOT,55),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,62),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.COTTON_GUARD,"tm"),
                        new MoveLearnSetEntry(Move.AFTER_YOU,"tm")                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Sombruja");

    }


}
