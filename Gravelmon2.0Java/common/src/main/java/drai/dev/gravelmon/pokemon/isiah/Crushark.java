package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Crushark extends drai.dev.gravelmon.pokemon.Pokemon {
    public Crushark() {
        super("Crushark",
                Type.WATER, Type.FIGHTING,
                new Stats(104,
                        102,
                        123,
                        87,
                        73,
                        46),
                List.of(Ability.TORRENT), Ability.SWIFT_SWIM,
                18, 165,
                new Stats(1,1,1,0,0,0), 45,
                0.875,
                241, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.WATER_2),
                List.of("Hydro CannonSTAB Water Water PledgeSTAB Water"),
                List.of(),
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
                ), SpawnContext.SUBMERGED, SpawnPool.ULTRA_RARE, 36, 58, 0.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.REEF),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);

    }


}
