package drai.dev.gravelmon.pokemon.lagoone;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Anemace extends drai.dev.gravelmon.pokemon.Pokemon {
    public Anemace() {
        super("Anemace",
                Type.POISON,Type.FIGHTING,
                new Stats(90,
                        100,
                        100,
                        50,
                        70,
                        60),
                List.of(Ability.DRY_SKIN), Ability.ROUGH_SKIN,
                12, 480,
                new Stats(0,2,0,0,0,0), 60,
                0.5,
                159, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("A brute that fights by swinging its tentacles. They like to display their strength by shattering rocks, sometimes hurting themselves but too prideful to show it."),
                List.of(),
                List.of(                        ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Anemace");

    }


}
