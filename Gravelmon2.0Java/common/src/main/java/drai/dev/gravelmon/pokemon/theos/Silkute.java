package drai.dev.gravelmon.pokemon.theos;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Silkute extends drai.dev.gravelmon.pokemon.Pokemon {
    public Silkute() {
        super("Silkute",
                Type.BUG,Type.PSYCHIC,
                new Stats(70,
                        30,
                        70,
                        60,
                        75,
                        30),
                List.of(Ability.SWARM), Ability.FILTER,
                7, 40,
                new Stats(1,0,0,0,0,0), 255,
                0.5,
                118, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
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
           setLangFileName("Silkute");

    }


}
