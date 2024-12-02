package drai.dev.data.pokemon.mushi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Kimfoo extends drai.dev.data.pokemon.Pokemon {
    public Kimfoo() {
        super("Kimfoo",
                Type.GHOST,
                new Stats(35,
                        73,
                        63,
                        57,
                        57,
                        35),
                List.of(Ability.HYPER_CUTTER,Ability.FRISK), Ability.TECHNICIAN,
                0, 0,
                new Stats(0,1,0,0,0,0), 225,
                0.5,
                59, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MUSHI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Kimfoo");

    }


}
