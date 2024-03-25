package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Trickgrin extends drai.dev.gravelmon.pokemon.Pokemon {
    public Trickgrin() {
        super("Trickgrin",
                Type.DARK,Type.QUESTION_MARK,
                new Stats(40,
                        50,
                        40,
                        40,
                        40,
                        120),
                List.of(Ability.PICKPOCKET,Ability.PRANKSTER), Ability.MASTERTHIEF,
                5, 135,
                new Stats(0,0,0,0,0,2), 45,
                0.5,
                133, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of("Trickgrin act innocent during day and aren't found very often in daylight, but at night they appear everywhere, ready to take whatever catches their eyes. Trickgrin are natural rivals to Delibird."),
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
           setLangFileName("Trickgrin");

    }


}
