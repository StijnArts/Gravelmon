package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Larbor extends drai.dev.data.pokemon.Pokemon {
    public Larbor() {
        super("Larbor",
                Type.GRASS, Type.BUG,
                new Stats(90,
                        50,
                        75,
                        85,
                        85,
                        40),
                List.of(Ability.OVERGROW), Ability.TRIAGE,
                11, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.875,
                149, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.BUG),
                List.of(""),
                List.of(new EvolutionEntry("Anbrosia", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")))),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .starter()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_FOREST)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Larbor");

    }


}
