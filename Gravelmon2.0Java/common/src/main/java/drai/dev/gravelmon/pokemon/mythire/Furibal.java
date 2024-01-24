package drai.dev.gravelmon.pokemon.mythire;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Furibal extends drai.dev.gravelmon.pokemon.Pokemon {
    public Furibal() {
        super("Furibal",
                Type.ICE,
                new Stats(40,
                        55,
                        50,
                        50,
                        55,
                        40),
                List.of(Ability.FUR_COAT,Ability.OVERCOAT,Ability.SNOW_CLOAK), Ability.SNOW_CLOAK,
                8, 165,
                new Stats(0,1,0,0,0,0), 190,
                0.5,
                58, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.MONSTER),
                List.of("Furibal huddle together during the cold winter nights, their fluffy bodies keeping each other warm. They also do this to hide their blue tails, which stick out among the snow."),
                List.of(),
                List.of(                        ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Furibal");

    }


}
