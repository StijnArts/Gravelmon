package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Scarfly extends drai.dev.data.pokemon.Pokemon {
    public Scarfly() {
        super("Scarfly",
                Type.FLYING, Type.ICE,
                new Stats(55,
                        33,
                        67,
                        58,
                        57,
                        50),
                List.of(Ability.BIG_PECKS), Ability.ICE_BODY,
                8, 0,
                new Stats(0,0,0,0,0,0), 120,
                0.5,
                112, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of(""),
                List.of(new EvolutionEntry("puffemperor", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(15).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SNOWY).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Scarfly");

    }


}
