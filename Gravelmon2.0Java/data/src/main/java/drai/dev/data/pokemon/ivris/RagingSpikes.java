package drai.dev.data.pokemon.ivris;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class RagingSpikes extends drai.dev.data.pokemon.Pokemon {
    public RagingSpikes() {
        super("RagingSpikes",
                Type.DRAGON,Type.STEEL,
                new Stats(124,
                        147,
                        124,
                        43,
                        105,
                        24),
                List.of(Ability.PROTOSYNTHESIS), null,
                24, 0,
                new Stats(0,0,0,0,0,0), 30,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.IVRIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .abnormality()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SPOOKY).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Raging Spikes");

    }


}
