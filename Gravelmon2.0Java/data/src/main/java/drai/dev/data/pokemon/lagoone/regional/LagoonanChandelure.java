package drai.dev.data.pokemon.lagoone.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class LagoonanChandelure extends drai.dev.data.pokemon.Pokemon {
    public LagoonanChandelure(String name, Aspect aspect) {
        super(name, aspect, "Chandelure",
                Type.FIRE,Type.GRASS,
                new Stats(60,
                        55,
                        90,
                        145,
                        90,
                        80),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                10, 343,
                new Stats(0,0,0,3,0,0), 45,
                0.5,
                234, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 41, 56, .1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Chandelure");

    }


}
