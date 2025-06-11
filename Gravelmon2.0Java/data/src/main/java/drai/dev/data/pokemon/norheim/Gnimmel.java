package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Gnimmel extends drai.dev.data.pokemon.Pokemon {
    public Gnimmel() {
        super("Gnimmel",
                Type.NORMAL,
                new Stats(40,
                        65,
                        50,
                        30,
                        40,
                        60),
                List.of(Ability.OVERCOAT,Ability.GLUTTONY,Ability.THICK_FAT), Ability.THICK_FAT,
                5, 165,
                new Stats(0,1,0,0,0,1), 150,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Gnimmel are great lookouts for potential danger. They guard their burrowed nests with care to provide safety for Lemini."),
                List.of(new EvolutionEntry("wolverage", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"41")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,4),
                        new MoveLearnSetEntry(Move.ENDURE,8),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,11),
                        new MoveLearnSetEntry(Move.SCRATCH,15),
                        new MoveLearnSetEntry(Move.BITE,19),
                        new MoveLearnSetEntry(Move.HYPER_FANG,29),
                        new MoveLearnSetEntry(Move.WORK_UP,33),
                        new MoveLearnSetEntry(Move.SWIFT,37),
                        new MoveLearnSetEntry(Move.BODY_SLAM,46),
                        new MoveLearnSetEntry(Move.LAST_RESORT,53)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(23)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_COLD)
    .setAntiBiomes(Biome.IS_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Gnimmel");

    }


}
