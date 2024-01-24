package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Saberian extends drai.dev.gravelmon.pokemon.Pokemon {
    public Saberian() {
        super("Saberian",
                Type.ROCK,Type.ICE,
                new Stats(80,
                        140,
                        111,
                        30,
                        70,
                        110),
                List.of(Ability.STRONG_JAW,Ability.SOLID_ROCK,Ability.REFRIGERATE), Ability.REFRIGERATE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                1.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Despite its size and bulky stature, a Saberian can reach a top speed at around 30 mph, sometimes higher if desired. They were the apex predators during the age of the Great Snowfall."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ACCELEROCK,1)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Saberian");

    }


}
