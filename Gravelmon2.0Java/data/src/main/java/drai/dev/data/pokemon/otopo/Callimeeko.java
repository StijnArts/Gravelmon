package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Callimeeko extends drai.dev.data.pokemon.Pokemon {
    public Callimeeko() {
        super("Callimeeko",
                Type.DARK,
                new Stats(60,
                        30,
                        55,
                        60,
                        75,
                        120),
                List.of(Ability.RUN_AWAY), Ability.EMERGENCY_EXIT,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Callimeeko are extremely elusive and have only been seen a few times. It is an expert at blending into the shadows, with just its eyes revealing its whereabouts."),
                List.of(),
                List.of(),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Callimeeko");

    }


}
