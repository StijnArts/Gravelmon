package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Astreon extends drai.dev.gravelmon.pokemon.Pokemon {
    public Astreon() {
        super("Astreon",
                Type.COSMIC,
                new Stats(65,
                        65,
                        60,
                        130,
                        110,
                        95),
                List.of(Ability.SIGNALBOOST), Ability.WONDER_SKIN,
                9, 171,
                new Stats(0,0,0,2,0,0), 45,
                0.125,
                190, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Astreon are almost never paying attention. They daydream constantly of space and the stars, and will spend all night staring at the sky."),
                List.of(),
                List.of(                        ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Astreon");

    }


}
