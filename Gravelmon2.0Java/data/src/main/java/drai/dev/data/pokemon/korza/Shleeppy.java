package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Shleeppy extends drai.dev.data.pokemon.Pokemon {
    public Shleeppy() {
        super("Shleeppy",
                Type.GHOST,
                new Stats(86,
                        50,
                        123,
                        64,
                        78,
                        61),
                List.of(Ability.COMATOSE), Ability.BAD_DREAMS,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Shleeppy drift around in the twilight hours, drawn to strong dreams. The flowers growing on its body are said to make people fall into a deep sleep."),
                List.of(),
                List.of(),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Shleeppy");

    }


}
