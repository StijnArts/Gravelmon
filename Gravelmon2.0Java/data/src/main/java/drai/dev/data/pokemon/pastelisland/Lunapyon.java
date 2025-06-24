package drai.dev.data.pokemon.pastelisland;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Lunapyon extends drai.dev.data.pokemon.Pokemon {
    public Lunapyon() {
        super("Lunapyon",
                Type.FAIRY, Type.ELECTRIC,
                new Stats(70,
                        55,
                        65,
                        90,
                        75,
                        60),
                List.of(Ability.CUTE_CHARM,Ability.ILLUMINATE), Ability.FRIEND_GUARD,
                13, 32,
                new Stats(0,0,0,1,0,1), 80,
                0.5,
                145, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(23).setPool(SpawnPool.RARE).setWeight(SpawnWeight.RARE)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_MAGICAL).atNight().canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Lunapyon");

    }


}
