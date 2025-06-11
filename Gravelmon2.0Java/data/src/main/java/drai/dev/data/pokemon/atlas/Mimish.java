package drai.dev.data.pokemon.atlas;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Mimish extends drai.dev.data.pokemon.Pokemon {
    public Mimish() {
        super("Mimish",
                Type.WATER,
                new Stats(60,
                        20,
                        15,
                        25,
                        15,
                        65),
                List.of(Ability.RATTLED,Ability.SWIFT_SWIM,Ability.IMMUNITY), Ability.IMMUNITY,
                2, 165,
                new Stats(0,0,0,0,0,1), 150,
                0.5,
                40, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_2,EggGroup.DRAGON),
                List.of(""),
                List.of(new EvolutionEntry("eelord", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.SPLASH,1),
                        new MoveLearnSetEntry(Move.ME_FIRST,8),
                        new MoveLearnSetEntry(Move.MIRROR_MOVE,16),
                        new MoveLearnSetEntry(Move.COPYCAT,24),
                        new MoveLearnSetEntry(Move.MIMIC,32)                        ),
                List.of(Label.ATLAS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(1)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_WARM_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.REEF)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
