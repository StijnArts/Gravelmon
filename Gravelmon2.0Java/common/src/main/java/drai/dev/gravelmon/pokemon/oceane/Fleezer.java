package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Fleezer extends drai.dev.gravelmon.pokemon.Pokemon {
    public Fleezer() {
        super("Fleezer",
                Type.NORMAL,
                new Stats(85,
                        90,
                        55,
                        85,
                        80,
                        70),
                List.of(Ability.FUR_COAT), Ability.FUR_COAT,
                8, 165,
                new Stats(0,2,0,0,0,0), 75,
                0.5,
                163, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Fleezer slam their heads against ice to break it up, their silky coat absorbing the impact. The value of Fleezer fur was once so highly prized that they adapted to life in the icy seas to escape predation."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.NUZZLE,1)                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Fleezer");

    }


}
