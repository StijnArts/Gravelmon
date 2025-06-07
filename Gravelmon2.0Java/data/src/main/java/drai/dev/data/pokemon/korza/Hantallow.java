package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Hantallow extends drai.dev.data.pokemon.Pokemon {
    public Hantallow() {
        super("Hantallow",
                Type.DARK,Type.GHOST,
                new Stats(50,
                        90,
                        100,
                        140,
                        60,
                        140),
                List.of(Ability.PRESSURE), Ability.PRESSURE,
                28, 208,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Believed to be an ancient mon responsible for the demise of an entire town. Those who watch the old road at night claim to see a floating orb of light, as if patrolling the outskirts of the town's remains-- though most don't dare attempt a closer look."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DISABLE,1),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,1),
                        new MoveLearnSetEntry(Move.LICK,11),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,20),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,29),
                        new MoveLearnSetEntry(Move.PARTING_SHOT,38),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,47),
                        new MoveLearnSetEntry(Move.STRIDENTECHO,57),
                        new MoveLearnSetEntry(Move.DARK_PULSE,75),
                        new MoveLearnSetEntry(Move.MAGICBACKLASH,84),
                        new MoveLearnSetEntry(Move.TOPSYTURVY,93)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Hantallow");

    }


}
