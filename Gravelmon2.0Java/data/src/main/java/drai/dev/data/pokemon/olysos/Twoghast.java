package drai.dev.data.pokemon.olysos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Twoghast extends drai.dev.data.pokemon.Pokemon {
    public Twoghast() {
        super("Twoghast",
                Type.GHOST, Type.STEEL,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                10, 0,
                new Stats(0,0,0,0,0,0), 190,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It has been told that breaking a urn would cause years of misfortune. Souls of Pokemon and Human are apperently trapped inside of it and fused to one Pokemon."),
                List.of(new EvolutionEntry("forcaken", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:dusk_stone")),
                List.of(),
                List.of(Label.OLYSOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(13).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_DESERT).cantSeeSky()
                        .setSpawnPreset(SpawnPreset.DESERT_PYRAMID).build(),
                List.of());
           setLangFileName("Twoghast");

    }


}
