package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Kombantis extends drai.dev.gravelmon.pokemon.Pokemon {
    public Kombantis() {
        super("Kombantis",
                Type.BUG,Type.FIGHTING,
                new Stats(85,
                        110,
                        80,
                        50,
                        50,
                        95),
                List.of(Ability.INNER_FOCUS,Ability.DEFIANT,Ability.FRISK), Ability.FRISK,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Kombantis are so well fit they can spare with each other for 72 hours before they are tired. Their striking is known to be faster and stronger than most Fighting-Type Pokemon."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LASER_FOCUS,1)                        ),
                List.of(Label.OROHNHAVAI
),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Kombantis");

    }


}
