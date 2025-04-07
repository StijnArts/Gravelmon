package drai.dev.data.pokemon.theos.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class TheossianVictreebel extends drai.dev.data.pokemon.Pokemon {
    public TheossianVictreebel(String name, Aspect aspect) {
        super(name, aspect, "Victreebel",
                Type.GRASS, Type.DARK,
                new Stats(90,
                        115,
                        75,
                        80,
                        70,
                        60),
                List.of(Ability.INTIMIDATE), Ability.GLUTTONY,
                17, 155,
                new Stats(0,3,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
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
           setLangFileName("Victreebel");

    }


}
