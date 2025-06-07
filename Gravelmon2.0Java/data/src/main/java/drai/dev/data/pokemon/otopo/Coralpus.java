package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Coralpus extends drai.dev.data.pokemon.Pokemon {
    public Coralpus() {
        super("Coralpus",
                Type.WATER, Type.GRASS,
                new Stats(75,
                        75,
                        75,
                        105,
                        105,
                        45),
                List.of(Ability.HYDRATION), Ability.HYDRATION,
                0, 0,
                new Stats(0,0,0,1,1,0), 0,
                0.5,
                168, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1),
                List.of("Coralpus is a sea creature that can be discovered stranded on the beach. They can remove kelp from their moustache and use it to make bandages for injured Pokemon, and their kelp is prized by hunters for its medical powers."),
                List.of(),
                List.of(),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Coralpus");

    }


}
