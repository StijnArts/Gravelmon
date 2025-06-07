package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Nimbrella extends drai.dev.data.pokemon.Pokemon {
    public Nimbrella() {
        super("Nimbrella",
                Type.FLYING,
                new Stats(71,
                        61,
                        63,
                        67,
                        68,
                        55),
                List.of(Ability.OWN_TEMPO), Ability.FILTER,
                10, 86,
                new Stats(0,0,0,0,0,0), 0,
                0.875,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Nimbrella hide in low clouds and lower its string through them as bait. Folklore claims that people who disappear into thin air have been taken by a Nimbrella."),
                List.of(),
                List.of(),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Nimbrella");

    }


}
