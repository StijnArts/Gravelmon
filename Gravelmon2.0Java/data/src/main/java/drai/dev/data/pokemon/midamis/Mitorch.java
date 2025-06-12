package drai.dev.data.pokemon.midamis;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Mitorch extends drai.dev.data.pokemon.Pokemon {
    public Mitorch() {
        super("Mitorch",
                Type.FIRE, Type.BUG,
                new Stats(40,
                        45,
                        40,
                        65,
                        50,
                        45),
                List.of(Ability.SWARM), Ability.CUTE_CHARM,
                2, 165,
                new Stats(0,0,0,0,0,0), 250,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("taratorcha", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"22")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.SCARY_FACE,5),
                        new MoveLearnSetEntry(Move.EMBER,8),
                        new MoveLearnSetEntry(Move.CONSTRICT,12)                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Mitorch");

    }


}
