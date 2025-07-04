package drai.dev.data.pokemon.beginnings;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Bunbush extends drai.dev.data.pokemon.Pokemon {
    public Bunbush() {
        super("Bunbush",
                Type.GRASS,
                new Stats(60,
                        55,
                        55,
                        80,
                        75,
                        85),
                List.of(Ability.OVERGROW), Ability.MISTY_SURGE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Whilst Hopling are still playful, Bunbush gain a more regal sense of protection. It will not hesitate to get aggressive with people destroying the environment."),
                List.of(),
                List.of(),
                List.of(Label.OTTORA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Bunbush");

    }


}
