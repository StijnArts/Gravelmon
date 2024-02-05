package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Tombarach extends drai.dev.gravelmon.pokemon.Pokemon {
    public Tombarach() {
        super("Tombarach",
                Type.BUG,Type.GROUND,
                new Stats(112,
                        113,
                        130,
                        50,
                        70,
                        45),
                List.of(Ability.MUMMY), Ability.POISON_TOUCH,
                23, 165,
                new Stats(0,0,0,0,0,0), 50,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("By covering itself with sandstone, it protects its frail body. Tombarach's silk was prized by ancient kings and used in mummification."),
                List.of(),
                List.of(       new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.HARDEN,5),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,10),
                        new MoveLearnSetEntry(Move.MUDSLAP,15),
                        new MoveLearnSetEntry(Move.ABSORB,21),
                        new MoveLearnSetEntry(Move.METAL_CLAW,25),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,30),
                        new MoveLearnSetEntry(Move.MIND_READER,35),
                        new MoveLearnSetEntry(Move.DIG,40)
                ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 45, 65, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DESERT)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.DESERT_PYRAMID),
                0.28, 0.3,
                List.of());
           setLangFileName("Tombarach");

    }


}
