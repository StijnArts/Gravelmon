package drai.dev.data.pokemon.nodorro.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class NodorranProbopass extends drai.dev.data.pokemon.Pokemon {
    public NodorranProbopass(String name, Aspect aspect) {
        super(name, aspect, "Probopass",
                Type.ROCK,Type.GRASS,
                new Stats(75,
                        70,
                        135,
                        90,
                        130,
                        25),
                List.of(Ability.HARVEST,Ability.STURDY), Ability.CHLOROPHYLL,
                18, 4060,
                new Stats(1,0,0,0,2,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of(""),
                List.of(),
                List.of(                     ),
                List.of(Label.NODORRO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(39).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_FOREST).duringDaytime()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
        setCanWalk(false);
           setLangFileName("Probopass");

    }


}
