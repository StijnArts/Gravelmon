package drai.dev.data.pokemon.lonava;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Dolpride extends drai.dev.data.pokemon.Pokemon {
    public Dolpride() {
        super("Dolphin2",
                Type.PSYCHIC,
                new Stats(88,
                        105,
                        56,
                        66,
                        56,
                        110),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                14, 165,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of( new MoveLearnSetEntry(Move.CONFUSION,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,4),
                        new MoveLearnSetEntry(Move.PAYBACK,8),
                        new MoveLearnSetEntry(Move.IMPRISON,12),
                        new MoveLearnSetEntry(Move.GYRO_BALL,16),
                        new MoveLearnSetEntry(Move.HYPNOSIS,20),
                        new MoveLearnSetEntry(Move.SAFEGUARD,24),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,28),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,32),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,36),
                        new MoveLearnSetEntry(Move.METAL_SOUND,40),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,44)          ),
                List.of(Label.LONAVA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(32)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Dolphin2");

    }


}
