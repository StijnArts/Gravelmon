package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Bwobble extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bwobble() {
        super("Bwobble",
                Type.DRAGON,
                new Stats(40,
                        60,
                        80,
                        40,
                        40,
                        40),
                List.of(Ability.POISON_POINT), Ability.POISON_POINT,
                8, 165,
                new Stats(0,0,1,0,0,0), 45,
                0.5,
                60, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_2,EggGroup.DRAGON),
                List.of("Bwobble are immediately abandoned at birth and never know their parents. Their plump, rubbery bodies protect them from the abuse they constantly receive as they wander aimlessly."),
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
           setLangFileName("Bwobble");

    }


}
