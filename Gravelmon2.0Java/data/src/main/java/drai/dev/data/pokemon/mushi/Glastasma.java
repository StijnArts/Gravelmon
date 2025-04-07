package drai.dev.data.pokemon.mushi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Glastasma extends drai.dev.data.pokemon.Pokemon {
    public Glastasma() {
        super("Glastasma",
                Type.GHOST, Type.ICE,
                new Stats(54,
                        45,
                        75,
                        103,
                        137,
                        36),
                List.of(Ability.CURSED_BODY,Ability.INTIMIDATE), Ability.SNOW_WARNING,
                15, 0,
                new Stats(0,0,0,0,2,0), 75,
                0.5,
                159, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MUSHI),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(33).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SNOWY_FOREST).atNight()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Glastasma");

    }


}
