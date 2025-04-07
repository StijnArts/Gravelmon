package drai.dev.data.pokemon.isiah;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Inood extends drai.dev.data.pokemon.Pokemon {
    public Inood() {
        super("Inood",
                Type.GRASS,
                new Stats(56,
                        60,
                        50,
                        50,
                        50,
                        50),
                List.of(Ability.OVERGROW), Ability.OVERGROW,
                5, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                63, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.GRASS),
                List.of(""),
                List.of(new EvolutionEntry("shibark", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))
                ),
                List.of(           new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.LEAFAGE,3),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,6),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,9),
                        new MoveLearnSetEntry(Move.DETECT,12),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,15),
                        new MoveLearnSetEntry(Move.ASSURANCE,18),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,21),
                        new MoveLearnSetEntry(Move.SLAM,24),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,27),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,30),
                        new MoveLearnSetEntry(Move.SCREECH,33),
                        new MoveLearnSetEntry(Move.ENDEAVOR,36),
                        new MoveLearnSetEntry(Move.LEAF_STORM,39)),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 5, 32, 6.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TAIGA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Inood");

    }


}
