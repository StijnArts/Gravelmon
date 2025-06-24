package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Yokorch extends drai.dev.data.pokemon.Pokemon {
    public Yokorch(Stats stats) {
        super("Yokorch",
                Type.FIRE, Type.GHOST,
                stats,
                List.of(Ability.FLARE_BOOST), Ability.FLARE_BOOST,
                16, 0,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("It is thought that the spirits of children who go missing at festivals led them to come to life when they were once just a simple paper lantern."),
                List.of(),
                List.of(),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(33).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_CHERRY_GROVE, Biome.IS_BAMBOO).atNight()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
        setCanFly(true);
           setLangFileName("Yokorch");

    }


}
