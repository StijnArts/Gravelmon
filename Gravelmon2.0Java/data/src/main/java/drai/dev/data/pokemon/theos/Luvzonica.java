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
                new Stats(0,1,1,0,0,0), 0,
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
           setLangFileName("Luvzonica");

    }


}
