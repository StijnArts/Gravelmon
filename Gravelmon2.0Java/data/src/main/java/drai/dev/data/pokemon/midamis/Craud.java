package drai.dev.data.pokemon.midamis;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Craud extends drai.dev.data.pokemon.Pokemon {
    public Craud() {
        super("Craud",
                Type.BUG, Type.ROCK,
                new Stats(100,
                        90,
                        195,
                        45,
                        55,
                        25),
                List.of(Ability.ROCK_HEAD,Ability.STURDY,Ability.GUTS), Ability.GUTS,
                18, 165,
                new Stats(0,0,0,0,0,0), 60,
                1.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of( new MoveLearnSetEntry(Move.FURY_CUTTER,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.WITHDRAW,4),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,8),
                        new MoveLearnSetEntry(Move.BUG_BITE,12),
                        new MoveLearnSetEntry(Move.FLAIL,16),
                        new MoveLearnSetEntry(Move.SLASH,20),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,24),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,28),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,32),
                        new MoveLearnSetEntry(Move.XSCISSOR,36),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,40),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,44),
                        new MoveLearnSetEntry(Move.ROCK_WRECKER,48)),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 44, 61, .2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DECIDUOUS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Craud");

    }


}
