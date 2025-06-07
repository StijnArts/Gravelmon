package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Ankarmor extends drai.dev.data.pokemon.Pokemon {
    public Ankarmor() {
        super("Ankarmor",
                Type.ROCK,
                new Stats(30,
                        42,
                        118,
                        42,
                        88,
                        30),
                List.of(Ability.STURDY), Ability.SOUNDPROOF,
                5, 570,
                new Stats(0,0,1,0,0,0), 45,
                0.875,
                70, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("Ankarmor were discovered in an old fossil and are thought to have existed thousands of years ago. Their carapace is extremely strong and can resist tremendous pressure."),
                List.of(),
                List.of(),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Ankarmor");

    }


}
