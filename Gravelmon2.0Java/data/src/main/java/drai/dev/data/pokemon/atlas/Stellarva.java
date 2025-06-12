package drai.dev.data.pokemon.atlas;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Stellarva extends drai.dev.data.pokemon.Pokemon {
    public Stellarva() {
        super("Stellarva",
                Type.BUG, Type.PSYCHIC,
                new Stats(35,
                        32,
                        45,
                        48,
                        60,
                        40),
                List.of(Ability.COMPOUND_EYES,Ability.NOCTURNAL,Ability.WONDER_SKIN), Ability.WONDER_SKIN,
                3, 165,
                new Stats(0,0,0,0,1,0), 240,
                0.5,
                52, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Stellarva light up the night like a starry sky. They use their glowing lights to communicate with each other and create beautiful spectacles."),
                List.of(new EvolutionEntry("crescoon", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"10")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.ABSORB,7),
                        new MoveLearnSetEntry(Move.BUG_BITE,15),
                        new MoveLearnSetEntry(Move.TAIL_GLOW,25),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,"tm")                        ),
                List.of(Label.ATLAS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_MAGICAL, Biome.IS_DECIDUOUS_FOREST)
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Stellarva");

    }


}
