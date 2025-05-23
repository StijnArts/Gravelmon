package drai.dev.data.pokemon.tochi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Locusteka extends drai.dev.data.pokemon.Pokemon {
    public Locusteka() {
        super("Locusteka",
                Type.BUG,Type.FIGHTING,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Locusteka are extremely skilled fighters, and many humans train under Locusteka to better improve their fighting abilities. It is said that if one gets exceptionally hungry it can go into a ravenous rage and become ten times stronger."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LOW_KICK,1),
                        new MoveLearnSetEntry(Move.HIGH_JUMP_KICK,1),
                        new MoveLearnSetEntry(Move.JUMP_KICK,1),
                        new MoveLearnSetEntry(Move.MEGA_KICK,1)),
                List.of(Label.TOCHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Locusteka");

    }


}
