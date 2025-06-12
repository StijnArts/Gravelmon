package drai.dev.data.pokemon.qamor;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Hissteric extends drai.dev.data.pokemon.Pokemon {
    public Hissteric() {
        super("Hissteric",
                Type.GROUND, Type.POISON,
                new Stats(76,
                        101,
                        84,
                        45,
                        105,
                        99),
                List.of(Ability.SHED_SKIN), Ability.MOLD_BREAKER,
                16, 165,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.DRAGON),
                List.of("Hissteric no longer use their tails purely as a defense mechanism, now they use it to entertain themselves by startling others and laughing at their misfortune. Their TRUE defense mechanism is comedy."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GLARE,1),
                        new MoveLearnSetEntry(Move.BITE,1),
                        new MoveLearnSetEntry(Move.MUDSLAP,4),
                        new MoveLearnSetEntry(Move.ROLLOUT,8),
                        new MoveLearnSetEntry(Move.GLARE,12),
                        new MoveLearnSetEntry(Move.SCREECH,16),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,20),
                        new MoveLearnSetEntry(Move.DRILL_RUN,24),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,28),
                        new MoveLearnSetEntry(Move.POISON_TAIL,32),
                        new MoveLearnSetEntry(Move.CRUNCH,36),
                        new MoveLearnSetEntry(Move.SHORE_UP,40),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,44),
                        new MoveLearnSetEntry(Move.COIL,48),
                        new MoveLearnSetEntry(Move.EARTH_POWER,52),
                        new MoveLearnSetEntry(Move.ENDEAVOR,56)        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(44)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DESERT)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Hissteric");

    }


}
