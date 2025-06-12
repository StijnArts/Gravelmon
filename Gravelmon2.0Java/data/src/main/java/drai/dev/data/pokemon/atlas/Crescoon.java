package drai.dev.data.pokemon.atlas;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Crescoon extends drai.dev.data.pokemon.Pokemon {
    public Crescoon() {
        super("Crescoon",
                Type.BUG, Type.PSYCHIC,
                new Stats(45,
                        35,
                        83,
                        57,
                        90,
                        30),
                List.of(Ability.SHIELD_DUST,Ability.NOCTURNAL,Ability.WONDER_SKIN), Ability.WONDER_SKIN,
                6, 165,
                new Stats(0,0,0,0,2,0), 120,
                0.5,
                123, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Crescoon recede high up in the canopy to avoid being seen. At night they can be seen cradling back and forth and glowing softly. The brighter their light, the closer to evolution they are."),
                List.of(new EvolutionEntry("moothnite", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"15")))),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.HARDEN,10),
                        new MoveLearnSetEntry(Move.TELEPORT,13),
                        new MoveLearnSetEntry(Move.BUG_BITE,20),
                        new MoveLearnSetEntry(Move.TAIL_GLOW,25),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,"tm")                        ),
                List.of(Label.ATLAS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(10)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_MAGICAL, Biome.IS_DECIDUOUS_FOREST)
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Crescoon");

    }


}
