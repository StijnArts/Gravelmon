package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Wandream extends drai.dev.data.pokemon.Pokemon {
    public Wandream() {
        super("Wandream",
                Type.PSYCHIC,
                new Stats(80,
                        70,
                        80,
                        90,
                        90,
                        60),
                List.of(Ability.ZEN_MODE), Ability.COMATOSE,
                10, 320,
                new Stats(0,0,0,2,0,0), 75,
                0.5,
                160, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 23, 45, 1.1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Wandream");

    }


}
