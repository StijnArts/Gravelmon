package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Fawnix extends drai.dev.data.pokemon.Pokemon {
    public Fawnix() {
        super("Fawnix",
                Type.GRASS,
                new Stats(45,
                        45,
                        45,
                        65,
                        65,
                        65),
                List.of(Ability.LEAF_GUARD), Ability.WONDER_SKIN,
                8, 40,
                new Stats(0,0,0,1,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It's said that Fawnix can create plant-life in the most barren of areas. They're quiet uncommon to come across in the wild so not many trainers have been able to capture them."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Fawnix");

    }


}
