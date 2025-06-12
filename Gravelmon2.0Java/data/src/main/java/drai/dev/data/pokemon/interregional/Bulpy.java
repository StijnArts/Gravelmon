package drai.dev.data.pokemon.interregional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Bulpy extends drai.dev.data.pokemon.Pokemon {
    public Bulpy() {
        super("Bulpy",
                Type.NORMAL,
                new Stats(30,
                        30,
                        40,
                        30,
                        35,
                        40),
                List.of(Ability.CUTE_CHARM), Ability.RUN_AWAY,
                4, 165,
                new Stats(0,0,0,0,0,0), 190,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Families from all over the world pay large amounts of money to get their hands on their own pet Bulpy. Their cuteness has become an internet sensation."),
                List.of(new EvolutionEntry("Filthound", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))
                ),
                List.of(     new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,3),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,6),
                        new MoveLearnSetEntry(Move.COVET,9),
                        new MoveLearnSetEntry(Move.HEADBUTT,12),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,15),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,18),
                        new MoveLearnSetEntry(Move.REST,21),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,24),
                        new MoveLearnSetEntry(Move.FLING,27),
                        new MoveLearnSetEntry(Move.FLAIL,30),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,33),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,36)),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(7)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Bulpy");

    }


}
