package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Chanacat extends drai.dev.data.pokemon.Pokemon {
    public Chanacat() {
        super("Chanacat",
                Type.WATER,Type.GROUND,
                new Stats(55,
                        40,
                        70,
                        40,
                        50,
                        50),
                List.of(Ability.OBLIVIOUS,Ability.SWIFT_SWIM), Ability.STATIC,
                6, 92,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                107, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("This pokemon is the most abundant water-dwelling pokemon in the region. Their abundance lends to their popularity with fisherman and in local cuisine."),
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
           setLangFileName("Chanacat");

    }


}
