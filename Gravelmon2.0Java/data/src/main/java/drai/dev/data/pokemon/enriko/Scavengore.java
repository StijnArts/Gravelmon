package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Scavengore extends drai.dev.data.pokemon.Pokemon {
    public Scavengore() {
        super("Scavengore",
                Type.BUG,
                new Stats(65,
                        70,
                        100,
                        60,
                        100,
                        50),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                12, 165,
                new Stats(0,0,0,0,0,0), 120,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Actually a colony of multiple Maglut, with different specialized forms serving different roles for the colony. They'll disperse if threatened, but will come back together when the coast is clear."),
                List.of(new EvolutionEntry("wrigormort", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"44")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.BIND,5),
                        new MoveLearnSetEntry(Move.BUG_BITE,8),
                        new MoveLearnSetEntry(Move.HARDEN,11),
                        new MoveLearnSetEntry(Move.ACID,15),
                        new MoveLearnSetEntry(Move.RECYCLE,19),
                        new MoveLearnSetEntry(Move.WAKEUP_SLAP,24),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,29),
                        new MoveLearnSetEntry(Move.STEAMROLLER,35),
                        new MoveLearnSetEntry(Move.WRING_OUT,45)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.RARE)
    .setMinLevel(24)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SWAMP)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Scavengore");

    }


}
