package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Gilkun extends drai.dev.gravelmon.pokemon.Pokemon {
    public Gilkun() {
        super("Gilkun",
                Type.WATER,
                new Stats(62,
                        63,
                        55,
                        63,
                        55,
                        62),
                List.of(Ability.SWIFT_SWIM,Ability.HYDRATION), Ability.OBLIVIOUS,
                4, 19,
                new Stats(0,0,0,1,0,0), 45,
                0.49,
                55, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.WATER_2),
                List.of("49% Male and 49% Female, 2% Genderless."),
                List.of(),
                List.of(                        ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Gilkun");

    }


}
