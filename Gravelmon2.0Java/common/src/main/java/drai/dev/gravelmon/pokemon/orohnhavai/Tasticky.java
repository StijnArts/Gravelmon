package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Tasticky extends drai.dev.gravelmon.pokemon.Pokemon {
    public Tasticky() {
        super("Tasticky",
                Type.NORMAL,
                new Stats(60,
                        40,
                        60,
                        40,
                        60,
                        25),
                List.of(Ability.OWN_TEMPO,Ability.OBLIVIOUS,Ability.CLOUD_NINE), Ability.CLOUD_NINE,
                8, 165,
                new Stats(1,0,0,0,0,0), 130,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of(""),
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
           setLangFileName("Tasticky");

    }


}
