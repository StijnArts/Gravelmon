package drai.dev.gravelmon.pokemon.terranov;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Hermitaur extends drai.dev.gravelmon.pokemon.Pokemon {
    public Hermitaur() {
        super("Hermitaur",
                Type.BUG,Type.WATER,
                new Stats(60,
                        50,
                        85,
                        75,
                        70,
                        50),
                List.of(Ability.SHELL_ARMOR), Ability.SHELL_ARMOR,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
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
           setLangFileName("Hermitaur");

    }


}
