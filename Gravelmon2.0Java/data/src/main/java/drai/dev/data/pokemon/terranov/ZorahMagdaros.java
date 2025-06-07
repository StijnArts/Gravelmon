package drai.dev.data.pokemon.terranov;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class ZorahMagdaros extends drai.dev.data.pokemon.Pokemon {
    public ZorahMagdaros() {
        super("ZorahMagdaros",
                Type.FIRE, Type.ROCK,
                new Stats(250,
                        70,
                        250,
                        60,
                        250,
                        5),
                List.of(Ability.TRUANT), Ability.TRUANT,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Zorah Magdaros rises from the earth like a volcano. Where it's headed, and why, the Research Commission has yet to figure out."),
                List.of(),
                List.of(),
                List.of(Label.TERRANOV),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Zorah Magdaros");

    }


}
