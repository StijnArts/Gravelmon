package drai.dev.data.pokemon.srin;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Grascal extends drai.dev.data.pokemon.Pokemon {
    public Grascal() {
        super("Grascal",
                Type.GRASS, Type.NORMAL,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.OVERGROW), Ability.SOUNDPROOF,
                5, 0,
                new Stats(0, 0, 0, 0, 0, 0), 45,
                0.875,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("Grascal's day consists of collecting nuts along the tree-covered cliffside, only to throw them at its playmates. It creates whistle sounds to call for his gang of other Grascals."),
                List.of(new EvolutionEntry("astoundent", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"14")))),
                List.of(),
                List.of(Label.SORIN),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .starter()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_DECIDUOUS_FOREST)
                        .canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL)
                        .build(), List.of());

        setLangFileName("Grascal");

    }


}
