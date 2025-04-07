package drai.dev.data.pokemon.terranov;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Baggi extends drai.dev.data.pokemon.Pokemon {
    public Baggi() {
        super("Baggi",
                Type.ICE, Type.PSYCHIC,
                new Stats(45,
                        30,
                        55,
                        65,
                        65,
                        70),
                List.of(Ability.DREAMTRAP), Ability.DREAMTRAP,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Baggis live in colder regions and are led by an alpha. They are agile and intelligent, and rely on outsmarting their prey instead of using brute strength."),
                List.of(),
                List.of(),
                List.of(Label.TERRANOV),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Baggi");

    }


}
