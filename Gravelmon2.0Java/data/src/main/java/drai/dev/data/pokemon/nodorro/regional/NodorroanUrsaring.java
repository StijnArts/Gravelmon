package drai.dev.data.pokemon.nodorro.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class NodorroanUrsaring extends drai.dev.data.pokemon.Pokemon {
    public NodorroanUrsaring(String name, Aspect aspect) {
        super(name, aspect, "NodorroanUrsaring",
                Type.NORMAL,Type.FIGHTING,
                new Stats(100,
                        135,
                        81,
                        59,
                        70,
                        55),
                List.of(Ability.GUTS,Ability.TOUGH_CLAWS), Ability.ADAPTABILITY,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
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
           setLangFileName("Ursaring");

    }


}
