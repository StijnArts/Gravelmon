package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Krakshen extends drai.dev.data.pokemon.Pokemon {
    public Krakshen() {
        super("Krakshen",
                Type.WATER, Type.DRAGON,
                new Stats(83,
                        110,
                        114,
                        82,
                        83,
                        63),
                List.of(Ability.SHELL_ARMOR,Ability.INTIMIDATE,Ability.BERSERK), Ability.BERSERK,
                17, 165,
                new Stats(0,0,2,0,0,0), 45,
                0.5,
                185, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_3,EggGroup.MONSTER),
                List.of("These 'sea monsters' lurk deep in the ocean. When starving, they grow vicious and actively hunt for food. Their diet mainly consists of Slowpoke and Cloyster. After feeding enough to last them months, they return to dwell on the ocean floor. Many believe these Pokemon are responsible for swimmers going missing."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TWISTER,1),
                        new MoveLearnSetEntry(Move.DRAGON_HAMMER,1),
                        new MoveLearnSetEntry(Move.CLAMP,1),
                        new MoveLearnSetEntry(Move.SPIKY_SHIELD,1),
                        new MoveLearnSetEntry(Move.SLAM,1),
                        new MoveLearnSetEntry(Move.POWER_WHIP,1),
                        new MoveLearnSetEntry(Move.RAZOR_SHELL,1),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,1),
                        new MoveLearnSetEntry(Move.WITHDRAW,1),
                        new MoveLearnSetEntry(Move.TICKLE,1),
                        new MoveLearnSetEntry(Move.OUTRAGE,1),
                        new MoveLearnSetEntry(Move.WRING_OUT,1),
                        new MoveLearnSetEntry(Move.DRAG_UNDER,1),
                        new MoveLearnSetEntry(Move.MUD_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,"tm"),
                        new MoveLearnSetEntry(Move.BRINE,"tm"),
                        new MoveLearnSetEntry(Move.RAZOR_SHELL,"tm")                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), SpawnContext.SEAFLOOR, SpawnPool.RARE, 47, 64, .2, List.of(
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
