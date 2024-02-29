package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Drazephir extends drai.dev.gravelmon.pokemon.Pokemon {
    public Drazephir() {
        super("Drazephir",
                Type.PSYCHIC,Type.FLYING,
                new Stats(80,
                        120,
                        80,
                        140,
                        60,
                        120),
                List.of(Ability.PRESSURE), Ability.DEFIANT,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("A Pokemon spoken about in folklore where it controls winds. Some locals believe windy days mean Drazephir is very active and playful, while strong winds are seen as warning signs of incoming danger. It guards the sky over the islands."),
                List.of(),
                List.of(                        ),
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
           setLangFileName("Drazephir");

    }


}
