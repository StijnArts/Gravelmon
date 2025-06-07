package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Blufable extends drai.dev.data.pokemon.Pokemon {
    public Blufable() {
        super("Blufable",
                Type.WATER, Type.FAIRY,
                new Stats(95,
                        70,
                        73,
                        95,
                        90,
                        60),
                List.of(Ability.DAMP,Ability.MAGIC_GUARD), Ability.UNAWARE,
                13, 600,
                new Stats(3,0,0,0,0,0), 25,
                0.75,
                217, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FAIRY),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .setMinLevel(32).setPool(SpawnPool.RARE).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.SURFACE)
                        .setBiomes(Biome.IS_BEACH).canSeeSky()
                        .setSpawnPreset(SpawnPreset.WATER_SURFACE).build(),
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
        setCanWalkOnWater(true);
           setLangFileName("Blufable");

    }


}
