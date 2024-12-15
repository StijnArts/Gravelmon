package drai.dev.data.pokemon.ayrei;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Fleumingo extends Pokemon {
    public Fleumingo() {
        super("Fleumingo",
                Type.WATER, Type.FLYING,
                new Stats(67,103,60,134,71,57),
                List.of(Ability.SWIFT_SWIM), Ability.GALE_WINGS,
                18, 350,
                new Stats(0,0,0,3,0,0), 255,
                0.5,
                234, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Despite the loss of flight, these Pokemon are incredibly fast, reaching up to 85 MPH at full speed."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.JUMP_KICK, 1),
                        new MoveLearnSetEntry(Move.AQUA_JET, 1),
                        new MoveLearnSetEntry(Move.GUST, 1),
                        new MoveLearnSetEntry(Move.GROWL, 1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW, 4),
                        new MoveLearnSetEntry(Move.WATER_GUN, 7),
                        new MoveLearnSetEntry(Move.RAIN_DANCE, 10),
                        new MoveLearnSetEntry(Move.WATER_PULSE, 13),
                        new MoveLearnSetEntry(Move.WING_ATTACK, 18),
                        new MoveLearnSetEntry(Move.FROST_WALKER, 23),
                        new MoveLearnSetEntry(Move.WAVE_LASH, 27),
                        new MoveLearnSetEntry(Move.AGILITY, 30),
                        new MoveLearnSetEntry(Move.BULK_UP, 36),
                        new MoveLearnSetEntry(Move.WAVE_CRASH, 43),
                        new MoveLearnSetEntry(Move.HIGH_JUMP_KICK, 47),
                        new MoveLearnSetEntry(Move.STEEL_WING, 50),
                        new MoveLearnSetEntry(Move.ROOST, 57),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD, 64),

                        new MoveLearnSetEntry(Move.UPROAR, "tutor"),
                        new MoveLearnSetEntry(Move.ACROBATICS, "tutor"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE, "tutor"),
                        new MoveLearnSetEntry(Move.AGILITY, "tutor"),
                        new MoveLearnSetEntry(Move.ATTRACT, "tutor"),
                        new MoveLearnSetEntry(Move.CONFIDE, "tutor"),
                        new MoveLearnSetEntry(Move.DEFOG, "tutor"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, "tutor"),
                        new MoveLearnSetEntry(Move.DUAL_WINGBEAT, "tutor"),
                        new MoveLearnSetEntry(Move.ENDURE, "tutor"),
                        new MoveLearnSetEntry(Move.FACADE, "tutor"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST, "tutor"),
                        new MoveLearnSetEntry(Move.FIRE_SPIN, "tutor"),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE, "tutor"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER, "tutor"),
                        new MoveLearnSetEntry(Move.FLY, "tutor"),
                        new MoveLearnSetEntry(Move.FROST_WALKER, "tutor"),
                        new MoveLearnSetEntry(Move.FRUSTRATION, "tutor"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE, "tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.OVERHEAT, "tutor"),
                        new MoveLearnSetEntry(Move.PROTECT, "tutor"),
                        new MoveLearnSetEntry(Move.REST, "tutor"),
                        new MoveLearnSetEntry(Move.RETURN, "tutor"),
                        new MoveLearnSetEntry(Move.ROOST, "tutor"),
                        new MoveLearnSetEntry(Move.ROUND, "tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tutor"),
                        new MoveLearnSetEntry(Move.SNATCH, "tutor"),
                        new MoveLearnSetEntry(Move.SNORE, "tutor"),
                        new MoveLearnSetEntry(Move.STEEL_WING, "tutor"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tutor"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY, "tutor"),
                        new MoveLearnSetEntry(Move.SWAGGER, "tutor"),
                        new MoveLearnSetEntry(Move.SWIFT, "tutor"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE, "tutor"),
                        new MoveLearnSetEntry(Move.TAILWIND, "tutor"),
                        new MoveLearnSetEntry(Move.TAUNT, "tutor"),
                        new MoveLearnSetEntry(Move.THIEF, "tutor"),
                        new MoveLearnSetEntry(Move.TOXIC, "tutor"),
                        new MoveLearnSetEntry(Move.UTURN, "tutor"),
                        new MoveLearnSetEntry(Move.WILLOWISP, "tutor"),
                        new MoveLearnSetEntry(Move.WORK_UP, "tutor"),

                        new MoveLearnSetEntry(Move.FLAME_CHARGE, "egg"),
                        new MoveLearnSetEntry(Move.QUICK_GUARD, "egg"),
                        new MoveLearnSetEntry(Move.DEFOG, "egg")
                ),
                List.of(Label.VANGUARD),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 33, 58, 1.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"day")
                ), List.of(),
                List.of(SpawnPreset.NEAR_WATER),
                0.28, 0.3,
                List.of());
        setCanFly(true);
    }
}
