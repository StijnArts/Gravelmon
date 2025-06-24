package drai.dev.data.pokemon.srin;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Astoundent extends drai.dev.data.pokemon.Pokemon {
    public Astoundent() {
        super("Astoundent",
                Type.GRASS,Type.NORMAL,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.OVERGROW), Ability.SOUNDPROOF,
                12, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.875,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("cragweise", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"34"))),
                        new EvolutionEntry("amartiste", EvolutionType.ITEM_INTERACT, false, List.of(),
                                List.of(),List.of(),"cobblemon:dusk_stone")),
                List.of(),
                List.of(Label.SORIN),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
                        .starter()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_DECIDUOUS_FOREST)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Astoundent");

    }


}
