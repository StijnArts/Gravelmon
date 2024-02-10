package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Bullark extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bullark() {
        super("Bullark",
                Type.WATER,Type.FIGHTING,
                new Stats(67,
                        67,
                        67,
                        67,
                        67,
                        67),
                List.of(Ability.TORRENT), Ability.SWIFT_SWIM,
                9, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.875,
                142, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.WATER_2),
                List.of("Water PledgeSTAB Water"),
                List.of(new EvolutionEntry("crushark", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"36")))
                ),
                List.of(new MoveLearnSetEntry(Move.DOUBLE_HIT,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.WORK_UP,7),
                        new MoveLearnSetEntry(Move.WING_ATTACK,10),
                        new MoveLearnSetEntry(Move.AQUA_JET,13),
                        new MoveLearnSetEntry(Move.WATER_PULSE,17),
                        new MoveLearnSetEntry(Move.LOW_SWEEP,19),
                        new MoveLearnSetEntry(Move.AQUA_CUTTER,23),
                        new MoveLearnSetEntry(Move.AIR_SLASH,27),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,32),
                        new MoveLearnSetEntry(Move.ACROBATICS,38),
                        new MoveLearnSetEntry(Move.LIQUIDATION,43),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,48),

                        new MoveLearnSetEntry(Move.WATER_PLEDGE,"tm")                        ),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.ULTRA_RARE, 16, 46, 2.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_REEF)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);

    }


}
