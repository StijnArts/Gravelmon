package drai.dev.gravelmon.pokemon.varitas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Meanstalk extends drai.dev.gravelmon.pokemon.Pokemon {
    public Meanstalk() {
        super("Meanstalk",
                Type.GRASS, Type.DARK,
                new Stats(70,
                        70,
                        50,
                        75,
                        60,
                        105),
                List.of(Ability.INFILTRATOR), Ability.REGENERATOR,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("They constantly do things like covertly stealing or misplacing people's belongings or using their vines to tamper with outdoor equipment. They yield beans that are extremely bitter, said to be indicative of their true inner rage and malice."),
                List.of(),
                List.of(                        ),
                List.of(Label.VARITAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Meanstalk");

    }


}
