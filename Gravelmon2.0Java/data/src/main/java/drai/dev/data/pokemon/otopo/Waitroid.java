package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Waitroid extends drai.dev.data.pokemon.Pokemon {
    public Waitroid() {
        super("Waitroid",
                Type.STEEL, Type.ELECTRIC,
                new Stats(60,
                        40,
                        90,
                        120,
                        90,
                        65),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                18, 50,
                new Stats(0,0,0,2,0,0), 30,
                0.5,
                230, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("After several years with its trainer, Robutler evolves into Waitroid. Waitroid is capable of combat as well as chores, and can quickly overwhelm other Pokemon."),
                List.of(),
                List.of(),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Waitroid");

    }


}
