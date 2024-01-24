package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Digdog extends drai.dev.gravelmon.pokemon.Pokemon {
    public Digdog() {
        super("Digdog",
                Type.GROUND,
                new Stats(99,
                        23,
                        82,
                        32,
                        79,
                        41),
                List.of(Ability.UNAWARE), Ability.SAND_SPIT,
                8, 165,
                new Stats(2,0,0,0,0,0), 190,
                0.5,
                71, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.WATER_1),
                List.of("Digdogs can be found lying either beneath or right on top of huge sand piles. They're incredibly lax, and are known to be unresponsive to any physical stimuli when asleep."),
                List.of(),
                List.of(                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Digdog");

    }


}
