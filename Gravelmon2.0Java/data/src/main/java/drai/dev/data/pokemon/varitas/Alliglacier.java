package drai.dev.data.pokemon.varitas;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Alliglacier extends drai.dev.data.pokemon.Pokemon {
    public Alliglacier(Stats stats) {
        super("Alliglacier",
                Type.ICE, Type.DARK,
                stats,
                List.of(Ability.STRONG_JAW), Ability.SNOW_CLOAK,
                16, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.VARITAS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .setMinLevel(48).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SNOWY).setAntiBiomes(Biome.IS_FOREST, Biome.IS_MOUNTAIN).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Alliglacier");

    }


}
