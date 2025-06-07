package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Sorcehorress extends drai.dev.data.pokemon.Pokemon {
    public Sorcehorress() {
        super("Sorcehorress",
                Type.POISON, Type.PSYCHIC,
                new Stats(90,
                        75,
                        100,
                        140,
                        80,
                        50),
                List.of(Ability.CURIOUS_MEDICINE), Ability.POWER_OF_ALCHEMY,
                18, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.125,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("An experiment gone horribly wrong has turned it into this form. It hides it's face from others, scalding them with boiling poison if they dare look."),
                List.of(),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .setMinLevel(36).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SWAMP)
                        .setSpawnPreset(SpawnPreset.ILLAGER_STRUCTURES ).build(),
                List.of());
           setLangFileName("Sorcehorress");

    }


}
