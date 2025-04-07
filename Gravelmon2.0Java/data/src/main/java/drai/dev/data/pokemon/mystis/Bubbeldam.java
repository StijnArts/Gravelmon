package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Bubbeldam extends drai.dev.data.pokemon.Pokemon {
    public Bubbeldam() {
        super("Bubbeldam",
                Type.POISON, Type.PSYCHIC,
                new Stats(60,
                        60,
                        80,
                        120,
                        65,
                        40),
                List.of(Ability.CURIOUS_MEDICINE), Ability.POWER_OF_ALCHEMY,
                13, 0,
                new Stats(0,0,0,0,0,0), 90,
                0.125,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The cauldron it lives in is constantly heated, although no one knows how. Anything that goes into a Bubbeldam's sludge comes out completely different, if given enough time."),
                List.of(new EvolutionEntry("sorcehorress", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:moon_stone")),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(22).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SWAMP)
                        .setSpawnPreset(SpawnPreset.ILLAGER_STRUCTURES ).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Bubbeldam");

    }


}
