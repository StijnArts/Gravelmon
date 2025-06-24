package drai.dev.data.pokemon.pastelisland;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Damaleo extends drai.dev.data.pokemon.Pokemon {
    public Damaleo() {
        super("Damaleo",
                Type.STEEL,
                new Stats(84,
                        95,
                        110,
                        65,
                        65,
                        80),
                List.of(Ability.GUTS,Ability.PRESSURE), Ability.HUGE_POWER,
                20, 2731,
                new Stats(0,0,0,0,0,0), 70,
                0.6,
                175, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.MINERAL),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(35).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_MOUNTAIN).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Damaleo");

    }


}
