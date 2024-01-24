package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Sambranaust extends drai.dev.gravelmon.pokemon.Pokemon {
    public Sambranaust() {
        super("Sambranaust",
                Type.GRASS,Type.ROCK,
                new Stats(95,
                        85,
                        125,
                        75,
                        85,
                        45),
                List.of(Ability.IRON_BARBS), Ability.FILTER,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                1.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Sambranaust's intimidating appearance may put off trainers from raising it, but don't be fooled. It merely wants to have a good time and relax with those who take good care of it."),
                List.of(),
                List.of(                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Sambranaust");

    }


}
