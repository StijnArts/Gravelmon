package drai.dev.data.pokemon.mastenia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Crabutan extends drai.dev.data.pokemon.Pokemon {
    public Crabutan() {
        super("Crabutan",
                Type.WATER, Type.NORMAL,
                new Stats(73,
                        117,
                        90,
                        55,
                        75,
                        70),
                List.of(Ability.HYPER_CUTTER,Ability.RATTLED), Ability.GORILLA_TACTICS,
                0, 0,
                new Stats(0,0,0,0,0,0), 70,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MASTENIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 42, 56, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COAST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Crabutan");

    }


}
