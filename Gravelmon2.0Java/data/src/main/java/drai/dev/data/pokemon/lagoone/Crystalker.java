package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Crystalker extends drai.dev.data.pokemon.Pokemon {
    public Crystalker() {
        super("Crystalker",
                Type.ICE,
                new Stats(68,
                        125,
                        50,
                        85,
                        50,
                        102),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                10, 175,
                new Stats(0,1,0,1,0,0), 50,
                0.5,
                168, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.WATER_2),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 24, 47, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FROZEN_OCEAN))
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());

        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Crystalker");

    }


}
