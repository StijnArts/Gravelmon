package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Hazardip extends drai.dev.data.pokemon.Pokemon {
    public Hazardip() {
        super("Hazardip",
                Type.POISON, Type.BUG,
                new Stats(80,
                        95,
                        70,
                        95,
                        70,
                        75),
                List.of(Ability.COMPOUND_EYES), Ability.CONTAMINATE,
                9, 0,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                170, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(24).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SWAMP).atNight()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
        setCanFly(true);
           setLangFileName("Hazardip");

    }


}
