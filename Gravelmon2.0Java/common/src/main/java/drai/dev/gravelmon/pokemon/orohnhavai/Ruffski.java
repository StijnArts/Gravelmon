package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Ruffski extends drai.dev.gravelmon.pokemon.Pokemon {
    public Ruffski() {
        super("Ruffski",
                Type.ICE,Type.NORMAL,
                new Stats(35,
                        70,
                        30,
                        40,
                        30,
                        65),
                List.of(Ability.SNOW_CLOAK,Ability.ICE_BODY,Ability.RIVALRY), Ability.RIVALRY,
                8, 165,
                new Stats(0,1,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Because they are only found in northern areas, they like to play and run around all day to keep their body heat at a suitable temperature."),
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
           setLangFileName("Ruffski");

    }


}
