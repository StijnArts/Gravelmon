package drai.dev.data.pokemon.tochi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Coatimber extends drai.dev.data.pokemon.Pokemon {
    public Coatimber() {
        super("Coatimber",
                Type.GRASS,Type.DARK,
                new Stats(87,
                        108,
                        98,
                        57,
                        77,
                        98),
                List.of(Ability.OVERGROW), Ability.STAKEOUT,
                14, 650,
                new Stats(0,3,0,0,0,0), 45,
                0.8,
                236, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Coatimber were used for many years by master criminals in heists of important artifacts from museums and private collections. These Pokemon were slowly used less and less as law enforcement better understood how this Pokemon would help to commit crimes. They have since been adopted by Pokemon rehabilitation groups and have been found to be very excellent and caring companions and excellent battlers."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.THIEF,1)),
                List.of(Label.TOCHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Coatimber");

    }


}
