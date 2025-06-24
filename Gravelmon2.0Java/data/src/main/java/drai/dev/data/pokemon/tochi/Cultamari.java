package drai.dev.data.pokemon.tochi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Cultamari extends drai.dev.data.pokemon.Pokemon {
    public Cultamari(Stats stats) {
        super("Cultamari",
                Type.WATER,Type.PSYCHIC,
                stats,
                List.of(Ability.SUCTION_CUPS), Ability.SUCTION_CUPS,
                16, 0,
                new Stats(0,0,0,0,0,0), 50,
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
                        .setMinLevel(35).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.SEAFLOOR)
                        .setBiomes(Biome.IS_COLD_OCEAN).canSeeSky().atNight()
                        .setSpawnPreset(SpawnPreset.UNDERWATER).build(),
                List.of());
        setCanBreathUnderwater(true);
           setLangFileName("Cultamari");

    }


}
