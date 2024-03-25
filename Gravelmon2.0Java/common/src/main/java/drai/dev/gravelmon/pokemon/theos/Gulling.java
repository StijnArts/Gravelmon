package drai.dev.gravelmon.pokemon.theos;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Gulling extends drai.dev.gravelmon.pokemon.Pokemon {
    public Gulling() {
        super("Gulling",
                Type.FLYING,
                new Stats(50,
                        70,
                        30,
                        70,
                        30,
                        75),
                List.of(Ability.EARLY_BIRD), Ability.WIND_RIDER,
                5, 21,
                new Stats(0,1,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("With limited flying prowess, Gullings linger along steep cliffs, skillfully catching updrafts to glide through the air."),
                List.of(),
                List.of(                        ),
                List.of(Label.THEOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Gulling");

    }


}
