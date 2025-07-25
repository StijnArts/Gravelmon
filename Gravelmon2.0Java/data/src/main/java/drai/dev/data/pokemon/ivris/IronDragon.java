package drai.dev.data.pokemon.ivris;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class IronDragon extends drai.dev.data.pokemon.Pokemon {
    public IronDragon() {
        super("IronDragon",
                Type.DRAGON,Type.FIRE,
                new Stats(98,
                        49,
                        83,
                        152,
                        122,
                        83),
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
                        .setBiomes(Biome.IS_CAVE).cantSeeSky()
                        .setSpawnPreset(SpawnPreset.UNDERGROUND).build(),
                List.of());
           setLangFileName("Iron Dragon");

    }


}
