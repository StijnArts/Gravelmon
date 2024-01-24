package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Belublebug extends drai.dev.gravelmon.pokemon.Pokemon {
    public Belublebug() {
        super("Belublebug",
                Type.FIRE,Type.BUG,
                new Stats(99,
                        88,
                        77,
                        66,
                        55,
                        44),
                List.of(Ability.FLAME_BODY), Ability.FRIEND_GUARD,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Once a Belublebug finds its soulmate, the two are paired for life and never leave each other's sides. They have difficulty flying alone due to their weak wings, but two together are able to support their collective weight."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CHERUBARROW,"tm")                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Belublebug");

    }


}
