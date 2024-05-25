package drai.dev.gravelmon.pokemon.theos;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Scalyx extends drai.dev.gravelmon.pokemon.Pokemon {
    public Scalyx() {
        super("Scalyx",
                Type.DRAGON,
                new Stats(60,
                        80,
                        50,
                        30,
                        40,
                        40),
                List.of(Ability.RIVALRY), Ability.POISON_HEAL,
                9, 150,
                new Stats(0,1,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Scalyx are very aggressive and mean Pokémon. People prefer to stay away from them as they're known to bite leaving a deep wound."),
                List.of(),
                List.of(                        ),
                List.of(Label.THEOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Scalyx");

    }


}
