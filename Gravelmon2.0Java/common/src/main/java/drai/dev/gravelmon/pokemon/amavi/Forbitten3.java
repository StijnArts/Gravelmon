package drai.dev.gravelmon.pokemon.amavi;


import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Forbitten3 extends drai.dev.gravelmon.pokemon.Pokemon {
    public Forbitten3() {
        super("Forbitten",
                Type.GRASS,Type.POISON,
                new Stats(115,
                        30,
                        80,
                        75,
                        105,
                        125),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                21, 342,
                new Stats(2,0,0,0,0,1), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.AMAVI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Forbitten");

    }


}
