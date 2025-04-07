package drai.dev.data.pokemon.theos.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class TheossianFlorges extends drai.dev.data.pokemon.Pokemon {
    public TheossianFlorges(String name, Aspect aspect) {
        super(name, aspect, "Florges",
                Type.GHOST, Type.FAIRY,
                new Stats(78,
                        65,
                        68,
                        112,
                        154,
                        75),
                List.of(Ability.CURSED_BODY), Ability.MISTY_SURGE,
                11, 100,
                new Stats(0,0,0,0,3,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Theosian Florges are very malicious, feeding on the souls of fellow Pokémon while they rest."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Florges");

    }


}
