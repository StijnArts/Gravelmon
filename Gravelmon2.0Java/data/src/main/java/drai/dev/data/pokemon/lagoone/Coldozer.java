package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Coldozer extends drai.dev.data.pokemon.Pokemon {
    public Coldozer() {
        super("Coldozer",
                Type.ICE, Type.ROCK,
                new Stats(65,
                        80,
                        90,
                        50,
                        70,
                        60),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                9, 780,
                new Stats(0,0,2,0,0,0), 90,
                0.5,
                150, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of(""),
                List.of(new EvolutionEntry("frosterror", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"52")))),
                List.of(
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,4),
                        new MoveLearnSetEntry(Move.STOMP,12),
                        new MoveLearnSetEntry(Move.BIDE,16),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,20),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,24),
                        new MoveLearnSetEntry(Move.MIST,28),
                        new MoveLearnSetEntry(Move.ICICLE_SPEAR,32),
                        new MoveLearnSetEntry(Move.ENDURE,40),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,44),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,48),
                        new MoveLearnSetEntry(Move.STONE_EDGE,52),
                        new MoveLearnSetEntry(Move.BLIZZARD,58)
                ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(32)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_FREEZING)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Coldozer");

    }


}
