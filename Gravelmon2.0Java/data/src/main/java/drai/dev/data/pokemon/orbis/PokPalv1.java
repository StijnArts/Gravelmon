package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class PokPalv1 extends drai.dev.data.pokemon.Pokemon {
    public PokPalv1() {
        super("PokPalv1",
                Type.NORMAL,
                new Stats(50,
                        50,
                        50,
                        50,
                        50,
                        50),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                5, 30,
                new Stats(1,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Introducing your newest Virtual Companion, the PokéPal! With a highly customisable interface and design, your PokéPal is entirely unique and personalised!"),
                List.of(),
                List.of(),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("PokéPal v1");

    }


}
