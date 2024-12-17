package drai.dev.data.pokemon.ayrei;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Loathedisc extends Pokemon {
    public Loathedisc() {
        super("Loathedisc",
                Type.GHOST, Type.WATER,
                new Stats(78,30,55,100,90,142),
                List.of(Ability.SWIFT_SWIM, Ability.CURSED_BODY), Ability.HYDRATION,
                12, 187,
                new Stats(0,0,0,0,0,2), 120,
                0.875,
                116, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("It floats about pretending to be dead, waiting for its prey to approach before attacking."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.NIGHT_DAZE, 1),
                        new MoveLearnSetEntry(Move.TACKLE, 1),
                        new MoveLearnSetEntry(Move.SCARY_FACE, 1),
                        new MoveLearnSetEntry(Move.WATER_GUN, 4),
                        new MoveLearnSetEntry(Move.AGILITY, 7),
                        new MoveLearnSetEntry(Move.HEX, 9),
                        new MoveLearnSetEntry(Move.TORMENT, 13),
                        new MoveLearnSetEntry(Move.WATER_PULSE, 17),
                        new MoveLearnSetEntry(Move.FLATTER, 20),
                        new MoveLearnSetEntry(Move.SWIFT, 22),
                        new MoveLearnSetEntry(Move.AMNESIA, 27),
                        new MoveLearnSetEntry(Move.NASTY_PLOT, 30),
                        new MoveLearnSetEntry(Move.MUDDY_WATER, 34),
                        new MoveLearnSetEntry(Move.SHADOW_BALL, 37),
                        new MoveLearnSetEntry(Move.AQUA_RING, 40),
                        new MoveLearnSetEntry(Move.WILLOWISP, 42),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP, 46),
                        new MoveLearnSetEntry(Move.SAFEGUARD, 49),

                        new MoveLearnSetEntry(Move.ATTRACT, "tutor"),
                        new MoveLearnSetEntry(Move.BLIZZARD, "tutor"),
                        new MoveLearnSetEntry(Move.BOUNCE, "tutor"),
                        new MoveLearnSetEntry(Move.BRINE, "tutor"),
                        new MoveLearnSetEntry(Move.CONFIDE, "tutor"),
                        new MoveLearnSetEntry(Move.DIVE, "tutor"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, "tutor"),
                        new MoveLearnSetEntry(Move.ENDURE, "tutor"),
                        new MoveLearnSetEntry(Move.FACADE, "tutor"),
                        new MoveLearnSetEntry(Move.FRUSTRATION, "tutor"),
                        new MoveLearnSetEntry(Move.HAIL, "tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.ICE_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.ICY_WIND, "tutor"),
                        new MoveLearnSetEntry(Move.LIQUIDATION, "tutor"),
                        new MoveLearnSetEntry(Move.PROTECT, "tutor"),
                        new MoveLearnSetEntry(Move.PSYCH_UP, "tutor"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE, "tutor"),
                        new MoveLearnSetEntry(Move.REST, "tutor"),
                        new MoveLearnSetEntry(Move.RETURN, "tutor"),
                        new MoveLearnSetEntry(Move.ROUND, "tutor"),
                        new MoveLearnSetEntry(Move.SAFEGUARD, "tutor"),
                        new MoveLearnSetEntry(Move.SCALD, "tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tutor"),
                        new MoveLearnSetEntry(Move.SNORE, "tutor"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tutor"),
                        new MoveLearnSetEntry(Move.SURF, "tutor"),
                        new MoveLearnSetEntry(Move.SWAGGER, "tutor"),
                        new MoveLearnSetEntry(Move.SWIFT, "tutor"),
                        new MoveLearnSetEntry(Move.TOXIC, "tutor"),
                        new MoveLearnSetEntry(Move.WATERFALL, "tutor"),
                        new MoveLearnSetEntry(Move.WATER_PULSE, "tutor"),
                        new MoveLearnSetEntry(Move.WHIRLPOOL, "tutor"),

                        new MoveLearnSetEntry(Move.SPLASH, "egg"),
                        new MoveLearnSetEntry(Move.SUPERSONIC, "egg"),
                        new MoveLearnSetEntry(Move.WATER_SPORT, "egg"),
                        new MoveLearnSetEntry(Move.MUD_SPORT, "egg"),
                        new MoveLearnSetEntry(Move.CAPTIVATE, "egg"),
                        new MoveLearnSetEntry(Move.AQUA_RING, "egg"),
                        new MoveLearnSetEntry(Move.AQUA_JET, "egg"),
                        new MoveLearnSetEntry(Move.HEAL_PULSE, "egg"),
                        new MoveLearnSetEntry(Move.BRINE, "egg"),
                        new MoveLearnSetEntry(Move.ENTRAINMENT, "egg")
                ),
                List.of(Label.VANGUARD),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.RARE, 24, 54, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false"),
                        new SpawnCondition(SpawnConditionType.MAXY,"30")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.29, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);
    }
}
