package drai.dev.data.pokemon.ishiria.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class IshirianSewaddle extends drai.dev.data.pokemon.Pokemon {
    public IshirianSewaddle(String name, Aspect aspect) {
        super(name, aspect, "IshirianSewaddle",
                Type.GRASS,Type.STEEL,
                new Stats(45,
                        43,
                        65,
                        43,
                        65,
                        49),
                List.of(Ability.OVERGROW,Ability.LEAF_GUARD), Ability.OVERCOAT,
                3, 250,
                new Stats(0,3,0,0,0,0), 255,
                0.5,
                225, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("It keeps its eggs warm with heat from fermenting leaves. It also uses leaves to make warm wrappings for Sewaddle."),
                List.of(new EvolutionEntry("ishirianswadloon", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20")))),
                List.of(
                ),
                List.of(Label.ISHIRIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(10).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TAIGA)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
        setLangFileName("Sewaddle");

    }
}
