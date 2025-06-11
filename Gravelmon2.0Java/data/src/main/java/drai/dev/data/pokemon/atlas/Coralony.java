package drai.dev.data.pokemon.atlas;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Coralony extends drai.dev.data.pokemon.Pokemon {
    public Coralony() {
        super("Coralony",
                Type.ROCK,
                new Stats(55,
                        58,
                        77,
                        60,
                        45,
                        23),
                List.of(Ability.REGENERATOR,Ability.STURDY,Ability.STORM_DRAIN), Ability.STORM_DRAIN,
                7, 165,
                new Stats(0,0,1,0,0,0), 200,
                0.0,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.WATER_3),
                List.of("The three different species of Coralony are constantly fighting for dominance over the group, but there can only ever be one leader. They make up the greatest barrier reefs in the world."),
                List.of(new EvolutionEntry("Barreef", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.BIOME,Biome.IS_WARM_OCEAN.getId() + ":" + Biome.IS_WARM_OCEAN.getName())))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN,1)                        ),
                List.of(Label.ATLAS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SEAFLOOR)
    .setBiomes(Biome.IS_WARM_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.REEF)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
