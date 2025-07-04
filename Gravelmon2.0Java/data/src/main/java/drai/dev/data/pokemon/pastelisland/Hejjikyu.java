package drai.dev.data.pokemon.pastelisland;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Hejjikyu extends drai.dev.data.pokemon.Pokemon {
    public Hejjikyu() {
        super("Hejjikyu",
                Type.GRASS,
                new Stats(60,
                        66,
                        120,
                        60,
                        100,
                        31),
                List.of(Ability.ROUGH_SKIN), Ability.SIMPLE,
                9, 0,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Sharp grassy quills grow over the shell of Hejjikyu, allowing Hejjikyu to create their own source of energy while remaining still. They appear commonly in the summer inside of hedges and bushes."),
                List.of(),
                List.of(),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(18).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.RARE)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_BIRCH).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Hejjikyu");

    }


}
