package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Dorimedon extends drai.dev.gravelmon.pokemon.Pokemon {
    public Dorimedon() {
        super("Dorimedon",
                Type.PSYCHIC,Type.STEEL,
                new Stats(70,
                        80,
                        70,
                        110,
                        120,
                        50),
                List.of(Ability.SOUNDPROOF,Ability.OWN_TEMPO,Ability.MOODY), Ability.MOODY,
                15, 165,
                new Stats(0,0,0,0,2,0), 70,
                0.5,
                175, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.HUMAN_LIKE),
                List.of(""),
                List.of(),
                List.of(           new MoveLearnSetEntry(Move.CONFUSE_RAY,1),
                        new MoveLearnSetEntry(Move.CONFUSION,1),
                        new MoveLearnSetEntry(Move.PAYBACK,1),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.WEATHER_BALL,1),
                        new MoveLearnSetEntry(Move.IMPRISON,12),
                        new MoveLearnSetEntry(Move.GYRO_BALL,16),
                        new MoveLearnSetEntry(Move.HYPNOSIS,20),
                        new MoveLearnSetEntry(Move.SAFEGUARD,24),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,28),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,32),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,38),
                        new MoveLearnSetEntry(Move.METAL_SOUND,44),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,50),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,56)),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 28, 56, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.MANSION),
                0.28, 0.3,
                List.of());
           setLangFileName("Dorimedon");

    }


}
