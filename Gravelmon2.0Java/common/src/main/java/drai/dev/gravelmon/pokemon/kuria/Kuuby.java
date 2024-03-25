package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Kuuby extends drai.dev.gravelmon.pokemon.Pokemon {
    public Kuuby() {
        super("Kuuby",
                Type.FIRE,
                new Stats(78,
                        66,
                        51,
                        30,
                        51,
                        43),
                List.of(Ability.BLAZE), Ability.SUPERNOVA,
                4, 54,
                new Stats(0,1,0,0,0,0), 45,
                0.875,
                62, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.FIELD),
                List.of("Kuuby float around carefree most of their days but are very easily startled. This usually leads to their inner heat coming out and setting the surroundings on fire."),
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
           setLangFileName("Kuuby");

    }


}
