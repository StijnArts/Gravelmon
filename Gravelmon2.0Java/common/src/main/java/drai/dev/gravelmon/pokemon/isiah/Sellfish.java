package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Sellfish extends drai.dev.gravelmon.pokemon.Pokemon {
    public Sellfish() {
        super("Sellfish",
                Type.WATER,Type.DARK,
                new Stats(70,
                        65,
                        140,
                        50,
                        95,
                        40),
                List.of(Ability.SHELL_ARMOR,Ability.UNBURDEN,Ability.RAIN_DISH), Ability.RAIN_DISH,
                8, 165,
                new Stats(0,0,2,0,0,0), 0,
                0.5,
                154, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Sellfish");

    }


}
