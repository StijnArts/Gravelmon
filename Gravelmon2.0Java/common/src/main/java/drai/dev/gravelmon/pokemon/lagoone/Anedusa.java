package drai.dev.gravelmon.pokemon.lagoone;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Anedusa extends drai.dev.gravelmon.pokemon.Pokemon {
    public Anedusa() {
        super("Anedusa",
                Type.POISON,Type.FIGHTING,
                new Stats(60,
                        100,
                        70,
                        50,
                        80,
                        110),
                List.of(Ability.DRY_SKIN), Ability.TECHNICIAN,
                12, 251,
                new Stats(0,0,0,2,0,0), 60,
                0.5,
                159, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("Instead of using its arms it fights using its snake head like tentacles, the poison on those is powerful enough to paralyze its foes for hours."),
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
           setLangFileName("Anedusa");

    }


}
