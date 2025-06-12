package drai.dev.data.pokemon.midamis;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Geropian extends drai.dev.data.pokemon.Pokemon {
    public Geropian() {
        super("Geropian",
                Type.POISON, Type.BUG,
                new Stats(40,
                        40,
                        40,
                        55,
                        45,
                        35),
                List.of(Ability.LIQUID_OOZE), Ability.POISON_POINT,
                8, 165,
                new Stats(0,0,0,0,0,0), 220,
                0.75,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("malropian", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"28")))),
                List.of(      new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.ROLLOUT,4),
                        new MoveLearnSetEntry(Move.PROTECT,8),
                        new MoveLearnSetEntry(Move.POISON_TAIL,12),
                        new MoveLearnSetEntry(Move.SCREECH,16),
                        new MoveLearnSetEntry(Move.BUG_BITE,20),
                        new MoveLearnSetEntry(Move.VENOSHOCK,24),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,28),
                        new MoveLearnSetEntry(Move.AGILITY,32),
                        new MoveLearnSetEntry(Move.TOXIC,36),
                        new MoveLearnSetEntry(Move.VENOM_DRENCH,40),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,44)
                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(4)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .setAntiBiomes(Biome.IS_SUMMER, Biome.IS_TAIGA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Geropian");

    }


}
