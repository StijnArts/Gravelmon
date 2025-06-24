package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Cherishen extends drai.dev.data.pokemon.Pokemon {
    public Cherishen() {
        super("Cherishen",
                Type.NORMAL, Type.FLYING,
                new Stats(120,
                        50,
                        70,
                        80,
                        85,
                        75),
                List.of(Ability.IMMUNITY), Ability.NATURAL_CURE,
                11, 200,
                new Stats(2,0,0,0,0,0), 70,
                0,
                168, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TEMPERATE, Biome.IS_ARID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.VILLAGE).build(),
                List.of());
           setLangFileName("Cherishen");

    }


}
