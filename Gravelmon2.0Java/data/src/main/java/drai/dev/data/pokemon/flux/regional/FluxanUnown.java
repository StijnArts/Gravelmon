package drai.dev.data.pokemon.flux.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class FluxanUnown extends drai.dev.data.pokemon.Pokemon {
    public FluxanUnown(String name, Aspect aspect) {
        super(name, aspect, "FluxanUnown",
                Type.ROCK,
                new Stats(50,
                        90,
                        60,
                        90,
                        60,
                        50),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                5, 50,
                new Stats(0,1,0,1,0,0), 225,
                0.0,
                140, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("An ancient lineage of Unown said to predate the forms first found in the Johto region. Their shapes have been found scrawled on cave walls."),
                List.of(),
                List.of(),
                List.of(Label.FLUX),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Unown");

    }


}
