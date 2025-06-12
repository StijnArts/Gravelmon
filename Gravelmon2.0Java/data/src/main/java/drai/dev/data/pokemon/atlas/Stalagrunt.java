package drai.dev.data.pokemon.atlas;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Stalagrunt extends drai.dev.data.pokemon.Pokemon {
    public Stalagrunt() {
        super("Stalagrunt",
                Type.ICE, Type.ROCK,
                new Stats(55,
                        75,
                        65,
                        20,
                        40,
                        45),
                List.of(Ability.STURDY,Ability.UNDERLING,Ability.DEFIANT), Ability.DEFIANT,
                9, 165,
                new Stats(0,1,0,0,0,0), 255,
                0.5,
                60, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Stalagrunt work tirelessly in the darkness of caves to aid a leading Stalagang to expand territory. They have brash attitudes, especially when fighting against stronger opponents."),
                List.of(new EvolutionEntry("stalagang", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.HARDEN,6),
                        new MoveLearnSetEntry(Move.ROCK_THROW,9),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,13),
                        new MoveLearnSetEntry(Move.SPITE,16),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,20),
                        new MoveLearnSetEntry(Move.ICE_SHARD,23),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,27),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,32),
                        new MoveLearnSetEntry(Move.SWAGGER,36),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,40),
                        new MoveLearnSetEntry(Move.STONE_EDGE,44),
                        new MoveLearnSetEntry(Move.COLDSNAP,48),
                        new MoveLearnSetEntry(Move.ICICLE_SPEAR,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,"tm")                        ),
                List.of(Label.ATLAS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(5)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_COLD)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Stalagrunt");

    }


}
