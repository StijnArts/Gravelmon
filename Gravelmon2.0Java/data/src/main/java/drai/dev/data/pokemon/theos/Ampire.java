package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Ampire extends drai.dev.data.pokemon.Pokemon {
    public Ampire() {
        super("Ampire",
                Type.DARK, Type.ELECTRIC,
                new Stats(85,
                        95,
                        80,
                        95,
                        80,
                        100),
                List.of(Ability.TRIAGE), Ability.SURGE_SURFER,
                15, 850,
                new Stats(0,0,0,0,0,2), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Ampire are not welcome in major cities as they will hang from Transmission Towers at night often causing damage and large power outages."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Ampire");

    }


}
