package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Sproutrop extends drai.dev.gravelmon.pokemon.Pokemon {
    public Sproutrop() {
        super("Sproutrop",
                Type.GRASS, Type.ROCK,
                new Stats(104,
                        64,
                        64,
                        64,
                        60,
                        60),
                List.of(Ability.LEAF_GUARD), Ability.FIREPROOF,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.MONSTER),
                List.of("Bamboo ShotSTAB Grass"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BAMBOOSHOT,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Sproutrop");

    }


}
