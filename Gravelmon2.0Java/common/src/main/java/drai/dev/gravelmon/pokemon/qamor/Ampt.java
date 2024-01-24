package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Ampt extends drai.dev.gravelmon.pokemon.Pokemon {
    public Ampt() {
        super("Ampt",
                Type.NORMAL,
                new Stats(61,
                        63,
                        48,
                        74,
                        52,
                        42),
                List.of(Ability.PUNK_ROCK), Ability.PUNK_ROCK,
                8, 165,
                new Stats(0,1,0,1,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.HUMAN_LIKE),
                List.of("Ampt love nothing more then attention and playing cool, but they are constantly causing trouble and act extremely rebellious on and off the stage. They are always trying to think of new ways to do things that go against the norm and starting anarchy."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CLANGOROUS_SOUL,"tm"),
                        new MoveLearnSetEntry(Move.OVERDRIVE,"tm")                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Ampt");

    }


}
