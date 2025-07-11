package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Ufo2 extends drai.dev.data.pokemon.Pokemon {
    public Ufo2() {
        super("Ufo2",
                Type.STEEL,Type.ELECTRIC,
                new Stats(90,
                        51,
                        102,
                        114,
                        102,
                        51),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                15, 1200,
                new Stats(1,0,0,2,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.NODORRO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Ufo 2");

    }


}
