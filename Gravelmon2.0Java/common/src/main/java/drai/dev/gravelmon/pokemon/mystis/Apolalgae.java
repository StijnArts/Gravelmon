package drai.dev.gravelmon.pokemon.mystis;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Apolalgae extends drai.dev.gravelmon.pokemon.Pokemon {
    public Apolalgae() {
        super("Apolalgae",
                Type.GRASS, Type.WATER,
                new Stats(95,
                        30,
                        80,
                        60,
                        110,
                        25),
                List.of(Ability.HYDRATION,Ability.WATER_ABSORB), Ability.WATER_COMPACTION,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Squishy and full of nutrients and water, Apolalgae make a loud wailing noise to deter predators. This usually ends up backfiring, attracting even more."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TEARFUL_LOOK,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,1)                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Apolalgae");

    }


}
