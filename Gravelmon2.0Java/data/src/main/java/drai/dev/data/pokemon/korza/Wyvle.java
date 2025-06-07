package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Wyvle extends drai.dev.data.pokemon.Pokemon {
    public Wyvle() {
        super("Wyvle",
                Type.DRAGON,Type.NORMAL,
                new Stats(30,
                        50,
                        95,
                        40,
                        50,
                        40),
                List.of(Ability.BATTLE_ARMOR), Ability.MULTISCALE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Wyvle keep their shells for protection of their soft, fragile bodies. Their scales are highly prized for their bright color and radiant shimmer."),
                List.of(),
                List.of(),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Wyvle");

    }


}
