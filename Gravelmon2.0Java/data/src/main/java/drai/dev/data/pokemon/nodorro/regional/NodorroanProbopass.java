package drai.dev.data.pokemon.nodorro.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class NodorroanProbopass extends drai.dev.data.pokemon.Pokemon {
    public NodorroanProbopass(String name, Aspect aspect) {
        super(name, aspect, "NodorroanProbopass",
                Type.ROCK,Type.GRASS,
                new Stats(75,
                        70,
                        135,
                        90,
                        130,
                        25),
                List.of(Ability.HARVEST,Ability.STURDY), Ability.CHLOROPHYLL,
                0, 4060,
                new Stats(1,0,0,0,2,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("- Stone EdgeSTAB Rock - Stealth Rock Rock - Growth Normal"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWTH,1),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,1),
                        new MoveLearnSetEntry(Move.STONE_EDGE,1)),
                List.of(Label.NODORRO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Probopass");

    }


}
