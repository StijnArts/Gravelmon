package drai.dev.gravelmon.pokemon.mythire;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Banshoal extends drai.dev.gravelmon.pokemon.Pokemon {
    public Banshoal() {
        super("Banshoal",
                Type.GHOST, Type.WATER,
                new Stats(68,
                        65,
                        95,
                        97,
                        97,
                        67),
                List.of(Ability.SOUNDPROOF), Ability.DANCER,
                21, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.25,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_2,EggGroup.DRAGON),
                List.of("Banshoal prizes itself on its appearance and loves to be the center of attention, which it achieves by overshadowing all competition with its colorful fins. However, its squawking voice is shrill enough to break glass."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.POISON_STING,4),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,8),
                        new MoveLearnSetEntry(Move.WATER_PULSE,12),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,16),
                        new MoveLearnSetEntry(Move.HEX,20),
                        new MoveLearnSetEntry(Move.BRINE,24),
                        new MoveLearnSetEntry(Move.RECOVER,28),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,32),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,36),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,41),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,44),
                        new MoveLearnSetEntry(Move.WATER_SPOUT,48)
                ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.COMMON, 23, 45, 1.4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OCEAN)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Banshoal");

    }


}
