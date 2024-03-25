package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Gueel extends drai.dev.gravelmon.pokemon.Pokemon {
    public Gueel() {
        super("Gueel",
                Type.STEEL,Type.LIGHT,
                new Stats(55,
                        91,
                        115,
                        134,
                        115,
                        50),
                List.of(Ability.SPEED_BOOST), Ability.SPEED_BOOST,
                4, 47,
                new Stats(0,0,0,2,0,0), 45,
                0.0,
                149, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Gueel");

    }


}
