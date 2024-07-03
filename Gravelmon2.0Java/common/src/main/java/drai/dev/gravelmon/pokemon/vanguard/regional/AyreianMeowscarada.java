package drai.dev.gravelmon.pokemon.vanguard.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class AyreianMeowscarada extends Pokemon {
    public AyreianMeowscarada(String name, Aspect aspect) {
        super(name, aspect,"AyreianMeowscarada",
                Type.GHOST, Type.POISON,
                new Stats(66,76,70,118,120,80),
                List.of(Ability.INSOMNIA, Ability.MERCILESS ), Ability.PROTEAN,
                15, 312,
                new Stats(0,0,0,0,0,3), 45,
                0.875,
                144, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD, EggGroup.GRASS),
                List.of("While it may look innocent, it has a dangerous personality. It tricks other Pokemon into accepting its bouquet, which then erupts into a shower of venomous spikes."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.NIGHT_SHADE_BOUQUET, 1),
                        new MoveLearnSetEntry(Move.ASTONISH, 1),
                        new MoveLearnSetEntry(Move.SCRATCH, 1),
                        new MoveLearnSetEntry(Move.POISON_GAS, 1),
                        new MoveLearnSetEntry(Move.POISON_FANG, 7),
                        new MoveLearnSetEntry(Move.WORK_UP, 10),
                        new MoveLearnSetEntry(Move.HEX, 13),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK, 15),
                        new MoveLearnSetEntry(Move.SLUDGE, 20),
                        new MoveLearnSetEntry(Move.UTURN, 24),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, 29),
                        new MoveLearnSetEntry(Move.SHADOW_BALL, 33),
                        new MoveLearnSetEntry(Move.SWITCHEROO, 38),
                        new MoveLearnSetEntry(Move.ENERGY_BALL, 43),
                        new MoveLearnSetEntry(Move.VENOSHOCK, 47),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM, 52),
                        new MoveLearnSetEntry(Move.NASTY_PLOT, 58),
                        new MoveLearnSetEntry(Move.SPECTRAL_BARRAGE, 64),

                        new MoveLearnSetEntry(Move.TAKE_DOWN, "tutor"),
                        new MoveLearnSetEntry(Move.CHARM, "tutor"),
                        new MoveLearnSetEntry(Move.FAKE_TEARS, "tutor"),
                        new MoveLearnSetEntry(Move.AGILITY, "tutor"),
                        new MoveLearnSetEntry(Move.MUDSLAP, "tutor"),
                        new MoveLearnSetEntry(Move.PROTECT, "tutor"),
                        new MoveLearnSetEntry(Move.LOW_KICK, "tutor"),
                        new MoveLearnSetEntry(Move.ACROBATICS, "tutor"),
                        new MoveLearnSetEntry(Move.THIEF, "tutor"),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE, "tutor"),
                        new MoveLearnSetEntry(Move.TRAILBLAZE, "tutor"),
                        new MoveLearnSetEntry(Move.CHILLING_WATER, "tutor"),
                        new MoveLearnSetEntry(Move.FACADE, "tutor"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE, "tutor"),
                        new MoveLearnSetEntry(Move.SWIFT, "tutor"),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF, "tutor"),
                        new MoveLearnSetEntry(Move.LOW_SWEEP, "tutor"),
                        new MoveLearnSetEntry(Move.FLING, "tutor"),
                        new MoveLearnSetEntry(Move.ENDURE, "tutor"),
                        new MoveLearnSetEntry(Move.BULLET_SEED, "tutor"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK, "tutor"),
                        new MoveLearnSetEntry(Move.UTURN, "tutor"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW, "tutor"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY, "tutor"),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH, "tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tutor"),
                        new MoveLearnSetEntry(Move.SEED_BOMB, "tutor"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT, "tutor"),
                        new MoveLearnSetEntry(Move.REST, "tutor"),
                        new MoveLearnSetEntry(Move.TAUNT, "tutor"),
                        new MoveLearnSetEntry(Move.SPIKES, "tutor"),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES, "tutor"),
                        new MoveLearnSetEntry(Move.DARK_PULSE, "tutor"),
                        new MoveLearnSetEntry(Move.SKILL_SWAP, "tutor"),
                        new MoveLearnSetEntry(Move.POWER_GEM, "tutor"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tutor"),
                        new MoveLearnSetEntry(Move.TRICK, "tutor"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN, "tutor"),
                        new MoveLearnSetEntry(Move.AURA_SPHERE, "tutor"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL, "tutor"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL, "tutor"),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH, "tutor"),
                        new MoveLearnSetEntry(Move.HELPING_HAND, "tutor"),
                        new MoveLearnSetEntry(Move.POLLEN_PUFF, "tutor"),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN, "tutor"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT, "tutor"),
                        new MoveLearnSetEntry(Move.GRASS_PLEDGE, "tutor"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT, "tutor"),
                        new MoveLearnSetEntry(Move.FRENZY_PLANT, "tutor"),
                        new MoveLearnSetEntry(Move.LEAF_STORM, "tutor"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM, "tutor"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.TERA_BLAST, "tutor"),

                        new MoveLearnSetEntry(Move.LEECH_SEED, "egg"),
                        new MoveLearnSetEntry(Move.COPYCAT, "egg"),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH, "egg"),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH, "egg"),
                        new MoveLearnSetEntry(Move.PETAL_BLIZZARD, "egg")
                ),
                List.of(Label.GEN9,Label.VANGUARD),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 36, 47, 0.2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.29, 0.3,
                List.of());
        this.setLangFileName("Meowscarada");
        this.setPortraitXYZ(0,1.8,0);
    }
}
