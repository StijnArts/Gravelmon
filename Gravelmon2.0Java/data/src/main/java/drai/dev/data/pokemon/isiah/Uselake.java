package drai.dev.data.pokemon.isiah;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Uselake extends drai.dev.data.pokemon.Pokemon {
    public Uselake() {
        super("Uselake",
                Type.WATER,
                new Stats(37,
                        12,
                        25,
                        15,
                        36,
                        75),
                List.of(Ability.OBLIVIOUS), Ability.SUPER_LUCK,
                5, 165,
                new Stats(0,0,0,0,0,1), 255,
                0.5,
                40, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_2,EggGroup.DRAGON),
                List.of(""),
                List.of(new EvolutionEntry("monartide", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20")))
                ),
                List.of(      new MoveLearnSetEntry(Move.SPLASH,1),
                        new MoveLearnSetEntry(Move.TACKLE,15),
                        new MoveLearnSetEntry(Move.FLAIL,25)),
                List.of(Label.ISIAH),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(1)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_FRESHWATER)
    .setAntiBiomes(Biome.IS_SWAMP)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
