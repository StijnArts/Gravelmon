package drai.dev.gravelmon.pokemon.nodorro.regional;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Weezing extends drai.dev.gravelmon.pokemon.Pokemon {
    public Weezing(String originalMon, Aspect aspect) {
        super(originalMon, aspect, "Weezing",
                Type.ROCK, Type.FIRE,
                new Stats(60,
                        99,
                        120,
                        82,
                        99,
                        30),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 1000,
                new Stats(0,1,2,0,0,0), 0,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(),
                List.of("- Lava PlumeSTAB Fire - EmberSTAB Fire - Rock TombSTAB Rock - Rock SlideSTAB Rock"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ROCK_TOMB,1),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,1),
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.LAVA_PLUME,1)                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Weezing");

    }


}
