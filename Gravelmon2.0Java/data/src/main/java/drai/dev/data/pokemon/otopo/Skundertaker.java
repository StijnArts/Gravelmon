package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Skundertaker extends drai.dev.data.pokemon.Pokemon {
    public Skundertaker() {
        super("Skundertaker",
                Type.DARK,Type.GHOST,
                new Stats(110,
                        30,
                        80,
                        100,
                        75,
                        85),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Skundertaker seems completely unfazed by its own odour. It loves to sneak up on unsuspecting trainers, unleashing a stink so bad that some claim they saw their souls leave their bodies—if only for a moment!"),
                List.of(),
                List.of(),
                List.of(Label.OTOPO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Skundertaker");

    }


}
