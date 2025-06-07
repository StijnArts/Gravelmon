package drai.dev.data.pokemon.mushi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Sneacroach extends drai.dev.data.pokemon.Pokemon {
    public Sneacroach() {
        super("Sneacroach",
                Type.DARK, Type.NORMAL,
                new Stats(35,
                        65,
                        65,
                        45,
                        50,
                        85),
                List.of(Ability.RATTLED,Ability.FRISK), Ability.PRANKSTER,
                6, 0,
                new Stats(0,0,0,0,0,1), 120,
                0.5,
                144, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of(""),
                List.of(new EvolutionEntry("Stalroach", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:dusk_stone")),
                List.of(),
                List.of(Label.MUSHI),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_OVERWORLD).atNight()
                        .setSpawnPreset(SpawnPreset.VILLAGE).build(),
                List.of());
           setLangFileName("Sneacroach");

    }


}
