package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Barbeetle extends drai.dev.data.pokemon.Pokemon {
    public Barbeetle() {
        super("Barbeetle",
                Type.BUG,Type.FAIRY,
                new Stats(60,
                        80,
                        85,
                        60,
                        95,
                        105),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                10, 122,
                new Stats(0,0,0,0,0,2), 90,
                0.5,
                169, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 23, 45, .9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BIRCH)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Barbeetle");

    }


}
