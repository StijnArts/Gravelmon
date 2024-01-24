package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Scalfib extends drai.dev.gravelmon.pokemon.Pokemon {
    public Scalfib() {
        super("Scalfib",
                Type.WATER,
                new Stats(50,
                        40,
                        40,
                        60,
                        45,
                        50),
                List.of(Ability.UNNERVE,Ability.WATER_VEIL,Ability.ANTICIPATION), Ability.ANTICIPATION,
                8, 165,
                new Stats(0,0,0,1,0,0), 235,
                0.5,
                57, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.WATER_2,EggGroup.MONSTER),
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
           setLangFileName("Scalfib");

    }


}
