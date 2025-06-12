package drai.dev.data.pokemon.enjin;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Coldfin extends drai.dev.data.pokemon.Pokemon {
    public Coldfin(Stats stats) {
        super("Coldfin",
                Type.WATER, Type.ICE,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                7, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Added Oct 27 2021 Etymology: cold + dolphin + fin Evo line: Open to suggestions and submissions Origin: Created by JaneJewel for the April 2020 Around The World Fakeathon Day 21 prompt, Antarctica"),
                List.of(),
                List.of(),
                List.of(Label.ENJIN),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 11, 32, 4.4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COLD_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"day")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Coldfin");

    }


}
