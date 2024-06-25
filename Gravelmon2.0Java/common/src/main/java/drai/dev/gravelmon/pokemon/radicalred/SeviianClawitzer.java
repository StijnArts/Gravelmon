package drai.dev.gravelmon.pokemon.radicalred;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class SeviianClawitzer extends Pokemon {
    public SeviianClawitzer(String originalMon, Aspect aspect) {
        super(originalMon, aspect, "SeviianClawitzer",
                Type.BUG, Type.DARK,
                new Stats(81, 63, 83, 110, 79, 97),
                List.of(Ability.MEGA_LAUNCHER), Ability.MEGA_LAUNCHER,
                13, 353,
                new Stats(0, 0, 0, 0, 2, 0), 55,
                0.5,
                100, ExperienceGroup.SLOW,
                70,
                51, List.of(EggGroup.WATER_1, EggGroup.WATER_3),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.AURA_SPHERE, 1),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE, 1),
                        new MoveLearnSetEntry(Move.HEAL_PULSE, 1),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG, 1),
                        new MoveLearnSetEntry(Move.TORMENT, 1),
                        new MoveLearnSetEntry(Move.VICE_GRIP, 1),
                        new MoveLearnSetEntry(Move.WATER_PULSE, 1),
                        new MoveLearnSetEntry(Move.TORMENT, 7),
                        new MoveLearnSetEntry(Move.VICE_GRIP, 9),
                        new MoveLearnSetEntry(Move.PURSUIT, 12),
                        new MoveLearnSetEntry(Move.FLAIL, 16),
                        new MoveLearnSetEntry(Move.SILVER_WIND, 20),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE, 25),
                        new MoveLearnSetEntry(Move.UTURN, 30),
                        new MoveLearnSetEntry(Move.BUG_BUZZ, 34),
                        new MoveLearnSetEntry(Move.SMACK_DOWN, 42),
                        new MoveLearnSetEntry(Move.FIRST_IMPRESSION, 43),
                        new MoveLearnSetEntry(Move.DARK_PULSE, 48),
                        new MoveLearnSetEntry(Move.FLASH_CANNON, 56),
                        new MoveLearnSetEntry(Move.STICKY_WEB, 70),
                        new MoveLearnSetEntry(Move.ORIGIN_PULSE, 100),
                        new MoveLearnSetEntry(Move.CUT, "tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE, "tm"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE, "tm"),
                        new MoveLearnSetEntry(Move.FACADE, "tm"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON, "tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST, "tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tm"),
                        new MoveLearnSetEntry(Move.LEECH_LIFE, "tm"),
                        new MoveLearnSetEntry(Move.PROTECT, "tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE, "tm"),
                        new MoveLearnSetEntry(Move.REST, "tm"),
                        new MoveLearnSetEntry(Move.RETURN, "tm"),
                        new MoveLearnSetEntry(Move.SILVER_WIND, "tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB, "tm"),
                        new MoveLearnSetEntry(Move.SNARL, "tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE, "tm"),
                        new MoveLearnSetEntry(Move.TAUNT, "tm"),
                        new MoveLearnSetEntry(Move.THIEF, "tm"),
                        new MoveLearnSetEntry(Move.TOXIC, "tm"),
                        new MoveLearnSetEntry(Move.UTURN, "tm"),
                        new MoveLearnSetEntry(Move.XSCISSOR, "tm"),
                        new MoveLearnSetEntry(Move.AURA_SPHERE, "tutor"),
                        new MoveLearnSetEntry(Move.BUG_BITE, "tutor"),
                        new MoveLearnSetEntry(Move.BUG_BUZZ, "tutor"),
                        new MoveLearnSetEntry(Move.DARK_HOLE, "tutor"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY, "tutor"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF, "tutor"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT, "tutor"),
                        new MoveLearnSetEntry(Move.PIN_MISSILE, "tutor"),
                        new MoveLearnSetEntry(Move.ENDURE, "egg"),
                        new MoveLearnSetEntry(Move.ENTRAINMENT, "egg"),
                        new MoveLearnSetEntry(Move.FIRST_IMPRESSION, "egg"),
                        new MoveLearnSetEntry(Move.HELPING_HAND, "egg"),
                        new MoveLearnSetEntry(Move.SNARL, "egg")
                ),
                List.of(Label.RADICAL_RED, Label.GEN6),
                0, List.of(),
                SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 34, 56, 0.2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.19, 0.3,
                List.of());
        this.setLangFileName("Clawitzer");
        this.setPortraitXYZ(0.1, 2.0, 0.0);
    }
}
