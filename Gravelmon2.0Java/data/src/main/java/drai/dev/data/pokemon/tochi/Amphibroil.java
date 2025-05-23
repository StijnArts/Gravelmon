package drai.dev.data.pokemon.tochi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Amphibroil extends drai.dev.data.pokemon.Pokemon {
    public Amphibroil() {
        super("Amphibroil",
                Type.FIRE,Type.POISON,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.BLAZE), Ability.BLAZE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Amphibroil have molten lava covering their backs that their body constantly produce. When they move quickly they will spill a massive amounts of very hot lava, which can be dangerous!"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,1),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,1),
                        new MoveLearnSetEntry(Move.LAVA_PLUME,1)),
                List.of(Label.TOCHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Amphibroil");

    }


}
