package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Konsert extends drai.dev.gravelmon.pokemon.Pokemon {
    public Konsert() {
        super("Konsert",
                Type.DRAGON,Type.NORMAL,
                new Stats(92,
                        98,
                        73,
                        105,
                        95,
                        75),
                List.of(Ability.PUNK_ROCK), Ability.PUNK_ROCK,
                8, 165,
                new Stats(0,1,0,2,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.HUMAN_LIKE),
                List.of("Konsert have reached the highest potential of musical ability. These Pokemon absolutely live for theatrics and turn everything into a huge show and often flex their advanced guitar skills to make other Pokemon and people swoon. Konsert's natural instrument- its voice- has an astounding amount of vocal ranges and frequencies."),
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
           setLangFileName("Konsert");

    }


}
