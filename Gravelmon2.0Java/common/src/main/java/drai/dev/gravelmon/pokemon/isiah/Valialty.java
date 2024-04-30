package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Valialty extends drai.dev.gravelmon.pokemon.Pokemon {
    public Valialty() {
        super("Valialty",
                Type.FIGHTING,
                new Stats(87,
                        131,
                        124,
                        69,
                        75,
                        94
                ),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                16, 165,
                new Stats(0,0,0,0,0,0), 3,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MACH_PUNCH, 1),
                        new MoveLearnSetEntry(Move.GROWL, 1),
                        new MoveLearnSetEntry(Move.SWIFT, 3),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK, 3),
                        new MoveLearnSetEntry(Move.AURA_SPHERE, 6),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES, 9),
                        new MoveLearnSetEntry(Move.WISH, 12),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK, 15),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH, 18),
                        new MoveLearnSetEntry(Move.ICE_PUNCH, 20),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH, 21),
                        new MoveLearnSetEntry(Move.BULK_UP, 24),
                        new MoveLearnSetEntry(Move.JUMP_KICK, 27),
                        new MoveLearnSetEntry(Move.TOXIC, 29),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH, 32),
                        new MoveLearnSetEntry(Move.BULLET_PUNCH, 36),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT, 40),
                        new MoveLearnSetEntry(Move.JET_STRIKE, 42),
                        new MoveLearnSetEntry(Move.EXTREME_SPEED, 47),
                        new MoveLearnSetEntry(Move.HIGH_JUMP_KICK, 51),
                        new MoveLearnSetEntry(Move.COUNTER, 57),
                        new MoveLearnSetEntry(Move.RECOVER, 61)
                ),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 65, 75, .0006, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_HIGHLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Valialty");

    }


}
