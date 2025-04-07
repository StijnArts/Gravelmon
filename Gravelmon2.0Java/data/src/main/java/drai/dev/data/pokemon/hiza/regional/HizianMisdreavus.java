package drai.dev.data.pokemon.hiza.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class HizianMisdreavus extends drai.dev.data.pokemon.Pokemon {
    public HizianMisdreavus(String name, Aspect aspect) {
        super(name, aspect, "Misdreavus",
                Type.FIRE,
                new Stats(60,
                        60,
                        60,
                        85,
                        85,
                        85),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                7, 165,
                new Stats(0,0,0,0,1,0), 45,
                0.5,
                87, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Their burning flames can be seen through nights and blizzards. They inhabit areas with colder climate as they enjoy startling ice-type Pokemon with their hot flames."),
                List.of(new EvolutionEntry("HizianMismagius", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:fire_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.EMBER,1),
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
                        new MoveLearnSetEntry(Move.OVERHEAT,55)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 19, 44, 9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_ISLAND, Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Misdreavus");
setCanFly(true);
    }


}
