package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Sealestial extends drai.dev.gravelmon.pokemon.Pokemon {
    public Sealestial() {
        super("Sealestial",
                Type.BUG,Type.POISON,
                new Stats(73,
                        50,
                        105,
                        95,
                        55,
                        72),
                List.of(Ability.SHELL_ARMOR), Ability.POISON_POINT,
                8, 165,
                new Stats(0,0,0,3,0,0), 45,
                0.5,
                203, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG,EggGroup.WATER_3),
                List.of("It moves gracefully like a dancer but also has a dark side. After stinging its prey and paralyzing it, it proceeds to slowly swallow it alive."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.QUIVER_DANCE,1),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,"tm"),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,"tm")                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Sealestial");

    }


}
