package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Bookalf extends drai.dev.data.pokemon.Pokemon {
    public Bookalf() {
        super("Bookalf",
                Type.FAIRY,
                new Stats(60,
                        50,
                        50,
                        50,
                        70,
                        40),
                List.of(Ability.CUTE_CHARM), Ability.OBLIVIOUS,
                7, 0,
                new Stats(0,0,0,0,0,0), 190,
                0.5,
                64, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("faebull", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:moon_stone")),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_MAGICAL).duringDaytime()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Bookalf");

    }


}
