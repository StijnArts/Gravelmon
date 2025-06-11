package drai.dev.data.pokemon.dhiome;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Gloshroom extends drai.dev.data.pokemon.Pokemon {
    public Gloshroom() {
        super("Gloshroom",
                Type.ELECTRIC,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.ILLUMINATE), Ability.ILLUMINATE,
                5, 0,
                new Stats(0,0,0,0,0,0), 200,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("phosporus", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"27")))),
                List.of(
                        new MoveLearnSetEntry(Move.PLAY_NICE,1),
                        new MoveLearnSetEntry(Move.NUZZLE,5),
                        new MoveLearnSetEntry(Move.HAZARDCLOUD,8),
                        new MoveLearnSetEntry(Move.METRONOME,12),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,17),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,19),
                        new MoveLearnSetEntry(Move.SECRET_POWER,24),
                        new MoveLearnSetEntry(Move.MINIMIZE,27),
                        new MoveLearnSetEntry(Move.DISCHARGE,31),
                        new MoveLearnSetEntry(Move.EERIE_IMPULSE,36),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,47),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,52),
                        new MoveLearnSetEntry(Move.ELECTRIFY,56)
                ),
                List.of(Label.DHIOME),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(4)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_MUSHROOM, Biome.IS_LUSH)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Gloshroom");

    }


}
