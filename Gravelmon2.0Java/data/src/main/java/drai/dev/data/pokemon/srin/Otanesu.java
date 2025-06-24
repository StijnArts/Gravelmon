package drai.dev.data.pokemon.srin;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Otanesu extends drai.dev.data.pokemon.Pokemon {
    public Otanesu(Stats stats) {
        super("Otanesu",
                Type.COSMIC,Type.ROCK,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                10, 0,
                new Stats(0,0,0,0,0,0), 30,
                0.0,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.SORIN),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.ULTRA_RARE).setWeight(SpawnWeight.RARE)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_BAMBOO).atNight().canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
        setCanFly(true);
           setLangFileName("Ota'nesu");

    }


}
