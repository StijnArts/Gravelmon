package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Purswayer extends drai.dev.gravelmon.pokemon.Pokemon {
    public Purswayer() {
        super("Purswayer",
                Type.DARK,
                new Stats(80,
                        105,
                        50,
                        60,
                        60,
                        95),
                List.of(Ability.INTIMIDATE,Ability.QUICK_FEET,Ability.JUSTIFIED), Ability.JUSTIFIED,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Purswayer are very skilled hunters. They teach their young at a very young age how to hunt down their prey. A pack hunting together won't stop until their prey tires out from running. A glare from a Purswayer is said to mess with one's judgment, and cause prey to submit to it."),
                List.of(),
                List.of(                        ),
                List.of(Label.OROHNHAVAI
),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Purswayer");

    }


}
