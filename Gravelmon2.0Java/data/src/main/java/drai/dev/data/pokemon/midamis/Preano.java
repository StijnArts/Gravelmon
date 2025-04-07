package drai.dev.data.pokemon.midamis;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Preano extends drai.dev.data.pokemon.Pokemon {
    public Preano() {
        super("Preano",
                Type.GRASS, Type.ELECTRIC,
                new Stats(50,
                        45,
                        50,
                        75,
                        45,
                        30),
                List.of(Ability.ROUGH_SKIN), Ability.ROUGH_SKIN,
                6, 165,
                new Stats(0,0,0,0,0,0), 220,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("prarendo", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"21")))),
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
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, 9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DESERT)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"day")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Preano");

    }


}
