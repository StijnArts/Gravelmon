package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Chaballic extends drai.dev.gravelmon.pokemon.Pokemon {
    public Chaballic() {
        super("Chaballic",
                Type.QUESTION_MARK,Type.DRAGON,
                new Stats(90,
                        71,
                        85,
                        106,
                        85,
                        68),
                List.of(Ability.ANALYTIC,Ability.COMPOUND_EYES), Ability.PRANKSTER,
                13, 216,
                new Stats(0,0,0,2,0,0), 45,
                0.5,
                188, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.FIELD),
                List.of("Chaballic can create large illusions of themselves by striking odd poses, and they use this to stun their foes in fear. They're very stubborn when it comes to changing colors."),
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
           setLangFileName("Chaballic");

    }


}
