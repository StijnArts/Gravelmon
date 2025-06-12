package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Stricklisk extends drai.dev.data.pokemon.Pokemon {
    public Stricklisk() {
        super("Stricklisk",
                Type.FIGHTING, Type.DRAGON,
                new Stats(80,
                        95,
                        112,
                        80,
                        80,
                        65),
                List.of(Ability.INNER_FOCUS,Ability.SHED_SKIN,Ability.STEELWORKER), Ability.STEELWORKER,
                8, 165,
                new Stats(0,0,0,0,0,0), 30,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Evo Sacred SwordSTAB Fighting"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SACRED_SWORD,1),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.SUBMISSION,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm")   ,
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,4),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,8),
                        new MoveLearnSetEntry(Move.MUDSLAP,12),
                        new MoveLearnSetEntry(Move.DETECT,16),
                        new MoveLearnSetEntry(Move.LOW_SWEEP,22),
                        new MoveLearnSetEntry(Move.COIL,26),
                        new MoveLearnSetEntry(Move.COUNTER,32),
                        new MoveLearnSetEntry(Move.AUTOTOMIZE,38),
                        new MoveLearnSetEntry(Move.IRON_TAIL,44),
                        new MoveLearnSetEntry(Move.FINAL_GAMBIT,50),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.SUBMISSION,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm")                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(33)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Stricklisk");

    }


}
