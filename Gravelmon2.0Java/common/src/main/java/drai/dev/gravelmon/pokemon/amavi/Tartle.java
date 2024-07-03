package drai.dev.gravelmon.pokemon.amavi;


import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;
public class Tartle extends drai.dev.gravelmon.pokemon.Pokemon {
    public Tartle() {
        super("Tartle",
                Type.ICE, Type.GROUND,
                new Stats(120,
                        30,
                        60,
                        60,
                        80,
                        30),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                7, 0,
                new Stats(0,0,0,0,0,0), 180,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("sweetort", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")))),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,6),
                        new MoveLearnSetEntry(Move.BIDE,9),
                        new MoveLearnSetEntry(Move.REST,13),
                        new MoveLearnSetEntry(Move.ICE_SHARD,17),
                        new MoveLearnSetEntry(Move.BULLDOZE,22),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,26),
                        new MoveLearnSetEntry(Move.SLASH,30),
                        new MoveLearnSetEntry(Move.AVALANCHE,34),
                        new MoveLearnSetEntry(Move.SLACK_OFF,38),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,42),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,46),
                        new MoveLearnSetEntry(Move.SUPERPOWER,51),
                        new MoveLearnSetEntry(Move.STONE_EDGE,56),
                        new MoveLearnSetEntry(Move.SHEER_COLD,61)
                ),
                List.of(Label.AMAVI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 7, 28, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Tartle");

    }


}
