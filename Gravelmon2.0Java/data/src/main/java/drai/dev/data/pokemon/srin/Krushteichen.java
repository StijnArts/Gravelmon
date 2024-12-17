package drai.dev.data.pokemon.srin;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Krushteichen extends drai.dev.data.pokemon.Pokemon {
    public Krushteichen() {
        super("Krushteichen",
                Type.FIRE,Type.FIGHTING,
                new Stats(86,
                        116,
                        93,
                        75,
                        70,
                        94),
                List.of(Ability.BLAZE), Ability.IRON_FIST,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.875,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("- Scald Water - Fire PunchSTAB Fire - Jet Punch Water - Shell Smash Normal - Mat Block (N) Fighting - Bullet Punch Steel - Crabhammer Water - Hammer ArmSTAB Fighting - Fire Spin (N)STAB Fire - Flame ChargeSTAB Fire - Withdraw Water - Mach PunchSTAB Fighting - Sky UppercutSTAB Fighting - Crush Grip Normal - Vise Grip Normal - Flame Burst (N)STAB Fire"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WITHDRAW,1),
                        new MoveLearnSetEntry(Move.MAT_BLOCK,1),
                        new MoveLearnSetEntry(Move.SCALD,1),
                        new MoveLearnSetEntry(Move.SKY_UPPERCUT,1),
                        new MoveLearnSetEntry(Move.JET_PUNCH,1),
                        new MoveLearnSetEntry(Move.HAMMER_ARM,1),
                        new MoveLearnSetEntry(Move.VISE_GRIP,1),
                        new MoveLearnSetEntry(Move.FLAME_BURST,1),
                        new MoveLearnSetEntry(Move.CRUSH_GRIP,1),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,1),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,1),
                        new MoveLearnSetEntry(Move.MACH_PUNCH,1),
                        new MoveLearnSetEntry(Move.CRABHAMMER,1),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,1),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,1),
                        new MoveLearnSetEntry(Move.BULLET_PUNCH,1)                        ),
                List.of(Label.SORIN),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Krushteichen");

    }


}
