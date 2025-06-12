package drai.dev.data.pokemon.midamis;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Paradeano extends drai.dev.data.pokemon.Pokemon {
    public Paradeano() {
        super("Paradeano",
                Type.GRASS, Type.ELECTRIC,
                new Stats(110,
                        85,
                        70,
                        115,
                        85,
                        70),
                List.of(Ability.ELECTRIC_SURGE), Ability.CHLOROPHYLL,
                21, 165,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Paradeano's bulbs are full of pure energy, capable of powering cities when given proper care. When angered, they're known to burst in chaotic displays of electrical bolts."),
                List.of(),
                List.of(   new MoveLearnSetEntry(Move.CHARGE,1),
                        new MoveLearnSetEntry(Move.STUN_SPORE,6),
                        new MoveLearnSetEntry(Move.VINE_WHIP,9),
                        new MoveLearnSetEntry(Move.TICKLE,14),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,20),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,26),
                        new MoveLearnSetEntry(Move.WORRY_SEED,31),
                        new MoveLearnSetEntry(Move.FACEPLANT,34),
                        new MoveLearnSetEntry(Move.DISCHARGE,38),
                        new MoveLearnSetEntry(Move.ROTOTILLER,43),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,48),
                        new MoveLearnSetEntry(Move.POWER_WHIP,53)                     ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 43, 65, .2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DESERT)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"day")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Paradeano");

    }


}
