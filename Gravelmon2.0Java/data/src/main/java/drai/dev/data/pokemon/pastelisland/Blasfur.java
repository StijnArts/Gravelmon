package drai.dev.data.pokemon.pastelisland;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Blasfur extends drai.dev.data.pokemon.Pokemon {
    public Blasfur() {
        super("Blasfur",
                Type.FIRE,
                new Stats(80,
                        70,
                        90,
                        110,
                        65,
                        65),
                List.of(Ability.FLASH_FIRE), Ability.FLASH_FIRE,
                12, 600,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Loyal and smart, these Pokémon can smell the faintest smell of burning from miles away, making them useful for firefighters. They can detect when a person is ill by their temperature, and will try their best to help them."),
                List.of(),
                List.of(),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Blasfur");

    }


}
