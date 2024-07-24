package drai.dev.data.pokemon.goetia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Glowyrm extends drai.dev.data.pokemon.Pokemon {
    public Glowyrm(Stats stats) {
        super("Glowyrm",
                Type.BUG, Type.DRAGON,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                9, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Glowyrm is the final evolution of Lumini, a predator that runs swiftly and catches its enemies off guard. Because they use their lights to attract both prey and mates, they tend to be quite hostile."),
                List.of(),
                List.of(                        ),
                List.of(Label.GOETIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 32, 51, .2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST, Biome.IS_SWAMP)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Glowyrm");

    }


}
