package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Flowerbed extends drai.dev.data.pokemon.Pokemon {
    public Flowerbed() {
        super("Flowerbed",
                Type.FAIRY, Type.GRASS,
                new Stats(90,
                        70,
                        100,
                        70,
                        130,
                        70),
                List.of(Ability.COTTON_DOWN), Ability.DREAMER,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("(Name) is an incredibly great mon to sleep on. Not only does it carry its young on its back, it has a sweet aroma that leaves anyone who rests on it calmed."),
                List.of(),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Flowerbed");

    }


}
