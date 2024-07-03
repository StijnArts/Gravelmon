package drai.dev.gravelmon.pokemon.vanguard;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Cradecart extends Pokemon {
    public Cradecart() {
        super("Cradecart",
                Type.WATER, Type.BUG,
                new Stats(90,65,115,55,35,125),
                List.of(Ability.RAIN_DISH, Ability.SHELL_ARMOR), Ability.HUGE_POWER,
                14, 2000,
                new Stats(0,0,0,0,0,2), 75,
                0.5,
                170, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL, EggGroup.BUG),
                List.of("Also known as the scavenger of the sea, it picks up discarded body parts of other acquatic Pokemon and builds a tough exoskeleton."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.STICKY_WEB, 1),
                        new MoveLearnSetEntry(Move.MUDSLAP, 1),
                        new MoveLearnSetEntry(Move.WITHDRAW, 1),
                        new MoveLearnSetEntry(Move.BUBBLE, 1),
                        new MoveLearnSetEntry(Move.BUG_BITE, 12),
                        new MoveLearnSetEntry(Move.FLAIL, 16),
                        new MoveLearnSetEntry(Move.SLASH, 20),
                        new MoveLearnSetEntry(Move.RAZOR_SHELL, 24),
                        new MoveLearnSetEntry(Move.SKITTER_SMACK, 28),
                        new MoveLearnSetEntry(Move.LIQUIDATION, 32),
                        new MoveLearnSetEntry(Move.LEECH_LIFE, 38),
                        new MoveLearnSetEntry(Move.RAIN_DANCE, 44),
                        new MoveLearnSetEntry(Move.SHELL_SMASH, 50),
                        new MoveLearnSetEntry(Move.WAVE_CRASH, 56),

                        new MoveLearnSetEntry(Move.AERIAL_ACE, "tutor"),
                        new MoveLearnSetEntry(Move.ATTRACT, "tutor"),
                        new MoveLearnSetEntry(Move.BLOCK, "tutor"),
                        new MoveLearnSetEntry(Move.BODY_PRESS, "tutor"),
                        new MoveLearnSetEntry(Move.BUG_BITE, "tutor"),
                        new MoveLearnSetEntry(Move.BULLDOZE, "tutor"),
                        new MoveLearnSetEntry(Move.CONFIDE, "tutor"),
                        new MoveLearnSetEntry(Move.CUT, "tutor"),
                        new MoveLearnSetEntry(Move.DIG, "tutor"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, "tutor"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE, "tutor"),
                        new MoveLearnSetEntry(Move.ENDURE, "tutor"),
                        new MoveLearnSetEntry(Move.FACADE, "tutor"),
                        new MoveLearnSetEntry(Move.FRUSTRATION, "tutor"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT, "tutor"),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM, "tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE, "tutor"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF, "tutor"),
                        new MoveLearnSetEntry(Move.NATURE_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.POISON_JAB, "tutor"),
                        new MoveLearnSetEntry(Move.PROTECT, "tutor"),
                        new MoveLearnSetEntry(Move.REST, "tutor"),
                        new MoveLearnSetEntry(Move.RETURN, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB, "tutor"),
                        new MoveLearnSetEntry(Move.ROUND, "tutor"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW, "tutor"),
                        new MoveLearnSetEntry(Move.SKITTER_SMACK, "tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tutor"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN, "tutor"),
                        new MoveLearnSetEntry(Move.SNORE, "tutor"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.SOLAR_BLADE, "tutor"),
                        new MoveLearnSetEntry(Move.SPIKES, "tutor"),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM, "tutor"),
                        new MoveLearnSetEntry(Move.STONE_EDGE, "tutor"),
                        new MoveLearnSetEntry(Move.STRENGTH, "tutor"),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG, "tutor"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tutor"),
                        new MoveLearnSetEntry(Move.SWAGGER, "tutor"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE, "tutor"),
                        new MoveLearnSetEntry(Move.TOXIC, "tutor"),
                        new MoveLearnSetEntry(Move.XSCISSOR, "tutor"),

                        new MoveLearnSetEntry(Move.NIGHT_SLASH, "egg"),
                        new MoveLearnSetEntry(Move.COUNTER, "egg"),
                        new MoveLearnSetEntry(Move.CURSE, "egg"),
                        new MoveLearnSetEntry(Move.BLOCK, "egg"),
                        new MoveLearnSetEntry(Move.WIDE_GUARD, "egg"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF, "egg")
                ),
                List.of(Label.GEN5,Label.VANGUARD),
                0, List.of(
                ), SpawnContext.SEAFLOOR, SpawnPool.COMMON, 35, 56, 0.9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.REEF),
                0.28, 0.3,
                List.of());
        this.setLangFileName("Cradecart");
        this.setPortraitXYZ(0,1.8,0);
    }
}
