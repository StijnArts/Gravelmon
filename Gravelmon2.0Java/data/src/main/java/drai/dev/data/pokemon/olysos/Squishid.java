package drai.dev.data.pokemon.olysos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Squishid extends drai.dev.data.pokemon.Pokemon {
    public Squishid() {
        super("Squishid",
                Type.WATER,
                new Stats(40,
                        30,
                        40,
                        60,
                        60,
                        50),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                3, 23,
                new Stats(0,0,0,1,1,0), 200,
                0.5,
                70, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("Squishid's small size and white coloration help it to blend into the ocean floor, making it difficult to spot by predators. Its unique fins on its head enable it to swim quickly through the water and maneuver with ease. It's red-marked tentacles are often used to attract prey or ward off enemies. Squishid is known for its mischievous behavior and enjoys playing pranks on other Pokemon."),
                List.of(),
                List.of(),
                List.of(Label.OLYSOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Squishid");

    }


}
