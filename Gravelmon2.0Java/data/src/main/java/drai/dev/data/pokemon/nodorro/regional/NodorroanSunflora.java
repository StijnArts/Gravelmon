package drai.dev.data.pokemon.nodorro.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class NodorroanSunflora extends drai.dev.data.pokemon.Pokemon {
    public NodorroanSunflora(String name, Aspect aspect) {
        super(name, aspect, "NodorroanSunflora",
                Type.GRASS,Type.GROUND,
                new Stats(74,
                        70,
                        115,
                        70,
                        105,
                        10),
                List.of(Ability.IRON_BARBS), Ability.SOLAR_POWER,
                9, 123,
                new Stats(0,0,1,0,1,0), 120,
                0.5,
                149, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Sunflora have evolved to grow thicker prickly roots to defend themselves from imicada who prey on them."),
                List.of(),
                List.of(),
                List.of(Label.NODORRO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Sunflora");

    }


}
