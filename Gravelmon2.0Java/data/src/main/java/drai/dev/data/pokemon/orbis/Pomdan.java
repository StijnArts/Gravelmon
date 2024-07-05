package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Pomdan extends drai.dev.data.pokemon.Pokemon {
    public Pomdan() {
        super("Pompuff",
                Type.FIGHTING, Type.FAIRY,
                new Stats(50,
                        65,
                        30,
                        40,
                        50,
                        60),
                List.of(Ability.COSTAR), Ability.DANCER,
                4, 100,
                new Stats(0,1,0,0,0,0), 190,
                0.25,
                68, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Pompuff");

    }


}
