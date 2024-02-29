package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Taratorcha extends drai.dev.gravelmon.pokemon.Pokemon {
    public Taratorcha() {
        super("Taratorcha",
                Type.FIRE,Type.BUG,
                new Stats(80,
                        75,
                        65,
                        95,
                        70,
                        60),
                List.of(Ability.SWARM), Ability.INFILTRATOR,
                7, 165,
                new Stats(0,0,0,0,0,0), 130,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.SCARY_FACE,5),
                        new MoveLearnSetEntry(Move.EMBER,8),
                        new MoveLearnSetEntry(Move.CONSTRICT,12)                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 22, 37, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Taratorcha");

    }


}
