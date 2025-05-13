package drai.dev.data.pokemon.nodorro.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class NodorroanWeezing extends drai.dev.data.pokemon.Pokemon {
    public NodorroanWeezing(String name, Aspect aspect) {
        super(name, aspect, "NodorroanWeezing",
                Type.ROCK,Type.FIRE,
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
                        new MoveLearnSetEntry(Move.LAVA_PLUME,1)),
                List.of(Label.NODORRO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Weezing");

    }


}
