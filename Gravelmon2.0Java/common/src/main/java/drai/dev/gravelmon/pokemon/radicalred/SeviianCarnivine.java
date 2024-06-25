package drai.dev.gravelmon.pokemon.radicalred;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class SeviianCarnivine extends Pokemon {
    public SeviianCarnivine(String originalMon, Aspect aspect) {
        super(originalMon, aspect, "SeviianCarnivine",
                Type.POISON, Type.STEEL,
                new Stats(94, 100, 92, 55, 77, 36),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                14, 270,
                new Stats(0, 2, 0, 0, 0, 0), 200,
                0.5,
                159, ExperienceGroup.SLOW,
                70,
                51, List.of(EggGroup.GRASS),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BIND, 1),
                        new MoveLearnSetEntry(Move.GROWTH, 1),
                        new MoveLearnSetEntry(Move.BITE, 7),
                        new MoveLearnSetEntry(Move.ACID, 11),
                        new MoveLearnSetEntry(Move.METAL_CLAW, 17),
                        new MoveLearnSetEntry(Move.CURSE, 21),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK, 27),
                        new MoveLearnSetEntry(Move.CROSS_POISON, 31),
                        new MoveLearnSetEntry(Move.SPIT_UP, 37),
                        new MoveLearnSetEntry(Move.STOCKPILE, 37),
                        new MoveLearnSetEntry(Move.SWALLOW, 37),
                        new MoveLearnSetEntry(Move.GYRO_BALL, 41),
                        new MoveLearnSetEntry(Move.WRING_OUT, 47),
                        new MoveLearnSetEntry(Move.POISON_JAB, 50),
                        new MoveLearnSetEntry(Move.GUNK_SHOT, 56),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG, 60),
                        new MoveLearnSetEntry(Move.SNAP_TRAP, 63),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES, 66),
                        new MoveLearnSetEntry(Move.BODY_PRESS, "tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE, "tm"),
                        new MoveLearnSetEntry(Move.CUT, "tm"),
                        new MoveLearnSetEntry(Move.DEFOG, "tm"),
                        new MoveLearnSetEntry(Move.FACADE, "tm"),
                        new MoveLearnSetEntry(Move.FLASH, "tm"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON, "tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL, "tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tm"),
                        new MoveLearnSetEntry(Move.IRON_TAIL, "tm"),
                        new MoveLearnSetEntry(Move.LEECH_LIFE, "tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB, "tm"),
                        new MoveLearnSetEntry(Move.PROTECT, "tm"),
                        new MoveLearnSetEntry(Move.REST, "tm"),
                        new MoveLearnSetEntry(Move.RETURN, "tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB, "tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE, "tm"),
                        new MoveLearnSetEntry(Move.STEEL_BEAM, "tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY, "tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE, "tm"),
                        new MoveLearnSetEntry(Move.THIEF, "tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE, "tm"),
                        new MoveLearnSetEntry(Move.TOXIC, "tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK, "tm"),
                        new MoveLearnSetEntry(Move.BUG_BITE, "tutor"),
                        new MoveLearnSetEntry(Move.GUNK_SHOT, "tutor"),
                        new MoveLearnSetEntry(Move.IRON_HEAD, "tutor"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF, "tutor"),
                        new MoveLearnSetEntry(Move.POWER_WHIP, "tutor"),
                        new MoveLearnSetEntry(Move.SEED_BOMB, "tutor"),
                        new MoveLearnSetEntry(Move.ACID_SPRAY, "egg"),
                        new MoveLearnSetEntry(Move.CRUNCH, "egg"),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE, "egg"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE, "egg"),
                        new MoveLearnSetEntry(Move.LEECH_SEED, "egg"),
                        new MoveLearnSetEntry(Move.RAGE_POWDER, "egg"),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER, "egg"),
                        new MoveLearnSetEntry(Move.STUN_SPORE, "egg"),
                        new MoveLearnSetEntry(Move.SYNTHESIS, "egg"),
                        new MoveLearnSetEntry(Move.WORRY_SEED, "egg")
                ),
                List.of(Label.RADICAL_RED, Label.GEN4),
                0, List.of(),
                SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 18, 55, 1.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE, "night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.19, 0.3,
                List.of());
        this.setLangFileName("Carnivine");
        this.setPortraitXYZ(0.1, 2.0, 0.0);
    }
}
