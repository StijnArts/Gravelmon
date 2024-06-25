package drai.dev.gravelmon.pokemon.kuria;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Sasaggot extends drai.dev.gravelmon.pokemon.Pokemon {
    public Sasaggot() {
        super("Sasaggot",
                Type.BUG, Type.FIGHTING,
                new Stats(65,
                        118,
                        92,
                        44,
                        96,
                        85),
                List.of(Ability.IAISLASH), Ability.IAISLASH,
                13, 326,
                new Stats(0,2,0,0,0,0), 45,
                0.5,
                175, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.BUG,EggGroup.MONSTER),
                List.of(""),
                List.of(),
                List.of(           new MoveLearnSetEntry(Move.MEGAHORN,1),
                        new MoveLearnSetEntry(Move.STORM_THROW,1),
                        new MoveLearnSetEntry(Move.HAMMER_ARM,1),
                        new MoveLearnSetEntry(Move.PROTECT,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,5),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,10),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,12),
                        new MoveLearnSetEntry(Move.ARM_THRUST,16),
                        new MoveLearnSetEntry(Move.PROTECT,18),
                        new MoveLearnSetEntry(Move.HEADBUTT,22),
                        new MoveLearnSetEntry(Move.SEISMIC_TOSS,28),
                        new MoveLearnSetEntry(Move.BODY_SLAM,34),
                        new MoveLearnSetEntry(Move.COUNTER,40),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,46),
                        new MoveLearnSetEntry(Move.MEGAHORN,52),
                        new MoveLearnSetEntry(Move.HAMMER_ARM,58),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,64)             ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 13, 33, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_CHERRY_GROVE)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Sasaggot");

    }


}
