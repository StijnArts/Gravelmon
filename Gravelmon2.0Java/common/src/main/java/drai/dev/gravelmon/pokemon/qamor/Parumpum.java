package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Parumpum extends drai.dev.gravelmon.pokemon.Pokemon {
    public Parumpum() {
        super("Parumpum",
                Type.PSYCHIC,
                new Stats(99,
                        31,
                        48,
                        90,
                        95,
                        25),
                List.of(Ability.OWN_TEMPO), Ability.ADAPTABILITY,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("During battles of tribes, native Qamorans would always take Parumpum out to help sync the warriors with one another, and pump them up for the fight."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DRUM_BEATING,"tm")                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Parumpum");

    }


}
