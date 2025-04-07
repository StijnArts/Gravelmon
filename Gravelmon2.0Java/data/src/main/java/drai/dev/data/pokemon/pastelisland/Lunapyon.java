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
                21, 32,
                new Stats(0,0,0,1,0,1), 0,
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
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Lunapyon");

    }


}
