package drai.dev.data.pokemon.pastelisland;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Doiliwoo extends drai.dev.data.pokemon.Pokemon {
    public Doiliwoo() {
        super("Doiliwoo",
                Type.GHOST, Type.FAIRY,
                new Stats(71,
                        51,
                        32,
                        74,
                        97,
                        82),
                List.of(Ability.PASTEL_VEIL), Ability.FILTER,
                0, 0,
                new Stats(0,0,0,0,1,0), 0,
                0.5,
                142, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.FAIRY),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Doiliwoo");

    }


}
