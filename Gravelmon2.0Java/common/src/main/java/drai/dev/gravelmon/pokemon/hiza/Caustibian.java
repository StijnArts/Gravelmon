package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Caustibian extends drai.dev.gravelmon.pokemon.Pokemon {
    public Caustibian() {
        super("Caustibian",
                Type.POISON,
                new Stats(50,
                        75,
                        60,
                        120,
                        70,
                        95),
                List.of(Ability.POISON_TOUCH,Ability.STICKY_HOLD,Ability.CORROSION), Ability.CORROSION,
                8, 165,
                new Stats(0,0,0,2,0,0), 45,
                0.5,
                168, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.MONSTER),
                List.of("They mark their territory by leaving toxic slime puddles behind. This slime dries out over a short time and becomes safe to touch."),
                List.of(),
                List.of(                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Caustibian");

    }


}
