package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Squeakey extends drai.dev.gravelmon.pokemon.Pokemon {
    public Squeakey() {
        super("Squeakey",
                Type.STEEL,
                new Stats(30,
                        40,
                        43,
                        71,
                        30,
                        90),
                List.of(Ability.WEAK_ARMOR,Ability.PICKUP,Ability.MOTOR_DRIVE), Ability.MOTOR_DRIVE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("- Tail Whip Normal - Quick Attack Normal 5 Charm Fairy 9 Sonic Boom Normal 12 Gyro BallSTAB Steel 15 Bolt InSTAB Steel 19 Covet Normal 21 Self-Repair Steel 25 Metal Sound Steel 29 Charge Electric 32 Iron TailSTAB Steel 36 Wild Charge Electric 40 Flash CannonSTAB Steel 45 Work Up Normal 49 Endeavor Normal"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,1),
                        new MoveLearnSetEntry(Move.CHARM,5),
                        new MoveLearnSetEntry(Move.SONIC_BOOM,9),
                        new MoveLearnSetEntry(Move.GYRO_BALL,12),
                        new MoveLearnSetEntry(Move.BOLTIN,15),
                        new MoveLearnSetEntry(Move.COVET,19),
                        new MoveLearnSetEntry(Move.SELFREPAIR,21),
                        new MoveLearnSetEntry(Move.METAL_SOUND,25),
                        new MoveLearnSetEntry(Move.CHARGE,29),
                        new MoveLearnSetEntry(Move.IRON_TAIL,32),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,36),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,40),
                        new MoveLearnSetEntry(Move.WORK_UP,45),
                        new MoveLearnSetEntry(Move.ENDEAVOR,49),
                        new MoveLearnSetEntry(Move.SCREECH,"tm"),
                        new MoveLearnSetEntry(Move.PURSUIT,"tm"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tm"),
                        new MoveLearnSetEntry(Move.ME_FIRST,"tm"),
                        new MoveLearnSetEntry(Move.SHIFT_GEAR,"tm"),
                        new MoveLearnSetEntry(Move.PARABOLIC_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.NUZZLE,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Squeakey");

    }


}
