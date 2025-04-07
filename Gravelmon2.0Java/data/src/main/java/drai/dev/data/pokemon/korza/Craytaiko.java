package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Craytaiko extends drai.dev.data.pokemon.Pokemon {
    public Craytaiko() {
        super("Craytaiko",
                Type.WATER,Type.FIRE,
                new Stats(55,
                        80,
                        63,
                        74,
                        57,
                        51),
                List.of(Ability.STORM_DRAIN,Ability.HYPER_CUTTER), Ability.COLOR_CHANGE,
                7, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.WATER_3),
                List.of("Craytaiko creates egg-like bubbles, considered a delicacy, and stores them on its back. The body's bright red coloration is a side effect of its ability to boil water with its claws."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.AQUA_JET,"tm")                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Craytaiko");

    }


}
