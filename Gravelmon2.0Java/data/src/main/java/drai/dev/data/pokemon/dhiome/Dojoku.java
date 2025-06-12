package drai.dev.data.pokemon.dhiome;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Dojoku extends drai.dev.data.pokemon.Pokemon {
    public Dojoku() {
        super("Dojoku",
                Type.FIGHTING,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.GUTS), Ability.ADAPTABILITY,
                7, 0,
                new Stats(0,0,0,0,0,0), 190,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It is capable of learning multiple fighting styles with ease. It uses them in different sequences to achieve victory."),
                List.of(new EvolutionEntry("fumaji", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.RATIO,"ATTACK_HIGHER"))),
                        new EvolutionEntry("furatle", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.RATIO,"DEFENCE_HIGHER"))),
                        new EvolutionEntry("fusecto", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.RATIO,"EQUAL")))),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.LOW_KICK,4),
                        new MoveLearnSetEntry(Move.ROCK_THROW,8),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,12),
                        new MoveLearnSetEntry(Move.BULK_UP,16),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,20),
                        new MoveLearnSetEntry(Move.SLAM,24),
                        new MoveLearnSetEntry(Move.SCARY_FACE,28),
                        new MoveLearnSetEntry(Move.DYNAMICPUNCH,32),
                        new MoveLearnSetEntry(Move.HAMMER_ARM,36),
                        new MoveLearnSetEntry(Move.STONE_EDGE,40),
                        new MoveLearnSetEntry(Move.SUPERPOWER,44),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,48)
                ),
                List.of(Label.DHIOME),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(6)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_HIGHLANDS, Biome.IS_MOUNTAIN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Dojoku");

    }


}
