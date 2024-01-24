package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Dokuduru extends drai.dev.gravelmon.pokemon.Pokemon {
    public Dokuduru() {
        super("Dokuduru",
                Type.PSYCHIC,
                new Stats(121,
                        43,
                        64,
                        102,
                        127,
                        33),
                List.of(Ability.OWN_TEMPO), Ability.ADAPTABILITY,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Dokuduru are able to play rhythms in certain frequencies that effect creatures and entities on another plane of existence, ancient Qamorans would use their skill to dispel evil and malevolent spirits from the mortal coil."),
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
           setLangFileName("Dokuduru");

    }


}
