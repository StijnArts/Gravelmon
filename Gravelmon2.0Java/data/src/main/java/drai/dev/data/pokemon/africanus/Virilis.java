package drai.dev.data.pokemon.africanus;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Virilis extends drai.dev.data.pokemon.Pokemon {
    public Virilis() {
        super("Virilis",
                Type.GRASS,Type.FAIRY,
                new Stats(75,
                        54,
                        64,
                        57,
                        87,
                        83),
                List.of(Ability.CLEAR_BODY), null,
                10, 370,
                new Stats(0,2,0,0,0,0), 127,
                0.0,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Se dice que aquellos entrenadores que cuentan con un Virilis son bendecidos por los dioses a hacer grandes hazañas en la vida."),
                List.of(new EvolutionEntry("Lupercalis", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))),
                List.of(
                        new MoveLearnSetEntry(Move.LEAF_TORNADO,18),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,32),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,28),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,20),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,36),
                        new MoveLearnSetEntry(Move.PSYBEAM,24)                        ),
                List.of(Label.AFRICANUS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 16, 40, 0.9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Virilis");

    }


}
