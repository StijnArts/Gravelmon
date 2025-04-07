package drai.dev.data.pokemon.urzavos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Gastropow extends drai.dev.data.pokemon.Pokemon {
    public Gastropow() {
        super("Gastropow",
                Type.ROCK, Type.FIGHTING,
                new Stats(80,
                        68,
                        102,
                        85,
                        75,
                        65),
                List.of(Ability.RECKLESS), Ability.RECKLESS,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("A Mon who carries the stones it could not pummel to pieces on its back. It is on a constant journey to train."),
                List.of(),
                List.of(),
                List.of(Label.URZAVOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Gastropow");

    }


}
