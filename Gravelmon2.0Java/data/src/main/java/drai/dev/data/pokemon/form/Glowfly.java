package drai.dev.data.pokemon.form;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Glowfly extends drai.dev.data.pokemon.Pokemon {
    public Glowfly() {
        super("Glowfly",
                Type.BUG,Type.WATER,
                new Stats(86,
                        30,
                        40,
                        46,
                        115,
                        69),
                List.of(Ability.WATER_ABSORB), null,
                15, 0,
                new Stats(0,0,0,0,0,0), 90,
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
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_SWAMP)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.FRESHWATER)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setCanFly(true);
           setLangFileName("Glowfly");

    }


}
