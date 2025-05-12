package drai.dev.data.pokemon.mushi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Hydrone extends drai.dev.data.pokemon.Pokemon {
    public Hydrone() {
        super("Hydrone",
                Type.WATER,Type.FLYING,
                new Stats(51,
                        49,
                        49,
                        137,
                        98,
                        101),
                List.of(Ability.COMPOUND_EYES,Ability.TORRENT), Ability.SPEED_BOOST,
                14, 0,
                new Stats(0,0,0,2,0,0), 100,
                0.5,
                166, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG,EggGroup.WATER_3),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MUSHI),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.SURFACE)
                    .setBiomes(Biome.IS_FRESHWATER).canSeeSky()
                        .setSpawnPreset(SpawnPreset.WATER_SURFACE).build(),
                0.28, 0.3,
                List.of());
        setCanWalkOnWater(true);
        setCanFly(true);
           setLangFileName("Hydrone");

    }


}
