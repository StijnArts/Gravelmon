package drai.dev.data.pokemon.terranov;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Rajang extends drai.dev.data.pokemon.Pokemon {
    public Rajang() {
        super("Rajang",
                Type.ELECTRIC, Type.FIGHTING,
                new Stats(70,
                        140,
                        89,
                        130,
                        78,
                        83),
                List.of(Ability.GUTS), Ability.GORILLA_TACTICS,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Despite being small, it is astoundingly strong. Rajang will feed on Kirin horns to get its electric powers, when powered up its dark fur turns into a shiny golden mane."),
                List.of(),
                List.of(),
                List.of(Label.TERRANOV),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Rajang");

    }


}
