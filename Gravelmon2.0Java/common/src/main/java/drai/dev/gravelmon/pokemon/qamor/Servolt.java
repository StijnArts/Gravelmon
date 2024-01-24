package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Servolt extends drai.dev.gravelmon.pokemon.Pokemon {
    public Servolt() {
        super("Servolt",
                Type.ELECTRIC,Type.DARK,
                new Stats(30,
                        72,
                        31,
                        33,
                        40,
                        88),
                List.of(Ability.QUICK_FEET), Ability.QUICK_FEET,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Servolt are very strong willed and won't give up a fight easily. They spend most of their time swatting and preying on smaller Pokemon, practicing their hunting skill."),
                List.of(),
                List.of(                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Servolt");

    }


}
