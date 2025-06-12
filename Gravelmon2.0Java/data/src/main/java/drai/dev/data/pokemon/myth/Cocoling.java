package drai.dev.data.pokemon.myth;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Cocoling extends Pokemon {
    public Cocoling() {
        super("Cocoling",
                Type.GRASS, Type.ROCK,
                new Stats(80,50,70,25,75,25),
                List.of(Ability.THICK_FAT), Ability.RAIN_DISH,
                4, 69,
                new Stats(1,0,0,0,0,0), 45,
                0.875,
                64, ExperienceGroup.MEDIUM_FAST,
                70,
                100, List.of(EggGroup.BUG),
                List.of("Newborn Cocoling sprout from fallen coconuts on the beach."),
                List.of(new EvolutionEntry("coconab", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
                List.of(
                        new MoveLearnSetEntry(Move.ABSORB, 1),
                        new MoveLearnSetEntry(Move.TACKLE, 3),
                        new MoveLearnSetEntry(Move.ROLLOUT, 7),
                        new MoveLearnSetEntry(Move.WATER_GUN, 10),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF, 13),
                        new MoveLearnSetEntry(Move.WITHDRAW, 15),
                        new MoveLearnSetEntry(Move.WATER_PULSE, 17),
                        new MoveLearnSetEntry(Move.TOXIC, 20),
                        new MoveLearnSetEntry(Move.CALM_MIND, 25)
                ),
                List.of(Label.MYTH),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BEACH)
    .setAntiBiomes(Biome.IS_COLD)
    .canSeeSky()
    .duringDaytime()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
