package drai.dev.gravelmon.pokemon.mushi;


import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;
public class Debribriz extends drai.dev.gravelmon.pokemon.Pokemon {
    public Debribriz() {
        super("Debribriz",
                Type.GROUND,
                new Stats(58,
                        70,
                        97,
                        24,
                        45,
                        34),
                List.of(Ability.HEATPROOF,Ability.MOLD_BREAKER), Ability.EARTH_EATER,
                0, 0,
                new Stats(0,0,1,0,0,0), 120,
                0.5,
                66, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.MUSHI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Debribriz");

    }


}
