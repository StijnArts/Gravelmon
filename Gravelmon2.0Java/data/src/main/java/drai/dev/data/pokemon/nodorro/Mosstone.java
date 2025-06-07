package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Mosstone extends drai.dev.data.pokemon.Pokemon {
    public Mosstone() {
        super("Mosstone",
                Type.ROCK, Type.GRASS,
                new Stats(90,
                        125,
                        120,
                        80,
                        85,
                        50),
                List.of(Ability.GREENTHUMB), Ability.GREENTHUMB,
                20, 3450,
                new Stats(0,2,1,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.NODORRO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .setMinLevel(40).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_OVERWORLD).cantSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Mosstone");

    }


}
