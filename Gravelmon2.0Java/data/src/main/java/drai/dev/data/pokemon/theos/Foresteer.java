package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Foresteer extends drai.dev.data.pokemon.Pokemon {
    public Foresteer() {
        super("Foresteer",
                Type.GRASS, Type.FAIRY,
                new Stats(75,
                        60,
                        60,
                        100,
                        125,
                        75),
                List.of(Ability.LEAF_GUARD), Ability.WONDER_SKIN,
                17, 360,
                new Stats(0,0,0,0,2,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Foresteer were thought to be a myth until a group of them were caught on film. The leaves on their horns change color depending on their enviroment."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Foresteer");

    }


}
