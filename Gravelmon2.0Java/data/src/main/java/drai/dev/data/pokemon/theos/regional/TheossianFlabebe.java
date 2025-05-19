package drai.dev.data.pokemon.theos.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class TheossianFlabebe extends drai.dev.data.pokemon.Pokemon {
    public TheossianFlabebe(String name, Aspect aspect) {
        super(name, aspect, "Flabb",
                Type.GHOST, Type.FAIRY,
                new Stats(44,
                        38,
                        39,
                        61,
                        79,
                        42),
                List.of(Ability.CURSED_BODY), Ability.MISTY_SURGE,
                1, 1,
                new Stats(0,0,0,0,1,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The light Theosian Flabébé produce from their flower grows brighter the more in-tune they are with their ghostly powers."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Flabébé");

    }


}
