package drai.dev.data.pokemon.ayrei.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class AyreianThwackey extends Pokemon {
    public AyreianThwackey(String name, Aspect aspect) {
        super(name, aspect,"AyreianThwackey",
                Type.ELECTRIC, Type.SOUND,
                new Stats(70,45,60,80,95,70),
                List.of(Ability.PUNK_ROCK, Ability.WIND_POWER), Ability.ELECTRIC_SURGE,
                7, 140,
                new Stats(0,2,0,0,0,0), 45,
                0.875,
                162, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD, EggGroup.GRASS),
                List.of("When it's drumming out rapid beats in battle, it gets so caught up in the rhythm that it won't even notice that it's already knocked out its opponent."),
                List.of(new EvolutionEntry("ayreianrillaboom", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"33")))),
                List.of(
                        new MoveLearnSetEntry(Move.SHOCK_WAVE, 1),
                        new MoveLearnSetEntry(Move.DOUBLE_HIT, 1),
                        new MoveLearnSetEntry(Move.SCRATCH, 1),
                        new MoveLearnSetEntry(Move.GROWL, 1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK, 1),
                        new MoveLearnSetEntry(Move.TAUNT, 1),
                        new MoveLearnSetEntry(Move.ROUND, 12),
                        new MoveLearnSetEntry(Move.METAL_SOUND, 19),
                        new MoveLearnSetEntry(Move.KNOCK_OFF, 24),
                        new MoveLearnSetEntry(Move.HYPER_VOICE, 30),
                        new MoveLearnSetEntry(Move.THUNDERBOLT, 38),
                        new MoveLearnSetEntry(Move.HURRICANE, 46),
                        new MoveLearnSetEntry(Move.OVERDRIVE, 54),
                        new MoveLearnSetEntry(Move.BOOMBURST, 62),

                        new MoveLearnSetEntry(Move.ACROBATICS, "tutor"),
                        new MoveLearnSetEntry(Move.ASSURANCE, "tutor"),
                        new MoveLearnSetEntry(Move.ATTRACT, "tutor"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH, "tutor"),
                        new MoveLearnSetEntry(Move.ENDURE, "tutor"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL, "tutor"),
                        new MoveLearnSetEntry(Move.FACADE, "tutor"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE, "tutor"),
                        new MoveLearnSetEntry(Move.FLING, "tutor"),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY, "tutor"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN, "tutor"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT, "tutor"),
                        new MoveLearnSetEntry(Move.GRASS_PLEDGE, "tutor"),
                        new MoveLearnSetEntry(Move.GRASSY_GLIDE, "tutor"),
                        new MoveLearnSetEntry(Move.LOW_KICK, "tutor"),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF, "tutor"),
                        new MoveLearnSetEntry(Move.MEGA_KICK, "tutor"),
                        new MoveLearnSetEntry(Move.MEGA_PUNCH, "tutor"),
                        new MoveLearnSetEntry(Move.PROTECT, "tutor"),
                        new MoveLearnSetEntry(Move.REST, "tutor"),
                        new MoveLearnSetEntry(Move.ROUND, "tutor"),
                        new MoveLearnSetEntry(Move.SCREECH, "tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tutor"),
                        new MoveLearnSetEntry(Move.SNORE, "tutor"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.SOLAR_BLADE, "tutor"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tutor"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY, "tutor"),
                        new MoveLearnSetEntry(Move.SWIFT, "tutor"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE, "tutor"),
                        new MoveLearnSetEntry(Move.TAUNT, "tutor"),
                        new MoveLearnSetEntry(Move.UPROAR, "tutor"),
                        new MoveLearnSetEntry(Move.UTURN, "tutor"),
                        new MoveLearnSetEntry(Move.WORK_UP, "tutor"),
                        new MoveLearnSetEntry(Move.TRAILBLAZE, "tutor"),

                        new MoveLearnSetEntry(Move.FAKE_OUT, "egg"),
                        new MoveLearnSetEntry(Move.GROWTH, "egg"),
                        new MoveLearnSetEntry(Move.HAMMER_ARM, "egg"),
                        new MoveLearnSetEntry(Move.LEECH_SEED, "egg"),
                        new MoveLearnSetEntry(Move.NATURE_POWER, "egg"),
                        new MoveLearnSetEntry(Move.STRENGTH, "egg"),
                        new MoveLearnSetEntry(Move.WORRY_SEED, "egg")
                ),
                List.of(Label.GEN8,Label.VANGUARD),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 16, 29, 1.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_NETHER_FOREST))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.29, 0.3,
                List.of());
        this.setLangFileName("Thwackey");
        this.setPortraitXYZ(0,1.8,0);
    }
}
