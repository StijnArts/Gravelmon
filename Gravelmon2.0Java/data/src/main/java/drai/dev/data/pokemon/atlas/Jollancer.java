package drai.dev.data.pokemon.atlas;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Jollancer extends drai.dev.data.pokemon.Pokemon {
    public Jollancer() {
        super("Jollancer",
                Type.DARK,
                new Stats(60,
                        99,
                        46,
                        65,
                        66,
                        121),
                List.of(Ability.SUPER_LUCK), Ability.RAZORFINS,
                15, 165,
                new Stats(0,0,0,0,0,2), 155,
                0.5,
                135, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("Jollancer find themselves floating above the ocean, only diving when preparing to skewer it's target. People in Atlas will always check the sea for black sails before going swimming."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.PURSUIT,9),
                        new MoveLearnSetEntry(Move.WATER_PULSE,14),
                        new MoveLearnSetEntry(Move.FEINT,18),
                        new MoveLearnSetEntry(Move.AQUA_JET,23),
                        new MoveLearnSetEntry(Move.TAUNT,27),
                        new MoveLearnSetEntry(Move.BEAT_UP,31),
                        new MoveLearnSetEntry(Move.DIVE,34),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,38),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,43),
                        new MoveLearnSetEntry(Move.DRILL_PECK,47),
                        new MoveLearnSetEntry(Move.FINAL_GAMBIT,51),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.HEARTFELTPULSE,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.TORPEDODASH,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.BOLTIN,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.MALICESTRIKE,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.POISONBURST,"tm"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.DEFOG,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,"tm"),
                        new MoveLearnSetEntry(Move.MIND_READER,"tm"),
                        new MoveLearnSetEntry(Move.MEGAHORN,"tm"),
                        new MoveLearnSetEntry(Move.AIR_SLASH,"tm"),
                        new MoveLearnSetEntry(Move.DRILL_RUN,"tm"),
                        new MoveLearnSetEntry(Move.HORN_DRILL,"tm"),
                        new MoveLearnSetEntry(Move.EXTREME_SPEED,"tm"),
                        new MoveLearnSetEntry(Move.SMART_STRIKE,"tm")                        ),
                List.of(Label.ATLAS),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 14, 44, 4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
