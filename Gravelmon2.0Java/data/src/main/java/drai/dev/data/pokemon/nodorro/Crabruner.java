package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Crabruner extends drai.dev.data.pokemon.Pokemon {
    public Crabruner() {
        super("Crabruner",
                Type.WATER, Type.STEEL,
                new Stats(70,
                        129,
                        90,
                        60,
                        70,
                        95),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                30, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.NODORRO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .setMinLevel(43).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_BEACH).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
           setLangFileName("Crabruner");

    }


}
