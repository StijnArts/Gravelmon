package drai.dev.data.pokemon.norheim;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Escaruption extends drai.dev.data.pokemon.Pokemon {
    public Escaruption(Stats stats) {
        super("Escaruption",
                Type.FIRE, Type.ROCK,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                18, 0,
                new Stats(0,0,0,0,0,0), 30,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.EARTH_POWER,1),
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.ROCK_THROW,1),
                        new MoveLearnSetEntry(Move.SMOG,1),
                        new MoveLearnSetEntry(Move.YAWN,1),
                        new MoveLearnSetEntry(Move.HARDEN,13),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,20),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,22),
                        new MoveLearnSetEntry(Move.INCINERATE,27),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,29),
                        new MoveLearnSetEntry(Move.LAVA_PLUME,34),
                        new MoveLearnSetEntry(Move.AMNESIA,36),
                        new MoveLearnSetEntry(Move.BODY_SLAM,43),
                        new MoveLearnSetEntry(Move.RECOVER,47),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,54)
                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(53)
    .setWeight(SpawnWeight.ULTRA_RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SKY, Biome.IS_MOUNTAIN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Escaruption");
        addAdditionalEvolution("magcargo", new EvolutionEntry("escaruption", EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"54"))));

    }


}
