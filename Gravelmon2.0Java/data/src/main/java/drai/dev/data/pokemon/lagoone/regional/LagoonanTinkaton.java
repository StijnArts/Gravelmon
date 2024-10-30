package drai.dev.data.pokemon.lagoone.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class LagoonanTinkaton extends drai.dev.data.pokemon.Pokemon {
    public LagoonanTinkaton(String name, Aspect aspect) {
        super(name, aspect, "LAGOONEnianTinkaton",
                Type.GRASS,Type.STEEL,
                new Stats(85,
                        75,
                        77,
                        70,
                        105,
                        94),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                17, 1128,
                new Stats(0,0,0,0,3,0), 45,
                0.0,
                253, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FAIRY),
                List.of("They share a symbiotic relationship with Dhelmise who takes over the seaweed in its body. In trade they are allowed to use its heavy anchor as a makeshift hammer."),
                List.of(),
                List.of(                        ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 38, 56, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BEACH, Biome.IS_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.SHIP_WRECK),
                0.28, 0.3,
                List.of());
           setLangFileName("Tinkaton");

    }


}
