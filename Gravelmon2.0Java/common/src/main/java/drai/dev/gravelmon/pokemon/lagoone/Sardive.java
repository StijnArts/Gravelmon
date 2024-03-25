package drai.dev.gravelmon.pokemon.lagoone;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Sardive extends drai.dev.gravelmon.pokemon.Pokemon {
    public Sardive() {
        super("Sardive",
                Type.WATER,
                new Stats(40,
                        30,
                        40,
                        65,
                        40,
                        75),
                List.of(Ability.PICKUP), Ability.MARVEL_SCALE,
                4, 32,
                new Stats(1,0,0,0,0,0), 220,
                0.5,
                52, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("They swim in very large groups in the ocean, if one is too tired to keep swimming it will use its hook tail to cling to another's tail and be pulled alongside."),
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
           setLangFileName("Sardive");

    }


}
