package drai.dev.gravelmon.pokemon.vanguard.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class AyreianVanniluxe extends Pokemon {
    public AyreianVanniluxe(String originalMon, Aspect aspect) {
        super(originalMon, aspect,"AyreianVanniluxe",
                Type.FIRE, Type.GROUND,
                new Stats(81,75,95,79,110,95),
                List.of(Ability.LEVITATE, Ability.FLAME_BODY), Ability.DRY_SKIN,
                11, 410,
                new Stats(0,0,0,0,3,0), 45,
                0.5,
                241, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Its outer shell is as hot as the inside of an active volcano. It obliviously burns everything in its vicinity to a crisp, be it friend or foe."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FLAME_BURST, 1),
                        new MoveLearnSetEntry(Move.MUDSLAP, 1),
                        new MoveLearnSetEntry(Move.HARDEN, 1),
                        new MoveLearnSetEntry(Move.TAUNT, 4),
                        new MoveLearnSetEntry(Move.MIST, 8),
                        new MoveLearnSetEntry(Move.INCINERATE, 12),
                        new MoveLearnSetEntry(Move.MUD_SHOT, 16),
                        new MoveLearnSetEntry(Move.SANDSTORM, 20),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN, 24),
                        new MoveLearnSetEntry(Move.SCORCHING_SANDS, 28),
                        new MoveLearnSetEntry(Move.ACID_ARMOR, 32),
                        new MoveLearnSetEntry(Move.MIRROR_COAT, 38),
                        new MoveLearnSetEntry(Move.ERUPTION, 44),
                        new MoveLearnSetEntry(Move.EARTH_POWER, 50),

                        new MoveLearnSetEntry(Move.ALLY_SWITCH, "tutor"),
                        new MoveLearnSetEntry(Move.ATTRACT, "tutor"),
                        new MoveLearnSetEntry(Move.AVALANCHE, "tutor"),
                        new MoveLearnSetEntry(Move.CONFIDE, "tutor"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, "tutor"),
                        new MoveLearnSetEntry(Move.ENDURE, "tutor"),
                        new MoveLearnSetEntry(Move.EXPLOSION, "tutor"),
                        new MoveLearnSetEntry(Move.FACADE, "tutor"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON, "tutor"),
                        new MoveLearnSetEntry(Move.FROST_BREATH, "tutor"),
                        new MoveLearnSetEntry(Move.FRUSTRATION, "tutor"),
                        new MoveLearnSetEntry(Move.HAIL, "tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE, "tutor"),
                        new MoveLearnSetEntry(Move.IMPRISON, "tutor"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE, "tutor"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN, "tutor"),
                        new MoveLearnSetEntry(Move.MAGIC_COAT, "tutor"),
                        new MoveLearnSetEntry(Move.MAGNET_RISE, "tutor"),
                        new MoveLearnSetEntry(Move.PROTECT, "tutor"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY, "tutor"),
                        new MoveLearnSetEntry(Move.REST, "tutor"),
                        new MoveLearnSetEntry(Move.RETURN, "tutor"),
                        new MoveLearnSetEntry(Move.ROUND, "tutor"),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT, "tutor"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tutor"),
                        new MoveLearnSetEntry(Move.SNORE, "tutor"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tutor"),
                        new MoveLearnSetEntry(Move.SWAGGER, "tutor"),
                        new MoveLearnSetEntry(Move.TAUNT, "tutor"),
                        new MoveLearnSetEntry(Move.TOXIC, "tutor"),
                        new MoveLearnSetEntry(Move.UPROAR, "tutor"),

                        new MoveLearnSetEntry(Move.AUTOTOMIZE, "egg"),
                        new MoveLearnSetEntry(Move.MAGNET_RISE, "egg"),
                        new MoveLearnSetEntry(Move.ICE_SHARD, "egg"),
                        new MoveLearnSetEntry(Move.EXPLOSION, "egg"),
                        new MoveLearnSetEntry(Move.AURORA_VEIL, "egg"),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH, "egg")
                ),
                List.of(Label.GEN5,Label.VANGUARD),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 35, 57, 0.2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_NETHER_BASALT, Biome.IS_NETHER_WASTELAND))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        this.setLangFileName("Vanniluxe");
        this.setPortraitXYZ(0,1.8,0);
    }
}
