package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Quadrarity extends drai.dev.data.pokemon.Pokemon {
    public Quadrarity() {
        super("Quadrarity",
                Type.STEEL, Type.ELECTRIC,
                new Stats(80,
                        30,
                        48,
                        150,
                        42,
                        150),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                12, 0,
                new Stats(0,0,0,0,0,0), 30,
                0.5,
                225, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The consequence of four Dioduo combining is Quadrarity. Due to the quick spinning of the electric, it blasts out in all directions."),
                List.of(),
                List.of(),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .setMinLevel(39).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_DEEP_DARK).cantSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
        setCanFly(true);
           setLangFileName("Quadrarity");

    }


}
