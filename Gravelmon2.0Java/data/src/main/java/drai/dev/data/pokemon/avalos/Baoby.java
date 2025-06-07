package drai.dev.data.pokemon.avalos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Baoby extends drai.dev.data.pokemon.Pokemon {
    public Baoby() {
        super("Baoby",
                Type.GRASS,
                new Stats(80,
                        55,
                        60,
                        40,
                        45,
                        40),
                List.of(Ability.WATER_COMPACTION), Ability.SUNSCREEN,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Baoby travel from river to river in search of water to drink and store. The leafy ossicones on its head conceal movable points that act similar to a dowsing rod. Many creatures follow Baoby in droughts."),
                List.of(),
                List.of(),
                List.of(Label.AVALOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Baoby");

    }


}
