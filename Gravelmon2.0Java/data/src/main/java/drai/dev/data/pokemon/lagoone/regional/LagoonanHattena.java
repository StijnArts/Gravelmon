package drai.dev.data.pokemon.lagoone.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class LagoonanHattena extends drai.dev.data.pokemon.Pokemon {
    public LagoonanHattena(String name, Aspect aspect) {
        super(name, aspect,"Hattena",
                Type.FAIRY,Type.WATER,
                new Stats(42,
                        30,
                        45,
                        56,
                        53,
                        39),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                4, 34,
                new Stats(0,0,0,1,0,0), 235,
                0.0,
                53, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FAIRY),
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
           setLangFileName("Hattena");

    }


}
