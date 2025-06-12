package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Wandream extends drai.dev.data.pokemon.Pokemon {
    public Wandream() {
        super("Wandream",
                Type.PSYCHIC,
                new Stats(80,
                        70,
                        80,
                        90,
                        90,
                        60),
                List.of(Ability.ZEN_MODE), Ability.COMATOSE,
                10, 320,
                new Stats(0,0,0,2,0,0), 75,
                0.5,
                160, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.LAGOONE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(23)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_MAGICAL)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Wandream");

    }


}
