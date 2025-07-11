package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Chickoo extends drai.dev.data.pokemon.Pokemon {
    public Chickoo() {
        super("Chickoo",
                Type.NORMAL,Type.FLYING,
                new Stats(50,
                        40,
                        40,
                        40,
                        40,
                        60),
                List.of(Ability.EARLY_BIRD), Ability.OBLIVIOUS,
                3, 13,
                new Stats(0,0,0,0,0,1), 255,
                0.5,
                54, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Chickoo");

    }


}
