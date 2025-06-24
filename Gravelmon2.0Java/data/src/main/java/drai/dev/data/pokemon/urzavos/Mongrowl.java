package drai.dev.data.pokemon.urzavos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Mongrowl extends drai.dev.data.pokemon.Pokemon {
    public Mongrowl() {
        super("Mongrowl",
                Type.STEEL,Type.GHOST,
                new Stats(55,
                        80,
                        90,
                        70,
                        60,
                        65),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.URZAVOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Mongrowl");

    }


}
