package drai.dev.data.pokemon.form;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Skeptile extends drai.dev.data.pokemon.Pokemon {
    public Skeptile() {
        super("Skepile",
                Type.FIGHTING,Type.GHOST,
                new Stats(75,
                        136,
                        80,
                        40,
                        80,
                        115),
                List.of(Ability.LASTCHANCE,Ability.INESCAPABLE), null,
                18, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.FORM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BAMBOO)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Skeptile");

    }


}
