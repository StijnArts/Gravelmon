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
                new Stats(2,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(20).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SAVANNA).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Miltank");

    }


}
