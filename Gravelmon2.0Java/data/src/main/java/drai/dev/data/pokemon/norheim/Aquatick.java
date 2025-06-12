package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Aquatick extends drai.dev.data.pokemon.Pokemon {
    public Aquatick() {
        super("Aquatick",
                Type.BUG, Type.WATER,
                new Stats(70,
                        70,
                        50,
                        30,
                        35,
                        50),
                List.of(Ability.WATER_ABSORB), Ability.WATER_BUBBLE,
                2, 165,
                new Stats(0,0,0,0,0,0), 220,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("clagcoon", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"17")))),
                List.of(
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.LEER,6),
                        new MoveLearnSetEntry(Move.BITE,12),
                        new MoveLearnSetEntry(Move.STICKY_WEB,22),
                        new MoveLearnSetEntry(Move.DIVE,32),
                        new MoveLearnSetEntry(Move.INFESTATION,36),
                        new MoveLearnSetEntry(Move.LIQUIDATION,40),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,46),
                        new MoveLearnSetEntry(Move.CRUNCH,52),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,60),
                        new MoveLearnSetEntry(Move.BUBBLE,"tm"),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_RING,"tm"),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,"tm")                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(1)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_GRASSLAND)
    .setAntiBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NEAR_WATER)
    .build(), List.of());
	
           setLangFileName("Aquatick");

    }


}
