package drai.dev.data.pokemon.tochi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Shellice extends drai.dev.data.pokemon.Pokemon {
    public Shellice(Stats stats) {
        super("Shellice",
                Type.POISON,
                stats,
                List.of(Ability.POISON_POINT), Ability.SHELL_ARMOR,
                15, 0,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.TOCHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
                        .setMinLevel(35).setPool(SpawnPool.RARE).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.SEAFLOOR)
                        .setBiomes(Biome.IS_COLD_OCEAN).canSeeSky()
                        .setSpawnPreset(SpawnPreset.UNDERWATER).build(),
                List.of());
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Shellice");

    }


}
