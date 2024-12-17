package drai.dev.data.pokemon.vega;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Benoreto extends Pokemon {
    public Benoreto() {
        super( "Benoreto",
                Type.BUG, Type.POISON,
                new Stats(83	,104	,87	,50	,61,	78),
                List.of(Ability.POISON_POINT), Ability.SNIPER,
                15, 1582,
                new Stats(0,3,0,0,0,0), 120,
                0.5,
                198, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BUG_GNAW,1),
                        new MoveLearnSetEntry(Move.SIGNAL,1),
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.ROLLOUT,6),
                        new MoveLearnSetEntry(Move.SCREECH,10),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,13),
                        new MoveLearnSetEntry(Move.POISON_TAIL,17),
                        new MoveLearnSetEntry(Move.NEUROTOXIN,24),
                        new MoveLearnSetEntry(Move.SLUDGE,32)
                        ),
                List.of(Label.DENEB),
                0,
                List.of(), SpawnContext.GROUNDED, SpawnPool.COMMON, 32, 52, 1.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.4, 0.3,
                List.of());
    }
}
