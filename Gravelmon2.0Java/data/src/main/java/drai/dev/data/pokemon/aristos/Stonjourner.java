package drai.dev.data.pokemon.aristos;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Stonjourner extends drai.dev.data.pokemon.Pokemon {
    public Stonjourner() {
        super("Stonjourner",
                Type.ROCK,
                new Stats(100,
                        125,
                        135,
                        20,
                        20,
                        70),
                List.of(Ability.POWER_SPOT), Ability.POWER_SPOT,
                8, 165,
                new Stats(0,0,2,0,0,0), 0,
                0.502,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("It stands in grasslands, watching the sun's descent from zenith to horizon. This Pokemon has a talent for delivering dynamic kicks."),
                List.of(),
                List.of(),
                List.of(Label.ARISTOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Stonjourner");

    }


}
