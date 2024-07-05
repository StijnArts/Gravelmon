package drai.dev.data.pokemon.mythire;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Strappen extends drai.dev.data.pokemon.Pokemon {
    public Strappen() {
        super("Strappen",
                Type.ICE, Type.FIGHTING,
                new Stats(50,
                        65,
                        45,
                        50,
                        40,
                        70),
                List.of(Ability.BATTLE_ARMOR,Ability.BIG_PECKS,Ability.SWIFT_SWIM), Ability.SWIFT_SWIM,
                13, 165,
                new Stats(0,1,0,0,0,0), 200,
                0.5,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING,EggGroup.FIELD),
                List.of("It moves by sliding across the ground as if it were ice-skating. If it falls over, its hard head armor protects it from any injury."),
                List.of(new EvolutionEntry("ruffiguin", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))),
                List.of(
                        new MoveLearnSetEntry(Move.PAYBACK,1),
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.ICE_SHARD,6),
                        new MoveLearnSetEntry(Move.CROSS_CHOP,9),
                        new MoveLearnSetEntry(Move.THROAT_CHOP,13),
                        new MoveLearnSetEntry(Move.AGILITY,16),
                        new MoveLearnSetEntry(Move.REVERSAL,19),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,22),
                        new MoveLearnSetEntry(Move.DETECT,25),
                        new MoveLearnSetEntry(Move.ICICLE_SPEAR,28),
                        new MoveLearnSetEntry(Move.LOW_KICK,31),
                        new MoveLearnSetEntry(Move.PLUCK,34),
                        new MoveLearnSetEntry(Move.ACROBATICS,37),
                        new MoveLearnSetEntry(Move.RUSHDOWN,40)),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COLD_OCEAN, Biome.IS_FROZEN_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);

    }


}
