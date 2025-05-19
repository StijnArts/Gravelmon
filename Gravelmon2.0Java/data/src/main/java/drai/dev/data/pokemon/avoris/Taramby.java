package drai.dev.data.pokemon.avoris;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Taramby extends drai.dev.data.pokemon.Pokemon {
    public Taramby() {
        super("Taramby",
                Type.GRASS,
                new Stats(50,
                        70,
                        60,
                        40,
                        50,
                        45),
                List.of(Ability.OVERGROW), Ability.OVERGROW,
                8, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.875,
                62, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Taramby playfully ram their horns against each other. After tiring themselves out, they like to sleep atop trees. They have a need to keep their habitat clean."),
                List.of(),
                List.of(),
                List.of(Label.AVORIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Taramby");

    }


}
