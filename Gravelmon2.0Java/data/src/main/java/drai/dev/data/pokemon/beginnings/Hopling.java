package drai.dev.data.pokemon.beginnings;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Hopling extends drai.dev.data.pokemon.Pokemon {
    public Hopling() {
        super("Hopling",
                Type.GRASS,
                new Stats(50,
                        40,
                        40,
                        60,
                        60,
                        65),
                List.of(Ability.OVERGROW), Ability.MISTY_SURGE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("As spring comes in, Hopling migrate in across hills from Northen Unova. They bathe in the sunlight to absorb energy."),
                List.of(),
                List.of(),
                List.of(Label.OTTORA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Hopling");

    }


}
