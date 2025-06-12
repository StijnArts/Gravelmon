package drai.dev.data.pokemon.atlas;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Silkch extends drai.dev.data.pokemon.Pokemon {
    public Silkch() {
        super("Silkch",
                Type.BUG,
                new Stats(48,
                        43,
                        55,
                        30,
                        52,
                        32),
                List.of(Ability.SWARM,Ability.SHED_SKIN,Ability.RUN_AWAY), Ability.RUN_AWAY,
                2, 165,
                new Stats(0,0,1,0,0,0), 255,
                0.5,
                52, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Silkch are constantly falling over and bumping themselves, so they wrap themselves in silk bandages."),
                List.of(new EvolutionEntry("cachoe", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"10")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.SCUTTLEHOP,7),
                        new MoveLearnSetEntry(Move.BUG_BITE,15),
                        new MoveLearnSetEntry(Move.SPIDER_WEB,25),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,"tm"),
                        new MoveLearnSetEntry(Move.THREADLASH,"tm"),
                        new MoveLearnSetEntry(Move.STICKY_WEB,"tm")                        ),
                List.of(Label.ATLAS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(1)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Silkch");

    }


}
