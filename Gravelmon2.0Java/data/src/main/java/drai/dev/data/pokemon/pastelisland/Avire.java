package drai.dev.data.pokemon.pastelisland;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Avire extends drai.dev.data.pokemon.Pokemon {
    public Avire() {
        super("Avire",
                Type.FIRE,
                new Stats(50,
                        70,
                        40,
                        35,
                        45,
                        60),
                List.of(Ability.BLAZE), Ability.DAZZLING,
                18, 32,
                new Stats(0,1,0,0,0,0), 45,
                0.875,
                60, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.FLYING),
                List.of("Avire can be very air-headed at times, and may sometimes walk into trees or bushes on accident."),
                List.of(),
                List.of(),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Avire");

    }


}
