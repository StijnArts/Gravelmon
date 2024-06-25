package drai.dev.gravelmon.pokemon.orbis;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Kingulum extends drai.dev.gravelmon.pokemon.Pokemon {
    public Kingulum() {
        super("Kingulum",
                Type.FLYING,
                new Stats(45,
                        85,
                        50,
                        55,
                        65,
                        145),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                2, 2,
                new Stats(0,0,0,0,0,2), 105,
                0.5,
                115, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.FLYING),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Kingulum");

    }


}
