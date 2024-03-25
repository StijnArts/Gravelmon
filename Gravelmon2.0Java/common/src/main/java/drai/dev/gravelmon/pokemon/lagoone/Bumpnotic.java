package drai.dev.gravelmon.pokemon.lagoone;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Bumpnotic extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bumpnotic() {
        super("Bumpnotic",
                Type.PSYCHIC,Type.WATER,
                new Stats(95,
                        60,
                        50,
                        100,
                        150,
                        60),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                14, 720,
                new Stats(0,0,0,0,2,0), 75,
                0.5,
                161, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of(""),
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
           setLangFileName("Bumpnotic");

    }


}
