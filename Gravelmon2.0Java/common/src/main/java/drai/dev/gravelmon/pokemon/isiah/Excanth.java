package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Excanth extends drai.dev.gravelmon.pokemon.Pokemon {
    public Excanth() {
        super("Excanth",
                Type.POISON, Type.ICE,
                new Stats(111,
                        145,
                        131,
                        72,
                        124,
                        97
                ),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                35, 165,
                new Stats(0,0,0,0,0,0), 3,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,5),
                        new MoveLearnSetEntry(Move.MIST,9),
                        new MoveLearnSetEntry(Move.SMOG,12),
                        new MoveLearnSetEntry(Move.DISABLE,15),
                        new MoveLearnSetEntry(Move.ICICLE_SPEAR,18),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,22),
                        new MoveLearnSetEntry(Move.AVALANCHE,25),
                        new MoveLearnSetEntry(Move.SCREECH,28),
                        new MoveLearnSetEntry(Move.RAZOR_WIND,32),
                        new MoveLearnSetEntry(Move.TRASHTALK,35),
                        new MoveLearnSetEntry(Move.TOXIC,38),
                        new MoveLearnSetEntry(Move.ICE_BEAM,43),
                        new MoveLearnSetEntry(Move.EMBARGO,47),
                        new MoveLearnSetEntry(Move.BLIZZARD,52),
                        new MoveLearnSetEntry(Move.SHEER_COLD,57)
                ),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 65, 75, .0006, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Excanth");

    }


}
