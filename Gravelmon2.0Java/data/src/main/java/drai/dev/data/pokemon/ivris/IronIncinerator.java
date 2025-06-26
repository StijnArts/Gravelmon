package drai.dev.data.pokemon.ivris;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class IronIncinerator extends drai.dev.data.pokemon.Pokemon {
    public IronIncinerator() {
        super("IronIncinerator",
                Type.DARK,Type.FIRE,
                new Stats(124,
                        43,
                        95,
                        105,
                        147,
                        53),
                List.of(Ability.QUARK_DRIVE), null,
                12, 0,
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
                        .setBiomes(Biome.IS_VOLCANIC, Biome.IS_NETHER_WASTELAND)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Iron Incinerator");

    }


}
