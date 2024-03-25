package drai.dev.gravelmon.pokemon.goetia;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Apeiron extends drai.dev.gravelmon.pokemon.Pokemon {
    public Apeiron() {
        super("Apeiron",
                Type.PSYCHIC,Type.NORMAL,
                new Stats(90,
                        65,
                        120,
                        85,
                        130,
                        80),
                List.of(Ability.PERPLEXING), Ability.PSYCHIC_SURGE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Anywhere it settles becomes distorted, everything and everyone becoming one with the spiral. Even so much as gazing upon its shell, its true body, is enough to cause vertigo."),
                List.of(),
                List.of(                        ),
                List.of(Label.GOETIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Apeiron");

    }


}
