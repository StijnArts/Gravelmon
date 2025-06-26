package drai.dev.data.pokemon.ivris;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class IronDinosaur extends drai.dev.data.pokemon.Pokemon {
    public IronDinosaur() {
        super("IronDinosaur",
                Type.FLYING,Type.STEEL,
                new Stats(175,
                        43,
                        67,
                        67,
                        181,
                        24),
                List.of(Ability.QUARK_DRIVE), null,
                15, 0,
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
                        .setBiomes(Biome.IS_JUNGLE).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
        setCanFly(true);
           setLangFileName("Iron Dinosaur");

    }


}
