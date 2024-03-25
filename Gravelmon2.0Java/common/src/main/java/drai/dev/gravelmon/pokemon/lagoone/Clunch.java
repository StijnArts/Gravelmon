package drai.dev.gravelmon.pokemon.lagoone;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Clunch extends drai.dev.gravelmon.pokemon.Pokemon {
    public Clunch() {
        super("Clunch",
                Type.WATER,
                new Stats(40,
                        50,
                        90,
                        30,
                        40,
                        40),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                4, 60,
                new Stats(0,0,1,0,0,0), 180,
                0.5,
                58, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("Its real body is concealed inside a seashell. Due to its light body they will clamp on surfaces to not get carried by strong currents."),
                List.of(),
                List.of(                        ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Clunch");

    }


}
