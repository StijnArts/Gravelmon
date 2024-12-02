package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Crimby extends drai.dev.data.pokemon.Pokemon {
    public Crimby() {
        super("Crimby",
                Type.FIRE,
                new Stats(60,
                        54,
                        20,
                        73,
                        40,
                        48),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                3, 22,
                new Stats(0,0,0,1,0,0), 120,
                0.5,
                59, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Crimby's body is very elastic and can absorb a lot of small damage. Radiates a lot of heat, making its body warm to the touch."),
                List.of(),
                List.of(),
                List.of(Label.KORZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Crimby");

    }


}
