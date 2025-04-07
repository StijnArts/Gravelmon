package drai.dev.data.pokemon.mastenia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Magneflite extends drai.dev.data.pokemon.Pokemon {
    public Magneflite() {
        super("Magneflite",
                Type.FLYING, Type.GRASS,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.CLOUD_NINE), Ability.WIND_RIDER,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Magneflite gathers knowledge about the history of Pokémon by droning and hovering over ancient sceneries. Their legs are reminiscent of plant buds and whenever they land on the ground they might begin sprouting."),
                List.of(),
                List.of(),
                List.of(Label.MASTENIA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Magneflite");

    }


}
