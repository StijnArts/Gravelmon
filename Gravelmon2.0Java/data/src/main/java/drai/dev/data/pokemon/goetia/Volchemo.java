package drai.dev.data.pokemon.goetia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Volchemo extends drai.dev.data.pokemon.Pokemon {
    public Volchemo(Stats stats) {
        super("Volchemo",
                Type.ROCK, Type.POISON,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                22, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Tublip are often found attached to Volchemo, blooming in order to feed off chemicals in its smoke. In exchange they allow Volchemo access to moves such as Ingrain, Synthesis and Giga Drain."),
                List.of(),
                List.of(),
                List.of(Label.GOETIA),
                0, List.of(
                ), SpawnContext.SEAFLOOR, SpawnPool.COMMON, 41, 54, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OCEAN))
                ), List.of(),
                List.of(SpawnPreset.NEAR_MAGMA),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Volchemo");

    }


}
