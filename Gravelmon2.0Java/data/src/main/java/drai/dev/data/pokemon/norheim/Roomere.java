package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Roomere extends drai.dev.data.pokemon.Pokemon {
    public Roomere() {
        super("Roomere",
                Type.GHOST, Type.FIRE,
                new Stats(110,
                        70,
                        50,
                        95,
                        95,
                        75),
                List.of(Ability.LEVITATE,Ability.CUTE_CHARM,Ability.INFILTRATOR), Ability.INFILTRATOR,
                11, 165,
                new Stats(0,0,0,0,0,0), 90,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Roomere may appear inside local buildings next to roads, spreading rumors. Some say that these ghosts used to work as innkeeper ladies and were the victims of terrible house fires."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,8),
                        new MoveLearnSetEntry(Move.EMBER,11),
                        new MoveLearnSetEntry(Move.WILLOWISP,17),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,22),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,25),
                        new MoveLearnSetEntry(Move.INCINERATE,29),
                        new MoveLearnSetEntry(Move.TORMENT,32),
                        new MoveLearnSetEntry(Move.MYSTICAL_FIRE,40),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,48),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,53),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,59),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,66)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 33, 56, .7, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Roomere");

    }


}
