package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Bencho extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bencho() {
        super("Bencho",
                Type.WATER,Type.FIGHTING,
                new Stats(77,
                        116,
                        95,
                        68,
                        72,
                        92),
                List.of(Ability.BULLY,Ability.ILLINTENT), Ability.MOXIE,
                10, 131,
                new Stats(0,2,0,0,0,0), 45,
                1.0,
                188, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.WATER_2),
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
           setLangFileName("Bencho");

    }


}
