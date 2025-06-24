package drai.dev.data.pokemon.beginnings;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Jueshika extends drai.dev.data.pokemon.Pokemon {
    public Jueshika() {
        super("Jueshika",
                Type.ELECTRIC,
                new Stats(48,
                        43,
                        40,
                        60,
                        46,
                        80),
                List.of(Ability.SAP_SIPPER,Ability.STATIC), Ability.GOOEY,
                5, 0,
                new Stats(0,0,0,0,0,0), 160,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Evolves into Juekizumi by using Maple Syrup on 5 times"),
                List.of(new EvolutionEntry("juekizumi", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"minecraft:honeycomb")),
                List.of(),
                List.of(Label.OTTORA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(14).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_BIRCH)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Jueshika");

    }


}
