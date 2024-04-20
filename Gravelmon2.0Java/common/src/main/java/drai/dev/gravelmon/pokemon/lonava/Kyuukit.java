package drai.dev.gravelmon.pokemon.lonava;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Kyuukit extends drai.dev.gravelmon.pokemon.Pokemon {
    public Kyuukit() {
        super("Kyuukit",
                Type.FIRE, Type.FAIRY,
                new Stats(45,
                        40,
                        30,
                        45,
                        60,
                        72),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Kyuukit adore hot springs, especially those found near the western seaboard of Lonava. These scrappy Pokemon can alter the humidity of the surrounding air to slow down their opponents, though it usually leaves their fur very poofy."),
                List.of(),
                List.of(                        ),
                List.of(Label.LONAVA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Kyuukit");

    }


}
