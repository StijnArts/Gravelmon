package drai.dev.data.pokemon.cyare;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Pengalance extends drai.dev.data.pokemon.Pokemon {
    public Pengalance() {
        super("Pengalance",
                Type.WATER, Type.ICE,
                new Stats(93,
                        76,
                        96,
                        109,
                        76,
                        88),
                List.of(Ability.TORRENT), Ability.TORRENT,
                19, 1520,
                new Stats(0,0,0,3,0,0), 45,
                0.875,
                241, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.CYARE),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Pengalance");

    }


}
