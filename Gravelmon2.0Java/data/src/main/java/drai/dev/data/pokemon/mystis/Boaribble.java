package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Boaribble extends drai.dev.data.pokemon.Pokemon {
    public Boaribble() {
        super("Boaribble",
                Type.DARK, Type.ROCK,
                new Stats(100,
                        140,
                        100,
                        70,
                        50,
                        40),
                List.of(Ability.GLUTTONY), Ability.ANGER_POINT,
                14, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                175, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The darkness of its surroundings caused it to evolve, its crystals growing ever larger. As its inner malice grows, it will crumble under it's own weight and become new Pebblets."),
                List.of(),
                List.of(                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(28).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_OVERWORLD).cantSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Boaribble");

    }


}
