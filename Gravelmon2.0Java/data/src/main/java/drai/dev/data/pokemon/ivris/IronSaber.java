package drai.dev.data.pokemon.ivris;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class IronSaber extends drai.dev.data.pokemon.Pokemon {
    public IronSaber() {
        super("IronSaber",
                Type.PSYCHIC,Type.STEEL,
                new Stats(81,
                        147,
                        86,
                        43,
                        86,
                        124),
                List.of(Ability.QUARK_DRIVE), null,
                17, 0,
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
                        .setBiomes(Biome.IS_CAVE).cantSeeSky()
                        .setSpawnPreset(SpawnPreset.UNDERGROUND).build(),
                List.of());
           setLangFileName("Iron Saber");

    }


}
