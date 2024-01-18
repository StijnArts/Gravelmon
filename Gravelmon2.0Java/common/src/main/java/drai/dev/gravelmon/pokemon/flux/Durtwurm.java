package drai.dev.gravelmon.pokemon.flux;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Durtwurm extends Pokemon {
    public Durtwurm() {
        super("Durtwurm",
                Type.BUG, Type.GROUND,
                new Stats(50,
                        60,
                        75,
                        40,
                        75,
                        40),
                List.of(Ability.WEAK_ARMOR, Ability.DRY_SKIN), Ability.DRY_SKIN,
                5, 82,
                new Stats(0,0,1,0,1,0), 255,
                0.5,
                125, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG, EggGroup.MINERAL),
                List.of("It secretes a sticky substance that it uses to attach clods of dirt to its body as protection. It rolls its body like a wheel to get around quickly."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.ROLLOUT,1),
                        new MoveLearnSetEntry(Move.WRIGGLE,1),
                        new MoveLearnSetEntry(Move.MUDSLAP,1)
                        ),
                List.of(Label.FLUX),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 16, 29, 1.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_PLAINS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_COLD))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
    }
}
