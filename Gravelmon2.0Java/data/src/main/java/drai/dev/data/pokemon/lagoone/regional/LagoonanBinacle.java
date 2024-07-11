package drai.dev.data.pokemon.lagoone.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class LagoonanBinacle extends drai.dev.data.pokemon.Pokemon {
    public LagoonanBinacle(String name, Aspect aspect) {
        super(name, aspect, "Binacle",
                Type.GHOST,Type.FIRE,
                new Stats(42,
                        52,
                        67,
                        56,
                        39,
                        50),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                5, 310,
                new Stats(0,1,0,0,0,0), 120,
                0.5,
                61, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Binacle");

    }


}
