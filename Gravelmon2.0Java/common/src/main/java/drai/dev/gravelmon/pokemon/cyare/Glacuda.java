package drai.dev.gravelmon.pokemon.cyare;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Glacuda extends drai.dev.gravelmon.pokemon.Pokemon {
    public Glacuda() {
        super("Glacuda",
                Type.ICE, Type.WATER,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Glacuda uses its fins as sensors to guide itself while swimming through the darkest frozen lakes. They're also used to communicate with others."),
                List.of(),
                List.of(                        ),
                List.of(Label.CYARE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Glacuda");

    }


}
