package drai.dev.gravelmon.pokemon.mushi;


import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;
public class Koromite extends drai.dev.gravelmon.pokemon.Pokemon {
    public Koromite() {
        super("Koromite",
                Type.GROUND,
                new Stats(65,
                        120,
                        135,
                        40,
                        70,
                        20),
                List.of(Ability.SAND_STREAM,Ability.SAP_SIPPER), Ability.WATER_ABSORB,
                0, 0,
                new Stats(0,1,2,0,0,0), 90,
                0.5,
                158, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
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
           setLangFileName("Koromite");

    }


}
