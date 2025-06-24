package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Glacermine extends drai.dev.data.pokemon.Pokemon {
    public Glacermine(Stats stats) {
        super("Glacermine",
                Type.ICE, Type.FAIRY,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                16, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("It employs its tail in a variety of ways. It utilises it as a scarf to stay warm in chilly places, but it may also be used to entangle opponents."),
                List.of(),
                List.of(),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(33).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SNOWY_FOREST).duringDaytime()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Glacermine");

    }


}
