package drai.dev.data.pokemon.tokas;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Mortoise extends drai.dev.data.pokemon.Pokemon {
    public Mortoise(Stats stats) {
        super("Mortoise",
                Type.ELECTRIC, Type.GROUND,
                stats,
                List.of(Ability.AFTERMATH), Ability.SHELL_ARMOR,
                15, 0,
                new Stats(0,0,0,0,0,0), 75,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The skull shape on its head serves as a warning to those aware if its presence. Explosions result for those who are not."),
                List.of(),
                List.of(),
                List.of(Label.TOKAS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.RARE)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_JUNGLE).cantSeeSky()
                        .setSpawnPreset(SpawnPreset.JUNGLE_PYRAMID).build(),
                List.of());
           setLangFileName("Mortoise");

    }


}
