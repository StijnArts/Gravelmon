package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class Barrakoba extends drai.dev.gravelmon.pokemon.Pokemon {
    public Barrakoba() {
        super("Barrakoba",
                Type.WATER, Type.STEEL,
                new Stats(115,
                        111,
                        100,
                        65,
                        95,
                        44),
                List.of(Ability.TORRENT), Ability.STAKEOUT,
                20, 165,
                new Stats(2,1,0,0,0,0), 45,
                0.875,
                239, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.WATER_2),
                List.of("Barrakoba are known to plunder fishing boats of their catches and gang up to sink ships that stray to close to their territories. Barrakoba strive to always be on top of their groups, they often get into violent sword fights with one another to show dominance in their clique and raise up the pecking order."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,1),
                        new MoveLearnSetEntry(Move.BUBBLE,6),
                        new MoveLearnSetEntry(Move.WATER_SPORT,8),
                        new MoveLearnSetEntry(Move.WATER_GUN,10),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,13),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,15),
                        new MoveLearnSetEntry(Move.PURSUIT,20),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,26),
                        new MoveLearnSetEntry(Move.AQUA_JET,34),
                        new MoveLearnSetEntry(Move.BULK_UP,40),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,47),
                        new MoveLearnSetEntry(Move.IRON_TAIL,54),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,62),
                        new MoveLearnSetEntry(Move.LIQUIDATION,70),
                        new MoveLearnSetEntry(Move.BEACHTIDE,"tm"),
                        new MoveLearnSetEntry(Move.BOLTIN,"tm"),
                        new MoveLearnSetEntry(Move.LIQUIDMETAL,"tm"),
                        new MoveLearnSetEntry(Move.TWINBLADE,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_JET,"tm"),
                        new MoveLearnSetEntry(Move.METAL_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,"tm"),
                        new MoveLearnSetEntry(Move.BARRIER,"tm"),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.SLASH,"tm"),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHO_CUT,"tm"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,"tm")                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.ULTRA_RARE, 36, 58, 0.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
