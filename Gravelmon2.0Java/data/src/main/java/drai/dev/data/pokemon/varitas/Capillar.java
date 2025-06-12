package drai.dev.data.pokemon.varitas;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Capillar extends drai.dev.data.pokemon.Pokemon {
    public Capillar() {
        super("Capillar",
                Type.BUG,
                new Stats(50,
                        20,
                        40,
                        35,
                        50,
                        25),
                List.of(Ability.SWARM), Ability.SWARM,
                3, 165,
                new Stats(0,0,0,0,0,0), 220,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Despite their small size, Capillar have a very tough attitude and will rear up and puff out their antenna when threatened. Ancient civilizations once held festivals to honor their bravery and ornate bodies."),
                List.of(new EvolutionEntry("beacoon", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"10")))),
                List.of(
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,1),
                        new MoveLearnSetEntry(Move.HEADBUTT,9)                        ),
                List.of(Label.VARITAS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(1)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BAMBOO)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Capillar");

    }


}
