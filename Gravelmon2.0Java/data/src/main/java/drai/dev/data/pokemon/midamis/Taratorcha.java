package drai.dev.data.pokemon.midamis;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Taratorcha extends drai.dev.data.pokemon.Pokemon {
    public Taratorcha() {
        super("Taratorcha",
                Type.FIRE, Type.BUG,
                new Stats(80,
                        75,
                        65,
                        95,
                        70,
                        60),
                List.of(Ability.SWARM), Ability.INFILTRATOR,
                7, 165,
                new Stats(0,0,0,0,0,0), 130,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.SCARY_FACE,5),
                        new MoveLearnSetEntry(Move.EMBER,8),
                        new MoveLearnSetEntry(Move.CONSTRICT,12)                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(22)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Taratorcha");

    }


}
