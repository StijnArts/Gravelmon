package drai.dev.data.pokemon.mushi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Kamabukee extends drai.dev.data.pokemon.Pokemon {
    public Kamabukee() {
        super("Kamabukee",
                Type.GHOST, Type.FIGHTING,
                new Stats(69,
                        118,
                        95,
                        75,
                        93,
                        50),
                List.of(Ability.HYPER_CUTTER,Ability.FRISK), Ability.TECHNICIAN,
                15, 0,
                new Stats(0,2,0,0,0,0), 45,
                0.5,
                159, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MUSHI),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(35).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_CHERRY_GROVE).atNight()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Kamabukee");

    }


}
