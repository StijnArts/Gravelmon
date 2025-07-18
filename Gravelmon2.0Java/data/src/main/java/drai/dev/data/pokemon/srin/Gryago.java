package drai.dev.data.pokemon.srin;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Gryago extends drai.dev.data.pokemon.Pokemon {
    public Gryago(Stats stats) {
        super("Gryago",
                Type.ICE,Type.GROUND,
                stats,
                List.of(Ability.POISON_POINT,Ability.SNOW_WARNING), Ability.SHEER_FORCE,
                26, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("A fearsome endurer from multiple Ice Ages. Gūryago carries toxins from pre-historic metals and carbon. These toxins can easily break down bone that in return builds up its exo-skeleton."),
                List.of(),
                List.of(),
                List.of(Label.SORIN),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .setMinLevel(42).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SNOWY_FOREST).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Gūryago");

    }


}
