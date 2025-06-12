package drai.dev.data.pokemon.amavi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Carndy extends drai.dev.data.pokemon.Pokemon {
    public Carndy() {
        super("Carndy",
                Type.FIRE,
                new Stats(48,
                        55,
                        40,
                        15,
                        40,
                        70),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                6, 0,
                new Stats(0,0,0,0,0,0), 190,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("roarn", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"28")))),
                List.of(
                        new MoveLearnSetEntry(Move.BITE,1),
                        new MoveLearnSetEntry(Move.ROLLOUT,8),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,15),
                        new MoveLearnSetEntry(Move.EMBER,22),
                        new MoveLearnSetEntry(Move.YAWN,29),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,36),
                        new MoveLearnSetEntry(Move.INCINERATE,43),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,50),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,57),
                        new MoveLearnSetEntry(Move.EXPLOSION,64)
                ),
                List.of(Label.AMAVI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_NETHER)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Carndy");

    }


}
