package drai.dev.data.pokemon.terranov;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Diablos extends drai.dev.data.pokemon.Pokemon {
    public Diablos() {
        super("Diablos",
                Type.GROUND,
                new Stats(95,
                        130,
                        80,
                        70,
                        75,
                        105),
                List.of(Ability.RECKLESS), Ability.RECKLESS,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Feared as tyrants of the desert, these Flying Wyverns attack any who stray into their territory. They use their huge horns in dash attacks to devastating effect. Their diet is comprised mostly of cacti."),
                List.of(),
                List.of(),
                List.of(Label.TERRANOV),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Diablos");

    }


}
