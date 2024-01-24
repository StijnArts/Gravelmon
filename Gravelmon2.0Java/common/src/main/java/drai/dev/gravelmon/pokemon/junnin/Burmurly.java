package drai.dev.gravelmon.pokemon.junnin;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Burmurly extends drai.dev.gravelmon.pokemon.Pokemon {
    public Burmurly() {
        super("Burmurly",
                Type.FIRE,
                new Stats(63,
                        71,
                        52,
                        84,
                        44,
                        91),
                List.of(Ability.BLAZE), Ability.COMPETITIVE,
                8, 165,
                new Stats(0,0,0,1,0,1), 45,
                0.875,
                142, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Burmurly swings though the trees with such speed that it has been nicknamed 'the Flaming Flash'. It's very careful not to set the branches from which it swings aflame."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BURNINGSNEEZE,"tm"),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,"tm")                        ),
                List.of(Label.JUNNIN),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Burmurly");

    }


}
