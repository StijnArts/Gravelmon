package drai.dev.gravelmon.pokemon.fliga;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Intelattod extends drai.dev.gravelmon.pokemon.Pokemon {
    public Intelattod() {
        super("Intelattod",
                Type.PSYCHIC,Type.BUG,
                new Stats(65,
                        40,
                        90,
                        120,
                        95,
                        60),
                List.of(Ability.ANALYTIC,Ability.SYNCHRONIZE), Ability.TELEPATHY,
                7, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Intelattod are said to have dated back since the Stone Age. Then, they were as big as a fully grown trainer. Even if they're not nearly as large as their ancestors, they're still equally, if not more powerful."),
                List.of(),
                List.of(                        ),
                List.of(Label.FLIGA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Intelattod");

    }


}
