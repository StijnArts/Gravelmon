package drai.dev.gravelmon.pokemon.lockemon;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Kituff extends Pokemon {
    public Kituff() {
        super("Kituff",
                Type.FIGHTING,
                new Stats(50,
                        65,
                        35,
                        35,
                        35,
                        65),
                List.of(Ability.TECHNICIAN, Ability.GRAVITY_SLING), Ability.FERROFLUX,
                6, 131,
                new Stats(0,1,0,0,0,0), 220,
                0.875,
                43, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of(""),
                List.of(new EvolutionEntry("beadamup", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.FRIENDSHIP,"220")))),
                List.of(
                        new MoveLearnSetEntry(Move.ENDURE,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,1),
                        new MoveLearnSetEntry(Move.FEINT,4),
                        new MoveLearnSetEntry(Move.METAL_CLAW,8),
                        new MoveLearnSetEntry(Move.COUNTER,12),
                        new MoveLearnSetEntry(Move.WORK_UP,16),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,20),
                        new MoveLearnSetEntry(Move.VACUUM_WAVE,24),
                        new MoveLearnSetEntry(Move.SCREECH,28),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,32),
                        new MoveLearnSetEntry(Move.FORCE_PALM,36),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,40),
                        new MoveLearnSetEntry(Move.HELPING_HAND,44),
                        new MoveLearnSetEntry(Move.COPYCAT,48),
                        new MoveLearnSetEntry(Move.FINAL_GAMBIT,52),
                        new MoveLearnSetEntry(Move.REVERSAL,56),
                        new MoveLearnSetEntry(Move.BITE,"egg"),
                        new MoveLearnSetEntry(Move.BULLET_PUNCH,"egg"),
                        new MoveLearnSetEntry(Move.CIRCLE_THROW,"egg"),
                        new MoveLearnSetEntry(Move.CROSS_CHOP,"egg"),
                        new MoveLearnSetEntry(Move.DETECT,"egg"),
                        new MoveLearnSetEntry(Move.HIGH_JUMP_KICK,"egg"),
                        new MoveLearnSetEntry(Move.HOWL,"egg")
                        ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 27, 7.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
    }
}
