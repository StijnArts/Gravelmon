package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Timekreepa extends drai.dev.data.pokemon.Pokemon {
    public Timekreepa(Stats stats) {
        super("Timekreepa",
                Type.GHOST, Type.PSYCHIC,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                12, 0,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.RARE).setWeight(SpawnWeight.RARE)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_LUKEWARM_OCEAN).atNight()
                        .setSpawnPreset(SpawnPreset.UNDERWATER, SpawnPreset.SHIP_WRECK).build(),
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Timekreepa");

    }


}
