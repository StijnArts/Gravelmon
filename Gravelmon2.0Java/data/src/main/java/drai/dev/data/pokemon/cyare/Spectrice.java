package drai.dev.data.pokemon.cyare;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Spectrice extends drai.dev.data.pokemon.Pokemon {
    public Spectrice() {
        super("Spectrice",
                Type.ICE, Type.GHOST,
                new Stats(90,
                        71,
                        80,
                        134,
                        110,
                        115),
                List.of(Ability.ICE_BODY), Ability.ICE_BODY,
                15, 0,
                new Stats(0,0,0,3,0,0), 45,
                0.5,
                270, ExperienceGroup.SLOW,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.CYARE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(39)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Spectrice");

    }


}
