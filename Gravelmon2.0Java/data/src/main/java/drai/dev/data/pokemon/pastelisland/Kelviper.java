package drai.dev.data.pokemon.pastelisland;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Kelviper extends drai.dev.data.pokemon.Pokemon {
    public Kelviper() {
        super("Kelviper",
                Type.WATER, Type.ICE,
                new Stats(120,
                        70,
                        115,
                        80,
                        85,
                        60),
                List.of(Ability.TORRENT), Ability.DRIZZLE,
                37, 710,
                new Stats(3,0,0,0,0,0), 45,
                0.875,
                239, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1),
                List.of("Slow and bulky, Kelviper hunt in the deepest of waters, but on land, can freeze the ground under them to move and hunt faster."),
                List.of(),
                List.of(),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Kelviper");

    }


}
