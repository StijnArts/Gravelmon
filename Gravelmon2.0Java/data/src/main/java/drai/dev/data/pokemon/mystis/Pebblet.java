package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Pebblet extends drai.dev.data.pokemon.Pokemon {
    public Pebblet() {
        super("Pebblet",
                Type.DARK,Type.ROCK,
                new Stats(70,
                        80,
                        60,
                        50,
                        30,
                        40),
                List.of(Ability.GLUTTONY), Ability.ANGER_POINT,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                66, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Pebblet's stone body is inhabited by crystals made of malice. If the crystals are shattered, Pebblet stops moving."),
                List.of(),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Pebblet");

    }


}
