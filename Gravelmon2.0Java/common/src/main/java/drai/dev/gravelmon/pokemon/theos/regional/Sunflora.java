package drai.dev.gravelmon.pokemon.theos.regional;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Sunflora extends drai.dev.gravelmon.pokemon.Pokemon {
    public Sunflora(int dex) {
        super(dex, "Sunflora",
                Type.GRASS, Type.FIRE,
                new Stats(75,
                        75,
                        55,
                        115,
                        75,
                        30),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                12, 85,
                new Stats(0,0,0,2,0,0), 255,
                0.5,
                149, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The strong sunlight of Theos allows Theosian Sunflora to convert their excess energy into powerful solar attacks."),
                List.of(),
                List.of(                        ),
                List.of(Label.THEOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Sunflora");

    }


}
