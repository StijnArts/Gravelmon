package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Lilquen extends drai.dev.data.pokemon.Pokemon {
    public Lilquen() {
        super("Lilquen",
                Type.GRASS, Type.ELECTRIC,
                new Stats(70,
                        15,
                        15,
                        32,
                        100,
                        10),
                List.of(Ability.CHLOROPHYLL,Ability.STATIC,Ability.SIMPLE), Ability.SIMPLE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Crop Circle Psychic"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CROPCIRCLE,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Lilquen");

    }


}
