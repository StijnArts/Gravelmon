package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Mosstatic extends drai.dev.data.pokemon.Pokemon {
    public Mosstatic() {
        super("Mosstatic",
                Type.GRASS, Type.ELECTRIC,
                new Stats(80,
                        20,
                        20,
                        70,
                        222,
                        36),
                List.of(Ability.CHLOROPHYLL,Ability.STATIC,Ability.SIMPLE), Ability.SIMPLE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Crop Circle Psychic"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CROPCIRCLE,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Mosstatic");

    }


}
