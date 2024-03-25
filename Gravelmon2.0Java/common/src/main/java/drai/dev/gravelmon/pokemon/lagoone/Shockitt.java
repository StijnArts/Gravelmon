package drai.dev.gravelmon.pokemon.lagoone;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Shockitt extends drai.dev.gravelmon.pokemon.Pokemon {
    public Shockitt() {
        super("Shockitt",
                Type.DARK,Type.ELECTRIC,
                new Stats(40,
                        50,
                        45,
                        70,
                        30,
                        65),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                7, 61,
                new Stats(0,0,0,1,0,0), 45,
                0.5,
                60, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD),
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
           setLangFileName("Shockitt");

    }


}
