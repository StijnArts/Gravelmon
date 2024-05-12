package drai.dev.gravelmon.pokemon.goetia;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Jawee extends drai.dev.gravelmon.pokemon.Pokemon {
    public Jawee() {
        super("Jawee",
                Type.WATER,
                new Stats(30,
                        63,
                        55,
                        58,
                        74,
                        50),
                List.of(Ability.STRONG_JAW), Ability.INTIMIDATE,
                0, 0,
                new Stats(0,0,0,0,1,0), 255,
                0.5,
                66, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_1),
                List.of("Its jaws are surprisingly powerful for a creature so small and squishy. Popular with beginner trainers who believe it to be in the best percentage."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WATER_SPORT,1),
                        new MoveLearnSetEntry(Move.SCUTTLEHOP,1),
                        new MoveLearnSetEntry(Move.BUBBLE,5),
                        new MoveLearnSetEntry(Move.BITE,5),
                        new MoveLearnSetEntry(Move.ABSORB,7),
                        new MoveLearnSetEntry(Move.CRUNCH,37)                        ),
                List.of(Label.GOETIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Jawee");

    }


}
