package drai.dev.gravelmon.pokemon.hiza.regional;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class HizianMismagius extends drai.dev.gravelmon.pokemon.Pokemon {
    public HizianMismagius(String name, Aspect aspect) {
        super(name, aspect, "Mismagius",
                Type.FIRE, Type.PSYCHIC,
                new Stats(60,
                        60,
                        60,
                        105,
                        105,
                        105),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                10, 165,
                new Stats(0,0,0,1,1,0), 45,
                0.5,
                173, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Its flames don't weaken even against the coldest winds, it is seen as a symbol of hope in the harsh frigid mountains."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BURN_UP,1),
                new MoveLearnSetEntry(Move.SPITE,5),
                new MoveLearnSetEntry(Move.QUICK_ATTACK,10),
                new MoveLearnSetEntry(Move.CONFUSE_RAY,14),
                new MoveLearnSetEntry(Move.FIRE_SPIN,19),
                new MoveLearnSetEntry(Move.WILLOWISP,23),
                new MoveLearnSetEntry(Move.FLAME_BURST,28),
                new MoveLearnSetEntry(Move.DAZZLING_GLEAM,32),
                new MoveLearnSetEntry(Move.FLAMETHROWER,37),
                new MoveLearnSetEntry(Move.PAIN_SPLIT,41),
                new MoveLearnSetEntry(Move.EXTRASENSORY,46),
                new MoveLearnSetEntry(Move.POWER_GEM,50),
                new MoveLearnSetEntry(Move.OVERHEAT,55)                       ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 39, 50, .6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_ISLAND, Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Mismagius");

    }


}
