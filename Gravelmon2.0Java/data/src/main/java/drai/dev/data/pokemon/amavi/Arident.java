package drai.dev.data.pokemon.amavi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Arident extends drai.dev.data.pokemon.Pokemon {
    public Arident() {
        super("Arident",
                Type.ROCK, Type.FIRE,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                6, 0,
                new Stats(0,0,0,0,0,0), 190,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("gorock", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"27")))),
                List.of(
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.SMOG,5),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,8),
                        new MoveLearnSetEntry(Move.PURSUIT,12),
                        new MoveLearnSetEntry(Move.PROTECT,15),
                        new MoveLearnSetEntry(Move.INCINERATE,19),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,23),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,28),
                        new MoveLearnSetEntry(Move.SHARPEN,32),
                        new MoveLearnSetEntry(Move.STEAMROLLER,37),
                        new MoveLearnSetEntry(Move.STONE_EDGE,41),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,43),
                        new MoveLearnSetEntry(Move.ROCK_CLIMB,46),
                        new MoveLearnSetEntry(Move.ROCK_WRECKER,50)
                ),
                List.of(Label.AMAVI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SAVANNA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Arident");

    }


}
