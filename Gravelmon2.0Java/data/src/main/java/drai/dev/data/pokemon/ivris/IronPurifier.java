package drai.dev.data.pokemon.ivris;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class IronPurifier extends drai.dev.data.pokemon.Pokemon {
    public IronPurifier() {
        super("IronPurifier",
                Type.FAIRY,Type.GRASS,
                new Stats(76,
                        76,
                        95,
                        72,
                        76,
                        161),
                List.of(Ability.QUARK_DRIVE), null,
                12, 0,
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
                        .setBiomes(Biome.IS_FLORAL).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Iron Purifier");

    }


}
