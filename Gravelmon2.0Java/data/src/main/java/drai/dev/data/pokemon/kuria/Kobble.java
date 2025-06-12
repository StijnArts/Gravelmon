package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Kobble extends drai.dev.data.pokemon.Pokemon {
    public Kobble() {
        super("Kobble",
                Type.ROCK, Type.PSYCHIC,
                new Stats(50,
                        120,
                        50,
                        30,
                        50,
                        60),
                List.of(Ability.ROUNDRECORD), Ability.ROUNDRECORD,
                7, 360,
                new Stats(0,2,0,0,0,0), 45,
                0.0,
                130, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Kobble spin at a dangerously fast speed. Because of this, they can never tell which direction they are going and often forget what they were even doing in the first place."),
                List.of(new EvolutionEntry("yamaki", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"48")))),
                List.of(             new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.FLASH,6),
                        new MoveLearnSetEntry(Move.PSYWAVE,9),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,12),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,16),
                        new MoveLearnSetEntry(Move.STORED_POWER,21),
                        new MoveLearnSetEntry(Move.BARRIER,25),
                        new MoveLearnSetEntry(Move.POWER_GEM,29),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,33),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,39),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,44),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,47),
                        new MoveLearnSetEntry(Move.PSYCHIC,51),
                        new MoveLearnSetEntry(Move.GEMCRASH,55),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,62)           ),
                List.of(Label.KURIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DESERT)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.DESERT_PYRAMID)
    .build(), List.of());
	
           setLangFileName("Kobble");

    }


}
