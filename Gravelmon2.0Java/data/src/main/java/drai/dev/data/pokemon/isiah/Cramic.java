package drai.dev.data.pokemon.isiah;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Cramic extends drai.dev.data.pokemon.Pokemon {
    public Cramic() {
        super("Cramic",
                Type.BUG,
                new Stats(40,
                        50,
                        70,
                        40,
                        70,
                        30),
                List.of(Ability.HYPER_CUTTER,Ability.SHELL_ARMOR,Ability.FRISK), Ability.FRISK,
                5, 165,
                new Stats(0,0,1,0,0,0), 190,
                0.5,
                60, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(new EvolutionEntry("clamsure", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.PINCH,1),
                        new MoveLearnSetEntry(Move.WITHDRAW,4),
                        new MoveLearnSetEntry(Move.SKITTER_SMACK,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm")                        ),
                List.of(Label.ISIAH),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(6)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Cramic");

    }


}
