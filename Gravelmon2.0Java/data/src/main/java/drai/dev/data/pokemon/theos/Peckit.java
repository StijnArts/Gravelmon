package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Peckit extends drai.dev.data.pokemon.Pokemon {
    public Peckit() {
        super("Peckit",
                Type.FLYING, Type.GROUND,
                new Stats(40,
                        70,
                        60,
                        50,
                        50,
                        50),
                List.of(Ability.BIG_PECKS,Ability.QUICK_FEET), Ability.GUTS,
                4, 30,
                new Stats(0,1,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Peckit cannot fly but can jump quite high. Their beak is quite strong, using it to peck through the hard ground to find hiding Sqworm."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Peckit");

    }


}
