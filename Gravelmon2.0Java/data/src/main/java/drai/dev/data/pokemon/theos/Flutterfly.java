package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Flutterfly extends drai.dev.data.pokemon.Pokemon {
    public Flutterfly() {
        super("Flutterfly",
                Type.BUG, Type.PSYCHIC,
                new Stats(70,
                        75,
                        50,
                        105,
                        95,
                        80),
                List.of(Ability.MIRROR_ARMOR), Ability.FILTER,
                13, 180,
                new Stats(0,0,0,2,0,0), 110,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .setMinLevel(20).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_BIRCH).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
        setCanFly(true);
           setLangFileName("Flutterfly");

    }


}
