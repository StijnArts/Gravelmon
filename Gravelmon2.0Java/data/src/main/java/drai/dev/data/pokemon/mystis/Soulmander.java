package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Soulmander extends drai.dev.data.pokemon.Pokemon {
    public Soulmander() {
        super("Soulmander",
                Type.FIRE, Type.GHOST,
                new Stats(70,
                        75,
                        50,
                        95,
                        50,
                        140),
                List.of(Ability.LEVITATE,Ability.FLASH_FIRE), Ability.SOULABSORB,
                12, 0,
                new Stats(0,0,0,0,0,0), 70,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.MONSTER),
                List.of("A close relative of Detonewt, assumed to have been extinct for hundreds of years. Latent dragon energy has reawakened it's spirit, and it's soul flame now burns uncontrollably."),
                List.of(),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(32).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_NETHER_SOUL_FIRE, Biome.IS_NETHER_SOUL_SAND)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Soulmander");

    }


}
