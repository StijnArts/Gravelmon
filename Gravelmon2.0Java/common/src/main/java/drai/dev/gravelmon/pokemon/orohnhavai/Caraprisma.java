package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Caraprisma extends drai.dev.gravelmon.pokemon.Pokemon {
    public Caraprisma() {
        super("Caraprisma",
                Type.WATER,
                new Stats(85,
                        65,
                        85,
                        100,
                        100,
                        65),
                List.of(Ability.DAZZLING), Ability.CUTE_CHARM,
                9, 165,
                new Stats(0,0,0,1,1,0), 135,
                0.8,
                175, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.WATER_2),
                List.of("Caraprisma are known for their beautiful shells. But the most valuable shells come from the females, which are rarely seen in the wild as they are afraid of being hunted for its chromatic shell. Caraprisma shells may act like solar panels. They swim near the surface of the ocean absorbing energy from the sun."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.AQUA_JET,1),
                        new MoveLearnSetEntry(Move.ATTRACT,6),
                        new MoveLearnSetEntry(Move.SOAK,11),
                        new MoveLearnSetEntry(Move.CAPTIVATE,15),
                        new MoveLearnSetEntry(Move.WATER_PULSE,20),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,23),
                        new MoveLearnSetEntry(Move.AURORA_BEAM,26),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,30),
                        new MoveLearnSetEntry(Move.TUCKIN,33),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,37),
                        new MoveLearnSetEntry(Move.HEARTFELTPULSE,41),
                        new MoveLearnSetEntry(Move.HEALING_WISH,46),
                        new MoveLearnSetEntry(Move.RAINBOWRUSH,50),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,55)                        ),
                List.of(Label.OROHNHAVAI
),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.RARE, 21, 53, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.REEF),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
