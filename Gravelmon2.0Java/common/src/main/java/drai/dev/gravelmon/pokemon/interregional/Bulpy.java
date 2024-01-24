package drai.dev.gravelmon.pokemon.interregional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Bulpy extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bulpy() {
        super("Bulpy",
                Type.NORMAL,
                new Stats(30,
                        30,
                        40,
                        30,
                        35,
                        40),
                List.of(Ability.CUTE_CHARM), Ability.RUN_AWAY,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Families from all over the world pay large amounts of money to get their hands on their own pet Bulpy. Their cuteness has become an internet sensation."),
                List.of(),
                List.of(                        ),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Bulpy");

    }


}
