package drai.dev.data.pokemon.form;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Algaphin extends drai.dev.data.pokemon.Pokemon {
    public Algaphin() {
        super("Algaphin",
                Type.WATER,Type.GRASS,
                new Stats(100,
                        35,
                        77,
                        85,
                        118,
                        42),
                List.of(Ability.STORM_DRAIN), null,
                16, 0,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.FORM),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.COMMON, 27, 51, .5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_RIVER)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.FRESHWATER, SpawnPreset.FOLIAGE),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Algaphin");

    }


}
