package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Quackle extends drai.dev.data.pokemon.Pokemon {
    public Quackle() {
        super("Quackle",
                Type.FLYING,
                new Stats(40,
                        30,
                        30,
                        60,
                        40,
                        70),
                List.of(Ability.RAIN_DISH,Ability.OWN_TEMPO), Ability.OVERCOAT,
                9, 100,
                new Stats(0,0,0,0,0,1), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Quackle are care-free Pokemon that spend their time lazily floating in ponds and lakes."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Quackle");

    }


}
