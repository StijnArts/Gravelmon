package drai.dev.data.pokemon.goetia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Astronotilus extends drai.dev.data.pokemon.Pokemon {
    public Astronotilus(Stats stats) {
        super("Astronotilus",
                Type.PSYCHIC,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Its body is sealed inside an organic suit that protects it from atmospheric pressure. It inquisitively examines things with its tentacles for unknown purposes. We do not yet know where it came from."),
                List.of(),
                List.of(),
                List.of(Label.GOETIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(27)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_DEEP_OCEAN)
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	

        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Astronotilus");

    }


}
