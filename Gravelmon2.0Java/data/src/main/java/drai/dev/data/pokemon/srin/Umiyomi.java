package drai.dev.data.pokemon.srin;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Umiyomi extends drai.dev.data.pokemon.Pokemon {
    public Umiyomi() {
        super("Umiyomi",
                Type.COSMIC,Type.WATER,
                new Stats(88,
                        98,
                        78,
                        128,
                        108,
                        88),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                40, 10480,
                new Stats(0,0,0,0,0,0), 30,
                0.0,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(),
                List.of("Despite its calm demeanor, Umi'yomi occasionally appears out of nowhere, wrecking anything unwanted. Its noodle-like tentacles move in synchronisation with 'the small spirits' circling around its head."),
                List.of(),
                List.of(),
                List.of(Label.SORIN),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(44).setPool(SpawnPool.ULTRA_RARE).setWeight(SpawnWeight.RARE)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_BAMBOO).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
        setCanFly(true);
           setLangFileName("Umi'yomi");

    }


}
