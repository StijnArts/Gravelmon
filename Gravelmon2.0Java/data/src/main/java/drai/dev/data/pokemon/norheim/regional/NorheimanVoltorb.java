package drai.dev.data.pokemon.norheim.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class NorheimanVoltorb extends drai.dev.data.pokemon.Pokemon {
    public NorheimanVoltorb(String name, Aspect aspect) {
        super(name, aspect, "Voltorb",
                Type.ELECTRIC, Type.ICE,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                10, 165,
                new Stats(0,0,0,0,0,0), 180,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("norheimanelectrode", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))),
                List.of(
                        new MoveLearnSetEntry(Move.CHARM,1),
                        new MoveLearnSetEntry(Move.ROLLOUT,12),
                        new MoveLearnSetEntry(Move.SPARK,15),
                        new MoveLearnSetEntry(Move.SOFTBOILED,18),
                        new MoveLearnSetEntry(Move.PROTECT,23),
                        new MoveLearnSetEntry(Move.ELECTRO_BALL,29),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,34),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,38),
                        new MoveLearnSetEntry(Move.ZING_ZAP,42),
                        new MoveLearnSetEntry(Move.ICYCHARGE,50),
                        new MoveLearnSetEntry(Move.ICE_BEAM,56),
                        new MoveLearnSetEntry(Move.SHEER_COLD,62)
                ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 8, 33, 5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Voltorb");

    }


}
