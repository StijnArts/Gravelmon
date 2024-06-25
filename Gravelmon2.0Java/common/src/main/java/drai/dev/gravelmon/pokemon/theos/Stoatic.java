package drai.dev.gravelmon.pokemon.theos;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Stoatic extends drai.dev.gravelmon.pokemon.Pokemon {
    public Stoatic() {
        super("Stoatic",
                Type.ELECTRIC, Type.GROUND,
                new Stats(60,
                        55,
                        60,
                        85,
                        70,
                        75),
                List.of(Ability.MOTOR_DRIVE), Ability.MOTOR_DRIVE,
                4, 40,
                new Stats(0,0,0,1,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Stoatic construct massive tunnel systems beneath the ground where they store berries. Their cheek pouches can glow in the dark, allowing them to see while traversing said systems."),
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
           setLangFileName("Stoatic");

    }


}
