package drai.dev.data.pokemon.qamor;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Seasnug extends drai.dev.data.pokemon.Pokemon {
    public Seasnug() {
        super("Seasnug",
                Type.PSYCHIC, Type.WATER,
                new Stats(74,
                        34,
                        48,
                        81,
                        48,
                        40),
                List.of(Ability.FOREWARN), Ability.GALE_WINGS,
                6, 165,
                new Stats(0,0,0,1,0,0), 170,
                0.5,
                70, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("When a large amount of these Pokemon move out of an area abruptly, it is said to be a sign of a disaster that is soon to come."),
                List.of(new EvolutionEntry("clairbuoyant", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"29")))),
                List.of(
                        new MoveLearnSetEntry(Move.WATER_SPORT,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,5),
                        new MoveLearnSetEntry(Move.LIFE_DEW,8),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,10),
                        new MoveLearnSetEntry(Move.WING_ATTACK,13),
                        new MoveLearnSetEntry(Move.CONFUSION,18),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,22),
                        new MoveLearnSetEntry(Move.AQUA_RING,26),
                        new MoveLearnSetEntry(Move.PSYCHIC,30),
                        new MoveLearnSetEntry(Move.CAPTIVATE,37),
                        new MoveLearnSetEntry(Move.HURRICANE,44),
                        new MoveLearnSetEntry(Move.STEEL_WING,"tm"),
                        new MoveLearnSetEntry(Move.DEFOG,"tm")                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(4)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_WARM_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
