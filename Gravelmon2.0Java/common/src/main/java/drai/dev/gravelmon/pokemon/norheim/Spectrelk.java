package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Spectrelk extends drai.dev.gravelmon.pokemon.Pokemon {
    public Spectrelk() {
        super("Spectrelk",
                Type.GHOST, Type.NORMAL,
                new Stats(75,
                        80,
                        65,
                        90,
                        110,
                        80),
                List.of(Ability.EARLY_BIRD), Ability.MISTY_SURGE,
                21, 165,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Spectrelk is a rare sight to behold and it is the cause of foggy and gloomy weather. While bellowing and rutting, it calls for the morning mist. The foggy weather protects the corners of Norheim’s primal forests and greets the passing of Pokemon to join the spirit world."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.LEER,4),
                        new MoveLearnSetEntry(Move.SPITE,6),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,9),
                        new MoveLearnSetEntry(Move.HAZE,17),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,20),
                        new MoveLearnSetEntry(Move.STOMP,25),
                        new MoveLearnSetEntry(Move.MIST,29),
                        new MoveLearnSetEntry(Move.HEX,32),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,35),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,40),
                        new MoveLearnSetEntry(Move.LIFE_DEW,45),
                        new MoveLearnSetEntry(Move.HORN_LEECH,50),
                        new MoveLearnSetEntry(Move.AROMATIC_MIST,56),
                        new MoveLearnSetEntry(Move.LAST_RESORT,62),
                        new MoveLearnSetEntry(Move.TRI_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.WATER_SPORT,"tm"),
                        new MoveLearnSetEntry(Move.MEGAHORN,"tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,"tm"),
                        new MoveLearnSetEntry(Move.MISTY_TERRAIN,"tm")                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 34, 53, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_HIGHLANDS, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Spectrelk");

    }


}
