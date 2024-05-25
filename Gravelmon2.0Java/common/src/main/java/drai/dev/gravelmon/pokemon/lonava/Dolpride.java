package drai.dev.gravelmon.pokemon.lonava;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Dolpride extends drai.dev.gravelmon.pokemon.Pokemon {
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
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 32, 45, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Dolphin2");

    }


}
