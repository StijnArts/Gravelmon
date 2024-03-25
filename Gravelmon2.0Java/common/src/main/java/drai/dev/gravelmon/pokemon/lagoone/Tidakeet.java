package drai.dev.gravelmon.pokemon.lagoone;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Tidakeet extends drai.dev.gravelmon.pokemon.Pokemon {
    public Tidakeet() {
        super("Tidakeet",
                Type.PSYCHIC,Type.WATER,
                new Stats(40,
                        35,
                        35,
                        80,
                        90,
                        50),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                5, 150,
                new Stats(0,0,0,0,1,0), 190,
                0.5,
                66, ExperienceGroup.SLOW,
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
           setLangFileName("Tidakeet");

    }


}
