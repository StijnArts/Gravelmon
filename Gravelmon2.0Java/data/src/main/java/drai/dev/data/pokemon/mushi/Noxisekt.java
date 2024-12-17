package drai.dev.data.pokemon.mushi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Noxisekt extends drai.dev.data.pokemon.Pokemon {
    public Noxisekt() {
        super("Noxisekt",
                Type.BUG, Type.POISON,
                new Stats(55,
                        75,
                        100,
                        105,
                        60,
                        55),
                List.of(Ability.STENCH,Ability.AFTERMATH), Ability.BULLETPROOF,
                0, 0,
                new Stats(0,0,0,2,0,0), 127,
                0.5,
                147, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG,EggGroup.AMORPHOUS),
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
           setLangFileName("Noxisekt");

    }


}
