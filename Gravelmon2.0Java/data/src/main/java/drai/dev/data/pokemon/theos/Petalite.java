package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Petalite extends drai.dev.data.pokemon.Pokemon {
    public Petalite() {
        super("Petalite",
                Type.GRASS,
                new Stats(40,
                        50,
                        45,
                        80,
                        45,
                        45),
                List.of(Ability.SIMPLE), Ability.FLOWER_GIFT,
                8, 60,
                new Stats(0,0,0,2,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Petalite have very efficient photosynthesis which allow them to take in a larger amount of sunlight than other grass Pokémon. The brighter their petals, the more energy they have absorbed."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Petalite");

    }


}
