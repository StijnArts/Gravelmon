package drai.dev.data.pokemon.goetia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Jawee extends drai.dev.data.pokemon.Pokemon {
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
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Jawee");

    }


}
