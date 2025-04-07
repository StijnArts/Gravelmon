package drai.dev.data.pokemon.enjin;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Tardidrake extends drai.dev.data.pokemon.Pokemon {
    public Tardidrake() {
        super("Tardidrake",
                Type.DRAGON, Type.GROUND,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.DRAGON),
                List.of("Added Oct 27 2021 Etymology: tardigrade + drake Created by JaneJewel for the April 2020 Around The World Fakeathon Day 29 prompt, The Moon Originally conceived as a pseudo-legendary."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DRACO_METEOR,"tm")                        ),
                List.of(Label.ENJIN),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Tardidrake");

    }


}
