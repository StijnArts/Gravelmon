package drai.dev.data.pokemon.form;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Tentaomega extends drai.dev.data.pokemon.Pokemon {
    public Tentaomega() {
        super("Tentaomega",
                Type.GHOST,Type.PSYCHIC,
                new Stats(79,
                        42,
                        84,
                        143,
                        84,
                        121),
                List.of(Ability.AFTERMATH), null,
                23, 0,
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
    .setPool(SpawnPool.COMMON)
    .setMinLevel(37)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_DEEP_OCEAN)
    .belowY(40)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Tentaomega");

    }


}
