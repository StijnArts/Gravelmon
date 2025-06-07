package drai.dev.data.pokemon.avoris;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class AvorianChemecko extends drai.dev.data.pokemon.Pokemon {
    public AvorianChemecko() {
        super("Chemecko",
                Type.POISON, Type.DARK,
                new Stats(34,
                        54,
                        52,
                        69,
                        41,
                        80),
                List.of(Ability.RATTLED,Ability.AFTERMATH,Ability.CORROSION), Ability.CORROSION,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It creates a mix of poisonous chemicals in its tail. When in fear, they drop behind the tail which then explodes, releasing hazardous gases hoping to scare off or harm any threats."),
                List.of(),
                List.of(),
                List.of(Label.AVORIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Chemecko");

    }


}
