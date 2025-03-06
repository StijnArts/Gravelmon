package drai.dev.data.pokemon.goetia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Bombun extends drai.dev.data.pokemon.Pokemon {
    public Bombun(Stats stats) {
        super("Bombun",
                Type.BUG, Type.FAIRY,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                9, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Rarely seen outside of captivity, it lacks wings but makes up for it by jumping with its powerful legs. The fur around its neck is some of the finest in the world."),
                List.of(),
                List.of(),
                List.of(Label.GOETIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 24, 47, .2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TEMPERATE))
                ), List.of( new BiomeSpawnCondition(List.of(Biome.IS_PLAINS))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Bombun");

    }


}
