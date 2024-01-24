package drai.dev.gravelmon.pokemon.vanguard.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class AyreianPinsir extends Pokemon {
    public AyreianPinsir(int dexNo) {
        super(dexNo,"AyreianPinsir",
                Type.STEEL, Type.DARK,
                new Stats(75,135,120,55,55,85),
                List.of(Ability.HEAVY_METAL, Ability.MOLD_BREAKER), Ability.SHEER_FORCE,
                15, 3550,
                new Stats(0,2,0,0,0,0), 45,
                0.5,
                175, ExperienceGroup.MEDIUM_SLOW,
                70,
                26, List.of(EggGroup.BUG),
                List.of("Its powerful carapace, harder than diamond, lets it shake off even tank shells. The leader of the pack has the most scars on its iron mantle."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.VISE_GRIP, 1),
                        new MoveLearnSetEntry(Move.HARDEN, 1),
                        new MoveLearnSetEntry(Move.POWER_TRIP, 4),
                        new MoveLearnSetEntry(Move.BITE, 8),
                        new MoveLearnSetEntry(Move.SEISMIC_TOSS, 12),
                        new MoveLearnSetEntry(Move.METAL_CLAW, 16),
                        new MoveLearnSetEntry(Move.STORM_THROW, 20),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH, 24),
                        new MoveLearnSetEntry(Move.VITAL_THROW, 28),
                        new MoveLearnSetEntry(Move.CRUNCH, 32),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM, 36),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE, 40),
                        new MoveLearnSetEntry(Move.IRON_HEAD, 44),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH, 48),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT, 52),

                        new MoveLearnSetEntry(Move.ATTRACT, "tutor"),
                        new MoveLearnSetEntry(Move.BIND, "tutor"),
                        new MoveLearnSetEntry(Move.BODY_SLAM, "tutor"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK, "tutor"),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING, "tutor"),
                        new MoveLearnSetEntry(Move.BUG_BITE, "tutor"),
                        new MoveLearnSetEntry(Move.BULK_UP, "tutor"),
                        new MoveLearnSetEntry(Move.BULLDOZE, "tutor"),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT, "tutor"),
                        new MoveLearnSetEntry(Move.CONFIDE, "tutor"),
                        new MoveLearnSetEntry(Move.CUT, "tutor"),
                        new MoveLearnSetEntry(Move.DIG, "tutor"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, "tutor"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE, "tutor"),
                        new MoveLearnSetEntry(Move.ENDURE, "tutor"),
                        new MoveLearnSetEntry(Move.FACADE, "tutor"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE, "tutor"),
                        new MoveLearnSetEntry(Move.FLING, "tutor"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST, "tutor"),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY, "tutor"),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH, "tutor"),
                        new MoveLearnSetEntry(Move.FRUSTRATION, "tutor"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT, "tutor"),
                        new MoveLearnSetEntry(Move.HELPING_HAND, "tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.HIGH_HORSEPOWER, "tutor"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE, "tutor"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF, "tutor"),
                        new MoveLearnSetEntry(Move.OUTRAGE, "tutor"),
                        new MoveLearnSetEntry(Move.PROTECT, "tutor"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE, "tutor"),
                        new MoveLearnSetEntry(Move.REST, "tutor"),
                        new MoveLearnSetEntry(Move.RETURN, "tutor"),
                        new MoveLearnSetEntry(Move.REVENGE, "tutor"),
                        new MoveLearnSetEntry(Move.REVERSAL, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB, "tutor"),
                        new MoveLearnSetEntry(Move.ROUND, "tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tutor"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN, "tutor"),
                        new MoveLearnSetEntry(Move.SNORE, "tutor"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK, "tutor"),
                        new MoveLearnSetEntry(Move.STONE_EDGE, "tutor"),
                        new MoveLearnSetEntry(Move.STRENGTH, "tutor"),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG, "tutor"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tutor"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY, "tutor"),
                        new MoveLearnSetEntry(Move.SUPERPOWER, "tutor"),
                        new MoveLearnSetEntry(Move.SWAGGER, "tutor"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE, "tutor"),
                        new MoveLearnSetEntry(Move.THIEF, "tutor"),
                        new MoveLearnSetEntry(Move.THROAT_CHOP, "tutor"),
                        new MoveLearnSetEntry(Move.TOXIC, "tutor"),
                        new MoveLearnSetEntry(Move.XSCISSOR, "tutor"),

                        new MoveLearnSetEntry(Move.THRASH, "egg"),
                        new MoveLearnSetEntry(Move.FURY_ATTACK, "egg"),
                        new MoveLearnSetEntry(Move.FLAIL, "egg"),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK, "egg"),
                        new MoveLearnSetEntry(Move.FEINT, "egg")
                ),
                List.of(Label.VANGUARD, Label.GEN1),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 20, 50, 10, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.22, 0.3,
                List.of());
        this.setLangFileName("Pinsir");
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
