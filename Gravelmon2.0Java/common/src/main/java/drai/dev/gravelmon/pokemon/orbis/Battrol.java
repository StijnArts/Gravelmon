package drai.dev.gravelmon.pokemon.orbis;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Battrol extends drai.dev.gravelmon.pokemon.Pokemon {
    public Battrol() {
        super("Battrol",
                Type.ELECTRIC, Type.FLYING,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.MOTOR_DRIVE), Ability.LIGHTNING_ROD,
                4, 130,
                new Stats(0,0,0,0,0,1), 210,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.FLYING),
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
           setLangFileName("Battrol");

    }


}
