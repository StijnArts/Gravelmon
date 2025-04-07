package drai.dev.data.pokemon.terranov;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Tetsucabra extends drai.dev.data.pokemon.Pokemon {
    public Tetsucabra() {
        super("Tetsucabra",
                Type.ROCK,
                new Stats(105,
                        80,
                        105,
                        55,
                        75,
                        70),
                List.of(Ability.DRY_SKIN), Ability.DRY_SKIN,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Amphibians with powerful hind legs allowing them to leap up even the steepest of slopes. The terrifying tusks on their enormous jaws allow them to excavate deep trenches, effectively trapping their prey."),
                List.of(),
                List.of(),
                List.of(Label.TERRANOV),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Tetsucabra");

    }


}
