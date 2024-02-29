package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Biduane extends drai.dev.gravelmon.pokemon.Pokemon {
    public Biduane() {
        super("Biduane",
                Type.GHOST,Type.FLYING,
                new Stats(40,
                        45,
                        50,
                        45,
                        50,
                        55),
                List.of(Ability.NATURAL_CURE), Ability.RATTLED,
                4, 165,
                new Stats(0,0,0,0,0,1), 220,
                0.125,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(),
                List.of("Bidaune are referenced in a legend which states they were once small flying Pokemon like Pidgey and Spearow who wanted to be free and fly wherever they went, supposedly leaving their bodies to do so."),
                List.of(new EvolutionEntry("bidengel", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"27"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.TIME,"day"))),
                        new EvolutionEntry("bidread", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"27"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.TIME,"night")))),
                List.of(
                        new MoveLearnSetEntry(Move.CONFIDE,1),
                        new MoveLearnSetEntry(Move.SAFEGUARD,7),
                        new MoveLearnSetEntry(Move.WING_ATTACK,12),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,15),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,18),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,23),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,26),
                        new MoveLearnSetEntry(Move.NIGHTMARE,29),
                        new MoveLearnSetEntry(Move.TAILWIND,34),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,37),
                        new MoveLearnSetEntry(Move.PERISH_SONG,40),
                        new MoveLearnSetEntry(Move.GUST,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.MIMIC,"tm"),
                        new MoveLearnSetEntry(Move.SKY_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,"tm"),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,"tm"),
                        new MoveLearnSetEntry(Move.UPROAR,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm")                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, 5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL, Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);

    }


}
