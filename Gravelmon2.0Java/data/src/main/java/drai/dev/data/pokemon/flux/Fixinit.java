package drai.dev.data.pokemon.flux;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Fixinit extends Pokemon {
    public Fixinit() {
        super("Fixinit",
                Type.FIGHTING,
                new Stats(75,
                        85,
                        98,
                        34,
                        72,
                        41),
                List.of(Ability.STEELY_SPIRIT), Ability.IRON_FIST,
                12, 546,
                new Stats(0,0,2,0,0,0), 120,
                0.5,
                142, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.HUMAN_LIKE, EggGroup.MONSTER),
                List.of("When properly trained, it can easily troubleshoot machinery. However, it loves to take things apart, so it can't be left unsupervised."),
                List.of(new EvolutionEntry("artifixt", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"42")))),
                List.of(
                        new MoveLearnSetEntry(Move.BULLET_PUNCH,1),
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,1),
                        new MoveLearnSetEntry(Move.VISE_GRIP,1),
                        new MoveLearnSetEntry(Move.RECYCLE,12),
                        new MoveLearnSetEntry(Move.VITAL_THROW,16),
                        new MoveLearnSetEntry(Move.SLACK_OFF,19),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,23),
                        new MoveLearnSetEntry(Move.HAMMER_ARM,34),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,39),
                        new MoveLearnSetEntry(Move.METAL_BURST,45),
                        new MoveLearnSetEntry(Move.SHIFT_GEAR,50),
                        new MoveLearnSetEntry(Move.IRON_TAIL,56),
                        new MoveLearnSetEntry(Move.SUPERPOWER,61),
                        new MoveLearnSetEntry(Move.CURSE,"egg"),
                        new MoveLearnSetEntry(Move.SKULL_BASH,"egg"),
                        new MoveLearnSetEntry(Move.COUNTER,"egg"),
                        new MoveLearnSetEntry(Move.SCREECH,"egg"),
                        new MoveLearnSetEntry(Move.DISABLE,"egg")
                ),
                List.of(Label.FLUX),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 26, 45, 0.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false"),
                        new SpawnCondition(SpawnConditionType.MAXY,"0")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
    }
}
