package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Lemighty extends drai.dev.data.pokemon.Pokemon {
    public Lemighty(Stats stats) {
        super("Lemighty",
                Type.NORMAL, Type.FIGHTING,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 0,
                new Stats(0,0,0,0,0,0), 120,
                0.75,
                0, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.MONSTER),
                List.of("Lemighty, despite its little stature, possesses incredible physical strength. A Lemighty will guard a herd of Arveeny to the death."),
                List.of(),
                List.of(),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(30).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_COAST).setAntiBiomes(Biome.IS_BEACH).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Lemighty");

    }


}
