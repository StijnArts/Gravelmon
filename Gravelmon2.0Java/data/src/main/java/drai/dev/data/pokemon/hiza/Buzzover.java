package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Buzzover extends drai.dev.data.pokemon.Pokemon {
    public Buzzover() {
        super("Buzzover",
                Type.BUG, Type.FLYING,
                new Stats(60,
                        50,
                        50,
                        55,
                        50,
                        40),
                List.of(Ability.DEFEATIST), Ability.DEFEATIST,
                5, 165,
                new Stats(1,0,0,0,0,0), 255,
                0.5,
                61, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Buzzover's weak wings make it unable to fly 5 feet above the ground, even a small breeze can knock them off the air."),
                List.of(new EvolutionEntry("chopteran", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"31")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.SUPERSONIC,1),
                        new MoveLearnSetEntry(Move.FLAIL,5),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,15),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,25)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SURFACE)
    .setBiomes(Biome.IS_SPRING, Biome.IS_AUTUMN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.FRESHWATER)
    .build(), List.of());
	
        setCanFly(true);

    }


}
