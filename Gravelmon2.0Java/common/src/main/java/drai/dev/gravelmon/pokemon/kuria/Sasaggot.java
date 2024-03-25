package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Sasaggot extends drai.dev.gravelmon.pokemon.Pokemon {
    public Sasaggot() {
        super("Sasaggot",
                Type.BUG,Type.FIGHTING,
                new Stats(65,
                        118,
                        92,
                        44,
                        96,
                        85),
                List.of(Ability.IAISLASH), Ability.IAISLASH,
                13, 326,
                new Stats(0,2,0,0,0,0), 45,
                0.5,
                175, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.BUG,EggGroup.MONSTER),
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
           setLangFileName("Sasaggot");

    }


}
