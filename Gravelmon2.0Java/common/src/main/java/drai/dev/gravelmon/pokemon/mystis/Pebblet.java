package drai.dev.gravelmon.pokemon.mystis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Pebblet extends drai.dev.gravelmon.pokemon.Pokemon {
    public Pebblet() {
        super("Pebblet",
                Type.DARK,Type.ROCK,
                new Stats(70,
                        80,
                        60,
                        50,
                        30,
                        40),
                List.of(Ability.GLUTTONY), Ability.ANGER_POINT,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                66, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Pebblet's stone body is inhabited by crystals made of malice. If the crystals are shattered, Pebblet stops moving."),
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
           setLangFileName("Pebblet");

    }


}
