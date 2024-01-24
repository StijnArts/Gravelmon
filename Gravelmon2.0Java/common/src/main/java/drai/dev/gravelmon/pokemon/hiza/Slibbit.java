package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Slibbit extends drai.dev.gravelmon.pokemon.Pokemon {
    public Slibbit() {
        super("Slibbit",
                Type.POISON,
                new Stats(30,
                        20,
                        20,
                        70,
                        50,
                        70),
                List.of(Ability.POISON_TOUCH,Ability.STICKY_HOLD,Ability.CORROSION), Ability.CORROSION,
                8, 165,
                new Stats(0,0,0,1,0,0), 120,
                0.5,
                64, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.MONSTER),
                List.of("Its body is covered in a thick toxic slime that poisons those who touch it. This slime cannot be contained as it will corrode anything over time."),
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
           setLangFileName("Slibbit");

    }


}
