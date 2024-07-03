package drai.dev.gravelmon.pokemon.mushi;


import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;
public class Hedodan extends drai.dev.gravelmon.pokemon.Pokemon {
    public Hedodan() {
        super("Hedodan",
                Type.BUG, Type.POISON,
                new Stats(35,
                        60,
                        70,
                        50,
                        60,
                        35),
                List.of(Ability.STENCH,Ability.AFTERMATH), Ability.BULLETPROOF,
                0, 0,
                new Stats(0,0,1,0,0,0), 255,
                0.5,
                56, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG,EggGroup.AMORPHOUS),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.MUSHI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Hedodan");

    }


}
