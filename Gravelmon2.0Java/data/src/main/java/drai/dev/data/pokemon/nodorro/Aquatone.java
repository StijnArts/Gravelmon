package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Aquatone extends drai.dev.data.pokemon.Pokemon {
    public Aquatone() {
        super("Aquatone",
                Type.ROCK, Type.WATER,
                new Stats(70,
                        90,
                        75,
                        115,
                        120,
                        80),
                List.of(Ability.STORM_DRAIN), Ability.DRIZZLE,
                18, 1900,
                new Stats(0,0,0,1,2,0), 45,
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
           setLangFileName("Aquatone");

    }


}
