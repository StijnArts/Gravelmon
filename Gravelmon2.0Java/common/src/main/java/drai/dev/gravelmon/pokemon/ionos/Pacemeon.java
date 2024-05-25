package drai.dev.gravelmon.pokemon.ionos;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Pacemeon extends drai.dev.gravelmon.pokemon.Pokemon {
    public Pacemeon() {
        super("Pacemeon",
                Type.GROUND, Type.FAIRY,
                new Stats(130,
                        80,
                        90,
                        90,
                        100,
                        40),
                List.of(Ability.SAND_FORCE), Ability.SCRAPPY,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.87,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Pacemeon rarely moves an inch due to its lazy yet peaceful nature. It was first seen around 3,000 years ago during an era of peace and verdure. Only a just king or queen will earn its respect."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.CURSE,1),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,6),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,10),
                        new MoveLearnSetEntry(Move.DISABLE,16),
                        new MoveLearnSetEntry(Move.BITE,20),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,24),
                        new MoveLearnSetEntry(Move.BULLDOZE,28),
                        new MoveLearnSetEntry(Move.SANDSTORM,33),
                        new MoveLearnSetEntry(Move.POWER_GEM,37),
                        new MoveLearnSetEntry(Move.REST,42),
                        new MoveLearnSetEntry(Move.PUNISHMENT,45),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,50),
                        new MoveLearnSetEntry(Move.RECOVER,57),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,62),
                        new MoveLearnSetEntry(Move.EARTH_POWER,68)                        ),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Pacemeon");

    }


}
