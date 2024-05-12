package drai.dev.gravelmon.pokemon.eternalforest;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Wormini extends Pokemon {
    public Wormini() {
        super("Wormini",
                Type.GROUND,
                new Stats(64,
                        65,
                        45,
                        40,
                        45,
                        85),
                List.of(Ability.DRY_SKIN, Ability.SAND_FORCE), Ability.SHED_SKIN,
                8, 147,
                new Stats(0,0,0,0,0,1), 255,
                0.5,
                50, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Wormini spends its time digging in the ground and rarely sees the light of day."),
                List.of(new EvolutionEntry("wormeel", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")))),
                List.of(
                        new MoveLearnSetEntry(Move.MUDSLAP, 1),
                        new MoveLearnSetEntry(Move.LEER, 1),
                        new MoveLearnSetEntry(Move.BIND, 5),
                        new MoveLearnSetEntry(Move.PROTECT, 7),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE, 10),
                        new MoveLearnSetEntry(Move.SAND_TOMB, 13),
                        new MoveLearnSetEntry(Move.STEALTHFLAW, 18),
                        new MoveLearnSetEntry(Move.SANDSTORM, 24),
                        new MoveLearnSetEntry(Move.SLAM, 29),
                        new MoveLearnSetEntry(Move.MUD_BOMB, 34),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, 42),
                        new MoveLearnSetEntry(Move.MAGNITUDE, 47),
                        new MoveLearnSetEntry(Move.BLOCK, 53),
                        new MoveLearnSetEntry(Move.COUNTER, 61),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL, 68),
                        new MoveLearnSetEntry(Move.DIG, 75),
                        new MoveLearnSetEntry(Move.COIL, 81),
                        new MoveLearnSetEntry(Move.AQUA_TAIL, 88),
                        new MoveLearnSetEntry(Move.DRILL_RUN, 95),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE, 102),
                        new MoveLearnSetEntry(Move.EARTHQUAKE, 109),
                        new MoveLearnSetEntry(Move.FISSURE, 115),

                        new MoveLearnSetEntry(Move.ROAR, "tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.TAUNT, "tutor"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN, "tutor"),
                        new MoveLearnSetEntry(Move.PROTECT, "tutor"),
                        new MoveLearnSetEntry(Move.SAFEGUARD, "tutor"),
                        new MoveLearnSetEntry(Move.FRUSTRATION, "tutor"),
                        new MoveLearnSetEntry(Move.RETURN, "tutor"),
                        new MoveLearnSetEntry(Move.DIG, "tutor"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, "tutor"),
                        new MoveLearnSetEntry(Move.REFLECT, "tutor"),
                        new MoveLearnSetEntry(Move.SANDSTORM, "tutor"),
                        new MoveLearnSetEntry(Move.FACADE, "tutor"),
                        new MoveLearnSetEntry(Move.SECRET_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.REST, "tutor"),
                        new MoveLearnSetEntry(Move.ATTRACT, "tutor"),
                        new MoveLearnSetEntry(Move.THIEF, "tutor"),
                        new MoveLearnSetEntry(Move.SNATCH, "tutor"),
                        new MoveLearnSetEntry(Move.ENDURE, "tutor"),
                        new MoveLearnSetEntry(Move.PAYBACK, "tutor"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK, "tutor"),
                        new MoveLearnSetEntry(Move.PSYCH_UP, "tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tutor"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT, "tutor"),
                        new MoveLearnSetEntry(Move.SWAGGER, "tutor"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tutor"),
                        new MoveLearnSetEntry(Move.ROUND, "tutor"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE, "tutor"),
                        new MoveLearnSetEntry(Move.QUASH, "tutor"),
                        new MoveLearnSetEntry(Move.RETALIATE, "tutor"),

                        new MoveLearnSetEntry(Move.SUCKER_PUNCH, "egg"),
                        new MoveLearnSetEntry(Move.DUAL_CHOP, "egg"),
                        new MoveLearnSetEntry(Move.INFESTATION, "egg"),
                        new MoveLearnSetEntry(Move.HARMFULINVASION, "egg"),
                        new MoveLearnSetEntry(Move.WRAP, "egg"),
                        new MoveLearnSetEntry(Move.MINIMIZE, "egg"),
                        new MoveLearnSetEntry(Move.POWER_WHIP, "egg"),
                        new MoveLearnSetEntry(Move.TAUNT, "egg"),
                        new MoveLearnSetEntry(Move.REFRESH, "egg"),
                        new MoveLearnSetEntry(Move.EARTH_POWER, "egg"),
                        new MoveLearnSetEntry(Move.WRING_OUT, "egg")
                ),
                List.of(Label.ETERNAL_FOREST),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 2, 22, 7.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TAIGA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_SNOWY))),
                List.of(SpawnPreset.NATURAL),
                0.22, 0.3,
                List.of());
    }
}
