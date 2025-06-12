package drai.dev.data.pokemon.ionos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Armadealo extends drai.dev.data.pokemon.Pokemon {
    public Armadealo() {
        super("Armadealo",
                Type.FIRE, Type.GROUND,
                new Stats(80,
                        94,
                        102,
                        80,
                        82,
                        94),
                List.of(Ability.BLAZE), Ability.SAND_FORCE,
                16, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Hired during ancient times as scouts and mercenaries by wealthy families. Breaking a deal with an Armadealo would mean putting your own life at risk."),
                List.of(),
                List.of(),
                List.of(Label.IONOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SAVANNA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Armadealo");

    }


}
