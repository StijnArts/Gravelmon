package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Pyrotile extends drai.dev.data.pokemon.Pokemon {
    public Pyrotile() {
        super("Pyrotile",
                Type.FIRE, Type.ROCK,
                new Stats(36,
                        55,
                        50,
                        71,
                        31,
                        57),
                List.of(Ability.ROUGH_SKIN,Ability.DRY_SKIN,Ability.IGNITION), Ability.IGNITION,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.DRAGON),
                List.of("- Headbutt Normal - Pin Missile Bug - EmberSTAB Fire - Spike Cannon Normal - Spikes Ground - Heat WaveSTAB Fire - Head SmashSTAB Rock - Autotomize Steel - Flame BurstSTAB Fire - Jab Normal"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.JAB,1)                        ),
                List.of(Label.OKENO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Pyrotile");

    }


}
