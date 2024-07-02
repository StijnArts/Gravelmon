package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class Sevris extends drai.dev.gravelmon.pokemon.Pokemon {
    public Sevris() {
        super("Sevris",
                Type.WATER, Type.BUG,
                new Stats(50,
                        45,
                        65,
                        45,
                        45,
                        30),
                List.of(Ability.SWARM), Ability.SHELL_ARMOR,
                5, 165,
                new Stats(0,0,0,0,0,0), 210,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("cradvris", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"27")))),
                List.of(   new MoveLearnSetEntry(Move.PROTECT,1),
                        new MoveLearnSetEntry(Move.WATER_SPORT,10),
                        new MoveLearnSetEntry(Move.CHILLING_WATER,13),
                        new MoveLearnSetEntry(Move.LIFE_DEW,16),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,20),
                        new MoveLearnSetEntry(Move.VIOLENTSWARM,24),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,28),
                        new MoveLearnSetEntry(Move.BEACHTIDE,32),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,36),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,40),
                        new MoveLearnSetEntry(Move.SWARMINGTERRAIN,44),
                        new MoveLearnSetEntry(Move.NATURE_POWER,48),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,52)                     ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BEACH)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);

    }


}
