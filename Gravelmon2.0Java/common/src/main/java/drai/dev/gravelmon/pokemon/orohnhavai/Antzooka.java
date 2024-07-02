package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class Antzooka extends drai.dev.gravelmon.pokemon.Pokemon {
    public Antzooka() {
        super("Antzooka",
                Type.BUG,
                new Stats(62,
                        95,
                        70,
                        86,
                        70,
                        75),
                List.of(Ability.SNIPER,Ability.STEADFAST,Ability.SHARPSHOOTER), Ability.SHARPSHOOTER,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("They raid areas to collect Berries. They store the seeds in their abdomen and launch them out their cannons as bullets. They are very territorial and usually get into wars over territories with other armies of Antzooka."),
                List.of(),
                List.of(                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Antzooka");

    }


}
