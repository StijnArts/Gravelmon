package drai.dev.data.pokemon.tochi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Sapli extends drai.dev.data.pokemon.Pokemon {
    public Sapli() {
        super("Sapli",
                Type.GRASS,
                new Stats(67,
                        88,
                        78,
                        37,
                        57,
                        78),
                List.of(Ability.OVERGROW), Ability.STAKEOUT,
                6, 250,
                new Stats(0,2,0,0,0,0), 45,
                0.8,
                142, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Sapli survive the winter by stealing from other Pokemon's food stores. They are generally not well liked by other Pokemon for this reason."),
                List.of(),
                List.of(),
                List.of(Label.TOCHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Sapli");

    }


}
