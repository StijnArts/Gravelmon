package drai.dev.data.pokemon.raian;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Azagger extends drai.dev.data.pokemon.Pokemon {
    public Azagger(Stats stats) {
        super("Azagger",
                Type.STEEL,Type.PSYCHIC,
                stats,
                List.of(Ability.LEVITATE), null,
                23, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.RAIAN),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 41, 65, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.JUNGLE_PYRAMID),
                0.28, 0.3,
                List.of());
        addAdditionalEvolution("claydol", new EvolutionEntry("Azagger", EvolutionType.ITEM_INTERACT, false, List.of(),
                List.of(),List.of(),"minecraft:blaze_rod"));
           setLangFileName("Azagger");
        setCanFly(true);

    }


}
