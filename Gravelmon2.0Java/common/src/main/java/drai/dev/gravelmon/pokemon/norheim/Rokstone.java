package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Rokstone extends drai.dev.gravelmon.pokemon.Pokemon {
    public Rokstone() {
        super("Rokstone",
                Type.ROCK,Type.FIRE,
                new Stats(100,
                        75,
                        105,
                        80,
                        145,
                        5),
                List.of(Ability.WHITE_SMOKE,Ability.FOREWARN,Ability.COMATOSE), Ability.COMATOSE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Legends tell that a Rokstone can predict cataclysmic events, written in fire, written in stone."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SLEEP_TALK,1)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Rokstone");

    }


}
