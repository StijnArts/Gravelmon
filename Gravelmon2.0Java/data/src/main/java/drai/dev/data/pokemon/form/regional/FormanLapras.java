package drai.dev.data.pokemon.form.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class FormanLapras extends drai.dev.data.pokemon.Pokemon {
    public FormanLapras(String name, Aspect aspect) {
        super(name, aspect, "FormanLapras",
                Type.ROCK,Type.DRAGON,
                new Stats(116,
                        62,
                        134,
                        116,
                        81,
                        23),
                List.of(Ability.MARVEL_SCALE), null,
                28, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.FORM),
                0, List.of(
                ), SpawnContext.SEAFLOOR, SpawnPool.RARE, 31, 59, .7, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Lapras");
        setCanWalkOnWater(true);

    }


}
