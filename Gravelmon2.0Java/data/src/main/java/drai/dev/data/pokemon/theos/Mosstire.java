package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Mosstire extends drai.dev.data.pokemon.Pokemon {
    public Mosstire() {
        super("Mossloth",
                Type.GRASS,
                new Stats(140,
                        85,
                        100,
                        70,
                        90,
                        20),
                List.of(Ability.GRASS_PELT), Ability.STALL,
                22, 800,
                new Stats(2,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Mossloth conserves energy, appearing sluggish in battle to deceive opponents. When underestimated, it surprises with a powerful, rapid strike fueled by its stored energy."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(33).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_JUNGLE).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Mossloth");

    }


}
