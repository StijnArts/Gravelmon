package drai.dev.data.pokemon.flux;

import drai.dev.data.pokemon.*;
import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import java.util.*;

import java.util.*;

public class Karmilarie extends Pokemon {
    public Karmilarie() {
        super("Karmilarie",
                Type.BUG, Type.ELECTRIC,
                new Stats(52,
                        96,
                        52,
                        86,
                        87,
                        112),
                List.of(Ability.TRIAGE, Ability.POWER_THIEF), Ability.PUNK_ROCK,
                18, 330,
                new Stats(0,0,0,0,0,2), 30,
                0.5,
                170, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.BUG, EggGroup.MONSTER),
                List.of("When hunting, it generates inaudible but highly destructive sound waves. If it can't feed on life energy, it subsists on electricity."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,1),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,1),
                        new MoveLearnSetEntry(Move.SUPERSONIC,5),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,8),
                        new MoveLearnSetEntry(Move.PARABOLIC_CHARGE,12),
                        new MoveLearnSetEntry(Move.TORMENT,16),
                        new MoveLearnSetEntry(Move.ELECTROWEB,19),
                        new MoveLearnSetEntry(Move.ROUND,23),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,27),
                        new MoveLearnSetEntry(Move.QUASH,30),
                        new MoveLearnSetEntry(Move.LUNGE,34),
                        new MoveLearnSetEntry(Move.OVERDRIVE,38),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,41),
                        new MoveLearnSetEntry(Move.SUPER_FANG,45),
                        new MoveLearnSetEntry(Move.SCREECH,49),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,52),
                        new MoveLearnSetEntry(Move.STRENGTH_SAP,56),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,"egg"),
                        new MoveLearnSetEntry(Move.ECHOLOCATE,"egg"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,"egg"),
                        new MoveLearnSetEntry(Move.UPROAR,"egg"),
                        new MoveLearnSetEntry(Move.POWER_TRIP,"egg")
                        ),
                List.of(Label.FLUX),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 22, 54, 2.5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
    }
}
