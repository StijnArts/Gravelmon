package drai.dev.data.pokemon.amavi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Gallowing extends drai.dev.data.pokemon.Pokemon {
    public Gallowing() {
        super("Gallowing",
                Type.DARK, Type.FLYING,
                new Stats(50,
                        75,
                        65,
                        45,
                        55,
                        70),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                6, 0,
                new Stats(0,0,0,0,0,0), 160,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("sirender", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.PROPERTY,"gender=female"))),
                        new EvolutionEntry("harborosa", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.PROPERTY,"gender=male")))),
                List.of(      new MoveLearnSetEntry(Move.WING_ATTACK,1),
                        new MoveLearnSetEntry(Move.PECK,3),
                        new MoveLearnSetEntry(Move.SPIKE_CANNON,5),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,8),
                        new MoveLearnSetEntry(Move.ASSURANCE,10),
                        new MoveLearnSetEntry(Move.SCREECH,14),
                        new MoveLearnSetEntry(Move.SPIKY_SHIELD,20),
                        new MoveLearnSetEntry(Move.PLUCK,28),
                        new MoveLearnSetEntry(Move.ROOST,34),
                        new MoveLearnSetEntry(Move.BRAMBLEUP,45),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,47),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,50),
                        new MoveLearnSetEntry(Move.AIR_SLASH,55),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,60),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,67)                  ),
                List.of(Label.AMAVI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.SHIP_WRECK)
    .build(), List.of());
	
        setCanFly(true);

    }


}
