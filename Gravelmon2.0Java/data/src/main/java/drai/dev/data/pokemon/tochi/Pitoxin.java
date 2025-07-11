package drai.dev.data.pokemon.tochi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Pitoxin extends drai.dev.data.pokemon.Pokemon {
    public Pitoxin(Stats stats) {
        super("Pitoxin",
                Type.POISON,Type.FLYING,
                stats,
                List.of(Ability.POISON_POINT), Ability.POISON_POINT,
                14, 0,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Pitoxin's feathers have the ability to secrete poison, which Pitoxin gets from eating poisonous big-type Pokemon. It's red feather's are especially toxic, able to knock out a large Pokemon in a matter of seconds."),
                List.of(),
                List.of(),
                List.of(Label.TOCHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.RARE)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_BIRCH).canSeeSky().atNight()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Pitoxin");

    }


}
