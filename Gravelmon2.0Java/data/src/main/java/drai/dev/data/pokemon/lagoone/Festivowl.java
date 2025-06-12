package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Festivowl extends drai.dev.data.pokemon.Pokemon {
    public Festivowl() {
        super("Festivowl",
                Type.ICE,Type.GRASS,
                new Stats(95,
                        85,
                        80,
                        85,
                        70,
                        100),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                17, 834,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                180, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.LAGOONE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(33)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY_FOREST)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Festivowl");

    }


}
