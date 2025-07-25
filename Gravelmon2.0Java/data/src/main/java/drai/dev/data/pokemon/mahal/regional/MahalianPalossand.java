package drai.dev.data.pokemon.mahal.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class MahalianPalossand extends drai.dev.data.pokemon.Pokemon {
    public MahalianPalossand(String name, Aspect aspect) {
        super(name, aspect, "MahalianPalossand",
                Type.GHOST,Type.ROCK,
                new Stats(104,
                        104,
                        124,
                        36,
                        88,
                        20),
                List.of(), null,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MAHAL),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Palossand");

    }


}
