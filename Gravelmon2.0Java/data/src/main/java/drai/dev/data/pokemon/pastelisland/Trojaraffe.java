package drai.dev.data.pokemon.pastelisland;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Trojaraffe extends drai.dev.data.pokemon.Pokemon {
    public Trojaraffe(Stats stats) {
        super("Trojaraffe",
                Type.FIGHTING, Type.STEEL,
                stats,
                List.of(Ability.DEFIANT), Ability.GORILLA_TACTICS,
                35, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.4,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .setMinLevel(30).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SAVANNA).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Trojaraffe");

    }


}
