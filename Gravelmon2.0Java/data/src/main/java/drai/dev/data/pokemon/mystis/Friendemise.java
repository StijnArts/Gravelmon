package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Friendemise extends drai.dev.data.pokemon.Pokemon {
    public Friendemise() {
        super("Friendemise",
                Type.GHOST,
                new Stats(66,
                        90,
                        99,
                        90,
                        99,
                        36),
                List.of(Ability.FRIEND_GUARD), Ability.FRIEND_GUARD,
                17, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The 3 spirits surrounding this mon are individuals it once cared for in life. They have a tight knit bond, and will become anxious if one goes missing."),
                List.of(),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(33).setPool(SpawnPool.RARE).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SPOOKY).atNight()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Friendemise");

    }


}
