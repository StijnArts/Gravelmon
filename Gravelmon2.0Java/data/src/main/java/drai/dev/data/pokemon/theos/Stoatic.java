package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Stoatic extends drai.dev.data.pokemon.Pokemon {
    public Stoatic() {
        super("Stoatic",
                Type.ELECTRIC, Type.GROUND,
                new Stats(60,
                        55,
                        60,
                        85,
                        70,
                        75),
                List.of(Ability.MOTOR_DRIVE), Ability.MOTOR_DRIVE,
                4, 40,
                new Stats(0,0,0,1,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Stoatic construct massive tunnel systems beneath the ground where they store berries. Their cheek pouches can glow in the dark, allowing them to see while traversing said systems."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Stoatic");

    }


}
