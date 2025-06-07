package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Choaking extends drai.dev.data.pokemon.Pokemon {
    public Choaking() {
        super("Choaking",
                Type.ROCK, Type.FIRE,
                new Stats(65,
                        120,
                        140,
                        85,
                        115,
                        25),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                21, 2100,
                new Stats(0,1,2,0,0,0), 30,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.NODORRO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .setMinLevel(50).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_OVERWORLD).cantSeeSky().belowY(-20)
                        .setSpawnPreset(SpawnPreset.NEAR_LAVA).build(),
                List.of());
        setCanFly(true);
           setLangFileName("Choaking");

    }


}
