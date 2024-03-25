package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Canoling extends drai.dev.gravelmon.pokemon.Pokemon {
    public Canoling() {
        super("Canoling",
                Type.FIGHTING,
                new Stats(55,
                        50,
                        60,
                        80,
                        50,
                        55),
                List.of(Ability.MEGA_LAUNCHER,Ability.WEAK_ARMOR), Ability.UNBURDEN,
                6, 326,
                new Stats(0,0,0,1,0,0), 95,
                0.0,
                101, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Canoling will roll around, finding anything it can to launch out of the cannon on its head. They are often used for fireworks."),
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
           setLangFileName("Canoling");

    }


}
