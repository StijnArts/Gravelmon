package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Roacheap extends drai.dev.data.pokemon.Pokemon {
    public Roacheap() {
        super("Roacheap",
                Type.BUG, Type.DARK,
                new Stats(22,
                        78,
                        22,
                        22,
                        43,
                        80),
                List.of(Ability.UNDERLING,Ability.PICKUP,Ability.SWARMINGSURGE), Ability.SWARMINGSURGE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
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
           setLangFileName("Roacheap");

    }


}
