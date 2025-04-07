package drai.dev.data.pokemon.pastelisland;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Gecktricity extends drai.dev.data.pokemon.Pokemon {
    public Gecktricity() {
        super("Gecktricity",
                Type.GRASS, Type.ELECTRIC,
                new Stats(63,
                        54,
                        52,
                        86,
                        90,
                        60),
                List.of(Ability.OVERGROW), Ability.MOTOR_DRIVE,
                9, 126,
                new Stats(0,0,0,1,1,0), 45,
                0.875,
                142, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.MONSTER),
                List.of("Gecktricity, much like Geckamp, are excitable and full of energy; unlike their younger selves, Gecktricity have a much better control over their electrical powers."),
                List.of(),
                List.of(),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Gecktricity");

    }


}
