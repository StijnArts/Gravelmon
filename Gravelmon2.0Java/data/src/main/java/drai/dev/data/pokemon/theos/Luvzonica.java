package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Luvzonica extends drai.dev.data.pokemon.Pokemon {
    public Luvzonica() {
        super("Luvzonica",
                Type.FLYING, Type.GROUND,
                new Stats(65,
                        95,
                        95,
                        70,
                        70,
                        75),
                List.of(Ability.BIG_PECKS,Ability.QUICK_FEET), Ability.GUTS,
                15, 210,
                new Stats(0,1,1,0,0,0), 110,
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
                        .setMinLevel(22).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TAIGA).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Luvzonica");

    }


}
