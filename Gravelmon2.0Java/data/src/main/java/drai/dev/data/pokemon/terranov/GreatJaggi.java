package drai.dev.data.pokemon.terranov;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class GreatJaggi extends drai.dev.data.pokemon.Pokemon {
    public GreatJaggi(Stats stats) {
        super("GreatJaggi",
                Type.NORMAL,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Alpha monsters that lead packs of Jaggi. At a certain age, males leave the pack to live on their own before returning to fight for the right to become leader. They have a very commanding presence. It has been said they can call and give complex orders to their pack with their howls and barks."),
                List.of(),
                List.of(),
                List.of(Label.TERRANOV),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Great Jaggi");

    }


}
