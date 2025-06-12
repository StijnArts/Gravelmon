package drai.dev.data.pokemon.oceane;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Jawsome extends drai.dev.data.pokemon.Pokemon {
    public Jawsome() {
        super("Jawsome",
                Type.WATER,
                new Stats(56,
                        92,
                        70,
                        78,
                        92,
                        57),
                List.of(Ability.STRONG_JAW), Ability.INTIMIDATE,
                7, 165,
                new Stats(0,1,0,0,1,0), 90,
                0.5,
                156, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_1),
                List.of("Its strength lies in its jaws. It can retract its head inside its body to bite with its outer jaws."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WATERFALL,1),
                        new MoveLearnSetEntry(Move.CRUNCH,1),
                        new MoveLearnSetEntry(Move.ICE_FANG,1),
                        new MoveLearnSetEntry(Move.FIRE_FANG,1),
                        new MoveLearnSetEntry(Move.SCUTTLEHOP,1),
                        new MoveLearnSetEntry(Move.BUBBLE,5),
                        new MoveLearnSetEntry(Move.ABSORB,7),
                        new MoveLearnSetEntry(Move.CRUNCH,37)
                        ),
                List.of(Label.GOETIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(14)
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
