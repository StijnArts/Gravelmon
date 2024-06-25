package drai.dev.gravelmon.pokemon.vanguard.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class AyreianChikorita extends Pokemon {
    public AyreianChikorita(String originalMon, Aspect aspect) {
        super(originalMon, aspect,"AyreianChikorita",
                Type.GRASS, Type.FAIRY,
                new Stats(45,45,65,45,65,55),
                List.of(Ability.PIXILATE, Ability.TRIAGE), Ability.MISTY_SURGE,
                9, 64,
                new Stats(0,0,0,0,1,0), 45,
                0.875,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS, EggGroup.MONSTER),
                List.of("Said to have gone extinct shortly after the war, a few specimen have been found in the natural caves of Citrine Jungle."),
                List.of(new EvolutionEntry("ayreianbayleef", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"17")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE, 1),
                        new MoveLearnSetEntry(Move.GROWL, 1),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES, 5),
                        new MoveLearnSetEntry(Move.ABSORB, 6),
                        new MoveLearnSetEntry(Move.FAIRY_WIND, 9),
                        new MoveLearnSetEntry(Move.SWIFT, 12),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN, 15),
                        new MoveLearnSetEntry(Move.REFLECT, 18),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF, 20),
                        new MoveLearnSetEntry(Move.DRAINING_KISS, 23),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN, 27),
                        new MoveLearnSetEntry(Move.SWEET_SCENT, 32),
                        new MoveLearnSetEntry(Move.TRI_ATTACK, 40),
                        new MoveLearnSetEntry(Move.MOONBLAST, 46),
                        new MoveLearnSetEntry(Move.LEAF_STORM, 54),

                        new MoveLearnSetEntry(Move.ATTRACT, "tutor"),
                        new MoveLearnSetEntry(Move.BULLDOZE, "tutor"),
                        new MoveLearnSetEntry(Move.BULLET_SEED, "tutor"),
                        new MoveLearnSetEntry(Move.CONFIDE, "tutor"),
                        new MoveLearnSetEntry(Move.CUT, "tutor"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, "tutor"),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL, "tutor"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE, "tutor"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE, "tutor"),
                        new MoveLearnSetEntry(Move.ENDURE, "tutor"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL, "tutor"),
                        new MoveLearnSetEntry(Move.FACADE, "tutor"),
                        new MoveLearnSetEntry(Move.FRENZY_PLANT, "tutor"),
                        new MoveLearnSetEntry(Move.FRUSTRATION, "tutor"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN, "tutor"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT, "tutor"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT, "tutor"),
                        new MoveLearnSetEntry(Move.GRASS_PLEDGE, "tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.IRON_TAIL, "tutor"),
                        new MoveLearnSetEntry(Move.LASER_FOCUS, "tutor"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN, "tutor"),
                        new MoveLearnSetEntry(Move.MAGIC_COAT, "tutor"),
                        new MoveLearnSetEntry(Move.NATURE_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.OUTRAGE, "tutor"),
                        new MoveLearnSetEntry(Move.PROTECT, "tutor"),
                        new MoveLearnSetEntry(Move.REFLECT, "tutor"),
                        new MoveLearnSetEntry(Move.REST, "tutor"),
                        new MoveLearnSetEntry(Move.RETURN, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH, "tutor"),
                        new MoveLearnSetEntry(Move.ROUND, "tutor"),
                        new MoveLearnSetEntry(Move.SAFEGUARD, "tutor"),
                        new MoveLearnSetEntry(Move.SEED_BOMB, "tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tutor"),
                        new MoveLearnSetEntry(Move.SNORE, "tutor"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM, "tutor"),
                        new MoveLearnSetEntry(Move.STRENGTH, "tutor"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tutor"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY, "tutor"),
                        new MoveLearnSetEntry(Move.SWAGGER, "tutor"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE, "tutor"),
                        new MoveLearnSetEntry(Move.SYNTHESIS, "tutor"),
                        new MoveLearnSetEntry(Move.TOXIC, "tutor"),
                        new MoveLearnSetEntry(Move.WORK_UP, "tutor"),
                        new MoveLearnSetEntry(Move.WORRY_SEED, "tutor"),

                        new MoveLearnSetEntry(Move.VINE_WHIP, "egg"),
                        new MoveLearnSetEntry(Move.LEECH_SEED, "egg"),
                        new MoveLearnSetEntry(Move.COUNTER, "egg"),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER, "egg"),
                        new MoveLearnSetEntry(Move.FLAIL, "egg"),
                        new MoveLearnSetEntry(Move.NATURE_POWER, "egg"),
                        new MoveLearnSetEntry(Move.INGRAIN, "egg"),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE, "egg"),
                        new MoveLearnSetEntry(Move.LEAF_STORM, "egg"),
                        new MoveLearnSetEntry(Move.AROMATHERAPY, "egg"),
                        new MoveLearnSetEntry(Move.WRING_OUT, "egg"),
                        new MoveLearnSetEntry(Move.BODY_SLAM, "egg"),
                        new MoveLearnSetEntry(Move.REFRESH, "egg"),
                        new MoveLearnSetEntry(Move.HEAL_PULSE, "egg"),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN, "egg")
                ),
                List.of(Label.GEN2,Label.VANGUARD),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 3, 22, 8.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_CHERRY_GROVE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"day")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        this.setLangFileName("Chikorita");
        this.setPortraitXYZ(0,1.8,0);
    }
}
