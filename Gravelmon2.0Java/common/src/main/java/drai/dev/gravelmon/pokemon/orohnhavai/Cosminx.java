package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Cosminx extends drai.dev.gravelmon.pokemon.Pokemon {
    public Cosminx() {
        super("Cosminx",
                Type.FAIRY,Type.GHOST,
                new Stats(50,
                        80,
                        45,
                        105,
                        80,
                        120),
                List.of(Ability.IMMUNITY,Ability.FILTER,Ability.MISTY_SURGE), Ability.MISTY_SURGE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Scientists are unable to trace its origins but it is believed they migrated from a space cloud in deep space. It is said the gas emitting from its body has healing powers and purifies the air."),
                List.of(),
                List.of(                        ),
                List.of(Label.OROHNHAVAI
),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Cosminx");

    }


}
