package drai.dev.data.pokemon.theos.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class TheossianMiltank extends drai.dev.data.pokemon.Pokemon {
    public TheossianMiltank(String name, Aspect aspect) {
        super(name, aspect, "Miltank",
                Type.FAIRY, Type.NORMAL,
                new Stats(105,
                        80,
                        100,
                        40,
                        70,
                        95),
                List.of(Ability.HEALER), Ability.SERENE_GRACE,
                12, 755,
                new Stats(2,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Miltank");

    }


}
