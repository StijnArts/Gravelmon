package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Divona extends drai.dev.data.pokemon.Pokemon {
    public Divona() {
        super("Divona",
                Type.WATER,
                new Stats(62,
                        54,
                        58,
                        88,
                        87,
                        62),
                List.of(Ability.TORRENT), Ability.CLEAR_BODY,
                5, 50,
                new Stats(0,0,0,1,1,0), 45,
                0.875,
                144, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.AMORPHOUS),
                List.of("Divona's former carefreeness has been changed to impishness, but still maintains a strong bond with its trainer. The more it grows, the less it eats, often going weeks without food."),
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
           setLangFileName("Divona");

    }


}
