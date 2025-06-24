package drai.dev.data.pokemon.tochi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Rubster extends drai.dev.data.pokemon.Pokemon {
    public Rubster(Stats stats) {
        super("Rubster",
                Type.NORMAL,
                stats,
                List.of(Ability.REGENERATOR), Ability.REGENERATOR,
                12, 0,
                new Stats(0,0,0,0,0,0), 110,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("- Counter Fighting - Mirror Coat Psychic"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.COUNTER,1),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,1)),
                List.of(Label.TOCHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.RARE).setWeight(SpawnWeight.RARE)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_OVERWORLD).canSeeSky()
                        .setSpawnPreset(SpawnPreset.VILLAGE).build(),
                List.of());
           setLangFileName("Rubster");

    }


}
