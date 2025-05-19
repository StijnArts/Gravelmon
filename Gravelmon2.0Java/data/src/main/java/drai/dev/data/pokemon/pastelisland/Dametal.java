package drai.dev.data.pokemon.pastelisland;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Dametal extends drai.dev.data.pokemon.Pokemon {
    public Dametal() {
        super("Dametal",
                Type.STEEL,
                new Stats(55,
                        50,
                        60,
                        45,
                        35,
                        45),
                List.of(Ability.GUTS,Ability.PRESSURE), Ability.HUGE_POWER,
                19, 170,
                new Stats(0,0,0,0,0,0), 0,
                0.6,
                58, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.MINERAL),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Dametal");

    }


}
