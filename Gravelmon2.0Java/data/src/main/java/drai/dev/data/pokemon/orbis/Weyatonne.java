package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Weyatonne extends drai.dev.data.pokemon.Pokemon {
    public Weyatonne() {
        super("Weyatonne",
                Type.STEEL, Type.FIGHTING,
                new Stats(100,
                        120,
                        140,
                        35,
                        55,
                        35),
                List.of(Ability.HEAVY_METAL), Ability.STURDY,
                13, 9072,
                new Stats(0,1,1,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of("- Heavy SlamSTAB Steel - Rollout Rock - Arm ThrustSTAB Fighting - Hammer ArmSTAB Fighting - Iron Defense Steel - Gyro BallSTAB Steel"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ARM_THRUST,1),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,1),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,1),
                        new MoveLearnSetEntry(Move.GYRO_BALL,1),
                        new MoveLearnSetEntry(Move.ROLLOUT,1),
                        new MoveLearnSetEntry(Move.HAMMER_ARM,1)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Weyatonne");

    }


}
