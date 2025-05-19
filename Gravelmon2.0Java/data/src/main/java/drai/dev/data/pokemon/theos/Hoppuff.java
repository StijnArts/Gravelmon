package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Hoppuff extends drai.dev.data.pokemon.Pokemon {
    public Hoppuff() {
        super("Hoppuff",
                Type.FAIRY,
                new Stats(75,
                        60,
                        55,
                        60,
                        55,
                        70),
                List.of(Ability.CUTE_CHARM,Ability.FRIEND_GUARD), Ability.CLOUD_NINE,
                6, 90,
                new Stats(2,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Hoppuff can jump quiet high due to their springy legs. Don't be fooled by their cute appearance; Hoppuff can pack quite a punch with their ears."),
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
           setLangFileName("Hoppuff");

    }


}
