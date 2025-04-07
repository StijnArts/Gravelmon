package drai.dev.data.pokemon.pastelisland;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Carburn extends drai.dev.data.pokemon.Pokemon {
    public Carburn() {
        super("Carburn",
                Type.FIRE, Type.ROCK,
                new Stats(60,
                        45,
                        77,
                        35,
                        30,
                        33),
                List.of(Ability.SHELL_ARMOR,Ability.BLAZE), Ability.MAGMA_ARMOR,
                8, 200,
                new Stats(0,0,1,0,0,0), 130,
                0.5,
                60, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Carburn");

    }


}
