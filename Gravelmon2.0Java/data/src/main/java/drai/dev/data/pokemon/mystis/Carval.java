package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Carval extends drai.dev.data.pokemon.Pokemon {
    public Carval() {
        super("Carval",
                Type.GRASS, Type.STEEL,
                new Stats(90,
                        100,
                        100,
                        70,
                        60,
                        80),
                List.of(Ability.RIVALRY), Ability.DEFIANT,
                12, 2863,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It carves into rocks using its powerful horn. These carvings seem to be warnings and ways to communicate. It uses the end of its tail to file down rocks and remove the carvings. Carval fight among each other to sharpen their horns, leading to many carvings on its body, especially around the face."),
                List.of(),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(26).setPool(SpawnPool.RARE).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_MOUNTAIN).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Carval");

    }


}
