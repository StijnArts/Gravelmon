package drai.dev.data.pokemon.pastelisland;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Panthevil extends drai.dev.data.pokemon.Pokemon {
    public Panthevil() {
        super("Panthevil",
                Type.DARK,
                new Stats(66,
                        85,
                        52,
                        70,
                        55,
                        100),
                List.of(Ability.LIMBER,Ability.PICKUP), Ability.SUPER_LUCK,
                17, 405,
                new Stats(0,0,0,0,0,0), 45,
                0.4,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(20).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_BIRCH).atNight().canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Panthevil");

    }


}
