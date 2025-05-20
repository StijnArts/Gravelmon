package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Kingulum extends drai.dev.data.pokemon.Pokemon {
    public Kingulum() {
        super("Kingulum",
                Type.FLYING,
                new Stats(45,
                        85,
                        50,
                        55,
                        65,
                        145),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                2, 2,
                new Stats(0,0,0,0,0,2), 105,
                0.5,
                115, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.FLYING),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_DECIDUOUS_FOREST).canSeeSky()
                        .setSpawnPreset(SpawnPreset.WATER_SURFACE).build(),
                0.28, 0.3,
                List.of());
        setCanWalkOnWater(true);
        setCanFly(true);
           setLangFileName("Kingulum");

    }


}
