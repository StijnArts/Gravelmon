package drai.dev.data.pokemon.pastelisland;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Drasilis extends drai.dev.data.pokemon.Pokemon {
    public Drasilis() {
        super("Drasilis",
                Type.BUG, Type.DRAGON,
                new Stats(58,
                        35,
                        85,
                        35,
                        86,
                        50),
                List.of(Ability.SHIELD_DUST), Ability.BERSERK,
                9, 180,
                new Stats(0,0,0,0,0,0), 120,
                0.5,
                122, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG,EggGroup.DRAGON),
                List.of("Statuesque and solid like rock, these Pokémon remain still while their bodies metamorphose inside. They are also surprisingly warm and used as pillows by some."),
                List.of(),
                List.of(),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Drasilis");

    }


}
