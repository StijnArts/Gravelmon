package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Shroolie extends drai.dev.data.pokemon.Pokemon {
    public Shroolie() {
        super("Shroolie",
                Type.POISON, Type.FAIRY,
                new Stats(42,
                        30,
                        45,
                        56,
                        53,
                        39),
                List.of(Ability.SHIELD_DUST), Ability.MOODY,
                3, 15,
                new Stats(0,0,0,1,0,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The spores that Shroolie carelessly release from their bubbles can cause different effects, depending on how the Shroolie is feeling at the time."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Shroolie");

    }


}
