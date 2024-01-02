package drai.dev.gravelmon.pokemon.vanguard.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class AyreianDugtrio extends Pokemon {
    public AyreianDugtrio(int dexNo) {
        super(dexNo,"AyreianDugtrio",
                Type.ICE,
                new Stats(120,95,50,105,35,70),
                List.of(Ability.SNOW_CLOAK, Ability.ARENA_TRAP), Ability.TECHNICIAN,
                7, 333,
                new Stats(2,0,0,0,0,0), 50,
                0.5,
                149, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("It sits in one location, only bothering those who try to pass directly through it."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ICE_SHARD, 1),
                        new MoveLearnSetEntry(Move.SCRATCH, 1),
                        new MoveLearnSetEntry(Move.FAKE_OUT, 4),
                        new MoveLearnSetEntry(Move.ASTONISH, 8),
                        new MoveLearnSetEntry(Move.BULLDOZE, 12),
                        new MoveLearnSetEntry(Move.FROST_WALKER, 16),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH, 20),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH, 24),
                        new MoveLearnSetEntry(Move.HAIL, 28),
                        new MoveLearnSetEntry(Move.AURORA_VEIL, 32),
                        new MoveLearnSetEntry(Move.DIG, 36),
                        new MoveLearnSetEntry(Move.TRIPLE_AXEL, 42),
                        new MoveLearnSetEntry(Move.EARTHQUAKE, 48),
                        new MoveLearnSetEntry(Move.FISSURE, 54),

                        new MoveLearnSetEntry(Move.AERIAL_ACE, "tutor"),
                        new MoveLearnSetEntry(Move.AGILITY, "tutor"),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH, "tutor"),
                        new MoveLearnSetEntry(Move.ASSURANCE, "tutor"),
                        new MoveLearnSetEntry(Move.ATTRACT, "tutor"),
                        new MoveLearnSetEntry(Move.BEAT_UP, "tutor"),
                        new MoveLearnSetEntry(Move.BODY_SLAM, "tutor"),
                        new MoveLearnSetEntry(Move.BULLDOZE, "tutor"),
                        new MoveLearnSetEntry(Move.CONFIDE, "tutor"),
                        new MoveLearnSetEntry(Move.CUT, "tutor"),
                        new MoveLearnSetEntry(Move.DIG, "tutor"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, "tutor"),
                        new MoveLearnSetEntry(Move.EARTH_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE, "tutor"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE, "tutor"),
                        new MoveLearnSetEntry(Move.ENDURE, "tutor"),
                        new MoveLearnSetEntry(Move.FACADE, "tutor"),
                        new MoveLearnSetEntry(Move.FRUSTRATION, "tutor"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT, "tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.HIGH_HORSEPOWER, "tutor"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.PROTECT, "tutor"),
                        new MoveLearnSetEntry(Move.REST, "tutor"),
                        new MoveLearnSetEntry(Move.RETURN, "tutor"),
                        new MoveLearnSetEntry(Move.REVERSAL, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH, "tutor"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB, "tutor"),
                        new MoveLearnSetEntry(Move.ROUND, "tutor"),
                        new MoveLearnSetEntry(Move.SANDSTORM, "tutor"),
                        new MoveLearnSetEntry(Move.SAND_TOMB, "tutor"),
                        new MoveLearnSetEntry(Move.SCORCHING_SANDS, "tutor"),
                        new MoveLearnSetEntry(Move.SCREECH, "tutor"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW, "tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tutor"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB, "tutor"),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE, "tutor"),
                        new MoveLearnSetEntry(Move.SNORE, "tutor"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK, "tutor"),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM, "tutor"),
                        new MoveLearnSetEntry(Move.STONE_EDGE, "tutor"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tutor"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY, "tutor"),
                        new MoveLearnSetEntry(Move.SWAGGER, "tutor"),
                        new MoveLearnSetEntry(Move.THIEF, "tutor"),
                        new MoveLearnSetEntry(Move.TOXIC, "tutor"),
                        new MoveLearnSetEntry(Move.TRI_ATTACK, "tutor"),
                        new MoveLearnSetEntry(Move.UPROAR, "tutor"),
                        new MoveLearnSetEntry(Move.WORK_UP, "tutor"),

                        new MoveLearnSetEntry(Move.ANCIENT_POWER, "egg"),
                        new MoveLearnSetEntry(Move.HEADBUTT, "egg"),
                        new MoveLearnSetEntry(Move.FINAL_GAMBIT, "egg"),
                        new MoveLearnSetEntry(Move.MEMENTO, "egg"),
                        new MoveLearnSetEntry(Move.HONE_CLAWS, "egg")
                ),
                List.of(Label.GEN1,Label.VANGUARD),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 26, 39, 0.9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_FOREST))),
                List.of(SpawnPreset.URBAN),
                0.28, 0.3,
                List.of());
        this.setLangFileName("Dugtrio");
    }
}
