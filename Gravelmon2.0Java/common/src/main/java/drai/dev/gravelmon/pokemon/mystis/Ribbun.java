package drai.dev.gravelmon.pokemon.mystis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Ribbun extends drai.dev.gravelmon.pokemon.Pokemon {
    public Ribbun() {
        super("Ribbun",
                Type.NORMAL,
                new Stats(50,
                        30,
                        45,
                        60,
                        45,
                        50),
                List.of(Ability.QUICK_FEET,Ability.THICK_FAT), Ability.HUGE_POWER,
                0, 0,
                new Stats(0,0,0,0,0,0), 255,
                0.5,
                56, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Ribbun");

    }


}
