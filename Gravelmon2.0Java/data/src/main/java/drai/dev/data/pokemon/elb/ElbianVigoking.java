package drai.dev.data.pokemon.elb;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class ElbianVigoking extends drai.dev.data.pokemon.Pokemon {
    public ElbianVigoking(String name, Aspect aspect) {
        super(name, aspect, "Elbianvigoking",
                Type.ELECTRIC,Type.NORMAL,
                new Stats(67,
                        139,
                        72,
                        31,
                        72,
                        157),
                List.of(), null,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.ELB),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Vigoking");

    }


}
