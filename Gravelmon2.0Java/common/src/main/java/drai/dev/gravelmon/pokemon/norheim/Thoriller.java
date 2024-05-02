package drai.dev.gravelmon.pokemon.norheim;


import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Thoriller extends drai.dev.gravelmon.pokemon.Pokemon {
    public Thoriller() {
        super("Thornot",
                Type.BUG,
                new Stats(20,
                        65,
                        35,
                        20,
                        30,
                        40),
                List.of(Ability.SHIELD_DUST,Ability.ANGER_POINT), Ability.RUN_AWAY,
                0, 0,
                new Stats(0,1,0,0,0,0), 220,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Larver gain energy by eating wood. They used to ruin viking ships by chewing planks and thrashing around with its horn."),
                List.of(new EvolutionEntry("Thormite", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"25")))),
                List.of(
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.BUG_BITE,1),
                        new MoveLearnSetEntry(Move.RAGE,1),
                        new MoveLearnSetEntry(Move.BIDE,15),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,20),
                        new MoveLearnSetEntry(Move.ME_FIRST,25),
                        new MoveLearnSetEntry(Move.FIRST_IMPRESSION,30)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TAIGA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Thoriller");

    }


}
