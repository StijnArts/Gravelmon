package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Salmonock extends drai.dev.data.pokemon.Pokemon {
    public Salmonock() {
        super("Salmonock",
                Type.ELECTRIC, Type.WATER,
                new Stats(110,
                        80,
                        60,
                        80,
                        70,
                        90),
                List.of(Ability.SWIFT_SWIM), Ability.BATTERY,
                0, 0,
                new Stats(2,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Salmonock have incredibly powerful electricity-producing organs, allowing them to deter flying predators. This, however, made them prey to Bearrier and Urstaunch."),
                List.of(),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Salmonock");

    }


}
