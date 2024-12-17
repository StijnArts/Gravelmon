package drai.dev.data.pokemon.africanus.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class AfricanusanKricketot extends drai.dev.data.pokemon.Pokemon {
    public AfricanusanKricketot(String name, Aspect aspect) {
        super(name, aspect, "AfricanusanKricketot",
                Type.BUG,Type.FIGHTING,
                new Stats(47,
                        41,
                        41,
                        25,
                        25,
                        25),
                List.of(Ability.SHED_SKIN), null,
                3, 22,
                new Stats(0,0,1,0,0,0), 255,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Los pueblos galos usaron a los Kricketot cómo instrumento durante generaciones, adaptándose estos a sus bárbaras costumbres."),
                List.of(new EvolutionEntry("kricketune africanusan", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"10")))),
                List.of(
                        new MoveLearnSetEntry(Move.BUG_BITE,16),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.BIDE,1),
                        new MoveLearnSetEntry(Move.LOW_KICK,6)                        ),
                List.of(Label.AFRICANUS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 5.4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Kricketot");

    }


}
