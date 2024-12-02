package drai.dev.data.pokemon.pastelisland;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Crustoise extends drai.dev.data.pokemon.Pokemon {
    public Crustoise() {
        super("Crustoise",
                Type.FIRE, Type.ROCK,
                new Stats(80,
                        60,
                        100,
                        50,
                        50,
                        48),
                List.of(Ability.SHELL_ARMOR,Ability.BLAZE), Ability.MAGMA_ARMOR,
                32, 2041,
                new Stats(0,0,2,0,0,0), 60,
                0.5,
                365, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.DRAGON),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Crustoise");

    }


}
