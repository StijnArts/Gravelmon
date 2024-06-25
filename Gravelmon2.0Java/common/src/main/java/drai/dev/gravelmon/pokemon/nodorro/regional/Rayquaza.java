package drai.dev.gravelmon.pokemon.nodorro.regional;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Rayquaza extends drai.dev.gravelmon.pokemon.Pokemon {
    public Rayquaza(String originalMon, Aspect aspect) {
        super(originalMon, aspect, "Rayquaza",
                Type.DRAGON, Type.FLYING,
                new Stats(105,
                        150,
                        90,
                        150,
                        90,
                        95),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                70, 2060,
                new Stats(0,2,0,2,0,0), 5,
                0.0,
                306, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Rayquack"),
                List.of(),
                List.of(                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Rayquaza");

    }


}
