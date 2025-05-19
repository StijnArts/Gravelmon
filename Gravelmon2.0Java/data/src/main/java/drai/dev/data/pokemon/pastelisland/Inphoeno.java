package drai.dev.data.pokemon.pastelisland;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Inphoeno extends drai.dev.data.pokemon.Pokemon {
    public Inphoeno() {
        super("Inphoeno",
                Type.FIRE,
                new Stats(80,
                        120,
                        70,
                        75,
                        70,
                        115),
                List.of(Ability.BLAZE), Ability.DAZZLING,
                21, 391,
                new Stats(0,3,0,0,0,0), 70,
                0.875,
                239, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.FLYING),
                List.of("A graceful Pokémon with powerful legs. By infusing their legs with heat, they can increase their kicks' power tenfold."),
                List.of(),
                List.of(),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Inphoeno");

    }


}
