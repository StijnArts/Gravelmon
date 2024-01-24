package drai.dev.gravelmon.pokemon.orohnhavai.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class HavaiianHaunter extends drai.dev.gravelmon.pokemon.Pokemon {
    public HavaiianHaunter() {
        super("Haunter",
                Type.GHOST,Type.FIRE,
                new Stats(45,
                        45,
                        55,
                        115,
                        50,
                        95),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It lurks in the darkness, luring its victims with the fire from within its body. It then licks them, completely absorbing all their energy. This is known as the 'death lick'. Chills run down your spine afterward."),
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
           setLangFileName("Haunter");

    }


}
