package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Sweepod extends drai.dev.data.pokemon.Pokemon {
    public Sweepod() {
        super("Sweepod",
                Type.GRASS,
                new Stats(20,
                        40,
                        60,
                        35,
                        30,
                        15),
                List.of(Ability.SWEET_VEIL), Ability.IRON_BARBS,
                4, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                40, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Sweepod are preyed on heavily by bug Pokémon. They secrete a thick, sweet sap that hardens into the shell around its body. As it grows older, it grows many layers."),
                List.of(),
                List.of(),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Sweepod");

    }


}
