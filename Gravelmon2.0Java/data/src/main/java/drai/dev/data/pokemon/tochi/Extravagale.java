package drai.dev.data.pokemon.tochi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Extravagale extends drai.dev.data.pokemon.Pokemon {
    public Extravagale() {
        super("Extravagale",
                Type.NORMAL,Type.FLYING,
                new Stats(100,
                        100,
                        80,
                        70,
                        70,
                        60),
                List.of(Ability.KEEN_EYE,Ability.EARLY_BIRD), Ability.DAZZLING,
                16, 0,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.TOCHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
                        .setMinLevel(31).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_DECIDUOUS_FOREST).canSeeSky()
                        .setSpawnPreset(SpawnPreset.VILLAGE).build(),
                List.of());
           setLangFileName("Extravagale");

    }


}
