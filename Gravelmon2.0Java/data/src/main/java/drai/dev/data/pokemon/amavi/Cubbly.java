package drai.dev.data.pokemon.amavi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Cubbly extends drai.dev.data.pokemon.Pokemon {
    public Cubbly() {
        super("Cubbly",
                Type.NORMAL,
                new Stats(80,
                        40,
                        40,
                        65,
                        80,
                        50),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                6, 0,
                new Stats(0,0,0,0,0,0), 210,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("koalove", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"23")))),
                List.of(new MoveLearnSetEntry(Move.SING,1),
                        new MoveLearnSetEntry(Move.ROUND,3),
                        new MoveLearnSetEntry(Move.PLAY_NICE,7),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,11),
                        new MoveLearnSetEntry(Move.CAPTIVATE,14),
                        new MoveLearnSetEntry(Move.COTTON_SPORE,16),
                        new MoveLearnSetEntry(Move.SNORE,20),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,25),
                        new MoveLearnSetEntry(Move.REST,29),
                        new MoveLearnSetEntry(Move.HEAL_BELL,32),
                        new MoveLearnSetEntry(Move.COTTON_GUARD,37),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,40),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,44),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,49)
                ),
                List.of(Label.AMAVI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SAVANNA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Cubbly");

    }


}
