package drai.dev.data.pokemon.nodorro.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Magnezone extends drai.dev.data.pokemon.Pokemon {
    public Magnezone(String name, Aspect aspect) {
        super(name, aspect, "Magnezone",
                Type.ELECTRIC, Type.STEEL,
                new Stats(70,
                        70,
                        115,
                        130,
                        90,
                        60),
                List.of(Ability.MAGNET_PULL,Ability.STURDY), Ability.ANALYTIC,
                12, 1800,
                new Stats(0,0,0,3,0,0), 20,
                0.0,
                241, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Magnezone");

    }


}
