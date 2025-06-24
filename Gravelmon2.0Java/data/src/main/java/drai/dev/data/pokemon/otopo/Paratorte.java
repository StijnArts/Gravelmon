package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Paratorte extends drai.dev.data.pokemon.Pokemon {
    public Paratorte(Stats stats) {
        super("Paratorte",
                Type.ROCK, Type.FLYING,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                13, 0,
                new Stats(0,0,0,0,0,0), 110,
                0.5,
                0, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("Paratorte is a mythical monster that may be spotted soaring over Otopo. When a Paratorte withdraws its wings in mid-flight and bombards the earth below, catastrophic head injuries have occurred."),
                List.of(),
                List.of(),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(23).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.RARE)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SKY).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Paratorte");

    }


}
