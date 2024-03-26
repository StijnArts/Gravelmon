package drai.dev.gravelmon.pokemon.mushi;


import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Shugatrix extends drai.dev.gravelmon.pokemon.Pokemon {
    public Shugatrix() {
        super("Shugatrix",
                Type.FAIRY,Type.ELECTRIC,
                new Stats(58,
                        102,
                        54,
                        102,
                        61,
                        113),
                List.of(Ability.SWEET_VEIL,Ability.UNBURDEN), Ability.UNAWARE,
                0, 0,
                new Stats(0,0,0,0,0,2), 45,
                1.0,
                221, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FAIRY),
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
           setLangFileName("Shugatrix");

    }


}
