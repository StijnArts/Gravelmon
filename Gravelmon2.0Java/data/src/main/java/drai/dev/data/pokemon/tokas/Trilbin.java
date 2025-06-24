package drai.dev.data.pokemon.tokas;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Trilbin extends drai.dev.data.pokemon.Pokemon {
    public Trilbin() {
        super("Trilbin",
                Type.FLYING, Type.NORMAL,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.GALE_WINGS), Ability.SOUNDPROOF,
                4, 0,
                new Stats(0,0,0,0,0,0), 255,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Trilbin are a common sight in Tokas. In the early mornings their songs can be heard, waking up people with gentle tunes."),
                List.of(new EvolutionEntry("bintone", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"17")))),
                List.of(),
                List.of(Label.TOKAS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_DECIDUOUS_FOREST).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Trilbin");

    }


}
