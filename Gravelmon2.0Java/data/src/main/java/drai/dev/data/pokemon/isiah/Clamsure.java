package drai.dev.data.pokemon.isiah;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Clamsure extends drai.dev.data.pokemon.Pokemon {
    public Clamsure() {
        super("Clamsure",
                Type.BUG, Type.DARK,
                new Stats(70,
                        75,
                        110,
                        60,
                        95,
                        50),
                List.of(Ability.HYPER_CUTTER,Ability.SHELL_ARMOR,Ability.FRISK), Ability.FRISK,
                9, 165,
                new Stats(0,0,2,0,0,0), 90,
                0.5,
                161, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WITHDRAW,1),
                        new MoveLearnSetEntry(Move.SKITTER_SMACK,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm")                        ),
                List.of(Label.ISIAH),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.RARE)
    .setMinLevel(32)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Clamsure");

    }


}
