package drai.dev.data.pokemon.ivris;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class VenomousCrest extends drai.dev.data.pokemon.Pokemon {
    public VenomousCrest() {
        super("VenomousCrest",
                Type.POISON,Type.ELECTRIC,
                new Stats(81,
                        147,
                        86,
                        43,
                        86,
                        124),
                List.of(Ability.PROTOSYNTHESIS), null,
                15, 0,
                new Stats(0,0,0,0,0,0), 50,
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
                        .setBiomes(Biome.IS_DESERT).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Venomous Crest");

    }


}
