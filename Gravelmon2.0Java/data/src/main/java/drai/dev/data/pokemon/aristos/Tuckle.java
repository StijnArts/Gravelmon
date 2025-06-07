package drai.dev.data.pokemon.aristos;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Tuckle extends drai.dev.data.pokemon.Pokemon {
    public Tuckle() {
        super("Tuckle",
                Type.WATER, Type.NORMAL,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.STURDY,Ability.SHELL_ARMOR,Ability.HYDRATION), Ability.HYDRATION,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Similar to Shuckle, it developed a long neck and nearly impenetrable shell. It sometimes washes ashore and gets knocked around by potential predators, but staying in its shell keeps it safe."),
                List.of(),
                List.of(),
                List.of(Label.ARISTOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Tuckle");

    }


}
