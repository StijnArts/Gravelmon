package drai.dev.gravelmon.pokemon.vanguard;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Setsarec extends Pokemon {
    public Setsarec() {
        super("Setsarec",
                Type.POISON, Type.ROCK,
                new Stats(95,55,140,20,55,140),
                List.of(Ability.REVIVAL_SHEDDING), Ability.REVIVAL_SHEDDING,
                25, 1440,
                new Stats(0,0,3,0,0,0), 45,
                0.5,
                239, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.DRAGON, EggGroup.FIELD),
                List.of("Almost immobile, its rock-hard skin bounces back most attacks. It's said that if you make eye contact, you will be turned into stone."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.EARTH_POWER, 1),
                        new MoveLearnSetEntry(Move.POWER_GEM, 1),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK, 1),
                        new MoveLearnSetEntry(Move.WRAP, 1),
                        new MoveLearnSetEntry(Move.LEER, 1),
                        new MoveLearnSetEntry(Move.POISON_TAIL, 4),
                        new MoveLearnSetEntry(Move.BITE, 9),
                        new MoveLearnSetEntry(Move.GLARE, 12),
                        new MoveLearnSetEntry(Move.FANG_LEECH, 15),
                        new MoveLearnSetEntry(Move.SCREECH, 17),
                        new MoveLearnSetEntry(Move.POISON_FANG, 20),
                        new MoveLearnSetEntry(Move.STOCKPILE, 24),
                        new MoveLearnSetEntry(Move.CROSS_POISON, 27),
                        new MoveLearnSetEntry(Move.ICE_FANG, 31),
                        new MoveLearnSetEntry(Move.CRUNCH, 35),
                        new MoveLearnSetEntry(Move.PSYCHIC_FANGS, 39),
                        new MoveLearnSetEntry(Move.GASTRO_ACID, 44),
                        new MoveLearnSetEntry(Move.POISON_JAB, 48),
                        new MoveLearnSetEntry(Move.HAZE, 51),
                        new MoveLearnSetEntry(Move.COIL, 56),
                        new MoveLearnSetEntry(Move.GUNK_SHOT, 63),
                        new MoveLearnSetEntry(Move.EARTHQUAKE, 69),
                        new MoveLearnSetEntry(Move.METEOR_BEAM, 75),

                        new MoveLearnSetEntry(Move.AQUA_TAIL, "tutor"),
                        new MoveLearnSetEntry(Move.ATTRACT, "tutor"),
                        new MoveLearnSetEntry(Move.BIND, "tutor"),
                        new MoveLearnSetEntry(Move.BODY_SLAM, "tutor"),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING, "tutor"),
                        new MoveLearnSetEntry(Move.BULLDOZE, "tutor"),
                        new MoveLearnSetEntry(Move.CONFIDE, "tutor"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY, "tutor"),
                        new MoveLearnSetEntry(Move.DARK_PULSE, "tutor"),
                        new MoveLearnSetEntry(Move.DIG, "tutor"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, "tutor"),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL, "tutor"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE, "tutor"),
                        new MoveLearnSetEntry(Move.ENDURE, "tutor"),
                        new MoveLearnSetEntry(Move.FACADE, "tutor"),
                        new MoveLearnSetEntry(Move.FRUSTRATION, "tutor"),
                        new MoveLearnSetEntry(Move.GASTRO_ACID, "tutor"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN, "tutor"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT, "tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.INFESTATION, "tutor"),
                        new MoveLearnSetEntry(Move.IRON_TAIL, "tutor"),
                        new MoveLearnSetEntry(Move.PAYBACK, "tutor"),
                        new MoveLearnSetEntry(Move.POISON_JAB, "tutor"),
                        new MoveLearnSetEntry(Move.PROTECT, "tutor"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE, "tutor"),
                        new MoveLearnSetEntry(Move.REST, "tutor"),
                        new MoveLearnSetEntry(Move.RETURN, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB, "tutor"),
                        new MoveLearnSetEntry(Move.ROUND, "tutor"),
                        new MoveLearnSetEntry(Move.SEED_BOMB, "tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tutor"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB, "tutor"),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE, "tutor"),
                        new MoveLearnSetEntry(Move.SNATCH, "tutor"),
                        new MoveLearnSetEntry(Move.SNORE, "tutor"),
                        new MoveLearnSetEntry(Move.SPITE, "tutor"),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM, "tutor"),
                        new MoveLearnSetEntry(Move.STRENGTH, "tutor"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tutor"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY, "tutor"),
                        new MoveLearnSetEntry(Move.SWAGGER, "tutor"),
                        new MoveLearnSetEntry(Move.THIEF, "tutor"),
                        new MoveLearnSetEntry(Move.THROAT_CHOP, "tutor"),
                        new MoveLearnSetEntry(Move.TORMENT, "tutor"),
                        new MoveLearnSetEntry(Move.TOXIC, "tutor"),
                        new MoveLearnSetEntry(Move.VENOSHOCK, "tutor"),
                        new MoveLearnSetEntry(Move.STONE_EDGE, "tutor")
                ),
                List.of(Label.VANGUARD),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 42, 68, 2.5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_ARID)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setPreEvolution("arbok");
        addAdditionalEvolution("arbok", new EvolutionEntry("setsarec", EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"42"))));
    }
}
