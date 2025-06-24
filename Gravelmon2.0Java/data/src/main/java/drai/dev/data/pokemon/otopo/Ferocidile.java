package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Ferocidile extends drai.dev.data.pokemon.Pokemon {
    public Ferocidile(Stats stats) {
        super("Ferocidile",
                Type.WATER, Type.DARK,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                19, 0,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("It can shatter a tree in half with its mouth. It will not release its prey once clasped."),
                List.of(),
                List.of(),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(23).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SWAMP).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL, SpawnPreset.NEAR_WATER).build(),
                List.of());
           setLangFileName("Ferocidile");

    }


}
