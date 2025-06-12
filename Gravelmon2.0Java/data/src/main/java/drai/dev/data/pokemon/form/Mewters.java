package drai.dev.data.pokemon.form;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Mewters extends drai.dev.data.pokemon.Pokemon {
    public Mewters() {
        super("Mewters",
                Type.PSYCHIC,Type.NUCLEAR,
                new Stats(120,
                        63,
                        103,
                        148,
                        114,
                        130),
                List.of(Ability.GRAVITYENTRANCE), null,
                22, 0,
                new Stats(0,0,0,0,0,0), 3,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.FORM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .legend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_END)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Mewters");

    }


}
