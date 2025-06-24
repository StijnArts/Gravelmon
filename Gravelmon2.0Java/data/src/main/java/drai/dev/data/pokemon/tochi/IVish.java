package drai.dev.data.pokemon.tochi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class IVish extends drai.dev.data.pokemon.Pokemon {
    public IVish(Stats stats) {
        super("IVish",
                Type.POISON,Type.WATER,
                stats,
                List.of(Ability.POISON_POINT), Ability.POISON_POINT,
                11, 0,
                new Stats(0,0,0,0,0,0), 70,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("- Splash Normal - Poison StingSTAB Poison - Poison JabSTAB Poison - Poison TailSTAB Poison - Aqua TailSTAB Water"),
                List.of(),
                List.of(),
                List.of(Label.TOCHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
                        .setMinLevel(19).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.SUBMERGED)
                        .setBiomes(Biome.IS_DEEP_OCEAN).canSeeSky().belowY(30)
                        .setSpawnPreset(SpawnPreset.UNDERWATER).build(),
                List.of());
        setAquatic();
           setLangFileName("I-Vish");

    }


}
