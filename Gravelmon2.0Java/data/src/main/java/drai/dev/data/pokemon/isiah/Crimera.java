package drai.dev.data.pokemon.isiah;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Crimera extends drai.dev.data.pokemon.Pokemon {
    public Crimera() {
        super("Crimera",
                Type.POISON,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                7, 165,
                new Stats(0,0,0,0,0,0), 110,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.MONSTER),
                List.of(""),
                List.of(new EvolutionEntry("chiverna", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))),
                List.of(          new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.ACID,5),
                        new MoveLearnSetEntry(Move.TWISTER,8),
                        new MoveLearnSetEntry(Move.PLUCK,12),
                        new MoveLearnSetEntry(Move.POISON_TAIL,15),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,19),
                        new MoveLearnSetEntry(Move.POISON_JAB,22),
                        new MoveLearnSetEntry(Move.SCREECH,26),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,29),
                        new MoveLearnSetEntry(Move.CROSS_POISON,34),
                        new MoveLearnSetEntry(Move.DEFOG,37),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,42),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,46),
                        new MoveLearnSetEntry(Move.OUTRAGE,50)              ),
                List.of(Label.ISIAH),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_CAVE)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Crimera");

    }


}
