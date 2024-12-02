package drai.dev.data.pokemon.pastelisland;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Panthevil extends drai.dev.data.pokemon.Pokemon {
    public Panthevil() {
        super("Panthevil",
                Type.DARK,
                new Stats(66,
                        85,
                        52,
                        70,
                        55,
                        100),
                List.of(Ability.LIMBER,Ability.PICKUP), Ability.SUPER_LUCK,
                35, 405,
                new Stats(0,0,0,0,0,0), 0,
                0.4,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
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
           setLangFileName("Panthevil");

    }


}
