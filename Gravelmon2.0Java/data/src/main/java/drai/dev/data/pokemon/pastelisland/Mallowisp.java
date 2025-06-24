package drai.dev.data.pokemon.pastelisland;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Mallowisp extends drai.dev.data.pokemon.Pokemon {
    public Mallowisp(Stats stats) {
        super("Mallowisp",
                Type.GHOST, Type.FIRE,
                stats,
                List.of(Ability.GOOEY), Ability.STICKY_HOLD,
                16, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.0,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.AMORPHOUS),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .setMinLevel(36).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_FOREST).canSeeSky().atNight()
                        .setSpawnPreset(SpawnPreset.NEAR_CAMPFIRE).build(),
                List.of());
           setLangFileName("Mallowisp");

    }


}
