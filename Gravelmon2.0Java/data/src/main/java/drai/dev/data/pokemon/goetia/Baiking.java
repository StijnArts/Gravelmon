package drai.dev.data.pokemon.goetia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Baiking extends drai.dev.data.pokemon.Pokemon {
    public Baiking(Stats stats) {
        super("Baiking",
                Type.POISON, Type.DARK,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                17, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Boisterous and jovial, it travels the world in search of exciting adventures. It leaves a trail of destruction in its wake where anything left standing is contaminated with toxic mold."),
                List.of(),
                List.of(                        ),
                List.of(Label.GOETIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 55, 65, .01, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_NETHER_WARPED))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Baiking");

    }


}
