package drai.dev.data.pokemon.varitas.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class VaritasianSlugma extends drai.dev.data.pokemon.Pokemon {
    public VaritasianSlugma(String name, Aspect aspect) {
        super(name, aspect, "VaritasianSlugma",
                Type.STEEL,Type.ELECTRIC,
                new Stats(30,
                        50,
                        40,
                        70,
                        40,
                        20),
                List.of(Ability.LIGHTNING_ROD,Ability.MAGNET_PULL), Ability.STATIC,
                7, 0,
                new Stats(0,0,0,0,0,0), 190,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("An increase of conductive minerals in its lava caused it to eventually take on this strange new form. As electricity runs through it, small spikes jut out of its surface following the electricity's paths"),
                List.of(new EvolutionEntry("varitasianmagcargo", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"38")))),
                List.of(),
                List.of(Label.VARITAS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(12).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_OVERWORLD).cantSeeSky().belowY(0)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Slugma");

    }


}
