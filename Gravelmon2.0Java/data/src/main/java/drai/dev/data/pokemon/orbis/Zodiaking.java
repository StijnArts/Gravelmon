package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Zodiaking extends drai.dev.data.pokemon.Pokemon {
    public Zodiaking() {
        super("Zodiaking",
                Type.FIRE, Type.DRAGON,
                new Stats(88,
                        88,
                        88,
                        88,
                        88,
                        88),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                88, 8880,
                new Stats(0,0,0,0,0,0), 8,
                0.5,
                288, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.DRAGON),
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
           setLangFileName("Zodiaking");

    }


}
