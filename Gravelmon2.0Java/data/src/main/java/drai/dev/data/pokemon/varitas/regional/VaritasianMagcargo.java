package drai.dev.data.pokemon.varitas.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class VaritasianMagcargo extends drai.dev.data.pokemon.Pokemon {
    public VaritasianMagcargo(String name, Aspect aspect) {
        super(name, aspect, "VaritasianMagcargo",
                Type.STEEL,Type.ELECTRIC,
                new Stats(50,
                        75,
                        110,
                        80,
                        85,
                        30),
                List.of(Ability.LIGHTNING_ROD,Ability.MAGNET_PULL), Ability.STATIC,
                10, 0,
                new Stats(0,0,0,0,0,0), 75,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("It can transfer the mass of its strange fluid body to the spike on its back for shape shifting such as extending it or adding more spikes. It uses this large spike both for attacking and conducting electricity."),
                List.of(),
                List.of(),
                List.of(Label.VARITAS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
                        .setMinLevel(38).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_OVERWORLD).cantSeeSky().belowY(0)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Magcargo");

    }


}
