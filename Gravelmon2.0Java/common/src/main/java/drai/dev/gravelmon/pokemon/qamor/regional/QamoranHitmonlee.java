package drai.dev.gravelmon.pokemon.qamor.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class QamoranHitmonlee extends drai.dev.gravelmon.pokemon.Pokemon {
    public QamoranHitmonlee(int dex) {
        super(dex, "Hitmonlee",
                Type.FIGHTING,Type.FAIRY,
                new Stats(50,
                        120,
                        53,
                        35,
                        110,
                        87),
                List.of(Ability.DANCER), Ability.DANCER,
                15, 165,
                new Stats(0,2,0,0,0,0), 45,
                1.0,
                159, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of("Hitmonlee's legs freely contract and stretch. Using these springlike legs, it bowls over foes with devastating kicks. After battle, it rubs down its legs and loosens the muscles to overcome fatigue."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,1),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,4),
                        new MoveLearnSetEntry(Move.LOW_KICK,8),
                        new MoveLearnSetEntry(Move.ENDURE,12),
                        new MoveLearnSetEntry(Move.TRIPLE_AXEL,16),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,21),
                        new MoveLearnSetEntry(Move.BLAZE_KICK,24),
                        new MoveLearnSetEntry(Move.MOONLIGHT,28),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,32),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,36),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,40),
                        new MoveLearnSetEntry(Move.HIGH_JUMP_KICK,44),
                        new MoveLearnSetEntry(Move.WARDANCE,48),
                        new MoveLearnSetEntry(Move.COUNTER,"tm"),
                        new MoveLearnSetEntry(Move.HIGH_JUMP_KICK,"tm"),
                        new MoveLearnSetEntry(Move.MIND_READER,"tm"),
                        new MoveLearnSetEntry(Move.MACH_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.PURSUIT,"tm"),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,"tm"),
                        new MoveLearnSetEntry(Move.FEINT,"tm"),
                        new MoveLearnSetEntry(Move.VACUUM_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_PUNCH,"tm")                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 20, 46, .2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Hitmonlee");

    }


}
