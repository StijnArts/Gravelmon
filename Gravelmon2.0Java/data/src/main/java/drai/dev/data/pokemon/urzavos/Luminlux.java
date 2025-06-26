package drai.dev.data.pokemon.urzavos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Luminlux extends drai.dev.data.pokemon.Pokemon {
    public Luminlux() {
        super("Luminlux",
                Type.ROCK,Type.ELECTRIC,
                new Stats(50,
                        60,
                        95,
                        120,
                        70,
                        70),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                15, 0,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("A towering colony of Luminlite become Luminlux - It has not yet harmonized all of its disparate parts, and thus skitters around erratically. Its many faces will flicker on and off randomly, disturbing those around it."),
                List.of(new EvolutionEntry("lumineye", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"45")))),
                List.of(),
                List.of(Label.URZAVOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(30).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_CAVE).cantSeeSky()
                        .setSpawnPreset(SpawnPreset.UNDERGROUND).build(),
                List.of());
           setLangFileName("Luminlux");

    }


}
