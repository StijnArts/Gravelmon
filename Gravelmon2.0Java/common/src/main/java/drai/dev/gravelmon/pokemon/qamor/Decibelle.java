package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Decibelle extends drai.dev.gravelmon.pokemon.Pokemon {
    public Decibelle() {
        super("Decibelle",
                Type.NORMAL,
                new Stats(50,
                        48,
                        40,
                        61,
                        45,
                        36),
                List.of(Ability.PUNK_ROCK), Ability.PUNK_ROCK,
                8, 165,
                new Stats(0,0,0,1,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.HUMAN_LIKE),
                List.of("Decibelle are very musically gifted pokemon. They learn to play new songs very quickly, and master any instruments with ease."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CLANGOROUS_SOUL,"tm"),
                        new MoveLearnSetEntry(Move.OVERDRIVE,"tm")                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Decibelle");

    }


}
