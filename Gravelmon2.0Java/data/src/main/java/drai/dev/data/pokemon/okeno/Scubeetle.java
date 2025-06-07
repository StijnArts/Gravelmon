package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Scubeetle extends drai.dev.data.pokemon.Pokemon {
    public Scubeetle() {
        super("Scubeetle",
                Type.WATER, Type.BUG,
                new Stats(100,
                        80,
                        80,
                        70,
                        60,
                        80),
                List.of(Ability.SWIFT_SWIM,Ability.FILTER,Ability.WATER_BUBBLE), Ability.WATER_BUBBLE,
                8, 165,
                new Stats(2,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG,EggGroup.WATER_3),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.OKENO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Scubeetle");

    }


}
