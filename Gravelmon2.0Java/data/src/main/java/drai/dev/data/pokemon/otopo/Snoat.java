package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Snoat extends drai.dev.data.pokemon.Pokemon {
    public Snoat() {
        super("Snoat",
                Type.ICE, Type.FAIRY,
                new Stats(85,
                        45,
                        54,
                        66,
                        50,
                        75),
                List.of(Ability.ADAPTABILITY,Ability.THICK_FAT), Ability.PIXILATE,
                5, 0,
                new Stats(0,0,0,0,0,0), 180,
                0.5,
                75, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Snoat has a slender physique. It can squeeze through tight areas and flee when attacked. Snoat is assumed to be a localised variety of Furret in other areas."),
                List.of(new EvolutionEntry("glacermine", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"33"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.TIME,"day"))),
                        new EvolutionEntry("sleasel", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"33"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.TIME,"night")))),
                List.of(
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.FORESIGHT,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,4),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,7),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,11),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,13),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,16),
                        new MoveLearnSetEntry(Move.HELPING_HAND,20),
                        new MoveLearnSetEntry(Move.SLAM,25),
                        new MoveLearnSetEntry(Move.ICE_FANG,27),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,32),
                        new MoveLearnSetEntry(Move.UPROAR,36),
                        new MoveLearnSetEntry(Move.BLIZZARD,40),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,42),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.AVALANCHE,"tm"),
                        new MoveLearnSetEntry(Move.ICE_FANG,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm")                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SNOWY_FOREST)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Snoat");

    }


}
