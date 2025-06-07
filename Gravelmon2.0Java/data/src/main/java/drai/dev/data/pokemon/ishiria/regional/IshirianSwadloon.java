package drai.dev.data.pokemon.ishiria.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class IshirianSwadloon extends drai.dev.data.pokemon.Pokemon {
    public IshirianSwadloon(String name, Aspect aspect) {
        super(name, aspect, "IshirianSwadloon",
                Type.GRASS,Type.STEEL,
                new Stats(55,
                        53,
                        85,
                        53,
                        85,
                        49),
                List.of(Ability.OVERGROW,Ability.LEAF_GUARD), Ability.OVERCOAT,
                5, 252,
                new Stats(0,3,0,0,0,0), 120,
                0.5,
                225, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("It keeps its eggs warm with heat from fermenting leaves. It also uses leaves to make warm wrappings for Sewaddle."),
                List.of(new EvolutionEntry("ishirianLeavanny", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:leaf_stone")),
                List.of(
                ),
                List.of(Label.ISHIRIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
                        .setMinLevel(20).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TAIGA)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
        setLangFileName("Swadloon");

    }
}
