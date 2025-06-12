package drai.dev.data.pokemon.atlas;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Phanta extends drai.dev.data.pokemon.Pokemon {
    public Phanta() {
        super("Phanta",
                Type.GHOST,
                new Stats(100,
                        90,
                        90,
                        100,
                        100,
                        90),
                List.of(Ability.PRESSURE), Ability.PRESSURE,
                8, 165,
                new Stats(1,0,0,1,1,0), 3,
                0.5,
                257, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.ATLAS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .subLegend()
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_WARM_OCEAN)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.REEF)
    .build(), List.of());
	
           setLangFileName("Phanta");

    }


}
