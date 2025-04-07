package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Squeebee extends drai.dev.data.pokemon.Pokemon {
    public Squeebee() {
        super("Squeebee",
                Type.NORMAL,
                new Stats(95,
                        25,
                        15,
                        25,
                        33,
                        25),
                List.of(Ability.LIMBER), Ability.LIMBER,
                2, 30,
                new Stats(0,0,0,0,0,0), 150,
                0.5,
                40, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FAIRY),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Squeebee");

    }


}
