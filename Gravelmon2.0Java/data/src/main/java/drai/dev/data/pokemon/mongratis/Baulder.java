package drai.dev.data.pokemon.mongratis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Baulder extends drai.dev.data.pokemon.Pokemon {
    public Baulder() {
        super("Baulder",
                Type.ROCK, Type.DRAGON,
                new Stats(55,
                        60,
                        65,
                        40,
                        45,
                        35),
                List.of(Ability.SOLID_ROCK), Ability.ROCK_HEAD,
                5, 484,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Baulder carry around a rock given to them soon after birth by its parents. They gnaw on this rock every chance they get, as it seems to sharpen their teeth."),
                List.of(),
                List.of(),
                List.of(Label.MONGRATIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Baulder");

    }


}
