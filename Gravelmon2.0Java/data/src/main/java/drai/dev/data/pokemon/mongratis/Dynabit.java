package drai.dev.data.pokemon.mongratis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Dynabit extends drai.dev.data.pokemon.Pokemon {
    public Dynabit() {
        super("Dynabit",
                Type.ELECTRIC,
                new Stats(85,
                        51,
                        34,
                        68,
                        85,
                        117),
                List.of(Ability.OWN_TEMPO,Ability.QUICK_FEET), Ability.MOTOR_DRIVE,
                6, 95,
                new Stats(0,0,0,0,0,2), 90,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Both its legs can spin independently from its body. It loves running up hills and rolling down them."),
                List.of(),
                List.of(),
                List.of(Label.MONGRATIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TEMPERATE).isThundering()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Dynabit");

    }


}
