package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Ripplier extends drai.dev.gravelmon.pokemon.Pokemon {
    public Ripplier() {
        super("Ripplier",
                Type.STEEL,
                new Stats(60,
                        90,
                        51,
                        60,
                        65,
                        79),
                List.of(Ability.TEMPER), Ability.STEADFAST,
                8, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.875,
                141, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of(""),
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
           setLangFileName("Ripplier");

    }


}
