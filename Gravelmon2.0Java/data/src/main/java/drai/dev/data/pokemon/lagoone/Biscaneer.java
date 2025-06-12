package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Biscaneer extends drai.dev.data.pokemon.Pokemon {
    public Biscaneer() {
        super("Biscaneer",
                Type.FAIRY, Type.DARK,
                new Stats(45,
                        60,
                        55,
                        45,
                        75,
                        60),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                3, 7,
                new Stats(0,1,0,0,0,0), 200,
                0.0,
                66, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of(""),
                List.of(new EvolutionEntry("gingerbeard", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"37")))),
                List.of(         new MoveLearnSetEntry(Move.WRING_OUT,1),
                        new MoveLearnSetEntry(Move.TORMENT,7),
                        new MoveLearnSetEntry(Move.ASTONISH,13),
                        new MoveLearnSetEntry(Move.HYPNOSIS,19),
                        new MoveLearnSetEntry(Move.FAIRY_LOCK,23),
                        new MoveLearnSetEntry(Move.RAINBOWGUST,29),
                        new MoveLearnSetEntry(Move.QUASH,31),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,37),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,43),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,47),
                        new MoveLearnSetEntry(Move.TOPSYTURVY,53),
                        new MoveLearnSetEntry(Move.MEMENTO,59),
                        new MoveLearnSetEntry(Move.RAINBOWRUSH,67),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,73)               ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .setSpawnPreset(SpawnPreset.SHIP_WRECK)
    .build(), List.of());
	
           setLangFileName("Biscaneer");

    }


}
