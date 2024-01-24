package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class NorheimanMismagius extends drai.dev.gravelmon.pokemon.Pokemon {
    public NorheimanMismagius() {
        super("Mismagius",
                Type.GHOST,Type.GRASS,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.LEVITATE), Ability.GRASSY_SURGE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Norheiman Mismagius wanders south as winter approaches. When the cold has passed, it greets spring with harmonic music. It hypnotizes families with children, making them gather around it; and they all begin to dance."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE,1)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Mismagius");

    }


}
