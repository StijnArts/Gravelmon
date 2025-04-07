package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Searell extends drai.dev.data.pokemon.Pokemon {
    public Searell() {
        super("Searell",
                Type.NORMAL, Type.FIRE,
                new Stats(65,
                        90,
                        65,
                        90,
                        65,
                        90),
                List.of(Ability.STEADFAST), Ability.FRISK,
                12, 80,
                new Stats(0,1,0,1,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Searell can ignite the seeds it keeps in it's cheeks to use for attacks. With their tail being very fluffy and warm, smaller Pokémon love to curl up in them on cold nights."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Searell");

    }


}
