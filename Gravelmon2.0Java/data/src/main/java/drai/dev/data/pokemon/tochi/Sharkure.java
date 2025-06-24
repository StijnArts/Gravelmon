package drai.dev.data.pokemon.tochi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Sharkure extends drai.dev.data.pokemon.Pokemon {
    public Sharkure(Stats stats) {
        super("Sharkure",
                Type.FAIRY,Type.WATER,
                stats,
                List.of(Ability.HEALER,Ability.STRONG_JAW), Ability.NATURAL_CURE,
                22, 0,
                new Stats(0,0,0,0,0,0), 90,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("- Aqua Ring Water - Heal Pulse Psychic"),
                List.of(),
                List.of(),
                List.of(Label.TOCHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
                        .setMinLevel(38).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.SUBMERGED)
                        .setBiomes(Biome.IS_WARM_OCEAN).canSeeSky()
                        .setSpawnPreset(SpawnPreset.UNDERWATER, SpawnPreset.REEF).build(),
                List.of());
        setAquatic();
           setLangFileName("Sharkure");

    }


}
