package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class QamoranRabsca extends drai.dev.gravelmon.pokemon.Pokemon {
    public QamoranRabsca() {
        super("Rabsca",
                Type.GROUND,Type.PSYCHIC,
                new Stats(75,
                        50,
                        100,
                        115,
                        85,
                        45),
                List.of(Ability.LEVITATE), Ability.TELEPATHY,
                8, 165,
                new Stats(0,0,0,2,0,0), 45,
                0.5,
                165, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Recover Normal Memento Dark Weather Ball Normal Cosmic Power Psychic"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.RECOVER,"tm"),
                        new MoveLearnSetEntry(Move.MEMENTO,"tm"),
                        new MoveLearnSetEntry(Move.WEATHER_BALL,"tm"),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,"tm")                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Rabsca");

    }


}
