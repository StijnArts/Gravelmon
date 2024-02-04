package drai.dev.gravelmon.pokemon.ferroa;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Hermice extends drai.dev.gravelmon.pokemon.Pokemon {
    public Hermice() {
        super("Hermice",
                Type.ICE,Type.WATER,
                new Stats(45,
                        45,
                        60,
                        45,
                        50,
                        55),
                List.of(Ability.SNOW_WARNING,Ability.SHELL_ARMOR,Ability.ICE_BODY), Ability.ICE_BODY,
                9, 165,
                new Stats(0,0,1,0,0,0), 200,
                0.5,
                60, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.BUG,EggGroup.WATER_3),
                List.of("Water vapor in the air around it condenses and freezes into its shell of ice. It must shed this ice daily or risk its whole body fatally freezing over."),
                List.of(new EvolutionEntry("hermafrost", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"34")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.WITHDRAW,1),
                        new MoveLearnSetEntry(Move.ICY_WIND,5),
                        new MoveLearnSetEntry(Move.SHARPEN,9),
                        new MoveLearnSetEntry(Move.VISE_GRIP,12),
                        new MoveLearnSetEntry(Move.ICE_SHARD,15),
                        new MoveLearnSetEntry(Move.WATER_PULSE,22),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,25),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,28),
                        new MoveLearnSetEntry(Move.RAZOR_SHELL,32),
                        new MoveLearnSetEntry(Move.CRYSTALDEFENSE,35),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,38),
                        new MoveLearnSetEntry(Move.GYRO_BALL,41),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,43),
                        new MoveLearnSetEntry(Move.CRABHAMMER,46),
                        new MoveLearnSetEntry(Move.BUG_BITE,"tm"),
                        new MoveLearnSetEntry(Move.DEFOG,"tm"),
                        new MoveLearnSetEntry(Move.RECYCLE,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.UPROAR,"tm"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tm"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.LIQUIDATION,"tm"),
                        new MoveLearnSetEntry(Move.THROAT_CHOP,"tm"),
                        new MoveLearnSetEntry(Move.SKITTER_SMACK,"tm"),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.GUILLOTINE,"tm"),
                        new MoveLearnSetEntry(Move.PINCH,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_HIT,"tm"),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,"tm"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tm")                        ),
                List.of(Label.FERROA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 12, 37, 5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COLD_OCEAN, Biome.IS_COLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);

    }


}
