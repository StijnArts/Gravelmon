package drai.dev.data.pokemon.oceane;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Jawee extends drai.dev.data.pokemon.Pokemon {
    public Jawee() {
        super("Jawee",
                Type.WATER,
                new Stats(30,
                        63,
                        55,
                        58,
                        74,
                        50),
                List.of(Ability.STRONG_JAW), Ability.INTIMIDATE,
                3, 165,
                new Stats(0,0,0,0,1,0), 255,
                0.5,
                66, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_1),
                List.of("Its jaws are surprisingly powerful for a creature so small and squishy. Popular with beginner trainers who believe it to be in the best percentage."),
                List.of(new EvolutionEntry("jawsome", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"14")))),
                List.of(
                        new MoveLearnSetEntry(Move.SCUTTLEHOP,1),
                        new MoveLearnSetEntry(Move.BUBBLE,5),
                        new MoveLearnSetEntry(Move.ABSORB,7),
                        new MoveLearnSetEntry(Move.CRUNCH,37)                        ),
                List.of(Label.GOETIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(1)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_OCEAN)
    .setAntiBiomes(Biome.IS_COLD_OCEAN, Biome.IS_WARM_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
