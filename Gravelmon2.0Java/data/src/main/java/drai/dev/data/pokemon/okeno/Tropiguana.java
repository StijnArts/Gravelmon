package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Tropiguana extends drai.dev.data.pokemon.Pokemon {
    public Tropiguana() {
        super("Tropiguana",
                Type.FIRE, Type.ROCK,
                new Stats(54,
                        80,
                        80,
                        84,
                        50,
                        72),
                List.of(Ability.ROUGH_SKIN,Ability.DRY_SKIN,Ability.IGNITION), Ability.IGNITION,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.DRAGON),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.OKENO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Tropiguana");

    }


}
