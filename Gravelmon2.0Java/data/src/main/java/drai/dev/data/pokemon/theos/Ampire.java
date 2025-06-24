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
                new Stats(0,0,0,0,0,2), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Ampire are not welcome in major cities as they will hang from Transmission Towers at night often causing damage and large power outages."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(33).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_OVERWORLD).setAntiBiomes(Biome.IS_ARID, Biome.IS_SNOWY).canSeeSky().atNight()
                        .setSpawnPreset(SpawnPreset.VILLAGE).build(),
                List.of());
           setLangFileName("Ampire");

    }


}
