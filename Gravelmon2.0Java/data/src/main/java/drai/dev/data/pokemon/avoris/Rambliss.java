package drai.dev.data.pokemon.avoris;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Rambliss extends drai.dev.data.pokemon.Pokemon {
    public Rambliss() {
        super("Rambliss",
                Type.GRASS,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.OVERGROW), Ability.NATURAL_CURE,
                9, 300,
                new Stats(0,0,0,0,0,0), 0,
                0.875,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Rambliss emanates an aroma that purifies the air and their surroundings. They release spores when in a blissful state, spreading happy vibes to those nearby. They like to keep their habitats clean and tidy. The flowers they grow produce a sweet aroma that calms people, which is why these Pokémon are popular in yoga and meditation. It is said to also purify and ward off any evil energy."),
                List.of(),
                List.of(),
                List.of(Label.AVORIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Rambliss");

    }


}
