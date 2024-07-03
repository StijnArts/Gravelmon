package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Shibark extends drai.dev.gravelmon.pokemon.Pokemon {
    public Shibark() {
        super("Shibark",
                Type.GRASS,
                new Stats(89,
                        94,
                        62,
                        50,
                        52,
                        58),
                List.of(Ability.OVERGROW), Ability.OVERGROW,
                9, 165,
                new Stats(1,1,0,0,0,0), 45,
                0.5,
                142, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.GRASS),
                List.of(""),
                List.of(new EvolutionEntry("gardraog", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"36")))
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
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 16, 46, 2.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TAIGA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Shibark");

    }


}
