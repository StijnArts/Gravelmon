package drai.dev.gravelmon.pokemon.terranov;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Gigginox extends drai.dev.gravelmon.pokemon.Pokemon {
    public Gigginox() {
        super("Gigginox",
                Type.POISON,Type.DARK,
                new Stats(60,
                        78,
                        75,
                        95,
                        95,
                        87),
                List.of(Ability.MERCILESS), Ability.STAMINA,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("A venomous cave dwelling creature that crawls around walls and ceillings, and constantly lays large eggs which hatch multiple offsprings almost instantlly. When enraged Gigginox's skin will harden allowing it to be more reckless."),
                List.of(),
                List.of(                        ),
                List.of(Label.TERRANOV),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Gigginox");

    }


}
