package drai.dev.data.pokemon.mongratis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Colobbus extends drai.dev.data.pokemon.Pokemon {
    public Colobbus(Stats stats) {
        super("Colobbus",
                Type.ROCK, Type.FIGHTING,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                22, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Through force of will it carries the weight of countless rocks, shattering all but the strongest of them to make its body almost as hard as diamond."),
                List.of(),
                List.of(),
                List.of(Label.MONGRATIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .setMinLevel(39).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_MOUNTAIN).canSeeSky().atNight()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Colobbus");

    }


}
