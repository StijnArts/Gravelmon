package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Magisbook extends drai.dev.data.pokemon.Pokemon {
    public Magisbook() {
        super("Magisbook",
                Type.GHOST, Type.DARK,
                new Stats(60,
                        110,
                        60,
                        100,
                        75,
                        80),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                16, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.NODORRO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(32).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SPOOKY).cantSeeSky()
                        .setSpawnPreset(SpawnPreset.MANSION, SpawnPreset.NEAR_BOOKSHELVES).build(),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Magisbook");

    }


}
