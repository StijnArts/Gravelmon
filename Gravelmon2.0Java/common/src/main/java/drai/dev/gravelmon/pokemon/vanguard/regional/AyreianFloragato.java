package drai.dev.gravelmon.pokemon.vanguard.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class AyreianFloragato extends Pokemon {
    public AyreianFloragato(String name, Aspect aspect) {
        super(name, aspect,"AyreianFloragato",
                Type.GHOST, Type.POISON,
                new Stats(51,55,63,78,90,73),
                List.of(Ability.INSOMNIA, Ability.MERCILESS ), Ability.PROTEAN,
                9, 122,
                new Stats(0,0,0,0,0,2), 45,
                0.875,
                144, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD, EggGroup.GRASS),
                List.of("Floragato deftly wields the poisonous flower buds under its hoodie, throwing them at opponents like grenades."),
                List.of(new EvolutionEntry("ayreianmeowscarada", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"33")))),
                List.of(
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

                        new MoveLearnSetEntry(Move.TAKE_DOWN, "tutor"),
                        new MoveLearnSetEntry(Move.CHARM, "tutor"),
                        new MoveLearnSetEntry(Move.FAKE_TEARS, "tutor"),
                        new MoveLearnSetEntry(Move.AGILITY, "tutor"),
                        new MoveLearnSetEntry(Move.MUDSLAP, "tutor"),
                        new MoveLearnSetEntry(Move.PROTECT, "tutor"),
                        new MoveLearnSetEntry(Move.LOW_KICK, "tutor"),
                        new MoveLearnSetEntry(Move.ACROBATICS, "tutor"),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE, "tutor"),
                        new MoveLearnSetEntry(Move.TRAILBLAZE, "tutor"),
                        new MoveLearnSetEntry(Move.FACADE, "tutor"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE, "tutor"),
                        new MoveLearnSetEntry(Move.SWIFT, "tutor"),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF, "tutor"),
                        new MoveLearnSetEntry(Move.LOW_SWEEP, "tutor"),
                        new MoveLearnSetEntry(Move.FLING, "tutor"),
                        new MoveLearnSetEntry(Move.ENDURE, "tutor"),
                        new MoveLearnSetEntry(Move.BULLET_SEED, "tutor"),
                        new MoveLearnSetEntry(Move.UTURN, "tutor"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW, "tutor"),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH, "tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tutor"),
                        new MoveLearnSetEntry(Move.SEED_BOMB, "tutor"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT, "tutor"),
                        new MoveLearnSetEntry(Move.REST, "tutor"),
                        new MoveLearnSetEntry(Move.TAUNT, "tutor"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tutor"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN, "tutor"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL, "tutor"),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH, "tutor"),
                        new MoveLearnSetEntry(Move.HELPING_HAND, "tutor"),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN, "tutor"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT, "tutor"),
                        new MoveLearnSetEntry(Move.GRASS_PLEDGE, "tutor"),
                        new MoveLearnSetEntry(Move.LEAF_STORM, "tutor"),
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
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 16, 29, 1.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.29, 0.3,
                List.of());
        this.setLangFileName("Floragato");
        this.setPortraitXYZ(0,1.8,0);
    }
}
