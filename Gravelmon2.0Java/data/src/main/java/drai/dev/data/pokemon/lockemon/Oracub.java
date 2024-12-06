package drai.dev.data.pokemon.lockemon;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Oracub extends Pokemon {
    public Oracub() {
        super("Oracub",
                Type.GHOST, Type.PSYCHIC,
                new Stats(80,
                        50,
                        50,
                        70,
                        90,
                        20),
                List.of(Ability.INNER_FOCUS), Ability.INNER_FOCUS,
                5, 121,
                new Stats(0,0,0,0,1,0), 200,
                0.5,
                120, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(new EvolutionEntry("bearvoyance", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HAS_MOVE,Move.OMINOUS_WIND.getName())))),
                List.of(
                        new MoveLearnSetEntry(Move.ALLY_SWITCH,1),
                        new MoveLearnSetEntry(Move.CONFUSION,1),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,1),
                        new MoveLearnSetEntry(Move.ASTONISH,4),
                        new MoveLearnSetEntry(Move.LICK,8),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,12),
                        new MoveLearnSetEntry(Move.PSYBEAM,16),
                        new MoveLearnSetEntry(Move.SKILL_SWAP,20),
                        new MoveLearnSetEntry(Move.GUARD_SPLIT,24),
                        new MoveLearnSetEntry(Move.POWER_SPLIT,28),
                        new MoveLearnSetEntry(Move.PSYSHOCK,32),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,36),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,40),
                        new MoveLearnSetEntry(Move.PSYCHIC,46),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,50),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,54),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"egg"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"egg")
                ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 17, 6.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
    }
}
