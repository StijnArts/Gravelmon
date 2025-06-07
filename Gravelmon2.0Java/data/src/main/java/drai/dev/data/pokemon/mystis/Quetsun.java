package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Quetsun extends drai.dev.data.pokemon.Pokemon {
    public Quetsun() {
        super("Quetsun",
                Type.FLYING, Type.DRAGON,
                new Stats(100,
                        130,
                        70,
                        110,
                        70,
                        120),
                List.of(Ability.GALE_WINGS), Ability.PRIDEFULSTANCE,
                32, 0,
                new Stats(0,0,0,0,0,0), 20,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It is said that when Quetsun flies overhead, the sun will emit colourful rays of light. When Quetsun flaps its wings, the wind it produces fills the earth with abundant greenery and sprouts of life."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DRAGON_ENERGY,1),
                        new MoveLearnSetEntry(Move.JUNGLE_HEALING,1),
                        new MoveLearnSetEntry(Move.DUAL_WINGBEAT,"tm")                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .subLegend()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_JUNGLE)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Quetsun");

    }


}
