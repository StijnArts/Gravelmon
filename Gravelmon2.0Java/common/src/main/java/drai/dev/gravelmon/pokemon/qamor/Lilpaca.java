package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Lilpaca extends drai.dev.gravelmon.pokemon.Pokemon {
    public Lilpaca() {
        super("Lilpaca",
                Type.ROCK,Type.ICE,
                new Stats(78,
                        25,
                        98,
                        43,
                        86,
                        70),
                List.of(Ability.FUR_COAT), Ability.SOLID_ROCK,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Lilpaca mostly eat rocks and minerals for nutrients. As a result of this diet, their body naturally produces turquoise colored rocks that help protect them against harm."),
                List.of(),
                List.of(                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Lilpaca");

    }


}
