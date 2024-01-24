package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Friney extends drai.dev.gravelmon.pokemon.Pokemon {
    public Friney() {
        super("Friney",
                Type.STEEL,
                new Stats(50,
                        60,
                        35,
                        50,
                        50,
                        60),
                List.of(Ability.TEMPER), Ability.STEADFAST,
                8, 165,
                new Stats(0,1,0,0,0,0), 45,
                0.875,
                61, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("Friney's tapered, aerodynamic body makes it an excellent swimmer. They love to challenge other Pokemon to races, effortlessly taking advantage of the ocean currents to gain the upper hand."),
                List.of(),
                List.of(                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Friney");

    }


}
