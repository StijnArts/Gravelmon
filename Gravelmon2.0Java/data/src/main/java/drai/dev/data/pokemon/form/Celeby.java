package drai.dev.data.pokemon.form;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Celeby extends drai.dev.data.pokemon.Pokemon {
    public Celeby() {
        super("Celeby",
                Type.BUG,Type.PSYCHIC,
                new Stats(100,
                        100,
                        100,
                        100,
                        100,
                        100),
                List.of(Ability.SYNCHRONIZE), null,
                16, 0,
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
    .mythical()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Celeby");

    }


}
