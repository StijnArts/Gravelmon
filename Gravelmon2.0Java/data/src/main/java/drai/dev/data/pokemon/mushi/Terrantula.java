package drai.dev.data.pokemon.mushi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Terrantula extends drai.dev.data.pokemon.Pokemon {
    public Terrantula() {
        super("Terrantula",
                Type.GRASS,Type.GROUND,
                new Stats(105,
                        115,
                        130,
                        34,
                        65,
                        36),
                List.of(Ability.SOLID_ROCK,Ability.OVERGROW), Ability.ADAPTABILITY,
                17, 0,
                new Stats(0,0,2,0,0,0), 100,
                0.5,
                166, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.BUG),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MUSHI),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_JUNGLE)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Terrantula");

    }


}
