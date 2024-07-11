package drai.dev.data.pokemon.lagoone.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class LagoonanLitwick extends drai.dev.data.pokemon.Pokemon {
    public LagoonanLitwick(String name, Aspect aspect) {
        super(name, aspect, "Litwick",
                Type.FIRE,Type.GRASS,
                new Stats(50,
                        30,
                        55,
                        65,
                        55,
                        20),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                3, 31,
                new Stats(0,0,0,1,0,0), 50,
                0.5,
                55, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
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
           setLangFileName("Litwick");

    }


}
