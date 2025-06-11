package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Clawconut extends drai.dev.data.pokemon.Pokemon {
    public Clawconut() {
        super("Clawconut",
                Type.ROCK, Type.GRASS,
                new Stats(45,
                        80,
                        65,
                        55,
                        40,
                        40),
                List.of(Ability.SHELL_ARMOR,Ability.ANTICIPATION,Ability.ARENA_TRAP), Ability.ARENA_TRAP,
                5, 165,
                new Stats(0,1,0,0,0,0), 255,
                0.5,
                65, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_3,EggGroup.MINERAL),
                List.of("They can be seen building sand castles or climbing up most trees near the beach. Hiding high up on trees, they drop themselves onto their foes' heads hoping to knock them out."),
                List.of(new EvolutionEntry("clawgigus", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"40")))),
                List.of(
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.LEAFTURN,6),
                        new MoveLearnSetEntry(Move.ROCK_THROW,11),
                        new MoveLearnSetEntry(Move.LEAF_TORNADO,15),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,18),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,22),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,26),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,30),
                        new MoveLearnSetEntry(Move.SANDSHOT,34),
                        new MoveLearnSetEntry(Move.CRABHAMMER,38),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,42),
                        new MoveLearnSetEntry(Move.STONE_EDGE,46)                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BEACH)
    .setAntiBiomes(Biome.IS_COLD)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Clawconut");

    }


}
