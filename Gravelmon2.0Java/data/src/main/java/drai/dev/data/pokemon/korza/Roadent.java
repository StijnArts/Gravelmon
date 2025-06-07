package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Roadent extends drai.dev.data.pokemon.Pokemon {
    public Roadent() {
        super("Roadent",
                Type.NORMAL,Type.GROUND,
                new Stats(50,
                        50,
                        60,
                        40,
                        50,
                        30),
                List.of(Ability.UNAWARE), Ability.UNAWARE,
                6, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                56, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Often crosses roads and routes with heavy traffic as a test of speed and skill. Its hide, on its own, isn't strong enough to protect from any collisions."),
                List.of(),
                List.of(),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Roadent");

    }


}
